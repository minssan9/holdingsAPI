package com.core.oracle.inv.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "XXE_INV_KPI_ITEM", schema = "XXE", catalog = "")
@IdClass(XxeInvKpiItem.class)
public class XxeInvKpiItem  implements Serializable {
    @Id
    private long organizationId;
    @Id
    private String kpiType;
    private String periodType;
    private String categorySegment1;
    private Long categorySegment2Id;
    private Time transactionDate;
    private long inventoryItemId;
    private String itemRevision;
    private Long target;
    private Long actual;
    private Long percent;
    private Long inventoryAmount;
    private Long longTermAmount;
    private Long productionAmount;
    private Long salesAmount;
    private Time lastUpdateDate;
    private long lastUpdatedBy;
    private Time creationDate;
    private long createdBy;
    private Long lastUpdateLogin;
    private String attributeCategory;
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

    @Basic
    @Column(name = "ORGANIZATION_ID", nullable = false, precision = 0)
    public long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "KPI_TYPE", nullable = false, length = 30)
    public String getKpiType() {
        return kpiType;
    }

    public void setKpiType(String kpiType) {
        this.kpiType = kpiType;
    }

    @Basic
    @Column(name = "PERIOD_TYPE", nullable = false, length = 30)
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    @Basic
    @Column(name = "CATEGORY_SEGMENT1", nullable = false, length = 30)
    public String getCategorySegment1() {
        return categorySegment1;
    }

    public void setCategorySegment1(String categorySegment1) {
        this.categorySegment1 = categorySegment1;
    }

    @Basic
    @Column(name = "CATEGORY_SEGMENT2_ID", nullable = true, precision = 0)
    public Long getCategorySegment2Id() {
        return categorySegment2Id;
    }

    public void setCategorySegment2Id(Long categorySegment2Id) {
        this.categorySegment2Id = categorySegment2Id;
    }

    @Basic
    @Column(name = "TRANSACTION_DATE", nullable = false)
    public Time getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Time transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Basic
    @Column(name = "INVENTORY_ITEM_ID", nullable = false, precision = 0)
    public long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Basic
    @Column(name = "ITEM_REVISION", nullable = true, length = 3)
    public String getItemRevision() {
        return itemRevision;
    }

    public void setItemRevision(String itemRevision) {
        this.itemRevision = itemRevision;
    }

    @Basic
    @Column(name = "TARGET", nullable = true, precision = 0)
    public Long getTarget() {
        return target;
    }

    public void setTarget(Long target) {
        this.target = target;
    }

    @Basic
    @Column(name = "ACTUAL", nullable = true, precision = 0)
    public Long getActual() {
        return actual;
    }

    public void setActual(Long actual) {
        this.actual = actual;
    }

    @Basic
    @Column(name = "PERCENT", nullable = true, precision = 0)
    public Long getPercent() {
        return percent;
    }

    public void setPercent(Long percent) {
        this.percent = percent;
    }

    @Basic
    @Column(name = "INVENTORY_AMOUNT", nullable = true, precision = 0)
    public Long getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(Long inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    @Basic
    @Column(name = "LONG_TERM_AMOUNT", nullable = true, precision = 0)
    public Long getLongTermAmount() {
        return longTermAmount;
    }

    public void setLongTermAmount(Long longTermAmount) {
        this.longTermAmount = longTermAmount;
    }

    @Basic
    @Column(name = "PRODUCTION_AMOUNT", nullable = true, precision = 0)
    public Long getProductionAmount() {
        return productionAmount;
    }

    public void setProductionAmount(Long productionAmount) {
        this.productionAmount = productionAmount;
    }

    @Basic
    @Column(name = "SALES_AMOUNT", nullable = true, precision = 0)
    public Long getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    public Time getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Time lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "LAST_UPDATED_BY", nullable = false, precision = 0)
    public long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false)
    public Time getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Time creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = false, precision = 0)
    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "LAST_UPDATE_LOGIN", nullable = true, precision = 0)
    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    @Basic
    @Column(name = "ATTRIBUTE_CATEGORY", nullable = true, length = 30)
    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    @Basic
    @Column(name = "ATTRIBUTE1", nullable = true, length = 150)
    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Basic
    @Column(name = "ATTRIBUTE2", nullable = true, length = 150)
    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Basic
    @Column(name = "ATTRIBUTE3", nullable = true, length = 150)
    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    @Basic
    @Column(name = "ATTRIBUTE4", nullable = true, length = 150)
    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    @Basic
    @Column(name = "ATTRIBUTE5", nullable = true, length = 150)
    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    @Basic
    @Column(name = "ATTRIBUTE6", nullable = true, length = 150)
    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    @Basic
    @Column(name = "ATTRIBUTE7", nullable = true, length = 150)
    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    @Basic
    @Column(name = "ATTRIBUTE8", nullable = true, length = 150)
    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    @Basic
    @Column(name = "ATTRIBUTE9", nullable = true, length = 150)
    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    @Basic
    @Column(name = "ATTRIBUTE10", nullable = true, length = 150)
    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    @Basic
    @Column(name = "ATTRIBUTE11", nullable = true, length = 150)
    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    @Basic
    @Column(name = "ATTRIBUTE12", nullable = true, length = 150)
    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    @Basic
    @Column(name = "ATTRIBUTE13", nullable = true, length = 150)
    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    @Basic
    @Column(name = "ATTRIBUTE14", nullable = true, length = 150)
    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    @Basic
    @Column(name = "ATTRIBUTE15", nullable = true, length = 150)
    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XxeInvKpiItem that = (XxeInvKpiItem) o;

        if (organizationId != that.organizationId) return false;
        if (inventoryItemId != that.inventoryItemId) return false;
        if (lastUpdatedBy != that.lastUpdatedBy) return false;
        if (createdBy != that.createdBy) return false;
        if (kpiType != null ? !kpiType.equals(that.kpiType) : that.kpiType != null) return false;
        if (periodType != null ? !periodType.equals(that.periodType) : that.periodType != null) return false;
        if (categorySegment1 != null ? !categorySegment1.equals(that.categorySegment1) : that.categorySegment1 != null)
            return false;
        if (categorySegment2Id != null ? !categorySegment2Id.equals(that.categorySegment2Id) : that.categorySegment2Id != null)
            return false;
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate) : that.transactionDate != null)
            return false;
        if (itemRevision != null ? !itemRevision.equals(that.itemRevision) : that.itemRevision != null) return false;
        if (target != null ? !target.equals(that.target) : that.target != null) return false;
        if (actual != null ? !actual.equals(that.actual) : that.actual != null) return false;
        if (percent != null ? !percent.equals(that.percent) : that.percent != null) return false;
        if (inventoryAmount != null ? !inventoryAmount.equals(that.inventoryAmount) : that.inventoryAmount != null)
            return false;
        if (longTermAmount != null ? !longTermAmount.equals(that.longTermAmount) : that.longTermAmount != null)
            return false;
        if (productionAmount != null ? !productionAmount.equals(that.productionAmount) : that.productionAmount != null)
            return false;
        if (salesAmount != null ? !salesAmount.equals(that.salesAmount) : that.salesAmount != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdateLogin != null ? !lastUpdateLogin.equals(that.lastUpdateLogin) : that.lastUpdateLogin != null)
            return false;
        if (attributeCategory != null ? !attributeCategory.equals(that.attributeCategory) : that.attributeCategory != null)
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (organizationId ^ (organizationId >>> 32));
        result = 31 * result + (kpiType != null ? kpiType.hashCode() : 0);
        result = 31 * result + (periodType != null ? periodType.hashCode() : 0);
        result = 31 * result + (categorySegment1 != null ? categorySegment1.hashCode() : 0);
        result = 31 * result + (categorySegment2Id != null ? categorySegment2Id.hashCode() : 0);
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (int) (inventoryItemId ^ (inventoryItemId >>> 32));
        result = 31 * result + (itemRevision != null ? itemRevision.hashCode() : 0);
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (actual != null ? actual.hashCode() : 0);
        result = 31 * result + (percent != null ? percent.hashCode() : 0);
        result = 31 * result + (inventoryAmount != null ? inventoryAmount.hashCode() : 0);
        result = 31 * result + (longTermAmount != null ? longTermAmount.hashCode() : 0);
        result = 31 * result + (productionAmount != null ? productionAmount.hashCode() : 0);
        result = 31 * result + (salesAmount != null ? salesAmount.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (int) (lastUpdatedBy ^ (lastUpdatedBy >>> 32));
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (int) (createdBy ^ (createdBy >>> 32));
        result = 31 * result + (lastUpdateLogin != null ? lastUpdateLogin.hashCode() : 0);
        result = 31 * result + (attributeCategory != null ? attributeCategory.hashCode() : 0);
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
        return result;
    }
}
