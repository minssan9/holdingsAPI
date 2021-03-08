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
@Table(name = "XXE_INV_MONTHLY_BALANCES", schema = "XXE", catalog = "")
@IdClass(XxeInvMonthlyBalances.class)
public class XxeInvMonthlyBalances implements Serializable {

    @Id
    private long organizationId;
    @Id
    private String balanceType;
    @Id
    private long acctPeriodId;
    @Id
    private long inventoryItemId;
    private String itemRevision;
    private String itemSegment;
    private String primaryUom;
    private Long beginingQuantity;
    private Long beginingAmount;
    private Long receiptsQuantity;
    private Long receiptsAmount;
    private Long issueQuantity;
    private Long issueAmount;
    private Long endingQuantity;
    private Long endingAmount;
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
    @Column(name = "BALANCE_TYPE", nullable = false, length = 45)
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    @Basic
    @Column(name = "ACCT_PERIOD_ID", nullable = false, precision = 0)
    public long getAcctPeriodId() {
        return acctPeriodId;
    }

    public void setAcctPeriodId(long acctPeriodId) {
        this.acctPeriodId = acctPeriodId;
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
    @Column(name = "ITEM_SEGMENT", nullable = true, length = 150)
    public String getItemSegment() {
        return itemSegment;
    }

    public void setItemSegment(String itemSegment) {
        this.itemSegment = itemSegment;
    }

    @Basic
    @Column(name = "PRIMARY_UOM", nullable = true, length = 3)
    public String getPrimaryUom() {
        return primaryUom;
    }

    public void setPrimaryUom(String primaryUom) {
        this.primaryUom = primaryUom;
    }

    @Basic
    @Column(name = "BEGINING_QUANTITY", nullable = true, precision = 0)
    public Long getBeginingQuantity() {
        return beginingQuantity;
    }

    public void setBeginingQuantity(Long beginingQuantity) {
        this.beginingQuantity = beginingQuantity;
    }

    @Basic
    @Column(name = "BEGINING_AMOUNT", nullable = true, precision = 0)
    public Long getBeginingAmount() {
        return beginingAmount;
    }

    public void setBeginingAmount(Long beginingAmount) {
        this.beginingAmount = beginingAmount;
    }

    @Basic
    @Column(name = "RECEIPTS_QUANTITY", nullable = true, precision = 0)
    public Long getReceiptsQuantity() {
        return receiptsQuantity;
    }

    public void setReceiptsQuantity(Long receiptsQuantity) {
        this.receiptsQuantity = receiptsQuantity;
    }

    @Basic
    @Column(name = "RECEIPTS_AMOUNT", nullable = true, precision = 0)
    public Long getReceiptsAmount() {
        return receiptsAmount;
    }

    public void setReceiptsAmount(Long receiptsAmount) {
        this.receiptsAmount = receiptsAmount;
    }

    @Basic
    @Column(name = "ISSUE_QUANTITY", nullable = true, precision = 0)
    public Long getIssueQuantity() {
        return issueQuantity;
    }

    public void setIssueQuantity(Long issueQuantity) {
        this.issueQuantity = issueQuantity;
    }

    @Basic
    @Column(name = "ISSUE_AMOUNT", nullable = true, precision = 0)
    public Long getIssueAmount() {
        return issueAmount;
    }

    public void setIssueAmount(Long issueAmount) {
        this.issueAmount = issueAmount;
    }

    @Basic
    @Column(name = "ENDING_QUANTITY", nullable = true, precision = 0)
    public Long getEndingQuantity() {
        return endingQuantity;
    }

    public void setEndingQuantity(Long endingQuantity) {
        this.endingQuantity = endingQuantity;
    }

    @Basic
    @Column(name = "ENDING_AMOUNT", nullable = true, precision = 0)
    public Long getEndingAmount() {
        return endingAmount;
    }

    public void setEndingAmount(Long endingAmount) {
        this.endingAmount = endingAmount;
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        XxeInvMonthlyBalances that = (XxeInvMonthlyBalances) o;

        if (organizationId != that.organizationId) {
            return false;
        }
        if (acctPeriodId != that.acctPeriodId) {
            return false;
        }
        if (inventoryItemId != that.inventoryItemId) {
            return false;
        }
        if (lastUpdatedBy != that.lastUpdatedBy) {
            return false;
        }
        if (createdBy != that.createdBy) {
            return false;
        }
        if (balanceType != null ? !balanceType.equals(that.balanceType)
            : that.balanceType != null) {
            return false;
        }
        if (itemRevision != null ? !itemRevision.equals(that.itemRevision)
            : that.itemRevision != null) {
            return false;
        }
        if (itemSegment != null ? !itemSegment.equals(that.itemSegment)
            : that.itemSegment != null) {
            return false;
        }
        if (primaryUom != null ? !primaryUom.equals(that.primaryUom) : that.primaryUom != null) {
            return false;
        }
        if (beginingQuantity != null ? !beginingQuantity.equals(that.beginingQuantity)
            : that.beginingQuantity != null) {
            return false;
        }
        if (beginingAmount != null ? !beginingAmount.equals(that.beginingAmount)
            : that.beginingAmount != null) {
            return false;
        }
        if (receiptsQuantity != null ? !receiptsQuantity.equals(that.receiptsQuantity)
            : that.receiptsQuantity != null) {
            return false;
        }
        if (receiptsAmount != null ? !receiptsAmount.equals(that.receiptsAmount)
            : that.receiptsAmount != null) {
            return false;
        }
        if (issueQuantity != null ? !issueQuantity.equals(that.issueQuantity)
            : that.issueQuantity != null) {
            return false;
        }
        if (issueAmount != null ? !issueAmount.equals(that.issueAmount)
            : that.issueAmount != null) {
            return false;
        }
        if (endingQuantity != null ? !endingQuantity.equals(that.endingQuantity)
            : that.endingQuantity != null) {
            return false;
        }
        if (endingAmount != null ? !endingAmount.equals(that.endingAmount)
            : that.endingAmount != null) {
            return false;
        }
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate)
            : that.lastUpdateDate != null) {
            return false;
        }
        if (creationDate != null ? !creationDate.equals(that.creationDate)
            : that.creationDate != null) {
            return false;
        }
        if (lastUpdateLogin != null ? !lastUpdateLogin.equals(that.lastUpdateLogin)
            : that.lastUpdateLogin != null) {
            return false;
        }
        if (attributeCategory != null ? !attributeCategory.equals(that.attributeCategory)
            : that.attributeCategory != null) {
            return false;
        }
        if (attribute1 != null ? !attribute1.equals(that.attribute1) : that.attribute1 != null) {
            return false;
        }
        if (attribute2 != null ? !attribute2.equals(that.attribute2) : that.attribute2 != null) {
            return false;
        }
        if (attribute3 != null ? !attribute3.equals(that.attribute3) : that.attribute3 != null) {
            return false;
        }
        if (attribute4 != null ? !attribute4.equals(that.attribute4) : that.attribute4 != null) {
            return false;
        }
        if (attribute5 != null ? !attribute5.equals(that.attribute5) : that.attribute5 != null) {
            return false;
        }
        if (attribute6 != null ? !attribute6.equals(that.attribute6) : that.attribute6 != null) {
            return false;
        }
        if (attribute7 != null ? !attribute7.equals(that.attribute7) : that.attribute7 != null) {
            return false;
        }
        if (attribute8 != null ? !attribute8.equals(that.attribute8) : that.attribute8 != null) {
            return false;
        }
        if (attribute9 != null ? !attribute9.equals(that.attribute9) : that.attribute9 != null) {
            return false;
        }
        if (attribute10 != null ? !attribute10.equals(that.attribute10)
            : that.attribute10 != null) {
            return false;
        }
        if (attribute11 != null ? !attribute11.equals(that.attribute11)
            : that.attribute11 != null) {
            return false;
        }
        if (attribute12 != null ? !attribute12.equals(that.attribute12)
            : that.attribute12 != null) {
            return false;
        }
        if (attribute13 != null ? !attribute13.equals(that.attribute13)
            : that.attribute13 != null) {
            return false;
        }
        if (attribute14 != null ? !attribute14.equals(that.attribute14)
            : that.attribute14 != null) {
            return false;
        }
        if (attribute15 != null ? !attribute15.equals(that.attribute15)
            : that.attribute15 != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (organizationId ^ (organizationId >>> 32));
        result = 31 * result + (balanceType != null ? balanceType.hashCode() : 0);
        result = 31 * result + (int) (acctPeriodId ^ (acctPeriodId >>> 32));
        result = 31 * result + (int) (inventoryItemId ^ (inventoryItemId >>> 32));
        result = 31 * result + (itemRevision != null ? itemRevision.hashCode() : 0);
        result = 31 * result + (itemSegment != null ? itemSegment.hashCode() : 0);
        result = 31 * result + (primaryUom != null ? primaryUom.hashCode() : 0);
        result = 31 * result + (beginingQuantity != null ? beginingQuantity.hashCode() : 0);
        result = 31 * result + (beginingAmount != null ? beginingAmount.hashCode() : 0);
        result = 31 * result + (receiptsQuantity != null ? receiptsQuantity.hashCode() : 0);
        result = 31 * result + (receiptsAmount != null ? receiptsAmount.hashCode() : 0);
        result = 31 * result + (issueQuantity != null ? issueQuantity.hashCode() : 0);
        result = 31 * result + (issueAmount != null ? issueAmount.hashCode() : 0);
        result = 31 * result + (endingQuantity != null ? endingQuantity.hashCode() : 0);
        result = 31 * result + (endingAmount != null ? endingAmount.hashCode() : 0);
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
