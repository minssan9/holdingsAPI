package halla.holdings.oracle.inv.domain;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "XXE_INV_MONTHLY_ISSUES", schema = "XXE", catalog = "")
public class XxeInvMonthlyIssues {
    @Id
    private long issueTransactionId;
    private long organizationId;
    private String balanceType;
    private long acctPeriodId;
    private Time transactionDate;
    private Time invoiceDate;
    private long inventoryItemId;
    private String itemRevision;
    private Long mmtTransactionId;
    private String itemSegment;
    private String transactionUom;
    private String primaryUom;
    private Long transactionQuantity;
    private Long primaryQuantity;
    private Long transactionAmount;
    private Long closeAmount;
    private String issueCode;
    private String noIssueTag;
    private String codeSegment1;
    private String codeSegment2;
    private String codeSourceType3;
    private String codeSource3;
    private String codeSegment3;
    private String codeSourceType4;
    private String codeSource4;
    private String codeSegment4;
    private String codeSourceType5;
    private String codeSource5;
    private String codeSegment5;
    private String creationSourceCode;
    private Time creationDate;
    private long createdBy;
    private Time lastUpdateDate;
    private long lastUpdatedBy;
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
    @Column(name = "ISSUE_TRANSACTION_ID", nullable = false, precision = 0)
    public long getIssueTransactionId() {
        return issueTransactionId;
    }

