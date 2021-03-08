select msi.*,
       BALANCE_TYPE,
       ITEM_SEGMENT,
       BEGINING_QUANTITY,
       BEGINING_AMOUNT,
       RECEIPTS_QUANTITY,
       RECEIPTS_AMOUNT,
       ISSUE_QUANTITY,
       ISSUE_AMOUNT,
       ENDING_QUANTITY,
       ENDING_AMOUNT,
       UNIT_PRICE,
       ITEM,
       SUBINVENTORY_CODE,
       ON_HAND,
       wod.itemcd,
       otherlot1,
       orderdate,
       expectqty1,
       shippedqty1
from (
         select distinct INVENTORY_ITEM_ID,
                         SEGMENT1,
                         SUMMARY_FLAG,
                         ENABLED_FLAG,
                         START_DATE_ACTIVE,
                         END_DATE_ACTIVE,
                         DESCRIPTION
         from MTL_SYSTEM_ITEMS_B a
         --WHERE         a.segment1 in ('VWSN10621301')
     ) MSI
         left outer join (
    -- 목천 조직 수불마감 기준 단가 확인
    SELECT ac.*,
           BALANCE_TYPE,
           ITEM_SEGMENT,
           BEGINING_QUANTITY,
           BEGINING_AMOUNT,
           RECEIPTS_QUANTITY,
           RECEIPTS_AMOUNT,
           ISSUE_QUANTITY,
           ISSUE_AMOUNT,
           ENDING_QUANTITY,
           ENDING_AMOUNT,
           CASE
               WHEN ENDING_QUANTITY = 0 THEN 0
               ELSE (ENDING_AMOUNT / ENDING_QUANTITY) END AS UNIT_PRICE
    FROM XXE_INV_MONTHLY_BALANCES xib
             inner join (
        SELECT ACCT_PERIOD_ID, ORGANIZATION_ID
        FROM ORG_ACCT_PERIODS a
        WHERE PERIOD_YEAR = 2020
          AND PERIOD_NUM = 01
          and ORGANIZATION_ID = 287
    ) ac on xib.ACCT_PERIOD_ID = ac.ACCT_PERIOD_ID
    WHERE xib.ORGANIZATION_ID = 287
    --and ITEM_SEGMENT like '%WHT001002%'
) XIB on msi.segment1 = xib.ITEM_SEGMENT
         left outer join (
    -- 현 창고 별 재고 수량 확인
    SELECT ITEM, SUBINVENTORY_CODE, SUM(ON_HAND) AS ON_HAND
    FROM MTL_ONHAND_TOTAL_V
    WHERE ORGANIZATION_ID = 287
          --and ITEM like '%WHT001002%'
    GROUP BY ITEM, SUBINVENTORY_CODE
) MOT on msi.segment1 = MOT.ITEM
         left outer join (
    -- WMS 주문 존재 여부 확인
    select itemcd,
           otherlot1,
           min(orderdate)   orderdate,
           sum(expectqty1)  expectqty1,
           sum(shippedqty1) shippedqty1
    from alexam.trso@alexam a
             inner join alexam.trsodetail@alexam b on a.sokey = b.sokey
    where to_char(orderdate, 'yyyyMM') >= :연월
      and to_char(orderdate, 'dd') >= 01
      and a.sokey >= 287284
      and PREOWNERSONO in (
        select distinct 'DIR' || ORDER_NO
        from xxe_wms_org_trf_req_if
        where to_char(ordered_date, 'yyyyMM') >= :연월
          and to_char(ordered_date, 'dd') >= 01
    )
--        and itemcd like  '%N10621301%'
    group by itemcd, otherlot1
) WOD on WOD.itemcd = substr(msi.SEGMENT1, 4)
