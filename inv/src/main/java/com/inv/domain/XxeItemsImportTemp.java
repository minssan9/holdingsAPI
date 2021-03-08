package com.inv.domain;

import java.time.LocalDateTime;
import javax.persistence.*;
import java.sql.Time;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "XXE_ITEMS_IMPORT_TEMP", schema = "APPS", catalog = "")
@Data
@NoArgsConstructor
public class XxeItemsImportTemp {

    @Id
    @GeneratedValue
    @Column(name = "SEQ")
    private Long seq;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
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
    private double unitWeight;
    @Column(name = "VOLUME_UOM_CODE")
    private String volumeUomCode;
    @Column(name = "UNIT_VOLUME")
    private double unitVolume;
    @Column(name = "ATTRIBUTE1")
    private String attribute1;
    @Column(name = "ATTRIBUTE2")
    private String attribute2;
    @Column(name = "ATTRIBUTE3")
    private String attribute3;
    @Column(name = "ATTRIBUTE4")
    private String attribute4;
    @Column(name = "ATTRIBUTE5")
    private String attribute5;
    @Column(name = "ATTRIBUTE6")
    private String attribute6;
    @Column(name = "ATTRIBUTE7")
    private String attribute7;
    @Column(name = "ATTRIBUTE8")
    private String attribute8;
    @Column(name = "ATTRIBUTE9")
    private String attribute9;
    @Column(name = "ATTRIBUTE10")
    private String attribute10;
    @Column(name = "ATTRIBUTE11")
    private String attribute11;
    @Column(name = "ATTRIBUTE12")
    private String attribute12;
    @Column(name = "ATTRIBUTE13")
    private String attribute13;
    @Column(name = "ATTRIBUTE14")
    private String attribute14;
    @Column(name = "ATTRIBUTE15")
    private String attribute15;
    @Column(name = "GLOBAL_ATTRIBUTE1")
    private String globalAttribute1;
    @Column(name = "GLOBAL_ATTRIBUTE2")
    private String globalAttribute2;
    @Column(name = "GLOBAL_ATTRIBUTE3")
    private String globalAttribute3;
    @Column(name = "GLOBAL_ATTRIBUTE4")
    private String globalAttribute4;
    @Column(name = "GLOBAL_ATTRIBUTE5")
    private String globalAttribute5;
    @Column(name = "GLOBAL_ATTRIBUTE6")
    private String globalAttribute6;
    @Column(name = "GLOBAL_ATTRIBUTE7")
    private String globalAttribute7;
    @Column(name = "GLOBAL_ATTRIBUTE8")
    private String globalAttribute8;
    @Column(name = "GLOBAL_ATTRIBUTE9")
    private String globalAttribute9;
    @Column(name = "GLOBAL_ATTRIBUTE10")
    private String globalAttribute10;
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;
    @Column(name = "PURCHASING_ENABLED_FLAG")
    private String purchasingEnabledFlag;
    @Column(name = "DEFAULT_SHIPPING_ORG")
    private Long defaultShippingOrg;
    @Column(name = "INVENTORY_ITEM_STATUS_CODE")
    private String inventoryItemStatusCode;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "PROCESS_FLAG")
    private Long processFlag;
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "SET_PROCESS_ID")
    private long setProcessId;
    @Column(name = "ORGANIZATION_ID_M")
    private Long organizationIdM;
    @Column(name = "SEGMENT1_M")
    private String segment1M;
    @Column(name = "ORGANIZATION_ID_ATTR")
    private Long organizationIdAttr;
    @Column(name = "SEGMENT1_ATTR")
    private String segment1Attr;
    @Column(name = "ORGANIZATION_ID_G")
    private Long organizationIdG;
    @Column(name = "SEGMENT1_G")
    private String segment1G;
    @Column(name = "ERR_MSG")
    private String errMsg;
    @Column(name = "PROCESS_FLAG_M")
    private Long processFlagM;
    @Column(name = "ERROR_MSG_M")
    private String errorMsgM;
    @Column(name = "PROCESS_FLAG_ATTR")
    private Long processFlagAttr;
    @Column(name = "ERROR_MSG_ATTR")
    private String errorMsgAttr;
    @Column(name = "PROCESS_FLAG_GLO")
    private Long processFlagGlo;
    @Column(name = "ERROR_MSG_GLO")
    private String errorMsgGlo;
    @Column(name = "STATUS_FLAG")
    private String statusFlag;
}
