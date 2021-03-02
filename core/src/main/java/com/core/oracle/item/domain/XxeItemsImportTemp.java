package com.core.oracle.item.domain;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "XXE_ITEMS_IMPORT_TEMP", schema = "APPS", catalog = "")
public class XxeItemsImportTemp {
    @Id
    private Long id;
    private Long seq;
    private Long organizationId;
    private String segment1;
    private String description;
    private String primaryUomCode;
    private String templateName;
    private String engItemFlag;
    private String weightUomCode;
    private Long unitWeight;
    private String volumeUomCode;
    private Long unitVolume;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;
    private String attribute8;
    private String attribute9;
    private String attribute10;
    private String attribute11;
    private String attribute12;
    private String attribute13;
    private String attribute14;
    private String attribute15;
    private String globalAttribute1;
    private String globalAttribute2;
    private String globalAttribute3;
    private String globalAttribute4;
    private String globalAttribute5;
    private String globalAttribute6;
    private String globalAttribute7;
    private String globalAttribute8;
    private String globalAttribute9;
    private String globalAttribute10;
    private String longDescription;
    private String purchasingEnabledFlag;
    private Long defaultShippingOrg;
    private String inventoryItemStatusCode;
    private String transactionType;
    private Long processFlag;
    private Time creationDate;
    private Long createdBy;
    private Time lastUpdateDate;
    private Long lastUpdatedBy;
    private long setProcessId;
    private Long organizationIdM;
    private String segment1M;
    private Long organizationIdAttr;
    private String segment1Attr;
    private Long organizationIdG;
    private String segment1G;
    private String errMsg;
    private Long processFlagM;
    private String errorMsgM;
    private Long processFlagAttr;
    private String errorMsgAttr;
    private Long processFlagGlo;
    private String errorMsgGlo;
    private String statusFlag;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SEQ", nullable = true, precision = 0)
    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    @Basic
    @Column(name = "ORGANIZATION_ID", nullable = true, precision = 0)
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "SEGMENT1", nullable = true, length = 40)
    public String getSegment1() {
        return segment1;
    }

    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 240)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "PRIMARY_UOM_CODE", nullable = true, length = 3)
    public String getPrimaryUomCode() {
        return primaryUomCode;
    }

    public void setPrimaryUomCode(String primaryUomCode) {
        this.primaryUomCode = primaryUomCode;
    }

    @Basic
    @Column(name = "TEMPLATE_NAME", nullable = true, length = 30)
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Basic
    @Column(name = "ENG_ITEM_FLAG", nullable = true, length = 1)
    public String getEngItemFlag() {
        return engItemFlag;
    }

    public void setEngItemFlag(String engItemFlag) {
        this.engItemFlag = engItemFlag;
    }

    @Basic
    @Column(name = "WEIGHT_UOM_CODE", nullable = true, length = 3)
    public String getWeightUomCode() {
        return weightUomCode;
    }

    public void setWeightUomCode(String weightUomCode) {
        this.weightUomCode = weightUomCode;
    }

    @Basic
    @Column(name = "UNIT_WEIGHT", nullable = true, precision = 0)
    public Long getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Long unitWeight) {
        this.unitWeight = unitWeight;
    }

    @Basic
    @Column(name = "VOLUME_UOM_CODE", nullable = true, length = 3)
    public String getVolumeUomCode() {
        return volumeUomCode;
    }

    public void setVolumeUomCode(String volumeUomCode) {
        this.volumeUomCode = volumeUomCode;
    }

    @Basic
    @Column(name = "UNIT_VOLUME", nullable = true, precision = 0)
    public Long getUnitVolume() {
        return unitVolume;
    }

    public void setUnitVolume(Long unitVolume) {
        this.unitVolume = unitVolume;
    }

    @Basic
    @Column(name = "ATTRIBUTE1", nullable = true, length = 240)
    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Basic
    @Column(name = "ATTRIBUTE2", nullable = true, length = 240)
    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Basic
    @Column(name = "ATTRIBUTE3", nullable = true, length = 240)
    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    @Basic
    @Column(name = "ATTRIBUTE4", nullable = true, length = 240)
    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    @Basic
    @Column(name = "ATTRIBUTE5", nullable = true, length = 240)
    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    @Basic
    @Column(name = "ATTRIBUTE6", nullable = true, length = 240)
    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    @Basic
    @Column(name = "ATTRIBUTE7", nullable = true, length = 240)
    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    @Basic
    @Column(name = "ATTRIBUTE8", nullable = true, length = 240)
    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    @Basic
    @Column(name = "ATTRIBUTE9", nullable = true, length = 240)
    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    @Basic
    @Column(name = "ATTRIBUTE10", nullable = true, length = 240)
    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    @Basic
    @Column(name = "ATTRIBUTE11", nullable = true, length = 240)
    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    @Basic
    @Column(name = "ATTRIBUTE12", nullable = true, length = 240)
    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    @Basic
    @Column(name = "ATTRIBUTE13", nullable = true, length = 240)
    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    @Basic
    @Column(name = "ATTRIBUTE14", nullable = true, length = 240)
    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    @Basic
    @Column(name = "ATTRIBUTE15", nullable = true, length = 240)
    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE1", nullable = true, length = 150)
    public String getGlobalAttribute1() {
        return globalAttribute1;
    }

    public void setGlobalAttribute1(String globalAttribute1) {
        this.globalAttribute1 = globalAttribute1;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE2", nullable = true, length = 150)
    public String getGlobalAttribute2() {
        return globalAttribute2;
    }

    public void setGlobalAttribute2(String globalAttribute2) {
        this.globalAttribute2 = globalAttribute2;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE3", nullable = true, length = 150)
    public String getGlobalAttribute3() {
        return globalAttribute3;
    }

    public void setGlobalAttribute3(String globalAttribute3) {
        this.globalAttribute3 = globalAttribute3;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE4", nullable = true, length = 150)
    public String getGlobalAttribute4() {
        return globalAttribute4;
    }

    public void setGlobalAttribute4(String globalAttribute4) {
        this.globalAttribute4 = globalAttribute4;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE5", nullable = true, length = 150)
    public String getGlobalAttribute5() {
        return globalAttribute5;
    }

    public void setGlobalAttribute5(String globalAttribute5) {
        this.globalAttribute5 = globalAttribute5;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE6", nullable = true, length = 150)
    public String getGlobalAttribute6() {
        return globalAttribute6;
    }

    public void setGlobalAttribute6(String globalAttribute6) {
        this.globalAttribute6 = globalAttribute6;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE7", nullable = true, length = 150)
    public String getGlobalAttribute7() {
        return globalAttribute7;
    }

    public void setGlobalAttribute7(String globalAttribute7) {
        this.globalAttribute7 = globalAttribute7;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE8", nullable = true, length = 150)
    public String getGlobalAttribute8() {
        return globalAttribute8;
    }

    public void setGlobalAttribute8(String globalAttribute8) {
        this.globalAttribute8 = globalAttribute8;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE9", nullable = true, length = 150)
    public String getGlobalAttribute9() {
        return globalAttribute9;
    }

    public void setGlobalAttribute9(String globalAttribute9) {
        this.globalAttribute9 = globalAttribute9;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE10", nullable = true, length = 150)
    public String getGlobalAttribute10() {
        return globalAttribute10;
    }

    public void setGlobalAttribute10(String globalAttribute10) {
        this.globalAttribute10 = globalAttribute10;
    }

    @Basic
    @Column(name = "LONG_DESCRIPTION", nullable = true, length = 4000)
    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Basic
    @Column(name = "PURCHASING_ENABLED_FLAG", nullable = true, length = 1)
    public String getPurchasingEnabledFlag() {
        return purchasingEnabledFlag;
    }

    public void setPurchasingEnabledFlag(String purchasingEnabledFlag) {
        this.purchasingEnabledFlag = purchasingEnabledFlag;
    }

    @Basic
    @Column(name = "DEFAULT_SHIPPING_ORG", nullable = true, precision = 0)
    public Long getDefaultShippingOrg() {
        return defaultShippingOrg;
    }

    public void setDefaultShippingOrg(Long defaultShippingOrg) {
        this.defaultShippingOrg = defaultShippingOrg;
    }

    @Basic
    @Column(name = "INVENTORY_ITEM_STATUS_CODE", nullable = true, length = 10)
    public String getInventoryItemStatusCode() {
        return inventoryItemStatusCode;
    }

    public void setInventoryItemStatusCode(String inventoryItemStatusCode) {
        this.inventoryItemStatusCode = inventoryItemStatusCode;
    }

    @Basic
    @Column(name = "TRANSACTION_TYPE", nullable = true, length = 10)
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Basic
    @Column(name = "PROCESS_FLAG", nullable = true, precision = 0)
    public Long getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(Long processFlag) {
        this.processFlag = processFlag;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = true)
    public Time getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Time creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = true, precision = 0)
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = true)
    public Time getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Time lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "LAST_UPDATED_BY", nullable = true, precision = 0)
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "SET_PROCESS_ID", nullable = false, precision = 0)
    public long getSetProcessId() {
        return setProcessId;
    }

    public void setSetProcessId(long setProcessId) {
        this.setProcessId = setProcessId;
    }

    @Basic
    @Column(name = "ORGANIZATION_ID_M", nullable = true, precision = 0)
    public Long getOrganizationIdM() {
        return organizationIdM;
    }

    public void setOrganizationIdM(Long organizationIdM) {
        this.organizationIdM = organizationIdM;
    }

    @Basic
    @Column(name = "SEGMENT1_M", nullable = true, length = 40)
    public String getSegment1M() {
        return segment1M;
    }

    public void setSegment1M(String segment1M) {
        this.segment1M = segment1M;
    }

    @Basic
    @Column(name = "ORGANIZATION_ID_ATTR", nullable = true, precision = 0)
    public Long getOrganizationIdAttr() {
        return organizationIdAttr;
    }

    public void setOrganizationIdAttr(Long organizationIdAttr) {
        this.organizationIdAttr = organizationIdAttr;
    }

    @Basic
    @Column(name = "SEGMENT1_ATTR", nullable = true, length = 40)
    public String getSegment1Attr() {
        return segment1Attr;
    }

    public void setSegment1Attr(String segment1Attr) {
        this.segment1Attr = segment1Attr;
    }

    @Basic
    @Column(name = "ORGANIZATION_ID_G", nullable = true, precision = 0)
    public Long getOrganizationIdG() {
        return organizationIdG;
    }

    public void setOrganizationIdG(Long organizationIdG) {
        this.organizationIdG = organizationIdG;
    }

    @Basic
    @Column(name = "SEGMENT1_G", nullable = true, length = 40)
    public String getSegment1G() {
        return segment1G;
    }

    public void setSegment1G(String segment1G) {
        this.segment1G = segment1G;
    }

    @Basic
    @Column(name = "ERR_MSG", nullable = true, length = 200)
    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Basic
    @Column(name = "PROCESS_FLAG_M", nullable = true, precision = 0)
    public Long getProcessFlagM() {
        return processFlagM;
    }

    public void setProcessFlagM(Long processFlagM) {
        this.processFlagM = processFlagM;
    }

    @Basic
    @Column(name = "ERROR_MSG_M", nullable = true, length = 200)
    public String getErrorMsgM() {
        return errorMsgM;
    }

    public void setErrorMsgM(String errorMsgM) {
        this.errorMsgM = errorMsgM;
    }

    @Basic
    @Column(name = "PROCESS_FLAG_ATTR", nullable = true, precision = 0)
    public Long getProcessFlagAttr() {
        return processFlagAttr;
    }

    public void setProcessFlagAttr(Long processFlagAttr) {
        this.processFlagAttr = processFlagAttr;
    }

    @Basic
    @Column(name = "ERROR_MSG_ATTR", nullable = true, length = 200)
    public String getErrorMsgAttr() {
        return errorMsgAttr;
    }

    public void setErrorMsgAttr(String errorMsgAttr) {
        this.errorMsgAttr = errorMsgAttr;
    }

    @Basic
    @Column(name = "PROCESS_FLAG_GLO", nullable = true, precision = 0)
    public Long getProcessFlagGlo() {
        return processFlagGlo;
    }

    public void setProcessFlagGlo(Long processFlagGlo) {
        this.processFlagGlo = processFlagGlo;
    }

    @Basic
    @Column(name = "ERROR_MSG_GLO", nullable = true, length = 200)
    public String getErrorMsgGlo() {
        return errorMsgGlo;
    }

    public void setErrorMsgGlo(String errorMsgGlo) {
        this.errorMsgGlo = errorMsgGlo;
    }

    @Basic
    @Column(name = "STATUS_FLAG", nullable = true, length = 5)
    public String getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(String statusFlag) {
        this.statusFlag = statusFlag;
    }

}
