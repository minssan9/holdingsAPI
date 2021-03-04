package com.core.oracle.inv.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "MTL_TRANSACTION_LOTS_INTERFACE", schema = "INV", catalog = "")
public class MtlTransactionLotsInterface {
    @Id
    private long transactionInterfaceId;
    private String sourceCode;
    private Long sourceLineId;
    private Time lastUpdateDate;
    private long lastUpdatedBy;
    private Time creationDate;
    private long createdBy;
    private Long lastUpdateLogin;
    private Long requestId;
    private Long programApplicationId;
    private Long programId;
    private Time programUpdateDate;
    private String lotNumber;
    private Time lotExpirationDate;
    private long transactionQuantity;
    private Long primaryQuantity;
    private Long serialTransactionTempId;
    private String errorCode;
    private String processFlag;
    private String description;
    private String vendorName;
    private String supplierLotNumber;
    private String countryOfOrigin;
    private Time originationDate;
    private String dateCode;
    private String gradeCode;
    private Time changeDate;
    private Time maturityDate;
    private Long statusId;
    private Time retestDate;
    private Long age;
    private Long itemSize;
    private String color;
    private Long volume;
    private String volumeUom;
    private String placeOfOrigin;
    private Time killDate;
    private Time bestByDate;
    private Long length;
    private String lengthUom;
    private Long recycledContent;
    private Long thickness;
    private String thicknessUom;
    private Long width;
    private String widthUom;
    private String curlWrinkleFold;
    private String lotAttributeCategory;
    private String cAttribute1;
    private String cAttribute2;
    private String cAttribute3;
    private String cAttribute4;
    private String cAttribute5;
    private String cAttribute6;
    private String cAttribute7;
    private String cAttribute8;
    private String cAttribute9;
    private String cAttribute10;
    private String cAttribute11;
    private String cAttribute12;
    private String cAttribute13;
    private String cAttribute14;
    private String cAttribute15;
    private String cAttribute16;
    private String cAttribute17;
    private String cAttribute18;
    private String cAttribute19;
    private String cAttribute20;
    private String cAttribute21;
    private String cAttribute22;
    private String cAttribute23;
    private String cAttribute24;
    private String cAttribute25;
    private String cAttribute26;
    private String cAttribute27;
    private String cAttribute28;
    private String cAttribute29;
    private String cAttribute30;
    private Time dAttribute1;
    private Time dAttribute2;
    private Time dAttribute3;
    private Time dAttribute4;
    private Time dAttribute5;
    private Time dAttribute6;
    private Time dAttribute7;
    private Time dAttribute8;
    private Time dAttribute9;
    private Time dAttribute10;
    private Time dAttribute11;
    private Time dAttribute12;
    private Time dAttribute13;
    private Time dAttribute14;
    private Time dAttribute15;
    private Time dAttribute16;
    private Time dAttribute17;
    private Time dAttribute18;
    private Time dAttribute19;
    private Time dAttribute20;
    private Long nAttribute1;
    private Long nAttribute2;
    private Long nAttribute3;
    private Long nAttribute4;
    private Long nAttribute5;
    private Long nAttribute6;
    private Long nAttribute7;
    private Long nAttribute8;
    private Long nAttribute9;
    private Long nAttribute10;
    private Long nAttribute11;
    private Long nAttribute12;
    private Long nAttribute13;
    private Long nAttribute14;
    private Long nAttribute15;
    private Long nAttribute16;
    private Long nAttribute17;
    private Long nAttribute18;
    private Long nAttribute19;
    private Long nAttribute20;
    private Long nAttribute21;
    private Long nAttribute22;
    private Long nAttribute23;
    private Long nAttribute24;
    private Long nAttribute25;
    private Long nAttribute26;
    private Long nAttribute27;
    private Long nAttribute28;
    private Long nAttribute29;
    private Long nAttribute30;
    private Long vendorId;
    private String territoryCode;
    private String productCode;
    private Long productTransactionId;
    private Long secondaryTransactionQuantity;
    private String sublotNum;
    private String reasonCode;
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
    @Column(name = "TRANSACTION_INTERFACE_ID", nullable = false, precision = 0)
    public long getTransactionInterfaceId() {
        return transactionInterfaceId;
    }

    public void setTransactionInterfaceId(long transactionInterfaceId) {
        this.transactionInterfaceId = transactionInterfaceId;
    }

    @Basic
    @Column(name = "SOURCE_CODE", nullable = true, length = 30)
    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Basic
    @Column(name = "SOURCE_LINE_ID", nullable = true, precision = 0)
    public Long getSourceLineId() {
        return sourceLineId;
    }

    public void setSourceLineId(Long sourceLineId) {
        this.sourceLineId = sourceLineId;
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
    @Column(name = "LOT_NUMBER", nullable = false, length = 30)
    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    @Basic
    @Column(name = "LOT_EXPIRATION_DATE", nullable = true)
    public Time getLotExpirationDate() {
        return lotExpirationDate;
    }

    public void setLotExpirationDate(Time lotExpirationDate) {
        this.lotExpirationDate = lotExpirationDate;
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
    @Column(name = "PRIMARY_QUANTITY", nullable = true, precision = 0)
    public Long getPrimaryQuantity() {
        return primaryQuantity;
    }

    public void setPrimaryQuantity(Long primaryQuantity) {
        this.primaryQuantity = primaryQuantity;
    }

    @Basic
    @Column(name = "SERIAL_TRANSACTION_TEMP_ID", nullable = true, precision = 0)
    public Long getSerialTransactionTempId() {
        return serialTransactionTempId;
    }

    public void setSerialTransactionTempId(Long serialTransactionTempId) {
        this.serialTransactionTempId = serialTransactionTempId;
    }

    @Basic
    @Column(name = "ERROR_CODE", nullable = true, length = 240)
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Basic
    @Column(name = "PROCESS_FLAG", nullable = true, length = 1)
    public String getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(String processFlag) {
        this.processFlag = processFlag;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 256)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "VENDOR_NAME", nullable = true, length = 240)
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Basic
    @Column(name = "SUPPLIER_LOT_NUMBER", nullable = true, length = 150)
    public String getSupplierLotNumber() {
        return supplierLotNumber;
    }

    public void setSupplierLotNumber(String supplierLotNumber) {
        this.supplierLotNumber = supplierLotNumber;
    }

    @Basic
    @Column(name = "COUNTRY_OF_ORIGIN", nullable = true, length = 30)
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Basic
    @Column(name = "ORIGINATION_DATE", nullable = true)
    public Time getOriginationDate() {
        return originationDate;
    }

    public void setOriginationDate(Time originationDate) {
        this.originationDate = originationDate;
    }

    @Basic
    @Column(name = "DATE_CODE", nullable = true, length = 150)
    public String getDateCode() {
        return dateCode;
    }

    public void setDateCode(String dateCode) {
        this.dateCode = dateCode;
    }

    @Basic
    @Column(name = "GRADE_CODE", nullable = true, length = 150)
    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    @Basic
    @Column(name = "CHANGE_DATE", nullable = true)
    public Time getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Time changeDate) {
        this.changeDate = changeDate;
    }

