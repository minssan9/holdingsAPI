package com.inv.domain;

import com.sun.istack.NotNull;
import java.time.LocalDateTime;
import javax.persistence.*;
import java.sql.Time;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;

@Entity
@Table(name = "XXE_ITEMS_IMPORT_TEMP", schema = "APPS", catalog = "")
@Data
@NoArgsConstructor
@NamedStoredProcedureQuery(
    name = "getOrders",
    procedureName = "Orders.getOrders",
    parameters = {
        @StoredProcedureParameter(name = "param1", mode = ParameterMode.IN, type = Integer.class),
        @StoredProcedureParameter(name = "param2", mode = ParameterMode.IN, type = Integer.class),
        @StoredProcedureParameter(name = "out_sqlerr", mode = ParameterMode.OUT, type = String.class),
        @StoredProcedureParameter(name = "out_curs", mode = ParameterMode.REF_CURSOR, type = void.class),
    }
)
public class XxeItemsImportTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
        generator = "XXE_ITEMS_IMPORT_TEMP_SEQ")
    @Column(name = "SEQ")
    private long seq;
    @Column(name = "ORGANIZATION_ID")
    private long organizationId;
    @Column(name = "SEGMENT1")
    private String segment1;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRIMARY_UOM_CODE")
    private String primaryUomCode;
    @Column(name = "TEMPLATE_NAME")
    private String templateName;
    @Column(name = "ENG_ITEM_FLAG")
    private String engItemFlag;
    @Column(name = "WEIGHT_UOM_CODE")
    private String weightUomCode;
    @Column(name = "UNIT_WEIGHT")
    @NotNull
    private double unitWeight;
    @Column(name = "VOLUME_UOM_CODE")
    private String volumeUomCode;
    @Column(name = "UNIT_VOLUME")
    @NotNull
    private double unitVolume;
    @Column(name = "ATTRIBUTE1")
    private String attribute1 = "";
    @Column(name = "ATTRIBUTE2")
    private String attribute2 = "";
    @Column(name = "ATTRIBUTE3")
    private String attribute3 = "";
    @Column(name = "ATTRIBUTE4")
    private String attribute4 = "";
    @Column(name = "ATTRIBUTE5")
    private String attribute5 = "";
    @Column(name = "ATTRIBUTE6")
    private String attribute6 = "";
    @Column(name = "ATTRIBUTE7")
    private String attribute7 = "";
    @Column(name = "ATTRIBUTE8")
    private String attribute8 = "";
    @Column(name = "ATTRIBUTE9")
    private String attribute9 = "";
    @Column(name = "ATTRIBUTE10")
    private String attribute10 = "";
    @Column(name = "ATTRIBUTE11")
    private String attribute11 = "";
    @Column(name = "ATTRIBUTE12")
    private String attribute12 = "";
    @Column(name = "ATTRIBUTE13")
    private String attribute13 = "";
    @Column(name = "ATTRIBUTE14")
    private String attribute14 = "";
    @Column(name = "ATTRIBUTE15")
    private String attribute15 = "";
    @Column(name = "GLOBAL_ATTRIBUTE1")
    private String globalAttribute1 = "";
    @Column(name = "GLOBAL_ATTRIBUTE2")
    private String globalAttribute2 = "";
    @Column(name = "GLOBAL_ATTRIBUTE3")
    private String globalAttribute3 = "";
    @Column(name = "GLOBAL_ATTRIBUTE4")
    private String globalAttribute4 = "";
    @Column(name = "GLOBAL_ATTRIBUTE5")
    private String globalAttribute5 = "";
    @Column(name = "GLOBAL_ATTRIBUTE6")
    private String globalAttribute6 = "";
    @Column(name = "GLOBAL_ATTRIBUTE7")
    private String globalAttribute7 = "";
    @Column(name = "GLOBAL_ATTRIBUTE8")
    private String globalAttribute8 = "";
    @Column(name = "GLOBAL_ATTRIBUTE9")
    private String globalAttribute9 = "";
    @Column(name = "GLOBAL_ATTRIBUTE10")
    private String globalAttribute10 = "";
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription = "";
    @Column(name = "PURCHASING_ENABLED_FLAG")
    private String purchasingEnabledFlag = "";
    @Column(name = "DEFAULT_SHIPPING_ORG")
    private long defaultShippingOrg;
    @Column(name = "INVENTORY_ITEM_STATUS_CODE")
    private String inventoryItemStatusCode;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "PROCESS_FLAG")
    private long processFlag;
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;
    @Column(name = "CREATED_BY")
    private long createdBy;
    @Column(name = "LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private long lastUpdatedBy;
    @Column(name = "SET_PROCESS_ID")
    @NotNull
    private long setProcessId;
    @Column(name = "ORGANIZATION_ID_M")
    private long organizationIdM;
    @Column(name = "SEGMENT1_M")
    private String segment1M;
    @Column(name = "ORGANIZATION_ID_ATTR")
    private long organizationIdAttr;
    @Column(name = "SEGMENT1_ATTR")
    private String segment1Attr;
    @Column(name = "ORGANIZATION_ID_G")
    private long organizationIdG;
    @Column(name = "SEGMENT1_G")
    private String segment1G;
    @Column(name = "ERR_MSG")
    private String errMsg;
    @Column(name = "PROCESS_FLAG_M")
    private long processFlagM;
    @Column(name = "ERROR_MSG_M")
    private String errorMsgM;
    @Column(name = "PROCESS_FLAG_ATTR")
    private long processFlagAttr;
    @Column(name = "ERROR_MSG_ATTR")
    private String errorMsgAttr;
    @Column(name = "PROCESS_FLAG_GLO")
    private long processFlagGlo;
    @Column(name = "ERROR_MSG_GLO")
    private String errorMsgGlo;
    @Column(name = "STATUS_FLAG")
    private String statusFlag;

    public XxeItemsImportTemp(XSSFRow row) {
        this.segment1 = row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
        this.description = row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
        this.primaryUomCode = row.getCell(3, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
        this.templateName = row.getCell(4, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
        this.engItemFlag = row.getCell(5, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
        this.weightUomCode = row.getCell(6, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
        this.unitWeight = row.getCell(7, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue();
        this.volumeUomCode = row.getCell(8, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
        this.unitVolume = row.getCell(9, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue();
//                    .(row.getCell(10, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(11, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(12, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(13, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(14, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(15, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(16, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(17, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
//                    .(row.getCell(18, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue())
        this.creationDate=LocalDateTime.now();
        this.lastUpdateDate=LocalDateTime.now();
    }



}
