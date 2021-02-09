package com.core.oracle.inv.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "XXE_INV_ITEM_INTERFACE", schema = "XXE", catalog = "")
public class XxeInvItemInterface {
    private String batchSource;
    private Long organizationId;
    private String segment1;
    private String description;
    private String templateName;
    private String primaryUom;
    private Long weight;
    private String weightUom;
    private Integer fixedLeadtime;
    private String itemCatalogGroups;
    private String wipFlag;
    private String wipType;
    private String catalogAttribute1;
    private String catalogAttribute2;
    private String catalogAttribute3;
    private String catalogAttribute4;
    private String categoryAttribute1;
    private String categoryAttribute2;
    private String categoryAttribute3;
    private String categoryAttribute4;
    private String categoryAttribute5;
    private String categoryAttribute6;
    private String categoryAttribute7;
    private String categoryAttribute8;
    private String categoryAttribute9;
    private String categoryAttribute10;
    private String oldCateAttribute1;
    private String oldCateAttribute2;
    private String oldCateAttribute3;
    private String oldCateAttribute4;
    private String oldCateAttribute5;
    private String oldCateAttribute6;
    private String oldCateAttribute7;
    private String oldCateAttribute8;
    private String oldCateAttribute9;
    private String oldCateAttribute10;
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
    private String interfaceType;
    private String interfaceFlag;
    private String ifErrorMessage;
    private Time creationDate;
    private String createdBy;
    private Time lastUpdateDate;
    private String lastUpdateBy;
    private Long listPricePerUnit;

    @Basic
    @Column(name = "BATCH_SOURCE", nullable = true, length = 50)
    public String getBatchSource() {
        return batchSource;
    }

    public void setBatchSource(String batchSource) {
        this.batchSource = batchSource;
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
    @Column(name = "SEGMENT1", nullable = false, length = 40)
    public String getSegment1() {
        return segment1;
    }

    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 2000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "TEMPLATE_NAME", nullable = true, length = 50)
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Basic
    @Column(name = "PRIMARY_UOM", nullable = true, length = 4)
    public String getPrimaryUom() {
        return primaryUom;
    }

    public void setPrimaryUom(String primaryUom) {
        this.primaryUom = primaryUom;
    }