    public void setIssueTransactionId(long issueTransactionId) {
        this.issueTransactionId = issueTransactionId;
    }

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
    @Column(name = "TRANSACTION_DATE", nullable = false)
    public Time getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Time transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Basic
    @Column(name = "INVOICE_DATE", nullable = false)
    public Time getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Time invoiceDate) {
        this.invoiceDate = invoiceDate;
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
    @Column(name = "MMT_TRANSACTION_ID", nullable = true, precision = 0)
    public Long getMmtTransactionId() {
        return mmtTransactionId;
    }

    public void setMmtTransactionId(Long mmtTransactionId) {
        this.mmtTransactionId = mmtTransactionId;
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
    @Column(name = "TRANSACTION_UOM", nullable = true, length = 3)
    public String getTransactionUom() {
        return transactionUom;
    }

    public void setTransactionUom(String transactionUom) {
        this.transactionUom = transactionUom;
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
    @Column(name = "TRANSACTION_QUANTITY", nullable = true, precision = 0)
    public Long getTransactionQuantity() {
        return transactionQuantity;
    }

    public void setTransactionQuantity(Long transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }

    @Basic
    @Column(name = "PRIMARY_QUANTITY", nullable = true, precision = 0)
    public Long getPrimaryQuantity() {
        return primaryQuantity;
    }

    public void setPrimaryQuantity(Long primaryQuantity) {
        this.primaryQuantity = primaryQuantity;
    }

    @Basic
    @Column(name = "TRANSACTION_AMOUNT", nullable = true, precision = 0)
    public Long getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Long transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Basic
    @Column(name = "CLOSE_AMOUNT", nullable = true, precision = 0)
    public Long getCloseAmount() {
        return closeAmount;
    }

    public void setCloseAmount(Long closeAmount) {
        this.closeAmount = closeAmount;
    }

    @Basic
    @Column(name = "ISSUE_CODE", nullable = true, length = 3)
    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    @Basic
    @Column(name = "NO_ISSUE_TAG", nullable = true, length = 1)
    public String getNoIssueTag() {
        return noIssueTag;
    }

    public void setNoIssueTag(String noIssueTag) {
        this.noIssueTag = noIssueTag;
    }

    @Basic
    @Column(name = "CODE_SEGMENT1", nullable = true, length = 150)
    public String getCodeSegment1() {
        return codeSegment1;
    }

    public void setCodeSegment1(String codeSegment1) {
        this.codeSegment1 = codeSegment1;
    }

    @Basic
    @Column(name = "CODE_SEGMENT2", nullable = true, length = 150)
    public String getCodeSegment2() {
        return codeSegment2;
    }

    public void setCodeSegment2(String codeSegment2) {
        this.codeSegment2 = codeSegment2;
    }

    @Basic
    @Column(name = "CODE_SOURCE_TYPE3", nullable = true, length = 45)
    public String getCodeSourceType3() {
        return codeSourceType3;
    }

    public void setCodeSourceType3(String codeSourceType3) {
        this.codeSourceType3 = codeSourceType3;
    }

    @Basic
    @Column(name = "CODE_SOURCE3", nullable = true, length = 45)
    public String getCodeSource3() {
        return codeSource3;
    }

    public void setCodeSource3(String codeSource3) {
        this.codeSource3 = codeSource3;
    }

    @Basic
    @Column(name = "CODE_SEGMENT3", nullable = true, length = 150)
    public String getCodeSegment3() {
        return codeSegment3;
    }

    public void setCodeSegment3(String codeSegment3) {
        this.codeSegment3 = codeSegment3;
    }

    @Basic
    @Column(name = "CODE_SOURCE_TYPE4", nullable = true, length = 45)
    public String getCodeSourceType4() {
        return codeSourceType4;
    }

    public void setCodeSourceType4(String codeSourceType4) {
        this.codeSourceType4 = codeSourceType4;
    }

    @Basic
    @Column(name = "CODE_SOURCE4", nullable = true, length = 45)
    public String getCodeSource4() {
        return codeSource4;
    }

    public void setCodeSource4(String codeSource4) {
        this.codeSource4 = codeSource4;
    }

    @Basic
    @Column(name = "CODE_SEGMENT4", nullable = true, length = 150)
    public String getCodeSegment4() {
        return codeSegment4;
    }

    public void setCodeSegment4(String codeSegment4) {
        this.codeSegment4 = codeSegment4;
    }

    @Basic
    @Column(name = "CODE_SOURCE_TYPE5", nullable = true, length = 45)
    public String getCodeSourceType5() {
        return codeSourceType5;
    }

    public void setCodeSourceType5(String codeSourceType5) {
        this.codeSourceType5 = codeSourceType5;
    }

    @Basic
    @Column(name = "CODE_SOURCE5", nullable = true, length = 45)
    public String getCodeSource5() {
        return codeSource5;
    }

    public void setCodeSource5(String codeSource5) {
        this.codeSource5 = codeSource5;
    }

    @Basic
    @Column(name = "CODE_SEGMENT5", nullable = true, length = 150)
    public String getCodeSegment5() {
        return codeSegment5;
    }

    public void setCodeSegment5(String codeSegment5) {
        this.codeSegment5 = codeSegment5;
    }

    @Basic
    @Column(name = "CREATION_SOURCE_CODE", nullable = false, length = 45)
    public String getCreationSourceCode() {
        return creationSourceCode;
    }

    public void setCreationSourceCode(String creationSourceCode) {
        this.creationSourceCode = creationSourceCode;
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

        XxeInvMonthlyIssues that = (XxeInvMonthlyIssues) o;

        if (issueTransactionId != that.issueTransactionId) return false;
        if (organizationId != that.organizationId) return false;
        if (acctPeriodId != that.acctPeriodId) return false;
        if (inventoryItemId != that.inventoryItemId) return false;
        if (createdBy != that.createdBy) return false;
        if (lastUpdatedBy != that.lastUpdatedBy) return false;
        if (balanceType != null ? !balanceType.equals(that.balanceType) : that.balanceType != null) return false;
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate) : that.transactionDate != null)
            return false;
        if (invoiceDate != null ? !invoiceDate.equals(that.invoiceDate) : that.invoiceDate != null) return false;
        if (itemRevision != null ? !itemRevision.equals(that.itemRevision) : that.itemRevision != null) return false;
        if (mmtTransactionId != null ? !mmtTransactionId.equals(that.mmtTransactionId) : that.mmtTransactionId != null)
            return false;
        if (itemSegment != null ? !itemSegment.equals(that.itemSegment) : that.itemSegment != null) return false;
        if (transactionUom != null ? !transactionUom.equals(that.transactionUom) : that.transactionUom != null)
            return false;
        if (primaryUom != null ? !primaryUom.equals(that.primaryUom) : that.primaryUom != null) return false;
        if (transactionQuantity != null ? !transactionQuantity.equals(that.transactionQuantity) : that.transactionQuantity != null)
            return false;
        if (primaryQuantity != null ? !primaryQuantity.equals(that.primaryQuantity) : that.primaryQuantity != null)
            return false;
        if (transactionAmount != null ? !transactionAmount.equals(that.transactionAmount) : that.transactionAmount != null)
            return false;
        if (closeAmount != null ? !closeAmount.equals(that.closeAmount) : that.closeAmount != null) return false;
        if (issueCode != null ? !issueCode.equals(that.issueCode) : that.issueCode != null) return false;
        if (noIssueTag != null ? !noIssueTag.equals(that.noIssueTag) : that.noIssueTag != null) return false;
        if (codeSegment1 != null ? !codeSegment1.equals(that.codeSegment1) : that.codeSegment1 != null) return false;
        if (codeSegment2 != null ? !codeSegment2.equals(that.codeSegment2) : that.codeSegment2 != null) return false;
        if (codeSourceType3 != null ? !codeSourceType3.equals(that.codeSourceType3) : that.codeSourceType3 != null)
            return false;
        if (codeSource3 != null ? !codeSource3.equals(that.codeSource3) : that.codeSource3 != null) return false;
        if (codeSegment3 != null ? !codeSegment3.equals(that.codeSegment3) : that.codeSegment3 != null) return false;
        if (codeSourceType4 != null ? !codeSourceType4.equals(that.codeSourceType4) : that.codeSourceType4 != null)
            return false;
        if (codeSource4 != null ? !codeSource4.equals(that.codeSource4) : that.codeSource4 != null) return false;
        if (codeSegment4 != null ? !codeSegment4.equals(that.codeSegment4) : that.codeSegment4 != null) return false;
        if (codeSourceType5 != null ? !codeSourceType5.equals(that.codeSourceType5) : that.codeSourceType5 != null)
            return false;
        if (codeSource5 != null ? !codeSource5.equals(that.codeSource5) : that.codeSource5 != null) return false;
        if (codeSegment5 != null ? !codeSegment5.equals(that.codeSegment5) : that.codeSegment5 != null) return false;
        if (creationSourceCode != null ? !creationSourceCode.equals(that.creationSourceCode) : that.creationSourceCode != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
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
        int result = (int) (issueTransactionId ^ (issueTransactionId >>> 32));
        result = 31 * result + (int) (organizationId ^ (organizationId >>> 32));
        result = 31 * result + (balanceType != null ? balanceType.hashCode() : 0);
        result = 31 * result + (int) (acctPeriodId ^ (acctPeriodId >>> 32));
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        result = 31 * result + (int) (inventoryItemId ^ (inventoryItemId >>> 32));
        result = 31 * result + (itemRevision != null ? itemRevision.hashCode() : 0);
        result = 31 * result + (mmtTransactionId != null ? mmtTransactionId.hashCode() : 0);
        result = 31 * result + (itemSegment != null ? itemSegment.hashCode() : 0);
        result = 31 * result + (transactionUom != null ? transactionUom.hashCode() : 0);
        result = 31 * result + (primaryUom != null ? primaryUom.hashCode() : 0);
        result = 31 * result + (transactionQuantity != null ? transactionQuantity.hashCode() : 0);
        result = 31 * result + (primaryQuantity != null ? primaryQuantity.hashCode() : 0);
        result = 31 * result + (transactionAmount != null ? transactionAmount.hashCode() : 0);
        result = 31 * result + (closeAmount != null ? closeAmount.hashCode() : 0);
        result = 31 * result + (issueCode != null ? issueCode.hashCode() : 0);
        result = 31 * result + (noIssueTag != null ? noIssueTag.hashCode() : 0);
        result = 31 * result + (codeSegment1 != null ? codeSegment1.hashCode() : 0);
        result = 31 * result + (codeSegment2 != null ? codeSegment2.hashCode() : 0);
        result = 31 * result + (codeSourceType3 != null ? codeSourceType3.hashCode() : 0);
        result = 31 * result + (codeSource3 != null ? codeSource3.hashCode() : 0);
        result = 31 * result + (codeSegment3 != null ? codeSegment3.hashCode() : 0);
        result = 31 * result + (codeSourceType4 != null ? codeSourceType4.hashCode() : 0);
        result = 31 * result + (codeSource4 != null ? codeSource4.hashCode() : 0);
        result = 31 * result + (codeSegment4 != null ? codeSegment4.hashCode() : 0);
        result = 31 * result + (codeSourceType5 != null ? codeSourceType5.hashCode() : 0);
        result = 31 * result + (codeSource5 != null ? codeSource5.hashCode() : 0);
        result = 31 * result + (codeSegment5 != null ? codeSegment5.hashCode() : 0);
        result = 31 * result + (creationSourceCode != null ? creationSourceCode.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (int) (createdBy ^ (createdBy >>> 32));
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (int) (lastUpdatedBy ^ (lastUpdatedBy >>> 32));
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
