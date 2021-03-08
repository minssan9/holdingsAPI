package com.inv.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "XXE_ERP_OTHER_TRXS", schema = "APPS", catalog = "")
public class XxeErpOtherTrxs {

    @Id
    private long seq;
    private long organizationId;
    private String groupId;
    private long lineNum;
    private String subinventoryCode;
    private long transactionTypeId;
    private long transactionActionId;
    private LocalDateTime transactionDate;
    private Long codeCombinationId;
    private String deptCode;
    private String itemCode;
    private long transactionQuantity;
    private LocalDateTime creationDate;
    private Long createdBy;
    private Long interfaceId;
    private String erpProcessSts;
    private String toSubinventoryCode;
    private Long vendorSiteId;
    private Long toOrgid;

    @Basic
    @Column(name = "ORGANIZATION_ID", nullable = false, precision = 0)
    public long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "GROUP_ID", nullable = false, length = 20)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "LINE_NUM", nullable = false, precision = 0)
    public long getLineNum() {
        return lineNum;
    }

    public void setLineNum(long lineNum) {
        this.lineNum = lineNum;
    }

    @Basic
    @Column(name = "SEQ", nullable = false, precision = 0)
    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    @Basic
    @Column(name = "SUBINVENTORY_CODE", nullable = false, length = 18)
    public String getSubinventoryCode() {
        return subinventoryCode;
    }

    public void setSubinventoryCode(String subinventoryCode) {
        this.subinventoryCode = subinventoryCode;
    }

    @Basic
    @Column(name = "TRANSACTION_TYPE_ID", nullable = false, precision = 0)
    public long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    @Basic
    @Column(name = "TRANSACTION_ACTION_ID", nullable = false, precision = 0)
    public long getTransactionActionId() {
        return transactionActionId;
    }

    public void setTransactionActionId(long transactionActionId) {
        this.transactionActionId = transactionActionId;
    }

    @Basic
    @Column(name = "TRANSACTION_DATE", nullable = false)
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Basic
    @Column(name = "CODE_COMBINATION_ID", nullable = true, precision = 0)
    public Long getCodeCombinationId() {
        return codeCombinationId;
    }

    public void setCodeCombinationId(Long codeCombinationId) {
        this.codeCombinationId = codeCombinationId;
    }

    @Basic
    @Column(name = "DEPT_CODE", nullable = true, length = 20)
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "ITEM_CODE", nullable = true, length = 40)
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Basic
    @Column(name = "TRANSACTION_QUANTITY", nullable = false, precision = 0)
    public long getTransactionQuantity() {
        return transactionQuantity;
    }

    public void setTransactionQuantity(long transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = true)
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
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
    @Column(name = "INTERFACE_ID", nullable = true, precision = 0)
    public Long getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
    }

    @Basic
    @Column(name = "ERP_PROCESS_STS", nullable = true, length = 18)
    public String getErpProcessSts() {
        return erpProcessSts;
    }

    public void setErpProcessSts(String erpProcessSts) {
        this.erpProcessSts = erpProcessSts;
    }

    @Basic
    @Column(name = "TO_SUBINVENTORY_CODE", nullable = true, length = 18)
    public String getToSubinventoryCode() {
        return toSubinventoryCode;
    }

    public void setToSubinventoryCode(String toSubinventoryCode) {
        this.toSubinventoryCode = toSubinventoryCode;
    }

    @Basic
    @Column(name = "VENDOR_SITE_ID", nullable = true, precision = 0)
    public Long getVendorSiteId() {
        return vendorSiteId;
    }

    public void setVendorSiteId(Long vendorSiteId) {
        this.vendorSiteId = vendorSiteId;
    }

    @Basic
    @Column(name = "TO_ORGID", nullable = true, precision = 0)
    public Long getToOrgid() {
        return toOrgid;
    }

    public void setToOrgid(Long toOrgid) {
        this.toOrgid = toOrgid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        XxeErpOtherTrxs that = (XxeErpOtherTrxs) o;

        if (organizationId != that.organizationId) {
            return false;
        }
        if (lineNum != that.lineNum) {
            return false;
        }
        if (seq != that.seq) {
            return false;
        }
        if (transactionTypeId != that.transactionTypeId) {
            return false;
        }
        if (transactionActionId != that.transactionActionId) {
            return false;
        }
        if (transactionQuantity != that.transactionQuantity) {
            return false;
        }
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) {
            return false;
        }
        if (subinventoryCode != null ? !subinventoryCode.equals(that.subinventoryCode)
            : that.subinventoryCode != null) {
            return false;
        }
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate)
            : that.transactionDate != null) {
            return false;
        }
        if (codeCombinationId != null ? !codeCombinationId.equals(that.codeCombinationId)
            : that.codeCombinationId != null) {
            return false;
        }
        if (deptCode != null ? !deptCode.equals(that.deptCode) : that.deptCode != null) {
            return false;
        }
        if (itemCode != null ? !itemCode.equals(that.itemCode) : that.itemCode != null) {
            return false;
        }
        if (creationDate != null ? !creationDate.equals(that.creationDate)
            : that.creationDate != null) {
            return false;
        }
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) {
            return false;
        }
        if (interfaceId != null ? !interfaceId.equals(that.interfaceId)
            : that.interfaceId != null) {
            return false;
        }
        if (erpProcessSts != null ? !erpProcessSts.equals(that.erpProcessSts)
            : that.erpProcessSts != null) {
            return false;
        }
        if (toSubinventoryCode != null ? !toSubinventoryCode.equals(that.toSubinventoryCode)
            : that.toSubinventoryCode != null) {
            return false;
        }
        if (vendorSiteId != null ? !vendorSiteId.equals(that.vendorSiteId)
            : that.vendorSiteId != null) {
            return false;
        }
        if (toOrgid != null ? !toOrgid.equals(that.toOrgid) : that.toOrgid != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (organizationId ^ (organizationId >>> 32));
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (int) (lineNum ^ (lineNum >>> 32));
        result = 31 * result + (int) (seq ^ (seq >>> 32));
        result = 31 * result + (subinventoryCode != null ? subinventoryCode.hashCode() : 0);
        result = 31 * result + (int) (transactionTypeId ^ (transactionTypeId >>> 32));
        result = 31 * result + (int) (transactionActionId ^ (transactionActionId >>> 32));
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (codeCombinationId != null ? codeCombinationId.hashCode() : 0);
        result = 31 * result + (deptCode != null ? deptCode.hashCode() : 0);
        result = 31 * result + (itemCode != null ? itemCode.hashCode() : 0);
        result = 31 * result + (int) (transactionQuantity ^ (transactionQuantity >>> 32));
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (interfaceId != null ? interfaceId.hashCode() : 0);
        result = 31 * result + (erpProcessSts != null ? erpProcessSts.hashCode() : 0);
        result = 31 * result + (toSubinventoryCode != null ? toSubinventoryCode.hashCode() : 0);
        result = 31 * result + (vendorSiteId != null ? vendorSiteId.hashCode() : 0);
        result = 31 * result + (toOrgid != null ? toOrgid.hashCode() : 0);
        return result;
    }
}
