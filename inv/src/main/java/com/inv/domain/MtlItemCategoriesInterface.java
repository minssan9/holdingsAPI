package com.inv.domain;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "MTL_ITEM_CATEGORIES_INTERFACE", schema = "INV", catalog = "")
public class MtlItemCategoriesInterface {

    @Id
    private Long inventoryItemId;
    private Long categorySetId;
    private Long categoryId;
    private Time lastUpdateDate;
    private Long lastUpdatedBy;
    private Time creationDate;
    private Long createdBy;
    private Long lastUpdateLogin;
    private Long requestId;
    private Long programApplicationId;
    private Long programId;
    private Time programUpdateDate;
    private Long organizationId;
    private Long transactionId;
    private Long processFlag;
    private String categorySetName;
    private String categoryName;
    private String organizationCode;
    private String itemNumber;
    private String transactionType;
    private long setProcessId;
    private Long oldCategoryId;
    private String oldCategoryName;

    @Basic
    @Column(name = "INVENTORY_ITEM_ID", nullable = false, precision = 0)
    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Basic
    @Column(name = "CATEGORY_SET_ID", nullable = true, precision = 0)
    public Long getCategorySetId() {
        return categorySetId;
    }

    public void setCategorySetId(Long categorySetId) {
        this.categorySetId = categorySetId;
    }

    @Basic
    @Column(name = "CATEGORY_ID", nullable = true, precision = 0)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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
    @Column(name = "LAST_UPDATE_LOGIN", nullable = true, precision = 0)
    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    @Basic
    @Column(name = "REQUEST_ID", nullable = true, precision = 0)
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    @Basic
    @Column(name = "PROGRAM_APPLICATION_ID", nullable = true, precision = 0)
    public Long getProgramApplicationId() {
        return programApplicationId;
    }

    public void setProgramApplicationId(Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }

    @Basic
    @Column(name = "PROGRAM_ID", nullable = true, precision = 0)
    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    @Basic
    @Column(name = "PROGRAM_UPDATE_DATE", nullable = true)
    public Time getProgramUpdateDate() {
        return programUpdateDate;
    }

    public void setProgramUpdateDate(Time programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
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
    @Column(name = "TRANSACTION_ID", nullable = true, precision = 0)
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
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
    @Column(name = "CATEGORY_SET_NAME", nullable = true, length = 30)
    public String getCategorySetName() {
        return categorySetName;
    }

    public void setCategorySetName(String categorySetName) {
        this.categorySetName = categorySetName;
    }

    @Basic
    @Column(name = "CATEGORY_NAME", nullable = true, length = 81)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
    @Column(name = "ITEM_NUMBER", nullable = true, length = 81)
    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
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
    @Column(name = "SET_PROCESS_ID", nullable = false, precision = 0)
    public long getSetProcessId() {
        return setProcessId;
    }

    public void setSetProcessId(long setProcessId) {
        this.setProcessId = setProcessId;
    }

    @Basic
    @Column(name = "OLD_CATEGORY_ID", nullable = true, precision = 0)
    public Long getOldCategoryId() {
        return oldCategoryId;
    }

    public void setOldCategoryId(Long oldCategoryId) {
        this.oldCategoryId = oldCategoryId;
    }

    @Basic
    @Column(name = "OLD_CATEGORY_NAME", nullable = true, length = 81)
    public String getOldCategoryName() {
        return oldCategoryName;
    }

    public void setOldCategoryName(String oldCategoryName) {
        this.oldCategoryName = oldCategoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MtlItemCategoriesInterface that = (MtlItemCategoriesInterface) o;

        if (setProcessId != that.setProcessId) {
            return false;
        }
        if (inventoryItemId != null ? !inventoryItemId.equals(that.inventoryItemId)
            : that.inventoryItemId != null) {
            return false;
        }
        if (categorySetId != null ? !categorySetId.equals(that.categorySetId)
            : that.categorySetId != null) {
            return false;
        }
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) {
            return false;
        }
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate)
            : that.lastUpdateDate != null) {
            return false;
        }
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy)
            : that.lastUpdatedBy != null) {
            return false;
        }
        if (creationDate != null ? !creationDate.equals(that.creationDate)
            : that.creationDate != null) {
            return false;
        }
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) {
            return false;
        }
        if (lastUpdateLogin != null ? !lastUpdateLogin.equals(that.lastUpdateLogin)
            : that.lastUpdateLogin != null) {
            return false;
        }
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) {
            return false;
        }
        if (programApplicationId != null ? !programApplicationId.equals(that.programApplicationId)
            : that.programApplicationId != null) {
            return false;
        }
        if (programId != null ? !programId.equals(that.programId) : that.programId != null) {
            return false;
        }
        if (programUpdateDate != null ? !programUpdateDate.equals(that.programUpdateDate)
            : that.programUpdateDate != null) {
            return false;
        }
        if (organizationId != null ? !organizationId.equals(that.organizationId)
            : that.organizationId != null) {
            return false;
        }
        if (transactionId != null ? !transactionId.equals(that.transactionId)
            : that.transactionId != null) {
            return false;
        }
        if (processFlag != null ? !processFlag.equals(that.processFlag)
            : that.processFlag != null) {
            return false;
        }
        if (categorySetName != null ? !categorySetName.equals(that.categorySetName)
            : that.categorySetName != null) {
            return false;
        }
        if (categoryName != null ? !categoryName.equals(that.categoryName)
            : that.categoryName != null) {
            return false;
        }
        if (organizationCode != null ? !organizationCode.equals(that.organizationCode)
            : that.organizationCode != null) {
            return false;
        }
        if (itemNumber != null ? !itemNumber.equals(that.itemNumber) : that.itemNumber != null) {
            return false;
        }
        if (transactionType != null ? !transactionType.equals(that.transactionType)
            : that.transactionType != null) {
            return false;
        }
        if (oldCategoryId != null ? !oldCategoryId.equals(that.oldCategoryId)
            : that.oldCategoryId != null) {
            return false;
        }
        if (oldCategoryName != null ? !oldCategoryName.equals(that.oldCategoryName)
            : that.oldCategoryName != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = inventoryItemId != null ? inventoryItemId.hashCode() : 0;
        result = 31 * result + (categorySetId != null ? categorySetId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastUpdateLogin != null ? lastUpdateLogin.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (programApplicationId != null ? programApplicationId.hashCode() : 0);
        result = 31 * result + (programId != null ? programId.hashCode() : 0);
        result = 31 * result + (programUpdateDate != null ? programUpdateDate.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (processFlag != null ? processFlag.hashCode() : 0);
        result = 31 * result + (categorySetName != null ? categorySetName.hashCode() : 0);
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (organizationCode != null ? organizationCode.hashCode() : 0);
        result = 31 * result + (itemNumber != null ? itemNumber.hashCode() : 0);
        result = 31 * result + (transactionType != null ? transactionType.hashCode() : 0);
        result = 31 * result + (int) (setProcessId ^ (setProcessId >>> 32));
        result = 31 * result + (oldCategoryId != null ? oldCategoryId.hashCode() : 0);
        result = 31 * result + (oldCategoryName != null ? oldCategoryName.hashCode() : 0);
        return result;
    }
}