    @Basic
    @Column(name = "WEIGHT", nullable = true, precision = 0)
    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "WEIGHT_UOM", nullable = true, length = 4)
    public String getWeightUom() {
        return weightUom;
    }

    public void setWeightUom(String weightUom) {
        this.weightUom = weightUom;
    }

    @Basic
    @Column(name = "FIXED_LEADTIME", nullable = true, precision = 0)
    public Integer getFixedLeadtime() {
        return fixedLeadtime;
    }

    public void setFixedLeadtime(Integer fixedLeadtime) {
        this.fixedLeadtime = fixedLeadtime;
    }

    @Basic
    @Column(name = "ITEM_CATALOG_GROUPS", nullable = true, length = 30)
    public String getItemCatalogGroups() {
        return itemCatalogGroups;
    }

    public void setItemCatalogGroups(String itemCatalogGroups) {
        this.itemCatalogGroups = itemCatalogGroups;
    }

    @Basic
    @Column(name = "WIP_FLAG", nullable = true, length = 10)
    public String getWipFlag() {
        return wipFlag;
    }

    public void setWipFlag(String wipFlag) {
        this.wipFlag = wipFlag;
    }

    @Basic
    @Column(name = "WIP_TYPE", nullable = true, length = 50)
    public String getWipType() {
        return wipType;
    }

    public void setWipType(String wipType) {
        this.wipType = wipType;
    }

    @Basic
    @Column(name = "CATALOG_ATTRIBUTE1", nullable = true, length = 40)
    public String getCatalogAttribute1() {
        return catalogAttribute1;
    }

    public void setCatalogAttribute1(String catalogAttribute1) {
        this.catalogAttribute1 = catalogAttribute1;
    }

    @Basic
    @Column(name = "CATALOG_ATTRIBUTE2", nullable = true, length = 40)
    public String getCatalogAttribute2() {
        return catalogAttribute2;
    }

    public void setCatalogAttribute2(String catalogAttribute2) {
        this.catalogAttribute2 = catalogAttribute2;
    }

    @Basic
    @Column(name = "CATALOG_ATTRIBUTE3", nullable = true, length = 40)
    public String getCatalogAttribute3() {
        return catalogAttribute3;
    }

    public void setCatalogAttribute3(String catalogAttribute3) {
        this.catalogAttribute3 = catalogAttribute3;
    }

    @Basic
    @Column(name = "CATALOG_ATTRIBUTE4", nullable = true, length = 40)
    public String getCatalogAttribute4() {
        return catalogAttribute4;
    }

    public void setCatalogAttribute4(String catalogAttribute4) {
        this.catalogAttribute4 = catalogAttribute4;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE1", nullable = true, length = 40)
    public String getCategoryAttribute1() {
        return categoryAttribute1;
    }

    public void setCategoryAttribute1(String categoryAttribute1) {
        this.categoryAttribute1 = categoryAttribute1;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE2", nullable = true, length = 40)
    public String getCategoryAttribute2() {
        return categoryAttribute2;
    }

    public void setCategoryAttribute2(String categoryAttribute2) {
        this.categoryAttribute2 = categoryAttribute2;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE3", nullable = true, length = 40)
    public String getCategoryAttribute3() {
        return categoryAttribute3;
    }

    public void setCategoryAttribute3(String categoryAttribute3) {
        this.categoryAttribute3 = categoryAttribute3;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE4", nullable = true, length = 40)
    public String getCategoryAttribute4() {
        return categoryAttribute4;
    }

    public void setCategoryAttribute4(String categoryAttribute4) {
        this.categoryAttribute4 = categoryAttribute4;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE5", nullable = true, length = 40)
    public String getCategoryAttribute5() {
        return categoryAttribute5;
    }

    public void setCategoryAttribute5(String categoryAttribute5) {
        this.categoryAttribute5 = categoryAttribute5;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE6", nullable = true, length = 40)
    public String getCategoryAttribute6() {
        return categoryAttribute6;
    }

    public void setCategoryAttribute6(String categoryAttribute6) {
        this.categoryAttribute6 = categoryAttribute6;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE7", nullable = true, length = 40)
    public String getCategoryAttribute7() {
        return categoryAttribute7;
    }

    public void setCategoryAttribute7(String categoryAttribute7) {
        this.categoryAttribute7 = categoryAttribute7;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE8", nullable = true, length = 40)
    public String getCategoryAttribute8() {
        return categoryAttribute8;
    }

    public void setCategoryAttribute8(String categoryAttribute8) {
        this.categoryAttribute8 = categoryAttribute8;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE9", nullable = true, length = 40)
    public String getCategoryAttribute9() {
        return categoryAttribute9;
    }

    public void setCategoryAttribute9(String categoryAttribute9) {
        this.categoryAttribute9 = categoryAttribute9;
    }

    @Basic
    @Column(name = "CATEGORY_ATTRIBUTE10", nullable = true, length = 40)
    public String getCategoryAttribute10() {
        return categoryAttribute10;
    }

    public void setCategoryAttribute10(String categoryAttribute10) {
        this.categoryAttribute10 = categoryAttribute10;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE1", nullable = true, length = 40)
    public String getOldCateAttribute1() {
        return oldCateAttribute1;
    }

    public void setOldCateAttribute1(String oldCateAttribute1) {
        this.oldCateAttribute1 = oldCateAttribute1;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE2", nullable = true, length = 40)
    public String getOldCateAttribute2() {
        return oldCateAttribute2;
    }

    public void setOldCateAttribute2(String oldCateAttribute2) {
        this.oldCateAttribute2 = oldCateAttribute2;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE3", nullable = true, length = 40)
    public String getOldCateAttribute3() {
        return oldCateAttribute3;
    }

    public void setOldCateAttribute3(String oldCateAttribute3) {
        this.oldCateAttribute3 = oldCateAttribute3;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE4", nullable = true, length = 40)
    public String getOldCateAttribute4() {
        return oldCateAttribute4;
    }

    public void setOldCateAttribute4(String oldCateAttribute4) {
        this.oldCateAttribute4 = oldCateAttribute4;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE5", nullable = true, length = 40)
    public String getOldCateAttribute5() {
        return oldCateAttribute5;
    }

    public void setOldCateAttribute5(String oldCateAttribute5) {
        this.oldCateAttribute5 = oldCateAttribute5;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE6", nullable = true, length = 40)
    public String getOldCateAttribute6() {
        return oldCateAttribute6;
    }

    public void setOldCateAttribute6(String oldCateAttribute6) {
        this.oldCateAttribute6 = oldCateAttribute6;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE7", nullable = true, length = 40)
    public String getOldCateAttribute7() {
        return oldCateAttribute7;
    }

    public void setOldCateAttribute7(String oldCateAttribute7) {
        this.oldCateAttribute7 = oldCateAttribute7;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE8", nullable = true, length = 40)
    public String getOldCateAttribute8() {
        return oldCateAttribute8;
    }

    public void setOldCateAttribute8(String oldCateAttribute8) {
        this.oldCateAttribute8 = oldCateAttribute8;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE9", nullable = true, length = 40)
    public String getOldCateAttribute9() {
        return oldCateAttribute9;
    }

    public void setOldCateAttribute9(String oldCateAttribute9) {
        this.oldCateAttribute9 = oldCateAttribute9;
    }

    @Basic
    @Column(name = "OLD_CATE_ATTRIBUTE10", nullable = true, length = 40)
    public String getOldCateAttribute10() {
        return oldCateAttribute10;
    }

    public void setOldCateAttribute10(String oldCateAttribute10) {
        this.oldCateAttribute10 = oldCateAttribute10;
    }

    @Basic
    @Column(name = "ATTRIBUTE1", nullable = true, length = 40)
    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Basic
    @Column(name = "ATTRIBUTE2", nullable = true, length = 40)
    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Basic
    @Column(name = "ATTRIBUTE3", nullable = true, length = 40)
    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    @Basic
    @Column(name = "ATTRIBUTE4", nullable = true, length = 40)
    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    @Basic
    @Column(name = "ATTRIBUTE5", nullable = true, length = 40)
    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    @Basic
    @Column(name = "ATTRIBUTE6", nullable = true, length = 40)
    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    @Basic
    @Column(name = "ATTRIBUTE7", nullable = true, length = 40)
    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    @Basic
    @Column(name = "ATTRIBUTE8", nullable = true, length = 40)
    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    @Basic
    @Column(name = "ATTRIBUTE9", nullable = true, length = 40)
    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    @Basic
    @Column(name = "ATTRIBUTE10", nullable = true, length = 40)
    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    @Basic
    @Column(name = "ATTRIBUTE11", nullable = true, length = 50)
    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    @Basic
    @Column(name = "ATTRIBUTE12", nullable = true, length = 40)
    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    @Basic
    @Column(name = "ATTRIBUTE13", nullable = true, length = 40)
    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    @Basic
    @Column(name = "ATTRIBUTE14", nullable = true, length = 40)
    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    @Basic
    @Column(name = "ATTRIBUTE15", nullable = true, length = 40)
    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE1", nullable = true, length = 40)
    public String getGlobalAttribute1() {
        return globalAttribute1;
    }

    public void setGlobalAttribute1(String globalAttribute1) {
        this.globalAttribute1 = globalAttribute1;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE2", nullable = true, length = 40)
    public String getGlobalAttribute2() {
        return globalAttribute2;
    }

    public void setGlobalAttribute2(String globalAttribute2) {
        this.globalAttribute2 = globalAttribute2;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE3", nullable = true, length = 40)
    public String getGlobalAttribute3() {
        return globalAttribute3;
    }

    public void setGlobalAttribute3(String globalAttribute3) {
        this.globalAttribute3 = globalAttribute3;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE4", nullable = true, length = 40)
    public String getGlobalAttribute4() {
        return globalAttribute4;
    }

    public void setGlobalAttribute4(String globalAttribute4) {
        this.globalAttribute4 = globalAttribute4;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE5", nullable = true, length = 40)
    public String getGlobalAttribute5() {
        return globalAttribute5;
    }

    public void setGlobalAttribute5(String globalAttribute5) {
        this.globalAttribute5 = globalAttribute5;
    }

    @Basic
    @Column(name = "INTERFACE_TYPE", nullable = true, length = 1)
    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    @Basic
    @Column(name = "INTERFACE_FLAG", nullable = true, length = 1)
    public String getInterfaceFlag() {
        return interfaceFlag;
    }

    public void setInterfaceFlag(String interfaceFlag) {
        this.interfaceFlag = interfaceFlag;
    }

    @Basic
    @Column(name = "IF_ERROR_MESSAGE", nullable = true, length = 400)
    public String getIfErrorMessage() {
        return ifErrorMessage;
    }

    public void setIfErrorMessage(String ifErrorMessage) {
        this.ifErrorMessage = ifErrorMessage;
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
    @Column(name = "CREATED_BY", nullable = true, length = 40)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
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
    @Column(name = "LAST_UPDATE_BY", nullable = true, length = 40)
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    @Basic
    @Column(name = "LIST_PRICE_PER_UNIT", nullable = true, precision = 0)
    public Long getListPricePerUnit() {
        return listPricePerUnit;
    }

    public void setListPricePerUnit(Long listPricePerUnit) {
        this.listPricePerUnit = listPricePerUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XxeInvItemInterface that = (XxeInvItemInterface) o;

        if (batchSource != null ? !batchSource.equals(that.batchSource) : that.batchSource != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (segment1 != null ? !segment1.equals(that.segment1) : that.segment1 != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (templateName != null ? !templateName.equals(that.templateName) : that.templateName != null) return false;
        if (primaryUom != null ? !primaryUom.equals(that.primaryUom) : that.primaryUom != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (weightUom != null ? !weightUom.equals(that.weightUom) : that.weightUom != null) return false;
        if (fixedLeadtime != null ? !fixedLeadtime.equals(that.fixedLeadtime) : that.fixedLeadtime != null)
            return false;
        if (itemCatalogGroups != null ? !itemCatalogGroups.equals(that.itemCatalogGroups) : that.itemCatalogGroups != null)
            return false;
        if (wipFlag != null ? !wipFlag.equals(that.wipFlag) : that.wipFlag != null) return false;
        if (wipType != null ? !wipType.equals(that.wipType) : that.wipType != null) return false;
        if (catalogAttribute1 != null ? !catalogAttribute1.equals(that.catalogAttribute1) : that.catalogAttribute1 != null)
            return false;
        if (catalogAttribute2 != null ? !catalogAttribute2.equals(that.catalogAttribute2) : that.catalogAttribute2 != null)
            return false;
        if (catalogAttribute3 != null ? !catalogAttribute3.equals(that.catalogAttribute3) : that.catalogAttribute3 != null)
            return false;
        if (catalogAttribute4 != null ? !catalogAttribute4.equals(that.catalogAttribute4) : that.catalogAttribute4 != null)
            return false;
        if (categoryAttribute1 != null ? !categoryAttribute1.equals(that.categoryAttribute1) : that.categoryAttribute1 != null)
            return false;
        if (categoryAttribute2 != null ? !categoryAttribute2.equals(that.categoryAttribute2) : that.categoryAttribute2 != null)
            return false;
        if (categoryAttribute3 != null ? !categoryAttribute3.equals(that.categoryAttribute3) : that.categoryAttribute3 != null)
            return false;
        if (categoryAttribute4 != null ? !categoryAttribute4.equals(that.categoryAttribute4) : that.categoryAttribute4 != null)
            return false;
        if (categoryAttribute5 != null ? !categoryAttribute5.equals(that.categoryAttribute5) : that.categoryAttribute5 != null)
            return false;
        if (categoryAttribute6 != null ? !categoryAttribute6.equals(that.categoryAttribute6) : that.categoryAttribute6 != null)
            return false;
        if (categoryAttribute7 != null ? !categoryAttribute7.equals(that.categoryAttribute7) : that.categoryAttribute7 != null)
            return false;
        if (categoryAttribute8 != null ? !categoryAttribute8.equals(that.categoryAttribute8) : that.categoryAttribute8 != null)
            return false;
        if (categoryAttribute9 != null ? !categoryAttribute9.equals(that.categoryAttribute9) : that.categoryAttribute9 != null)
            return false;
        if (categoryAttribute10 != null ? !categoryAttribute10.equals(that.categoryAttribute10) : that.categoryAttribute10 != null)
            return false;
        if (oldCateAttribute1 != null ? !oldCateAttribute1.equals(that.oldCateAttribute1) : that.oldCateAttribute1 != null)
            return false;
        if (oldCateAttribute2 != null ? !oldCateAttribute2.equals(that.oldCateAttribute2) : that.oldCateAttribute2 != null)
            return false;
        if (oldCateAttribute3 != null ? !oldCateAttribute3.equals(that.oldCateAttribute3) : that.oldCateAttribute3 != null)
            return false;
        if (oldCateAttribute4 != null ? !oldCateAttribute4.equals(that.oldCateAttribute4) : that.oldCateAttribute4 != null)
            return false;
        if (oldCateAttribute5 != null ? !oldCateAttribute5.equals(that.oldCateAttribute5) : that.oldCateAttribute5 != null)
            return false;
        if (oldCateAttribute6 != null ? !oldCateAttribute6.equals(that.oldCateAttribute6) : that.oldCateAttribute6 != null)
            return false;
        if (oldCateAttribute7 != null ? !oldCateAttribute7.equals(that.oldCateAttribute7) : that.oldCateAttribute7 != null)
            return false;
        if (oldCateAttribute8 != null ? !oldCateAttribute8.equals(that.oldCateAttribute8) : that.oldCateAttribute8 != null)
            return false;
        if (oldCateAttribute9 != null ? !oldCateAttribute9.equals(that.oldCateAttribute9) : that.oldCateAttribute9 != null)
            return false;
        if (oldCateAttribute10 != null ? !oldCateAttribute10.equals(that.oldCateAttribute10) : that.oldCateAttribute10 != null)
            return false;
        if (attribute1 != null ? !attribute1.equals(that.attribute1) : that.attribute1 != null) return false;
        if (attribute2 != null ? !attribute2.equals(that.attribute2) : that.attribute2 != null) return false;
        if (attribute3 != null ? !attribute3.equals(that.attribute3) : that.attribute3 != null) return false;
        if (attribute4 != null ? !attribute4.equals(that.attribute4) : that.attribute4 != null) return false;
        if (attribute5 != null ? !attribute5.equals(that.attribute5) : that.attribute5 != null) return false;
        if (attribute6 != null ? !attribute6.equals(that.attribute6) : that.attribute6 != null) return false;
        if (attribute7 != null ? !attribute7.equals(that.attribute7) : that.attribute7 != null) return false;
        if (attribute8 != null ? !attribute8.equals(that.attribute8) : that.attribute8 != null) return false;
        if (attribute9 != null ? !attribute9.equals(that.attribute9) : that.attribute9 != null) return false;
        if (attribute10 != null ? !attribute10.equals(that.attribute10) : that.attribute10 != null) return false;
        if (attribute11 != null ? !attribute11.equals(that.attribute11) : that.attribute11 != null) return false;
        if (attribute12 != null ? !attribute12.equals(that.attribute12) : that.attribute12 != null) return false;
        if (attribute13 != null ? !attribute13.equals(that.attribute13) : that.attribute13 != null) return false;
        if (attribute14 != null ? !attribute14.equals(that.attribute14) : that.attribute14 != null) return false;
        if (attribute15 != null ? !attribute15.equals(that.attribute15) : that.attribute15 != null) return false;
        if (globalAttribute1 != null ? !globalAttribute1.equals(that.globalAttribute1) : that.globalAttribute1 != null)
            return false;
        if (globalAttribute2 != null ? !globalAttribute2.equals(that.globalAttribute2) : that.globalAttribute2 != null)
            return false;
        if (globalAttribute3 != null ? !globalAttribute3.equals(that.globalAttribute3) : that.globalAttribute3 != null)
            return false;
        if (globalAttribute4 != null ? !globalAttribute4.equals(that.globalAttribute4) : that.globalAttribute4 != null)
            return false;
        if (globalAttribute5 != null ? !globalAttribute5.equals(that.globalAttribute5) : that.globalAttribute5 != null)
            return false;
        if (interfaceType != null ? !interfaceType.equals(that.interfaceType) : that.interfaceType != null)
            return false;
        if (interfaceFlag != null ? !interfaceFlag.equals(that.interfaceFlag) : that.interfaceFlag != null)
            return false;
        if (ifErrorMessage != null ? !ifErrorMessage.equals(that.ifErrorMessage) : that.ifErrorMessage != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdateBy != null ? !lastUpdateBy.equals(that.lastUpdateBy) : that.lastUpdateBy != null) return false;
        if (listPricePerUnit != null ? !listPricePerUnit.equals(that.listPricePerUnit) : that.listPricePerUnit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = batchSource != null ? batchSource.hashCode() : 0;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (segment1 != null ? segment1.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (templateName != null ? templateName.hashCode() : 0);
        result = 31 * result + (primaryUom != null ? primaryUom.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (weightUom != null ? weightUom.hashCode() : 0);
        result = 31 * result + (fixedLeadtime != null ? fixedLeadtime.hashCode() : 0);
        result = 31 * result + (itemCatalogGroups != null ? itemCatalogGroups.hashCode() : 0);
        result = 31 * result + (wipFlag != null ? wipFlag.hashCode() : 0);
        result = 31 * result + (wipType != null ? wipType.hashCode() : 0);
        result = 31 * result + (catalogAttribute1 != null ? catalogAttribute1.hashCode() : 0);
        result = 31 * result + (catalogAttribute2 != null ? catalogAttribute2.hashCode() : 0);
        result = 31 * result + (catalogAttribute3 != null ? catalogAttribute3.hashCode() : 0);
        result = 31 * result + (catalogAttribute4 != null ? catalogAttribute4.hashCode() : 0);
        result = 31 * result + (categoryAttribute1 != null ? categoryAttribute1.hashCode() : 0);
        result = 31 * result + (categoryAttribute2 != null ? categoryAttribute2.hashCode() : 0);
        result = 31 * result + (categoryAttribute3 != null ? categoryAttribute3.hashCode() : 0);
        result = 31 * result + (categoryAttribute4 != null ? categoryAttribute4.hashCode() : 0);
        result = 31 * result + (categoryAttribute5 != null ? categoryAttribute5.hashCode() : 0);
        result = 31 * result + (categoryAttribute6 != null ? categoryAttribute6.hashCode() : 0);
        result = 31 * result + (categoryAttribute7 != null ? categoryAttribute7.hashCode() : 0);
        result = 31 * result + (categoryAttribute8 != null ? categoryAttribute8.hashCode() : 0);
        result = 31 * result + (categoryAttribute9 != null ? categoryAttribute9.hashCode() : 0);
        result = 31 * result + (categoryAttribute10 != null ? categoryAttribute10.hashCode() : 0);
        result = 31 * result + (oldCateAttribute1 != null ? oldCateAttribute1.hashCode() : 0);
        result = 31 * result + (oldCateAttribute2 != null ? oldCateAttribute2.hashCode() : 0);
        result = 31 * result + (oldCateAttribute3 != null ? oldCateAttribute3.hashCode() : 0);
        result = 31 * result + (oldCateAttribute4 != null ? oldCateAttribute4.hashCode() : 0);
        result = 31 * result + (oldCateAttribute5 != null ? oldCateAttribute5.hashCode() : 0);
        result = 31 * result + (oldCateAttribute6 != null ? oldCateAttribute6.hashCode() : 0);
        result = 31 * result + (oldCateAttribute7 != null ? oldCateAttribute7.hashCode() : 0);
        result = 31 * result + (oldCateAttribute8 != null ? oldCateAttribute8.hashCode() : 0);
        result = 31 * result + (oldCateAttribute9 != null ? oldCateAttribute9.hashCode() : 0);
        result = 31 * result + (oldCateAttribute10 != null ? oldCateAttribute10.hashCode() : 0);
        result = 31 * result + (attribute1 != null ? attribute1.hashCode() : 0);
        result = 31 * result + (attribute2 != null ? attribute2.hashCode() : 0);
        result = 31 * result + (attribute3 != null ? attribute3.hashCode() : 0);
        result = 31 * result + (attribute4 != null ? attribute4.hashCode() : 0);
        result = 31 * result + (attribute5 != null ? attribute5.hashCode() : 0);
        result = 31 * result + (attribute6 != null ? attribute6.hashCode() : 0);
        result = 31 * result + (attribute7 != null ? attribute7.hashCode() : 0);
        result = 31 * result + (attribute8 != null ? attribute8.hashCode() : 0);
        result = 31 * result + (attribute9 != null ? attribute9.hashCode() : 0);
        result = 31 * result + (attribute10 != null ? attribute10.hashCode() : 0);
        result = 31 * result + (attribute11 != null ? attribute11.hashCode() : 0);
        result = 31 * result + (attribute12 != null ? attribute12.hashCode() : 0);
        result = 31 * result + (attribute13 != null ? attribute13.hashCode() : 0);
        result = 31 * result + (attribute14 != null ? attribute14.hashCode() : 0);
        result = 31 * result + (attribute15 != null ? attribute15.hashCode() : 0);
        result = 31 * result + (globalAttribute1 != null ? globalAttribute1.hashCode() : 0);
        result = 31 * result + (globalAttribute2 != null ? globalAttribute2.hashCode() : 0);
        result = 31 * result + (globalAttribute3 != null ? globalAttribute3.hashCode() : 0);
        result = 31 * result + (globalAttribute4 != null ? globalAttribute4.hashCode() : 0);
        result = 31 * result + (globalAttribute5 != null ? globalAttribute5.hashCode() : 0);
        result = 31 * result + (interfaceType != null ? interfaceType.hashCode() : 0);
        result = 31 * result + (interfaceFlag != null ? interfaceFlag.hashCode() : 0);
        result = 31 * result + (ifErrorMessage != null ? ifErrorMessage.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdateBy != null ? lastUpdateBy.hashCode() : 0);
        result = 31 * result + (listPricePerUnit != null ? listPricePerUnit.hashCode() : 0);
        return result;
    }
}
