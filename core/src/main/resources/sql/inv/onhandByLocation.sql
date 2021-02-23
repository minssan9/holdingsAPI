/*로케이터별 현재고 (21년 1월 15일 오류 개선)-가용재고.SQL - EUC V2, 2개 이상 조직 조회 + 품목군, 브랜드, 라우트, 재고룰명칭, 회전월, 무변동 개월수 추가*/

SELECT MSI.ORGANIZATION_ID,
       MSI.SEGMENT1,
       MSI.INVENTORY_ITEM_ID,
       TEMP.SUBINVENTORY_CODE,
       mil.segment1 || '.' || mil.segment2 || '.' || mil.segment3 || '.' || mil.segment4  LOCATOR,
       TEMP.ONHAND_QTY,
       TEMP.AVAILABLE_QTY,
       TEMP.ONHAND_QTY - TEMP.AVAILABLE_QTY,
       TEMP.ONHAND_QTY * msi.stock_price,
       MSI.DESCRIPTION,
       catpo.maker                                                                        MAKER,
       ppf.last_name                                                                      PICKOR,
       (
           CASE
               WHEN xida.BASE_YYYYMM = TO_CHAR(ADD_MONTHS(SYSDATE, -1), 'YYYYMM') THEN
                   (
                       SELECT RULE_NAME
                       FROM XXE_INV_DW_ITEM_ANALYSIS_H_V A
                       WHERE BASE_YYYYMM = TO_CHAR(ADD_MONTHS(SYSDATE, -2), 'YYYYMM')
                         AND ANALYSIS_TYPE = 'FIN'
                         AND ITEM_NUMBER = MSI.SEGMENT1
                         AND ORGANIZATION_ID = 83
                   )
               ELSE
                   (
                       SELECT RULE_NAME
                       FROM XXE_INV_DW_ITEM_ANALYSIS_H_V A
                       WHERE BASE_YYYYMM = TO_CHAR(ADD_MONTHS(SYSDATE, -1), 'YYYYMM')
                         AND ANALYSIS_TYPE = 'FIN'
                         AND ITEM_NUMBER = MSI.SEGMENT1
                         AND ORGANIZATION_ID = 83)
               END
           )         AS                                                                   Aging룰명칭,
       CASE WHEN TEMP.ONHAND_QTY <> 0 THEN xism.sum_salesqty / TEMP.ONHAND_QTY ELSE 0 end 재고회전월,
       xidi.stagingDays                                                                   무변동월수,
       CASE
           WHEN micv.SEGMENT1 = '상품_수입차정품'
               THEN (SELECT DESCRIPTION
                     FROM temp_car_maker_initial@mpic_link
                     WHERE TWOLENGTH = SUBSTR(MSI.SEGMENT1, 1, 2))
           WHEN micv.SEGMENT1 = '상품_수입차부품'
               THEN SUBSTR(MSI.SEGMENT1, 1, 2)
           ELSE MSI.SEGMENT1 END
                     AS                                                                   브랜드,
       micv.SEGMENT1 AS                                                                   품목군,
       CASE WHEN micv.SEGMENT1 = '상품_수입차정품' THEN SUBSTR(MSI.SEGMENT1, 3, 1) ELSE '' END   ROUTE
