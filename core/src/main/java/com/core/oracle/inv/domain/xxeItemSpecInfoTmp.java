package com.core.oracle.inv.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "XXE_ITEM_SPEC_INFO_TMP", schema = "XXE", catalog = "")
@IdClass(xxeItemSpecInfoTmp.class)
public class xxeItemSpecInfoTmp implements Serializable {
    @Id
    private Long groupId;
    @Id
    private String itemNumber;
    private String beforeNumber;
    private String beforeCompatible;
    private LocalDateTime beforeEffectiveDate;
    private String afterNumber;
    private String afterCompatible;
    private LocalDateTime afterEffectiveDate;
    private String ifflag;
    private LocalDateTime creationDate;
    private String createdBy;
    private LocalDateTime lastUpdateDate;
    private String lastUpdatedBy;
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

    @Basic
    @Column(name = "GROUP_ID", nullable = true, precision = 0)
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "ITEM_NUMBER", nullable = false, length = 50)
    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Basic
    @Column(name = "BEFORE_NUMBER", nullable = true, length = 50)
    public String getBeforeNumber() {
        return beforeNumber;
    }

    public void setBeforeNumber(String beforeNumber) {
        this.beforeNumber = beforeNumber;
    }

    @Basic
    @Column(name = "BEFORE_COMPATIBLE", nullable = true, length = 10)
    public String getBeforeCompatible() {
        return beforeCompatible;
    }

    public void setBeforeCompatible(String beforeCompatible) {
        this.beforeCompatible = beforeCompatible;
    }

    @Basic
    @Column(name = "BEFORE_EFFECTIVE_DATE", nullable = true)
    public LocalDateTime getBeforeEffectiveDate() {
        return beforeEffectiveDate;
    }

    public void setBeforeEffectiveDate(LocalDateTime beforeEffectiveDate) {
        this.beforeEffectiveDate = beforeEffectiveDate;
    }

    @Basic
    @Column(name = "AFTER_NUMBER", nullable = true, length = 50)
    public String getAfterNumber() {
        return afterNumber;
    }

    public void setAfterNumber(String afterNumber) {
        this.afterNumber = afterNumber;
    }

    @Basic
    @Column(name = "AFTER_COMPATIBLE", nullable = true, length = 10)
    public String getAfterCompatible() {
        return afterCompatible;
    }

    public void setAfterCompatible(String afterCompatible) {
        this.afterCompatible = afterCompatible;
    }

    @Basic
    @Column(name = "AFTER_EFFECTIVE_DATE", nullable = true)
    public LocalDateTime getAfterEffectiveDate() {
        return afterEffectiveDate;
    }

    public void setAfterEffectiveDate(LocalDateTime afterEffectiveDate) {
        this.afterEffectiveDate = afterEffectiveDate;
    }

    @Basic
    @Column(name = "IFFLAG", nullable = true, length = 5)
    public String getIfflag() {
        return ifflag;
    }

    public void setIfflag(String ifflag) {
        this.ifflag = ifflag;
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
    @Column(name = "CREATED_BY", nullable = true, length = 10)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = true)
    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "LAST_UPDATED_BY", nullable = true, length = 10)
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "ATTRIBUTE1", nullable = true, length = 30)
    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Basic
    @Column(name = "ATTRIBUTE2", nullable = true, length = 30)
    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Basic
    @Column(name = "ATTRIBUTE3", nullable = true, length = 30)
    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    @Basic
    @Column(name = "ATTRIBUTE4", nullable = true, length = 30)
    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    @Basic
    @Column(name = "ATTRIBUTE5", nullable = true, length = 30)
    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    @Basic
    @Column(name = "ATTRIBUTE6", nullable = true, length = 30)
    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    @Basic
    @Column(name = "ATTRIBUTE7", nullable = true, length = 30)
    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    @Basic
    @Column(name = "ATTRIBUTE8", nullable = true, length = 30)
    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    @Basic
    @Column(name = "ATTRIBUTE9", nullable = true, length = 30)
    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    @Basic
    @Column(name = "ATTRIBUTE10", nullable = true, length = 30)
    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        xxeItemSpecInfoTmp that = (xxeItemSpecInfoTmp) o;

        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (itemNumber != null ? !itemNumber.equals(that.itemNumber) : that.itemNumber != null) return false;
        if (beforeNumber != null ? !beforeNumber.equals(that.beforeNumber) : that.beforeNumber != null) return false;
        if (beforeCompatible != null ? !beforeCompatible.equals(that.beforeCompatible) : that.beforeCompatible != null)
            return false;
        if (beforeEffectiveDate != null ? !beforeEffectiveDate.equals(that.beforeEffectiveDate) : that.beforeEffectiveDate != null)
            return false;
        if (afterNumber != null ? !afterNumber.equals(that.afterNumber) : that.afterNumber != null) return false;
        if (afterCompatible != null ? !afterCompatible.equals(that.afterCompatible) : that.afterCompatible != null)
            return false;
        if (afterEffectiveDate != null ? !afterEffectiveDate.equals(that.afterEffectiveDate) : that.afterEffectiveDate != null)
            return false;
        if (ifflag != null ? !ifflag.equals(that.ifflag) : that.ifflag != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId != null ? groupId.hashCode() : 0;
        result = 31 * result + (itemNumber != null ? itemNumber.hashCode() : 0);
        result = 31 * result + (beforeNumber != null ? beforeNumber.hashCode() : 0);
        result = 31 * result + (beforeCompatible != null ? beforeCompatible.hashCode() : 0);
        result = 31 * result + (beforeEffectiveDate != null ? beforeEffectiveDate.hashCode() : 0);
        result = 31 * result + (afterNumber != null ? afterNumber.hashCode() : 0);
        result = 31 * result + (afterCompatible != null ? afterCompatible.hashCode() : 0);
        result = 31 * result + (afterEffectiveDate != null ? afterEffectiveDate.hashCode() : 0);
        result = 31 * result + (ifflag != null ? ifflag.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
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
        return result;
    }
}