    @Basic
    @Column(name = "MATURITY_DATE", nullable = true)
    public Time getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Time maturityDate) {
        this.maturityDate = maturityDate;
    }

    @Basic
    @Column(name = "STATUS_ID", nullable = true, precision = 0)
    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "RETEST_DATE", nullable = true)
    public Time getRetestDate() {
        return retestDate;
    }

    public void setRetestDate(Time retestDate) {
        this.retestDate = retestDate;
    }

    @Basic
    @Column(name = "AGE", nullable = true, precision = 0)
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Basic
    @Column(name = "ITEM_SIZE", nullable = true, precision = 0)
    public Long getItemSize() {
        return itemSize;
    }

    public void setItemSize(Long itemSize) {
        this.itemSize = itemSize;
    }

    @Basic
    @Column(name = "COLOR", nullable = true, length = 150)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "VOLUME", nullable = true, precision = 0)
    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "VOLUME_UOM", nullable = true, length = 3)
    public String getVolumeUom() {
        return volumeUom;
    }

    public void setVolumeUom(String volumeUom) {
        this.volumeUom = volumeUom;
    }

    @Basic
    @Column(name = "PLACE_OF_ORIGIN", nullable = true, length = 150)
    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    @Basic
    @Column(name = "KILL_DATE", nullable = true)
    public Time getKillDate() {
        return killDate;
    }

    public void setKillDate(Time killDate) {
        this.killDate = killDate;
    }

    @Basic
    @Column(name = "BEST_BY_DATE", nullable = true)
    public Time getBestByDate() {
        return bestByDate;
    }

    public void setBestByDate(Time bestByDate) {
        this.bestByDate = bestByDate;
    }

    @Basic
    @Column(name = "LENGTH", nullable = true, precision = 0)
    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    @Basic
    @Column(name = "LENGTH_UOM", nullable = true, length = 3)
    public String getLengthUom() {
        return lengthUom;
    }

    public void setLengthUom(String lengthUom) {
        this.lengthUom = lengthUom;
    }

    @Basic
    @Column(name = "RECYCLED_CONTENT", nullable = true, precision = 0)
    public Long getRecycledContent() {
        return recycledContent;
    }

    public void setRecycledContent(Long recycledContent) {
        this.recycledContent = recycledContent;
    }

    @Basic
    @Column(name = "THICKNESS", nullable = true, precision = 0)
    public Long getThickness() {
        return thickness;
    }

    public void setThickness(Long thickness) {
        this.thickness = thickness;
    }

    @Basic
    @Column(name = "THICKNESS_UOM", nullable = true, length = 3)
    public String getThicknessUom() {
        return thicknessUom;
    }

    public void setThicknessUom(String thicknessUom) {
        this.thicknessUom = thicknessUom;
    }

    @Basic
    @Column(name = "WIDTH", nullable = true, precision = 0)
    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    @Basic
    @Column(name = "WIDTH_UOM", nullable = true, length = 3)
    public String getWidthUom() {
        return widthUom;
    }

    public void setWidthUom(String widthUom) {
        this.widthUom = widthUom;
    }

    @Basic
    @Column(name = "CURL_WRINKLE_FOLD", nullable = true, length = 150)
    public String getCurlWrinkleFold() {
        return curlWrinkleFold;
    }

    public void setCurlWrinkleFold(String curlWrinkleFold) {
        this.curlWrinkleFold = curlWrinkleFold;
    }

    @Basic
    @Column(name = "LOT_ATTRIBUTE_CATEGORY", nullable = true, length = 30)
    public String getLotAttributeCategory() {
        return lotAttributeCategory;
    }

    public void setLotAttributeCategory(String lotAttributeCategory) {
        this.lotAttributeCategory = lotAttributeCategory;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE1", nullable = true, length = 150)
    public String getcAttribute1() {
        return cAttribute1;
    }

    public void setcAttribute1(String cAttribute1) {
        this.cAttribute1 = cAttribute1;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE2", nullable = true, length = 150)
    public String getcAttribute2() {
        return cAttribute2;
    }

    public void setcAttribute2(String cAttribute2) {
        this.cAttribute2 = cAttribute2;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE3", nullable = true, length = 150)
    public String getcAttribute3() {
        return cAttribute3;
    }

    public void setcAttribute3(String cAttribute3) {
        this.cAttribute3 = cAttribute3;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE4", nullable = true, length = 150)
    public String getcAttribute4() {
        return cAttribute4;
    }

    public void setcAttribute4(String cAttribute4) {
        this.cAttribute4 = cAttribute4;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE5", nullable = true, length = 150)
    public String getcAttribute5() {
        return cAttribute5;
    }

    public void setcAttribute5(String cAttribute5) {
        this.cAttribute5 = cAttribute5;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE6", nullable = true, length = 150)
    public String getcAttribute6() {
        return cAttribute6;
    }

    public void setcAttribute6(String cAttribute6) {
        this.cAttribute6 = cAttribute6;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE7", nullable = true, length = 150)
    public String getcAttribute7() {
        return cAttribute7;
    }

    public void setcAttribute7(String cAttribute7) {
        this.cAttribute7 = cAttribute7;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE8", nullable = true, length = 150)
    public String getcAttribute8() {
        return cAttribute8;
    }

    public void setcAttribute8(String cAttribute8) {
        this.cAttribute8 = cAttribute8;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE9", nullable = true, length = 150)
    public String getcAttribute9() {
        return cAttribute9;
    }

    public void setcAttribute9(String cAttribute9) {
        this.cAttribute9 = cAttribute9;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE10", nullable = true, length = 150)
    public String getcAttribute10() {
        return cAttribute10;
    }

    public void setcAttribute10(String cAttribute10) {
        this.cAttribute10 = cAttribute10;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE11", nullable = true, length = 150)
    public String getcAttribute11() {
        return cAttribute11;
    }

    public void setcAttribute11(String cAttribute11) {
        this.cAttribute11 = cAttribute11;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE12", nullable = true, length = 150)
    public String getcAttribute12() {
        return cAttribute12;
    }

    public void setcAttribute12(String cAttribute12) {
        this.cAttribute12 = cAttribute12;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE13", nullable = true, length = 150)
    public String getcAttribute13() {
        return cAttribute13;
    }

    public void setcAttribute13(String cAttribute13) {
        this.cAttribute13 = cAttribute13;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE14", nullable = true, length = 150)
    public String getcAttribute14() {
        return cAttribute14;
    }

    public void setcAttribute14(String cAttribute14) {
        this.cAttribute14 = cAttribute14;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE15", nullable = true, length = 150)
    public String getcAttribute15() {
        return cAttribute15;
    }

    public void setcAttribute15(String cAttribute15) {
        this.cAttribute15 = cAttribute15;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE16", nullable = true, length = 150)
    public String getcAttribute16() {
        return cAttribute16;
    }

    public void setcAttribute16(String cAttribute16) {
        this.cAttribute16 = cAttribute16;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE17", nullable = true, length = 150)
    public String getcAttribute17() {
        return cAttribute17;
    }

    public void setcAttribute17(String cAttribute17) {
        this.cAttribute17 = cAttribute17;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE18", nullable = true, length = 150)
    public String getcAttribute18() {
        return cAttribute18;
    }

    public void setcAttribute18(String cAttribute18) {
        this.cAttribute18 = cAttribute18;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE19", nullable = true, length = 150)
    public String getcAttribute19() {
        return cAttribute19;
    }

    public void setcAttribute19(String cAttribute19) {
        this.cAttribute19 = cAttribute19;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE20", nullable = true, length = 150)
    public String getcAttribute20() {
        return cAttribute20;
    }

    public void setcAttribute20(String cAttribute20) {
        this.cAttribute20 = cAttribute20;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE21", nullable = true, length = 150)
    public String getcAttribute21() {
        return cAttribute21;
    }

    public void setcAttribute21(String cAttribute21) {
        this.cAttribute21 = cAttribute21;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE22", nullable = true, length = 150)
    public String getcAttribute22() {
        return cAttribute22;
    }

    public void setcAttribute22(String cAttribute22) {
        this.cAttribute22 = cAttribute22;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE23", nullable = true, length = 150)
    public String getcAttribute23() {
        return cAttribute23;
    }

    public void setcAttribute23(String cAttribute23) {
        this.cAttribute23 = cAttribute23;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE24", nullable = true, length = 150)
    public String getcAttribute24() {
        return cAttribute24;
    }

    public void setcAttribute24(String cAttribute24) {
        this.cAttribute24 = cAttribute24;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE25", nullable = true, length = 150)
    public String getcAttribute25() {
        return cAttribute25;
    }

    public void setcAttribute25(String cAttribute25) {
        this.cAttribute25 = cAttribute25;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE26", nullable = true, length = 150)
    public String getcAttribute26() {
        return cAttribute26;
    }

    public void setcAttribute26(String cAttribute26) {
        this.cAttribute26 = cAttribute26;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE27", nullable = true, length = 150)
    public String getcAttribute27() {
        return cAttribute27;
    }

    public void setcAttribute27(String cAttribute27) {
        this.cAttribute27 = cAttribute27;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE28", nullable = true, length = 150)
    public String getcAttribute28() {
        return cAttribute28;
    }

    public void setcAttribute28(String cAttribute28) {
        this.cAttribute28 = cAttribute28;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE29", nullable = true, length = 150)
    public String getcAttribute29() {
        return cAttribute29;
    }

    public void setcAttribute29(String cAttribute29) {
        this.cAttribute29 = cAttribute29;
    }

    @Basic
    @Column(name = "C_ATTRIBUTE30", nullable = true, length = 150)
    public String getcAttribute30() {
        return cAttribute30;
    }

    public void setcAttribute30(String cAttribute30) {
        this.cAttribute30 = cAttribute30;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE1", nullable = true)
    public Time getdAttribute1() {
        return dAttribute1;
    }

    public void setdAttribute1(Time dAttribute1) {
        this.dAttribute1 = dAttribute1;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE2", nullable = true)
    public Time getdAttribute2() {
        return dAttribute2;
    }

    public void setdAttribute2(Time dAttribute2) {
        this.dAttribute2 = dAttribute2;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE3", nullable = true)
    public Time getdAttribute3() {
        return dAttribute3;
    }

    public void setdAttribute3(Time dAttribute3) {
        this.dAttribute3 = dAttribute3;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE4", nullable = true)
    public Time getdAttribute4() {
        return dAttribute4;
    }

    public void setdAttribute4(Time dAttribute4) {
        this.dAttribute4 = dAttribute4;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE5", nullable = true)
    public Time getdAttribute5() {
        return dAttribute5;
    }

    public void setdAttribute5(Time dAttribute5) {
        this.dAttribute5 = dAttribute5;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE6", nullable = true)
    public Time getdAttribute6() {
        return dAttribute6;
    }

    public void setdAttribute6(Time dAttribute6) {
        this.dAttribute6 = dAttribute6;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE7", nullable = true)
    public Time getdAttribute7() {
        return dAttribute7;
    }

    public void setdAttribute7(Time dAttribute7) {
        this.dAttribute7 = dAttribute7;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE8", nullable = true)
    public Time getdAttribute8() {
        return dAttribute8;
    }

    public void setdAttribute8(Time dAttribute8) {
        this.dAttribute8 = dAttribute8;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE9", nullable = true)
    public Time getdAttribute9() {
        return dAttribute9;
    }

    public void setdAttribute9(Time dAttribute9) {
        this.dAttribute9 = dAttribute9;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE10", nullable = true)
    public Time getdAttribute10() {
        return dAttribute10;
    }

    public void setdAttribute10(Time dAttribute10) {
        this.dAttribute10 = dAttribute10;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE11", nullable = true)
    public Time getdAttribute11() {
        return dAttribute11;
    }

    public void setdAttribute11(Time dAttribute11) {
        this.dAttribute11 = dAttribute11;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE12", nullable = true)
    public Time getdAttribute12() {
        return dAttribute12;
    }

    public void setdAttribute12(Time dAttribute12) {
        this.dAttribute12 = dAttribute12;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE13", nullable = true)
    public Time getdAttribute13() {
        return dAttribute13;
    }

    public void setdAttribute13(Time dAttribute13) {
        this.dAttribute13 = dAttribute13;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE14", nullable = true)
    public Time getdAttribute14() {
        return dAttribute14;
    }

    public void setdAttribute14(Time dAttribute14) {
        this.dAttribute14 = dAttribute14;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE15", nullable = true)
    public Time getdAttribute15() {
        return dAttribute15;
    }

    public void setdAttribute15(Time dAttribute15) {
        this.dAttribute15 = dAttribute15;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE16", nullable = true)
    public Time getdAttribute16() {
        return dAttribute16;
    }

    public void setdAttribute16(Time dAttribute16) {
        this.dAttribute16 = dAttribute16;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE17", nullable = true)
    public Time getdAttribute17() {
        return dAttribute17;
    }

    public void setdAttribute17(Time dAttribute17) {
        this.dAttribute17 = dAttribute17;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE18", nullable = true)
    public Time getdAttribute18() {
        return dAttribute18;
    }

    public void setdAttribute18(Time dAttribute18) {
        this.dAttribute18 = dAttribute18;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE19", nullable = true)
    public Time getdAttribute19() {
        return dAttribute19;
    }

    public void setdAttribute19(Time dAttribute19) {
        this.dAttribute19 = dAttribute19;
    }

    @Basic
    @Column(name = "D_ATTRIBUTE20", nullable = true)
    public Time getdAttribute20() {
        return dAttribute20;
    }

    public void setdAttribute20(Time dAttribute20) {
        this.dAttribute20 = dAttribute20;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE1", nullable = true, precision = 0)
    public Long getnAttribute1() {
        return nAttribute1;
    }

    public void setnAttribute1(Long nAttribute1) {
        this.nAttribute1 = nAttribute1;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE2", nullable = true, precision = 0)
    public Long getnAttribute2() {
        return nAttribute2;
    }

    public void setnAttribute2(Long nAttribute2) {
        this.nAttribute2 = nAttribute2;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE3", nullable = true, precision = 0)
    public Long getnAttribute3() {
        return nAttribute3;
    }

    public void setnAttribute3(Long nAttribute3) {
        this.nAttribute3 = nAttribute3;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE4", nullable = true, precision = 0)
    public Long getnAttribute4() {
        return nAttribute4;
    }

    public void setnAttribute4(Long nAttribute4) {
        this.nAttribute4 = nAttribute4;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE5", nullable = true, precision = 0)
    public Long getnAttribute5() {
        return nAttribute5;
    }

    public void setnAttribute5(Long nAttribute5) {
        this.nAttribute5 = nAttribute5;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE6", nullable = true, precision = 0)
    public Long getnAttribute6() {
        return nAttribute6;
    }

    public void setnAttribute6(Long nAttribute6) {
        this.nAttribute6 = nAttribute6;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE7", nullable = true, precision = 0)
    public Long getnAttribute7() {
        return nAttribute7;
    }

    public void setnAttribute7(Long nAttribute7) {
        this.nAttribute7 = nAttribute7;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE8", nullable = true, precision = 0)
    public Long getnAttribute8() {
        return nAttribute8;
    }

    public void setnAttribute8(Long nAttribute8) {
        this.nAttribute8 = nAttribute8;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE9", nullable = true, precision = 0)
    public Long getnAttribute9() {
        return nAttribute9;
    }

    public void setnAttribute9(Long nAttribute9) {
        this.nAttribute9 = nAttribute9;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE10", nullable = true, precision = 0)
    public Long getnAttribute10() {
        return nAttribute10;
    }

    public void setnAttribute10(Long nAttribute10) {
        this.nAttribute10 = nAttribute10;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE11", nullable = true, precision = 0)
    public Long getnAttribute11() {
        return nAttribute11;
    }

    public void setnAttribute11(Long nAttribute11) {
        this.nAttribute11 = nAttribute11;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE12", nullable = true, precision = 0)
    public Long getnAttribute12() {
        return nAttribute12;
    }

    public void setnAttribute12(Long nAttribute12) {
        this.nAttribute12 = nAttribute12;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE13", nullable = true, precision = 0)
    public Long getnAttribute13() {
        return nAttribute13;
    }

    public void setnAttribute13(Long nAttribute13) {
        this.nAttribute13 = nAttribute13;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE14", nullable = true, precision = 0)
    public Long getnAttribute14() {
        return nAttribute14;
    }

    public void setnAttribute14(Long nAttribute14) {
        this.nAttribute14 = nAttribute14;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE15", nullable = true, precision = 0)
    public Long getnAttribute15() {
        return nAttribute15;
    }

    public void setnAttribute15(Long nAttribute15) {
        this.nAttribute15 = nAttribute15;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE16", nullable = true, precision = 0)
    public Long getnAttribute16() {
        return nAttribute16;
    }

    public void setnAttribute16(Long nAttribute16) {
        this.nAttribute16 = nAttribute16;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE17", nullable = true, precision = 0)
    public Long getnAttribute17() {
        return nAttribute17;
    }

    public void setnAttribute17(Long nAttribute17) {
        this.nAttribute17 = nAttribute17;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE18", nullable = true, precision = 0)
    public Long getnAttribute18() {
        return nAttribute18;
    }

    public void setnAttribute18(Long nAttribute18) {
        this.nAttribute18 = nAttribute18;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE19", nullable = true, precision = 0)
    public Long getnAttribute19() {
        return nAttribute19;
    }

    public void setnAttribute19(Long nAttribute19) {
        this.nAttribute19 = nAttribute19;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE20", nullable = true, precision = 0)
    public Long getnAttribute20() {
        return nAttribute20;
    }

    public void setnAttribute20(Long nAttribute20) {
        this.nAttribute20 = nAttribute20;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE21", nullable = true, precision = 0)
    public Long getnAttribute21() {
        return nAttribute21;
    }

    public void setnAttribute21(Long nAttribute21) {
        this.nAttribute21 = nAttribute21;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE22", nullable = true, precision = 0)
    public Long getnAttribute22() {
        return nAttribute22;
    }

    public void setnAttribute22(Long nAttribute22) {
        this.nAttribute22 = nAttribute22;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE23", nullable = true, precision = 0)
    public Long getnAttribute23() {
        return nAttribute23;
    }

    public void setnAttribute23(Long nAttribute23) {
        this.nAttribute23 = nAttribute23;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE24", nullable = true, precision = 0)
    public Long getnAttribute24() {
        return nAttribute24;
    }

    public void setnAttribute24(Long nAttribute24) {
        this.nAttribute24 = nAttribute24;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE25", nullable = true, precision = 0)
    public Long getnAttribute25() {
        return nAttribute25;
    }

    public void setnAttribute25(Long nAttribute25) {
        this.nAttribute25 = nAttribute25;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE26", nullable = true, precision = 0)
    public Long getnAttribute26() {
        return nAttribute26;
    }

    public void setnAttribute26(Long nAttribute26) {
        this.nAttribute26 = nAttribute26;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE27", nullable = true, precision = 0)
    public Long getnAttribute27() {
        return nAttribute27;
    }

    public void setnAttribute27(Long nAttribute27) {
        this.nAttribute27 = nAttribute27;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE28", nullable = true, precision = 0)
    public Long getnAttribute28() {
        return nAttribute28;
    }

    public void setnAttribute28(Long nAttribute28) {
        this.nAttribute28 = nAttribute28;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE29", nullable = true, precision = 0)
    public Long getnAttribute29() {
        return nAttribute29;
    }

    public void setnAttribute29(Long nAttribute29) {
        this.nAttribute29 = nAttribute29;
    }

    @Basic
    @Column(name = "N_ATTRIBUTE30", nullable = true, precision = 0)
    public Long getnAttribute30() {
        return nAttribute30;
    }

    public void setnAttribute30(Long nAttribute30) {
        this.nAttribute30 = nAttribute30;
    }

    @Basic
    @Column(name = "VENDOR_ID", nullable = true, precision = 0)
    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "TERRITORY_CODE", nullable = true, length = 30)
    public String getTerritoryCode() {
        return territoryCode;
    }

    public void setTerritoryCode(String territoryCode) {
        this.territoryCode = territoryCode;
    }

    @Basic
    @Column(name = "PRODUCT_CODE", nullable = true, length = 5)
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Basic
    @Column(name = "PRODUCT_TRANSACTION_ID", nullable = true, precision = 0)
    public Long getProductTransactionId() {
        return productTransactionId;
    }

    public void setProductTransactionId(Long productTransactionId) {
        this.productTransactionId = productTransactionId;
    }

    @Basic
    @Column(name = "SECONDARY_TRANSACTION_QUANTITY", nullable = true, precision = 0)
    public Long getSecondaryTransactionQuantity() {
        return secondaryTransactionQuantity;
    }

    public void setSecondaryTransactionQuantity(Long secondaryTransactionQuantity) {
        this.secondaryTransactionQuantity = secondaryTransactionQuantity;
    }

    @Basic
    @Column(name = "SUBLOT_NUM", nullable = true, length = 32)
    public String getSublotNum() {
        return sublotNum;
    }

    public void setSublotNum(String sublotNum) {
        this.sublotNum = sublotNum;
    }

    @Basic
    @Column(name = "REASON_CODE", nullable = true, length = 4)
    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
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

        MtlTransactionLotsInterface that = (MtlTransactionLotsInterface) o;

        if (transactionInterfaceId != that.transactionInterfaceId) return false;
        if (lastUpdatedBy != that.lastUpdatedBy) return false;
        if (createdBy != that.createdBy) return false;
        if (transactionQuantity != that.transactionQuantity) return false;
        if (sourceCode != null ? !sourceCode.equals(that.sourceCode) : that.sourceCode != null) return false;
        if (sourceLineId != null ? !sourceLineId.equals(that.sourceLineId) : that.sourceLineId != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdateLogin != null ? !lastUpdateLogin.equals(that.lastUpdateLogin) : that.lastUpdateLogin != null)
            return false;
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;
        if (programApplicationId != null ? !programApplicationId.equals(that.programApplicationId) : that.programApplicationId != null)
            return false;
        if (programId != null ? !programId.equals(that.programId) : that.programId != null) return false;
        if (programUpdateDate != null ? !programUpdateDate.equals(that.programUpdateDate) : that.programUpdateDate != null)
            return false;
        if (lotNumber != null ? !lotNumber.equals(that.lotNumber) : that.lotNumber != null) return false;
        if (lotExpirationDate != null ? !lotExpirationDate.equals(that.lotExpirationDate) : that.lotExpirationDate != null)
            return false;
        if (primaryQuantity != null ? !primaryQuantity.equals(that.primaryQuantity) : that.primaryQuantity != null)
            return false;
        if (serialTransactionTempId != null ? !serialTransactionTempId.equals(that.serialTransactionTempId) : that.serialTransactionTempId != null)
            return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        if (processFlag != null ? !processFlag.equals(that.processFlag) : that.processFlag != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (vendorName != null ? !vendorName.equals(that.vendorName) : that.vendorName != null) return false;
        if (supplierLotNumber != null ? !supplierLotNumber.equals(that.supplierLotNumber) : that.supplierLotNumber != null)
            return false;
        if (countryOfOrigin != null ? !countryOfOrigin.equals(that.countryOfOrigin) : that.countryOfOrigin != null)
            return false;
        if (originationDate != null ? !originationDate.equals(that.originationDate) : that.originationDate != null)
            return false;
        if (dateCode != null ? !dateCode.equals(that.dateCode) : that.dateCode != null) return false;
        if (gradeCode != null ? !gradeCode.equals(that.gradeCode) : that.gradeCode != null) return false;
        if (changeDate != null ? !changeDate.equals(that.changeDate) : that.changeDate != null) return false;
        if (maturityDate != null ? !maturityDate.equals(that.maturityDate) : that.maturityDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (retestDate != null ? !retestDate.equals(that.retestDate) : that.retestDate != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (itemSize != null ? !itemSize.equals(that.itemSize) : that.itemSize != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (volume != null ? !volume.equals(that.volume) : that.volume != null) return false;
        if (volumeUom != null ? !volumeUom.equals(that.volumeUom) : that.volumeUom != null) return false;
        if (placeOfOrigin != null ? !placeOfOrigin.equals(that.placeOfOrigin) : that.placeOfOrigin != null)
            return false;
        if (killDate != null ? !killDate.equals(that.killDate) : that.killDate != null) return false;
        if (bestByDate != null ? !bestByDate.equals(that.bestByDate) : that.bestByDate != null) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (lengthUom != null ? !lengthUom.equals(that.lengthUom) : that.lengthUom != null) return false;
        if (recycledContent != null ? !recycledContent.equals(that.recycledContent) : that.recycledContent != null)
            return false;
        if (thickness != null ? !thickness.equals(that.thickness) : that.thickness != null) return false;
        if (thicknessUom != null ? !thicknessUom.equals(that.thicknessUom) : that.thicknessUom != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (widthUom != null ? !widthUom.equals(that.widthUom) : that.widthUom != null) return false;
        if (curlWrinkleFold != null ? !curlWrinkleFold.equals(that.curlWrinkleFold) : that.curlWrinkleFold != null)
            return false;
        if (lotAttributeCategory != null ? !lotAttributeCategory.equals(that.lotAttributeCategory) : that.lotAttributeCategory != null)
            return false;
        if (cAttribute1 != null ? !cAttribute1.equals(that.cAttribute1) : that.cAttribute1 != null) return false;
        if (cAttribute2 != null ? !cAttribute2.equals(that.cAttribute2) : that.cAttribute2 != null) return false;
        if (cAttribute3 != null ? !cAttribute3.equals(that.cAttribute3) : that.cAttribute3 != null) return false;
        if (cAttribute4 != null ? !cAttribute4.equals(that.cAttribute4) : that.cAttribute4 != null) return false;
        if (cAttribute5 != null ? !cAttribute5.equals(that.cAttribute5) : that.cAttribute5 != null) return false;
        if (cAttribute6 != null ? !cAttribute6.equals(that.cAttribute6) : that.cAttribute6 != null) return false;
        if (cAttribute7 != null ? !cAttribute7.equals(that.cAttribute7) : that.cAttribute7 != null) return false;
        if (cAttribute8 != null ? !cAttribute8.equals(that.cAttribute8) : that.cAttribute8 != null) return false;
        if (cAttribute9 != null ? !cAttribute9.equals(that.cAttribute9) : that.cAttribute9 != null) return false;
        if (cAttribute10 != null ? !cAttribute10.equals(that.cAttribute10) : that.cAttribute10 != null) return false;
        if (cAttribute11 != null ? !cAttribute11.equals(that.cAttribute11) : that.cAttribute11 != null) return false;
        if (cAttribute12 != null ? !cAttribute12.equals(that.cAttribute12) : that.cAttribute12 != null) return false;
        if (cAttribute13 != null ? !cAttribute13.equals(that.cAttribute13) : that.cAttribute13 != null) return false;
        if (cAttribute14 != null ? !cAttribute14.equals(that.cAttribute14) : that.cAttribute14 != null) return false;
        if (cAttribute15 != null ? !cAttribute15.equals(that.cAttribute15) : that.cAttribute15 != null) return false;
        if (cAttribute16 != null ? !cAttribute16.equals(that.cAttribute16) : that.cAttribute16 != null) return false;
        if (cAttribute17 != null ? !cAttribute17.equals(that.cAttribute17) : that.cAttribute17 != null) return false;
        if (cAttribute18 != null ? !cAttribute18.equals(that.cAttribute18) : that.cAttribute18 != null) return false;
        if (cAttribute19 != null ? !cAttribute19.equals(that.cAttribute19) : that.cAttribute19 != null) return false;
        if (cAttribute20 != null ? !cAttribute20.equals(that.cAttribute20) : that.cAttribute20 != null) return false;
        if (cAttribute21 != null ? !cAttribute21.equals(that.cAttribute21) : that.cAttribute21 != null) return false;
        if (cAttribute22 != null ? !cAttribute22.equals(that.cAttribute22) : that.cAttribute22 != null) return false;
        if (cAttribute23 != null ? !cAttribute23.equals(that.cAttribute23) : that.cAttribute23 != null) return false;
        if (cAttribute24 != null ? !cAttribute24.equals(that.cAttribute24) : that.cAttribute24 != null) return false;
        if (cAttribute25 != null ? !cAttribute25.equals(that.cAttribute25) : that.cAttribute25 != null) return false;
        if (cAttribute26 != null ? !cAttribute26.equals(that.cAttribute26) : that.cAttribute26 != null) return false;
        if (cAttribute27 != null ? !cAttribute27.equals(that.cAttribute27) : that.cAttribute27 != null) return false;
        if (cAttribute28 != null ? !cAttribute28.equals(that.cAttribute28) : that.cAttribute28 != null) return false;
        if (cAttribute29 != null ? !cAttribute29.equals(that.cAttribute29) : that.cAttribute29 != null) return false;
        if (cAttribute30 != null ? !cAttribute30.equals(that.cAttribute30) : that.cAttribute30 != null) return false;
        if (dAttribute1 != null ? !dAttribute1.equals(that.dAttribute1) : that.dAttribute1 != null) return false;
        if (dAttribute2 != null ? !dAttribute2.equals(that.dAttribute2) : that.dAttribute2 != null) return false;
        if (dAttribute3 != null ? !dAttribute3.equals(that.dAttribute3) : that.dAttribute3 != null) return false;
        if (dAttribute4 != null ? !dAttribute4.equals(that.dAttribute4) : that.dAttribute4 != null) return false;
        if (dAttribute5 != null ? !dAttribute5.equals(that.dAttribute5) : that.dAttribute5 != null) return false;
        if (dAttribute6 != null ? !dAttribute6.equals(that.dAttribute6) : that.dAttribute6 != null) return false;
        if (dAttribute7 != null ? !dAttribute7.equals(that.dAttribute7) : that.dAttribute7 != null) return false;
        if (dAttribute8 != null ? !dAttribute8.equals(that.dAttribute8) : that.dAttribute8 != null) return false;
        if (dAttribute9 != null ? !dAttribute9.equals(that.dAttribute9) : that.dAttribute9 != null) return false;
        if (dAttribute10 != null ? !dAttribute10.equals(that.dAttribute10) : that.dAttribute10 != null) return false;
        if (dAttribute11 != null ? !dAttribute11.equals(that.dAttribute11) : that.dAttribute11 != null) return false;
        if (dAttribute12 != null ? !dAttribute12.equals(that.dAttribute12) : that.dAttribute12 != null) return false;
        if (dAttribute13 != null ? !dAttribute13.equals(that.dAttribute13) : that.dAttribute13 != null) return false;
        if (dAttribute14 != null ? !dAttribute14.equals(that.dAttribute14) : that.dAttribute14 != null) return false;
        if (dAttribute15 != null ? !dAttribute15.equals(that.dAttribute15) : that.dAttribute15 != null) return false;
        if (dAttribute16 != null ? !dAttribute16.equals(that.dAttribute16) : that.dAttribute16 != null) return false;
        if (dAttribute17 != null ? !dAttribute17.equals(that.dAttribute17) : that.dAttribute17 != null) return false;
        if (dAttribute18 != null ? !dAttribute18.equals(that.dAttribute18) : that.dAttribute18 != null) return false;
        if (dAttribute19 != null ? !dAttribute19.equals(that.dAttribute19) : that.dAttribute19 != null) return false;
        if (dAttribute20 != null ? !dAttribute20.equals(that.dAttribute20) : that.dAttribute20 != null) return false;
        if (nAttribute1 != null ? !nAttribute1.equals(that.nAttribute1) : that.nAttribute1 != null) return false;
        if (nAttribute2 != null ? !nAttribute2.equals(that.nAttribute2) : that.nAttribute2 != null) return false;
        if (nAttribute3 != null ? !nAttribute3.equals(that.nAttribute3) : that.nAttribute3 != null) return false;
        if (nAttribute4 != null ? !nAttribute4.equals(that.nAttribute4) : that.nAttribute4 != null) return false;
        if (nAttribute5 != null ? !nAttribute5.equals(that.nAttribute5) : that.nAttribute5 != null) return false;
        if (nAttribute6 != null ? !nAttribute6.equals(that.nAttribute6) : that.nAttribute6 != null) return false;
        if (nAttribute7 != null ? !nAttribute7.equals(that.nAttribute7) : that.nAttribute7 != null) return false;
        if (nAttribute8 != null ? !nAttribute8.equals(that.nAttribute8) : that.nAttribute8 != null) return false;
        if (nAttribute9 != null ? !nAttribute9.equals(that.nAttribute9) : that.nAttribute9 != null) return false;
        if (nAttribute10 != null ? !nAttribute10.equals(that.nAttribute10) : that.nAttribute10 != null) return false;
        if (nAttribute11 != null ? !nAttribute11.equals(that.nAttribute11) : that.nAttribute11 != null) return false;
        if (nAttribute12 != null ? !nAttribute12.equals(that.nAttribute12) : that.nAttribute12 != null) return false;
        if (nAttribute13 != null ? !nAttribute13.equals(that.nAttribute13) : that.nAttribute13 != null) return false;
        if (nAttribute14 != null ? !nAttribute14.equals(that.nAttribute14) : that.nAttribute14 != null) return false;
        if (nAttribute15 != null ? !nAttribute15.equals(that.nAttribute15) : that.nAttribute15 != null) return false;
        if (nAttribute16 != null ? !nAttribute16.equals(that.nAttribute16) : that.nAttribute16 != null) return false;
        if (nAttribute17 != null ? !nAttribute17.equals(that.nAttribute17) : that.nAttribute17 != null) return false;
        if (nAttribute18 != null ? !nAttribute18.equals(that.nAttribute18) : that.nAttribute18 != null) return false;
        if (nAttribute19 != null ? !nAttribute19.equals(that.nAttribute19) : that.nAttribute19 != null) return false;
        if (nAttribute20 != null ? !nAttribute20.equals(that.nAttribute20) : that.nAttribute20 != null) return false;
        if (nAttribute21 != null ? !nAttribute21.equals(that.nAttribute21) : that.nAttribute21 != null) return false;
        if (nAttribute22 != null ? !nAttribute22.equals(that.nAttribute22) : that.nAttribute22 != null) return false;
        if (nAttribute23 != null ? !nAttribute23.equals(that.nAttribute23) : that.nAttribute23 != null) return false;
        if (nAttribute24 != null ? !nAttribute24.equals(that.nAttribute24) : that.nAttribute24 != null) return false;
        if (nAttribute25 != null ? !nAttribute25.equals(that.nAttribute25) : that.nAttribute25 != null) return false;
        if (nAttribute26 != null ? !nAttribute26.equals(that.nAttribute26) : that.nAttribute26 != null) return false;
        if (nAttribute27 != null ? !nAttribute27.equals(that.nAttribute27) : that.nAttribute27 != null) return false;
        if (nAttribute28 != null ? !nAttribute28.equals(that.nAttribute28) : that.nAttribute28 != null) return false;
        if (nAttribute29 != null ? !nAttribute29.equals(that.nAttribute29) : that.nAttribute29 != null) return false;
        if (nAttribute30 != null ? !nAttribute30.equals(that.nAttribute30) : that.nAttribute30 != null) return false;
        if (vendorId != null ? !vendorId.equals(that.vendorId) : that.vendorId != null) return false;
        if (territoryCode != null ? !territoryCode.equals(that.territoryCode) : that.territoryCode != null)
            return false;
        if (productCode != null ? !productCode.equals(that.productCode) : that.productCode != null) return false;
        if (productTransactionId != null ? !productTransactionId.equals(that.productTransactionId) : that.productTransactionId != null)
            return false;
        if (secondaryTransactionQuantity != null ? !secondaryTransactionQuantity.equals(that.secondaryTransactionQuantity) : that.secondaryTransactionQuantity != null)
            return false;
        if (sublotNum != null ? !sublotNum.equals(that.sublotNum) : that.sublotNum != null) return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;
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
        int result = (int) (transactionInterfaceId ^ (transactionInterfaceId >>> 32));
        result = 31 * result + (sourceCode != null ? sourceCode.hashCode() : 0);
        result = 31 * result + (sourceLineId != null ? sourceLineId.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (int) (lastUpdatedBy ^ (lastUpdatedBy >>> 32));
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (int) (createdBy ^ (createdBy >>> 32));
        result = 31 * result + (lastUpdateLogin != null ? lastUpdateLogin.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (programApplicationId != null ? programApplicationId.hashCode() : 0);
        result = 31 * result + (programId != null ? programId.hashCode() : 0);
        result = 31 * result + (programUpdateDate != null ? programUpdateDate.hashCode() : 0);
        result = 31 * result + (lotNumber != null ? lotNumber.hashCode() : 0);
        result = 31 * result + (lotExpirationDate != null ? lotExpirationDate.hashCode() : 0);
        result = 31 * result + (int) (transactionQuantity ^ (transactionQuantity >>> 32));
        result = 31 * result + (primaryQuantity != null ? primaryQuantity.hashCode() : 0);
        result = 31 * result + (serialTransactionTempId != null ? serialTransactionTempId.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (processFlag != null ? processFlag.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (vendorName != null ? vendorName.hashCode() : 0);
        result = 31 * result + (supplierLotNumber != null ? supplierLotNumber.hashCode() : 0);
        result = 31 * result + (countryOfOrigin != null ? countryOfOrigin.hashCode() : 0);
        result = 31 * result + (originationDate != null ? originationDate.hashCode() : 0);
        result = 31 * result + (dateCode != null ? dateCode.hashCode() : 0);
        result = 31 * result + (gradeCode != null ? gradeCode.hashCode() : 0);
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        result = 31 * result + (maturityDate != null ? maturityDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (retestDate != null ? retestDate.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (itemSize != null ? itemSize.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        result = 31 * result + (volumeUom != null ? volumeUom.hashCode() : 0);
        result = 31 * result + (placeOfOrigin != null ? placeOfOrigin.hashCode() : 0);
        result = 31 * result + (killDate != null ? killDate.hashCode() : 0);
        result = 31 * result + (bestByDate != null ? bestByDate.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (lengthUom != null ? lengthUom.hashCode() : 0);
        result = 31 * result + (recycledContent != null ? recycledContent.hashCode() : 0);
        result = 31 * result + (thickness != null ? thickness.hashCode() : 0);
        result = 31 * result + (thicknessUom != null ? thicknessUom.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (widthUom != null ? widthUom.hashCode() : 0);
        result = 31 * result + (curlWrinkleFold != null ? curlWrinkleFold.hashCode() : 0);
        result = 31 * result + (lotAttributeCategory != null ? lotAttributeCategory.hashCode() : 0);
        result = 31 * result + (cAttribute1 != null ? cAttribute1.hashCode() : 0);
        result = 31 * result + (cAttribute2 != null ? cAttribute2.hashCode() : 0);
        result = 31 * result + (cAttribute3 != null ? cAttribute3.hashCode() : 0);
        result = 31 * result + (cAttribute4 != null ? cAttribute4.hashCode() : 0);
        result = 31 * result + (cAttribute5 != null ? cAttribute5.hashCode() : 0);
        result = 31 * result + (cAttribute6 != null ? cAttribute6.hashCode() : 0);
        result = 31 * result + (cAttribute7 != null ? cAttribute7.hashCode() : 0);
        result = 31 * result + (cAttribute8 != null ? cAttribute8.hashCode() : 0);
        result = 31 * result + (cAttribute9 != null ? cAttribute9.hashCode() : 0);
        result = 31 * result + (cAttribute10 != null ? cAttribute10.hashCode() : 0);
        result = 31 * result + (cAttribute11 != null ? cAttribute11.hashCode() : 0);
        result = 31 * result + (cAttribute12 != null ? cAttribute12.hashCode() : 0);
        result = 31 * result + (cAttribute13 != null ? cAttribute13.hashCode() : 0);
        result = 31 * result + (cAttribute14 != null ? cAttribute14.hashCode() : 0);
        result = 31 * result + (cAttribute15 != null ? cAttribute15.hashCode() : 0);
        result = 31 * result + (cAttribute16 != null ? cAttribute16.hashCode() : 0);
        result = 31 * result + (cAttribute17 != null ? cAttribute17.hashCode() : 0);
        result = 31 * result + (cAttribute18 != null ? cAttribute18.hashCode() : 0);
        result = 31 * result + (cAttribute19 != null ? cAttribute19.hashCode() : 0);
        result = 31 * result + (cAttribute20 != null ? cAttribute20.hashCode() : 0);
        result = 31 * result + (cAttribute21 != null ? cAttribute21.hashCode() : 0);
        result = 31 * result + (cAttribute22 != null ? cAttribute22.hashCode() : 0);
        result = 31 * result + (cAttribute23 != null ? cAttribute23.hashCode() : 0);
        result = 31 * result + (cAttribute24 != null ? cAttribute24.hashCode() : 0);
        result = 31 * result + (cAttribute25 != null ? cAttribute25.hashCode() : 0);
        result = 31 * result + (cAttribute26 != null ? cAttribute26.hashCode() : 0);
        result = 31 * result + (cAttribute27 != null ? cAttribute27.hashCode() : 0);
        result = 31 * result + (cAttribute28 != null ? cAttribute28.hashCode() : 0);
        result = 31 * result + (cAttribute29 != null ? cAttribute29.hashCode() : 0);
        result = 31 * result + (cAttribute30 != null ? cAttribute30.hashCode() : 0);
        result = 31 * result + (dAttribute1 != null ? dAttribute1.hashCode() : 0);
        result = 31 * result + (dAttribute2 != null ? dAttribute2.hashCode() : 0);
        result = 31 * result + (dAttribute3 != null ? dAttribute3.hashCode() : 0);
        result = 31 * result + (dAttribute4 != null ? dAttribute4.hashCode() : 0);
        result = 31 * result + (dAttribute5 != null ? dAttribute5.hashCode() : 0);
        result = 31 * result + (dAttribute6 != null ? dAttribute6.hashCode() : 0);
        result = 31 * result + (dAttribute7 != null ? dAttribute7.hashCode() : 0);
        result = 31 * result + (dAttribute8 != null ? dAttribute8.hashCode() : 0);
        result = 31 * result + (dAttribute9 != null ? dAttribute9.hashCode() : 0);
        result = 31 * result + (dAttribute10 != null ? dAttribute10.hashCode() : 0);
        result = 31 * result + (dAttribute11 != null ? dAttribute11.hashCode() : 0);
        result = 31 * result + (dAttribute12 != null ? dAttribute12.hashCode() : 0);
        result = 31 * result + (dAttribute13 != null ? dAttribute13.hashCode() : 0);
        result = 31 * result + (dAttribute14 != null ? dAttribute14.hashCode() : 0);
        result = 31 * result + (dAttribute15 != null ? dAttribute15.hashCode() : 0);
        result = 31 * result + (dAttribute16 != null ? dAttribute16.hashCode() : 0);
        result = 31 * result + (dAttribute17 != null ? dAttribute17.hashCode() : 0);
        result = 31 * result + (dAttribute18 != null ? dAttribute18.hashCode() : 0);
        result = 31 * result + (dAttribute19 != null ? dAttribute19.hashCode() : 0);
        result = 31 * result + (dAttribute20 != null ? dAttribute20.hashCode() : 0);
        result = 31 * result + (nAttribute1 != null ? nAttribute1.hashCode() : 0);
        result = 31 * result + (nAttribute2 != null ? nAttribute2.hashCode() : 0);
        result = 31 * result + (nAttribute3 != null ? nAttribute3.hashCode() : 0);
        result = 31 * result + (nAttribute4 != null ? nAttribute4.hashCode() : 0);
        result = 31 * result + (nAttribute5 != null ? nAttribute5.hashCode() : 0);
        result = 31 * result + (nAttribute6 != null ? nAttribute6.hashCode() : 0);
        result = 31 * result + (nAttribute7 != null ? nAttribute7.hashCode() : 0);
        result = 31 * result + (nAttribute8 != null ? nAttribute8.hashCode() : 0);
        result = 31 * result + (nAttribute9 != null ? nAttribute9.hashCode() : 0);
        result = 31 * result + (nAttribute10 != null ? nAttribute10.hashCode() : 0);
        result = 31 * result + (nAttribute11 != null ? nAttribute11.hashCode() : 0);
        result = 31 * result + (nAttribute12 != null ? nAttribute12.hashCode() : 0);
        result = 31 * result + (nAttribute13 != null ? nAttribute13.hashCode() : 0);
        result = 31 * result + (nAttribute14 != null ? nAttribute14.hashCode() : 0);
        result = 31 * result + (nAttribute15 != null ? nAttribute15.hashCode() : 0);
        result = 31 * result + (nAttribute16 != null ? nAttribute16.hashCode() : 0);
        result = 31 * result + (nAttribute17 != null ? nAttribute17.hashCode() : 0);
        result = 31 * result + (nAttribute18 != null ? nAttribute18.hashCode() : 0);
        result = 31 * result + (nAttribute19 != null ? nAttribute19.hashCode() : 0);
        result = 31 * result + (nAttribute20 != null ? nAttribute20.hashCode() : 0);
        result = 31 * result + (nAttribute21 != null ? nAttribute21.hashCode() : 0);
        result = 31 * result + (nAttribute22 != null ? nAttribute22.hashCode() : 0);
        result = 31 * result + (nAttribute23 != null ? nAttribute23.hashCode() : 0);
        result = 31 * result + (nAttribute24 != null ? nAttribute24.hashCode() : 0);
        result = 31 * result + (nAttribute25 != null ? nAttribute25.hashCode() : 0);
        result = 31 * result + (nAttribute26 != null ? nAttribute26.hashCode() : 0);
        result = 31 * result + (nAttribute27 != null ? nAttribute27.hashCode() : 0);
        result = 31 * result + (nAttribute28 != null ? nAttribute28.hashCode() : 0);
        result = 31 * result + (nAttribute29 != null ? nAttribute29.hashCode() : 0);
        result = 31 * result + (nAttribute30 != null ? nAttribute30.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        result = 31 * result + (territoryCode != null ? territoryCode.hashCode() : 0);
        result = 31 * result + (productCode != null ? productCode.hashCode() : 0);
        result = 31 * result + (productTransactionId != null ? productTransactionId.hashCode() : 0);
        result = 31 * result + (secondaryTransactionQuantity != null ? secondaryTransactionQuantity.hashCode() : 0);
        result = 31 * result + (sublotNum != null ? sublotNum.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
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
