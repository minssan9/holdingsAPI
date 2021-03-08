package com.core.oracle.inv.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "XXE_INV_BALANCE_INTERFACE", schema = "XXE", catalog = "")
@IdClass(XxeInvBalanceInterface.class)
public class XxeInvBalanceInterface implements Serializable {
    @Id
    private Long interfaceId;
    @Id
    private Long organizationId;
    private String organizationCode;
    private String balanceType;
    @Id
    private String closingMonth;
    private Long acctPeriodId;
    @Id
    private String concatenatedSegments;
    private Long inventoryItemId;
    private String itemRevision;
    private String primaryUom;
    private Long beginingQuantity;
    private Long beginingAmount;
    private Long receiptsQuantity;
    private Long receiptsAmount;
    private Long issueQuantity;
    private Long issueAmount;
    private Long endingQuantity;
    private Long endingAmount;
    private String errorCode;

    @Basic
    @Column(name = "INTERFACE_ID", nullable = true, precision = 0)
    public Long getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
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
    @Column(name = "ORGANIZATION_CODE", nullable = true, length = 3)
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    @Basic
    @Column(name = "BALANCE_TYPE", nullable = true, length = 45)
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    @Basic
    @Column(name = "CLOSING_MONTH", nullable = true, length = 45)
    public String getClosingMonth() {
        return closingMonth;
    }

    public void setClosingMonth(String closingMonth) {
        this.closingMonth = closingMonth;
    }

    @Basic
    @Column(name = "ACCT_PERIOD_ID", nullable = true, precision = 0)
    public Long getAcctPeriodId() {
        return acctPeriodId;
    }

    public void setAcctPeriodId(Long acctPeriodId) {
        this.acctPeriodId = acctPeriodId;
    }

    @Basic
    @Column(name = "CONCATENATED_SEGMENTS", nullable = true, length = 240)
    public String getConcatenatedSegments() {
        return concatenatedSegments;
    }

    public void setConcatenatedSegments(String concatenatedSegments) {
        this.concatenatedSegments = concatenatedSegments;
    }

    @Basic
    @Column(name = "INVENTORY_ITEM_ID", nullable = true, precision = 0)
    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
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
    @Column(name = "ERROR_CODE", nullable = true, length = 240)
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XxeInvBalanceInterface that = (XxeInvBalanceInterface) o;

        if (interfaceId != null ? !interfaceId.equals(that.interfaceId) : that.interfaceId != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (organizationCode != null ? !organizationCode.equals(that.organizationCode) : that.organizationCode != null)
            return false;
        if (balanceType != null ? !balanceType.equals(that.balanceType) : that.balanceType != null) return false;
        if (closingMonth != null ? !closingMonth.equals(that.closingMonth) : that.closingMonth != null) return false;
        if (acctPeriodId != null ? !acctPeriodId.equals(that.acctPeriodId) : that.acctPeriodId != null) return false;
        if (concatenatedSegments != null ? !concatenatedSegments.equals(that.concatenatedSegments) : that.concatenatedSegments != null)
            return false;
        if (inventoryItemId != null ? !inventoryItemId.equals(that.inventoryItemId) : that.inventoryItemId != null)
            return false;
        if (itemRevision != null ? !itemRevision.equals(that.itemRevision) : that.itemRevision != null) return false;
        if (primaryUom != null ? !primaryUom.equals(that.primaryUom) : that.primaryUom != null) return false;
        if (beginingQuantity != null ? !beginingQuantity.equals(that.beginingQuantity) : that.beginingQuantity != null)
            return false;
        if (beginingAmount != null ? !beginingAmount.equals(that.beginingAmount) : that.beginingAmount != null)
            return false;
        if (receiptsQuantity != null ? !receiptsQuantity.equals(that.receiptsQuantity) : that.receiptsQuantity != null)
            return false;
        if (receiptsAmount != null ? !receiptsAmount.equals(that.receiptsAmount) : that.receiptsAmount != null)
            return false;
        if (issueQuantity != null ? !issueQuantity.equals(that.issueQuantity) : that.issueQuantity != null)
            return false;
        if (issueAmount != null ? !issueAmount.equals(that.issueAmount) : that.issueAmount != null) return false;
        if (endingQuantity != null ? !endingQuantity.equals(that.endingQuantity) : that.endingQuantity != null)
            return false;
        if (endingAmount != null ? !endingAmount.equals(that.endingAmount) : that.endingAmount != null) return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = interfaceId != null ? interfaceId.hashCode() : 0;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (organizationCode != null ? organizationCode.hashCode() : 0);
        result = 31 * result + (balanceType != null ? balanceType.hashCode() : 0);
        result = 31 * result + (closingMonth != null ? closingMonth.hashCode() : 0);
        result = 31 * result + (acctPeriodId != null ? acctPeriodId.hashCode() : 0);
        result = 31 * result + (concatenatedSegments != null ? concatenatedSegments.hashCode() : 0);
        result = 31 * result + (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        result = 31 * result + (itemRevision != null ? itemRevision.hashCode() : 0);
        result = 31 * result + (primaryUom != null ? primaryUom.hashCode() : 0);
        result = 31 * result + (beginingQuantity != null ? beginingQuantity.hashCode() : 0);
        result = 31 * result + (beginingAmount != null ? beginingAmount.hashCode() : 0);
        result = 31 * result + (receiptsQuantity != null ? receiptsQuantity.hashCode() : 0);
        result = 31 * result + (receiptsAmount != null ? receiptsAmount.hashCode() : 0);
        result = 31 * result + (issueQuantity != null ? issueQuantity.hashCode() : 0);
        result = 31 * result + (issueAmount != null ? issueAmount.hashCode() : 0);
        result = 31 * result + (endingQuantity != null ? endingQuantity.hashCode() : 0);
        result = 31 * result + (endingAmount != null ? endingAmount.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        return result;
    }
}