FROM (
         SELECT ORGANIZATION_ID,
                SUBINVENTORY_CODE,
                LOCATOR_ID,
                INVENTORY_ITEM_ID,
                SUM(ONHAND_QTY)    ONHAND_QTY,
                SUM(AVAILABLE_QTY) AVAILABLE_QTY
         FROM (
                  SELECT ORGANIZATION_ID,
                         SUBINVENTORY_CODE,
                         LOCATOR_ID,
                         INVENTORY_ITEM_ID,
                         SUM(NVL(PRIMARY_TRANSACTION_QUANTITY, 0)) ONHAND_QTY,
                         SUM(NVL(PRIMARY_TRANSACTION_QUANTITY, 0)) AVAILABLE_QTY
                  FROM MTL_ONHAND_QUANTITIES_DETAIL
                  WHERE IS_CONSIGNED = 2
                    and ORGANIZATION_ID in (::조직)
                  GROUP BY ORGANIZATION_ID, INVENTORY_ITEM_ID, SUBINVENTORY_CODE, LOCATOR_ID
                  UNION ALL
                  SELECT ORGANIZATION_ID,
                         SUBINVENTORY_CODE,
                         LOCATOR_ID,
                         INVENTORY_ITEM_ID,
                         0                               ONHAND_QTY,
                         - SUM(NVL(PRIMARY_QUANTITY, 0)) AVAILABLE_QTY
                  FROM MTL_MATERIAL_TRANSACTIONS_TEMP
                  where ORGANIZATION_ID in (::조직)
                  GROUP BY ORGANIZATION_ID, INVENTORY_ITEM_ID, SUBINVENTORY_CODE, LOCATOR_ID
                  UNION ALL
                  SELECT ORGANIZATION_ID,
                         SUBINVENTORY_CODE,
                         LOCATOR_ID,
                         INVENTORY_ITEM_ID,
                         0                                           ONHAND_QTY,
                         - SUM(NVL(PRIMARY_RESERVATION_QUANTITY, 0)) AVAILABLE_QTY
                  FROM MTL_RESERVATIONS
                  WHERE SUBINVENTORY_CODE IS NOT NULL
                    and ORGANIZATION_ID in (::조직)
                  GROUP BY ORGANIZATION_ID, INVENTORY_ITEM_ID, SUBINVENTORY_CODE, LOCATOR_ID
              ) TEMP
         GROUP BY ORGANIZATION_ID, INVENTORY_ITEM_ID, SUBINVENTORY_CODE, LOCATOR_ID
     ) TEMP
         inner join xxe_system_items_B msi
                    on MSI.INVENTORY_ITEM_ID = TEMP.INVENTORY_ITEM_ID AND MSI.ORGANIZATION_ID = TEMP.ORGANIZATION_ID
         inner join MTL_ITEM_CATEGORIES_V micv
                    on micv.ORGANIZATION_ID = MSI.ORGANIZATION_ID AND micv.INVENTORY_ITEM_ID = MSI.INVENTORY_ITEM_ID AND
                       micv.category_set_id = 1100000004
         left outer join XXE_INV_DW_ITEM_ANALYSIS_H_V xida
                         on xida.ANALYSIS_TYPE = 'FIN' AND xida.ITEM_NUMBER = MSI.SEGMENT1 AND
                            xida.ORGANIZATION_ID = TEMP.ORGANIZATION_ID
         left outer join mtl_item_locations mil
                         on mil.inventory_location_id = TEMP.locator_id AND mil.organization_id = TEMP.organization_id
         left outer join PER_PEOPLE_F PPF on mil.attribute15 = ppf.person_id
         left outer join (
    select MIC.ORGANIZATION_ID, MIC.INVENTORY_ITEM_ID, MCSV.CATEGORY_SET_NAME, MCB.SEGMENT3 maker
    from MTL_CATEGORY_SETS_VL MCSV
       , MTL_CATEGORIES_B MCB
       , MTL_ITEM_CATEGORIES MIC
    WHERE MCSV.STRUCTURE_ID = MCB.STRUCTURE_ID
      AND MIC.CATEGORY_SET_ID = MCSV.CATEGORY_SET_ID
      AND MIC.CATEGORY_ID = MCB.CATEGORY_ID
      AND MCSV.CATEGORY_SET_NAME = 'PO Category'
      AND MCB.ENABLED_FLAG = 'Y'
      and ORGANIZATION_ID in (::조직)
) catpo on msi.organization_id = catpo.organization_id and msi.inventory_item_id = catpo.inventory_item_id
         left outer join (
    SELECT INVENTORY_ITEM_ID, ROUND(MONTHS_BETWEEN(SYSDATE, NVL(LAST_ISSUE_DATE, SYSDATE)), 1) stagingDays
    FROM XXE_INV_DW_ITEM_ISSUE_MST A
             INNER JOIN XXE_INV_DW_RPT_GROUP_ID_CTL C ON A.RPT_GROUP_ID = C.RPT_GROUP_ID
             INNER JOIN MTL_SYSTEM_ITEMS_B B ON A.INVENTORY_ITEM_ID = B.INVENTORY_ITEM_ID AND B.ORGANIZATION_ID = 83
    WHERE ORGANIZATION_ID in (::조직)
      and ANALYSIS_TYPE = 'FIN'
      AND C.DEPT_CODE = 'A0018' -- 국내영업2팀만 해당 되도록 쿼리 수정
) xidi on xidi.INVENTORY_ITEM_ID = MSI.INVENTORY_ITEM_ID
         left outer join (
    SELECT INVENTORY_ITEM_ID,
           (NVL(SUM(SALES_QUANTITY_M11 + SALES_QUANTITY_M10 + SALES_QUANTITY_M9 + SALES_QUANTITY_M8 +
                    SALES_QUANTITY_M7 + SALES_QUANTITY_M6
               + SALES_QUANTITY_M5 + SALES_QUANTITY_M4 + SALES_QUANTITY_M3 + SALES_QUANTITY_M2 + SALES_QUANTITY_M1 +
                    SALES_QUANTITY_M), 0) / 12) sum_salesqty
    FROM XXE_INV_DW_SALES_PER_MONTH_H
    WHERE BASE_YYYYMM = TO_CHAR(ADD_MONTHS(SYSDATE, -1), 'YYYYMM')
    GROUP BY INVENTORY_ITEM_ID
) xism on xism.INVENTORY_ITEM_ID = MSI.INVENTORY_ITEM_ID
where MSI.ORGANIZATION_ID in (::조직)
order by segment1
