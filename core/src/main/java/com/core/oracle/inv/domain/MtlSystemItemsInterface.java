package com.core.oracle.inv.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "MTL_SYSTEM_ITEMS_INTERFACE", schema = "INV", catalog = "")
public class MtlSystemItemsInterface {
    @Id
    private Long inventoryItemId;
    private Long organizationId;
    private Time lastUpdateDate;
    private Long lastUpdatedBy;
    private Time creationDate;
    private Long createdBy;
    private Long lastUpdateLogin;
    private String summaryFlag;
    private String enabledFlag;
    private Time startDateActive;
    private Time endDateActive;
    private String description;
    private Long buyerId;
    private Long accountingRuleId;
    private Long invoicingRuleId;
    private String segment1;
    private String segment2;
    private String segment3;
    private String segment4;
    private String segment5;
    private String segment6;
    private String segment7;
    private String segment8;
    private String segment9;
    private String segment10;
    private String segment11;
    private String segment12;
    private String segment13;
    private String segment14;
    private String segment15;
    private String segment16;
    private String segment17;
    private String segment18;
    private String segment19;
    private String segment20;
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
    private String purchasingItemFlag;
    private String shippableItemFlag;
    private String customerOrderFlag;
    private String internalOrderFlag;
    private String serviceItemFlag;
    private String inventoryItemFlag;
    private String engItemFlag;
    private String inventoryAssetFlag;
    private String purchasingEnabledFlag;
    private String customerOrderEnabledFlag;
    private String internalOrderEnabledFlag;
    private String soTransactionsFlag;
    private String mtlTransactionsEnabledFlag;
    private String stockEnabledFlag;
    private String bomEnabledFlag;
    private String buildInWipFlag;
    private Long revisionQtyControlCode;
    private Long itemCatalogGroupId;
    private String catalogStatusFlag;
    private String checkShortagesFlag;
    private String returnableFlag;
    private Long defaultShippingOrg;
    private String collateralFlag;
    private String taxableFlag;
    private String qtyRcvExceptionCode;
    private String allowItemDescUpdateFlag;
    private String inspectionRequiredFlag;
    private String receiptRequiredFlag;
    private Long marketPrice;
    private Long hazardClassId;
    private String rfqRequiredFlag;
    private Long qtyRcvTolerance;
    private Long listPricePerUnit;
    private Long unNumberId;
    private Long priceTolerancePercent;
    private Long assetCategoryId;
    private Long roundingFactor;
    private String unitOfIssue;
    private String enforceShipToLocationCode;
    private String allowSubstituteReceiptsFlag;
    private String allowUnorderedReceiptsFlag;
    private String allowExpressDeliveryFlag;
    private Long daysEarlyReceiptAllowed;
    private Long daysLateReceiptAllowed;
    private String receiptDaysExceptionCode;
    private Long receivingRoutingId;
    private Long invoiceCloseTolerance;
    private Long receiveCloseTolerance;
    private String autoLotAlphaPrefix;
    private String startAutoLotNumber;
    private Long lotControlCode;
    private Long shelfLifeCode;
    private Long shelfLifeDays;
    private Long serialNumberControlCode;
    private String startAutoSerialNumber;
    private String autoSerialAlphaPrefix;
    private Long sourceType;
    private Long sourceOrganizationId;
    private String sourceSubinventory;
    private Long expenseAccount;
    private Long encumbranceAccount;
    private Long restrictSubinventoriesCode;
    private Long unitWeight;
    private String weightUomCode;
    private String volumeUomCode;
    private Long unitVolume;
    private Long restrictLocatorsCode;
    private Long locationControlCode;
    private Long shrinkageRate;
    private Long acceptableEarlyDays;
    private Long planningTimeFenceCode;
    private Long demandTimeFenceCode;
    private Long leadTimeLotSize;
    private Long stdLotSize;
    private Long cumManufacturingLeadTime;
    private Long overrunPercentage;
    private String mrpCalculateAtpFlag;
    private Long acceptableRateIncrease;
    private Long acceptableRateDecrease;
    private Long cumulativeTotalLeadTime;
    private Long planningTimeFenceDays;
    private Long demandTimeFenceDays;
    private String endAssemblyPeggingFlag;
    private String repetitivePlanningFlag;
    private String planningExceptionSet;
    private Long bomItemType;
    private String pickComponentsFlag;
    private String replenishToOrderFlag;
    private Long baseItemId;
    private String atpComponentsFlag;
    private String atpFlag;
    private Long fixedLeadTime;
    private Long variableLeadTime;
    private Long wipSupplyLocatorId;
    private Long wipSupplyType;
    private String wipSupplySubinventory;
    private String primaryUomCode;
    private String primaryUnitOfMeasure;
    private Long allowedUnitsLookupCode;
    private Long costOfSalesAccount;
    private Long salesAccount;
    private String defaultIncludeInRollupFlag;
    private String inventoryItemStatusCode;
    private Long inventoryPlanningCode;
    private String plannerCode;
    private Long planningMakeBuyCode;
    private Long fixedLotMultiplier;
    private Long roundingControlType;
    private Long carryingCost;
    private Long postprocessingLeadTime;
    private Long preprocessingLeadTime;
    private Long fullLeadTime;
    private Long orderCost;
    private Long mrpSafetyStockPercent;
    private Long mrpSafetyStockCode;
    private Long minMinmaxQuantity;
    private Long maxMinmaxQuantity;
    private Long minimumOrderQuantity;
    private Long fixedOrderQuantity;
    private Long fixedDaysSupply;
    private Long maximumOrderQuantity;
    private Long atpRuleId;
    private Long pickingRuleId;
    private Long reservableType;
    private Long positiveMeasurementError;
    private Long negativeMeasurementError;
    private String engineeringEcnCode;
    private Long engineeringItemId;
    private Time engineeringDate;
    private Long serviceStartingDelay;
    private String vendorWarrantyFlag;
    private String serviceableComponentFlag;
    private String serviceableProductFlag;
    private Long baseWarrantyServiceId;
    private Long paymentTermsId;
    private String preventiveMaintenanceFlag;
    private Long primarySpecialistId;
    private Long secondarySpecialistId;
    private Long serviceableItemClassId;
    private String timeBillableFlag;
    private String materialBillableFlag;
    private String expenseBillableFlag;
    private String prorateServiceFlag;
    private Long coverageScheduleId;
    private String serviceDurationPeriodCode;
    private Long serviceDuration;
    private Long warrantyVendorId;
    private Long maxWarrantyAmount;
    private String responseTimePeriodCode;
    private Long responseTimeValue;
    private String newRevisionCode;
    private String invoiceableItemFlag;
    private String taxCode;
    private String invoiceEnabledFlag;
    private String mustUseApprovedVendorFlag;
    private Long requestId;
    private Long programApplicationId;
    private Long programId;
    private Time programUpdateDate;
    private String outsideOperationFlag;
    private String outsideOperationUomType;
    private Long safetyStockBucketDays;
    private Long autoReduceMps;
    private String costingEnabledFlag;
    private String cycleCountEnabledFlag;
    private String demandSourceLine;
    private Long copyItemId;
    private String setId;
    private String revision;
    private String autoCreatedConfigFlag;
    private String itemType;
    private String modelConfigClauseName;
    private String shipModelCompleteFlag;
    private Long mrpPlanningCode;
    private Long returnInspectionRequirement;
    private Long demandSourceType;
    private Long demandSourceHeaderId;
    private Long transactionId;
    private Long processFlag;
    private String organizationCode;
    private String itemNumber;
    private String copyItemNumber;
    private Long templateId;
    private String templateName;
    private Long copyOrganizationId;
    private String copyOrganizationCode;
    private Long atoForecastControl;
    private String transactionType;
    private Long materialCost;
    private String materialSubElem;
    private Long materialOhRate;
    private String materialOhSubElem;
    private Long materialSubElemId;
    private Long materialOhSubElemId;
    private Long releaseTimeFenceCode;
    private Long releaseTimeFenceDays;
    private String containerItemFlag;
    private String vehicleItemFlag;
    private Long maximumLoadWeight;
    private Long minimumFillPercent;
    private String containerTypeCode;
    private Long internalVolume;
    private long setProcessId;
    private Time whUpdateDate;
    private Long productFamilyItemId;
    private String purchasingTaxCode;
    private Long overcompletionToleranceType;
    private Long overcompletionToleranceValue;
    private Long effectivityControl;
    private String globalAttributeCategory;
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
    private Long overShipmentTolerance;
    private Long underShipmentTolerance;
    private Long overReturnTolerance;
    private Long underReturnTolerance;
    private Long equipmentType;
    private String recoveredPartDispCode;
    private String defectTrackingOnFlag;
    private String usageItemFlag;
    private String eventFlag;
    private String electronicFlag;
    private String downloadableFlag;
    private String volDiscountExemptFlag;
    private String couponExemptFlag;
    private String commsNlTrackableFlag;
    private String assetCreationCode;
    private String commsActivationReqdFlag;
    private String orderableOnWebFlag;
    private String backOrderableFlag;
    private String webStatus;
    private String indivisibleFlag;
    private String longDescription;
    private String dimensionUomCode;
    private Long unitLength;
    private Long unitWidth;
    private Long unitHeight;
    private String bulkPickedFlag;
    private String lotStatusEnabled;
    private Long defaultLotStatusId;
    private String serialStatusEnabled;
    private Long defaultSerialStatusId;
    private String lotSplitEnabled;
    private String lotMergeEnabled;
    private Long inventoryCarryPenalty;
    private Long operationSlackPenalty;
    private String financingAllowedFlag;
    private Long eamItemType;
    private String eamActivityTypeCode;
    private String eamActivityCauseCode;
    private String eamActNotificationFlag;
    private String eamActShutdownStatus;
    private Long dualUomControl;
    private String secondaryUomCode;
    private Long dualUomDeviationHigh;
    private Long dualUomDeviationLow;
    private String contractItemTypeCode;
    private String subscriptionDependFlag;
    private String servReqEnabledCode;
    private String servBillingEnabledFlag;
    private Long servImportanceLevel;
    private String plannedInvPointFlag;
    private String lotTranslateEnabled;
    private String defaultSoSourceType;
    private String createSupplyFlag;
    private Long substitutionWindowCode;
    private Long substitutionWindowDays;
    private String ibItemInstanceClass;
    private String configModelType;
    private String lotSubstitutionEnabled;
    private Long minimumLicenseQuantity;
    private String eamActivitySourceCode;
    private Long lifecycleId;
    private Long currentPhaseId;
    private String trackingQuantityInd;
    private String ontPricingQtySource;
    private String secondaryDefaultInd;
    private Long vmiMinimumUnits;
    private Long vmiMinimumDays;
    private Long vmiMaximumUnits;
    private Long vmiMaximumDays;
    private Long vmiFixedOrderQuantity;
    private Long soAuthorizationFlag;
    private Long consignedFlag;
    private Long asnAutoexpireFlag;
    private Long vmiForecastType;
    private Long forecastHorizon;
    private Long excludeFromBudgetFlag;
    private Long daysTgtInvSupply;
    private Long daysTgtInvWindow;
    private Long daysMaxInvSupply;
    private Long daysMaxInvWindow;
    private Long drpPlannedFlag;
    private Long criticalComponentFlag;
    private Long continousTransfer;
    private Long convergence;
    private Long divergence;
    private String configOrgs;
    private String configMatch;

    @Basic
    @Column(name = "INVENTORY_ITEM_ID", nullable = true, precision = 0)
    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
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
    @Column(name = "SUMMARY_FLAG", nullable = true, length = 1)
    public String getSummaryFlag() {
        return summaryFlag;
    }

    public void setSummaryFlag(String summaryFlag) {
        this.summaryFlag = summaryFlag;
    }

    @Basic
    @Column(name = "ENABLED_FLAG", nullable = true, length = 1)
    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    @Basic
    @Column(name = "START_DATE_ACTIVE", nullable = true)
    public Time getStartDateActive() {
        return startDateActive;
    }

    public void setStartDateActive(Time startDateActive) {
        this.startDateActive = startDateActive;
    }

    @Basic
    @Column(name = "END_DATE_ACTIVE", nullable = true)
    public Time getEndDateActive() {
        return endDateActive;
    }

    public void setEndDateActive(Time endDateActive) {
        this.endDateActive = endDateActive;
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
    @Column(name = "BUYER_ID", nullable = true, precision = 0)
    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    @Basic
    @Column(name = "ACCOUNTING_RULE_ID", nullable = true, precision = 0)
    public Long getAccountingRuleId() {
        return accountingRuleId;
    }

    public void setAccountingRuleId(Long accountingRuleId) {
        this.accountingRuleId = accountingRuleId;
    }

    @Basic
    @Column(name = "INVOICING_RULE_ID", nullable = true, precision = 0)
    public Long getInvoicingRuleId() {
        return invoicingRuleId;
    }

    public void setInvoicingRuleId(Long invoicingRuleId) {
        this.invoicingRuleId = invoicingRuleId;
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
    @Column(name = "SEGMENT2", nullable = true, length = 40)
    public String getSegment2() {
        return segment2;
    }

    public void setSegment2(String segment2) {
        this.segment2 = segment2;
    }

    @Basic
    @Column(name = "SEGMENT3", nullable = true, length = 40)
    public String getSegment3() {
        return segment3;
    }

    public void setSegment3(String segment3) {
        this.segment3 = segment3;
    }

    @Basic
    @Column(name = "SEGMENT4", nullable = true, length = 40)
    public String getSegment4() {
        return segment4;
    }

    public void setSegment4(String segment4) {
        this.segment4 = segment4;
    }

    @Basic
    @Column(name = "SEGMENT5", nullable = true, length = 40)
    public String getSegment5() {
        return segment5;
    }

    public void setSegment5(String segment5) {
        this.segment5 = segment5;
    }

    @Basic
    @Column(name = "SEGMENT6", nullable = true, length = 40)
    public String getSegment6() {
        return segment6;
    }

    public void setSegment6(String segment6) {
        this.segment6 = segment6;
    }

    @Basic
    @Column(name = "SEGMENT7", nullable = true, length = 40)
    public String getSegment7() {
        return segment7;
    }

    public void setSegment7(String segment7) {
        this.segment7 = segment7;
    }

    @Basic
    @Column(name = "SEGMENT8", nullable = true, length = 40)
    public String getSegment8() {
        return segment8;
    }

    public void setSegment8(String segment8) {
        this.segment8 = segment8;
    }

    @Basic
    @Column(name = "SEGMENT9", nullable = true, length = 40)
    public String getSegment9() {
        return segment9;
    }

    public void setSegment9(String segment9) {
        this.segment9 = segment9;
    }

    @Basic
    @Column(name = "SEGMENT10", nullable = true, length = 40)
    public String getSegment10() {
        return segment10;
    }

    public void setSegment10(String segment10) {
        this.segment10 = segment10;
    }

    @Basic
    @Column(name = "SEGMENT11", nullable = true, length = 40)
    public String getSegment11() {
        return segment11;
    }

    public void setSegment11(String segment11) {
        this.segment11 = segment11;
    }

    @Basic
    @Column(name = "SEGMENT12", nullable = true, length = 40)
    public String getSegment12() {
        return segment12;
    }

    public void setSegment12(String segment12) {
        this.segment12 = segment12;
    }

    @Basic
    @Column(name = "SEGMENT13", nullable = true, length = 40)
    public String getSegment13() {
        return segment13;
    }

    public void setSegment13(String segment13) {
        this.segment13 = segment13;
    }

    @Basic
    @Column(name = "SEGMENT14", nullable = true, length = 40)
    public String getSegment14() {
        return segment14;
    }

    public void setSegment14(String segment14) {
        this.segment14 = segment14;
    }

    @Basic
    @Column(name = "SEGMENT15", nullable = true, length = 40)
    public String getSegment15() {
        return segment15;
    }

    public void setSegment15(String segment15) {
        this.segment15 = segment15;
    }

    @Basic
    @Column(name = "SEGMENT16", nullable = true, length = 40)
    public String getSegment16() {
        return segment16;
    }

    public void setSegment16(String segment16) {
        this.segment16 = segment16;
    }

    @Basic
    @Column(name = "SEGMENT17", nullable = true, length = 40)
    public String getSegment17() {
        return segment17;
    }

    public void setSegment17(String segment17) {
        this.segment17 = segment17;
    }

    @Basic
    @Column(name = "SEGMENT18", nullable = true, length = 40)
    public String getSegment18() {
        return segment18;
    }

    public void setSegment18(String segment18) {
        this.segment18 = segment18;
    }

    @Basic
    @Column(name = "SEGMENT19", nullable = true, length = 40)
    public String getSegment19() {
        return segment19;
    }

    public void setSegment19(String segment19) {
        this.segment19 = segment19;
    }

    @Basic
    @Column(name = "SEGMENT20", nullable = true, length = 40)
    public String getSegment20() {
        return segment20;
    }

    public void setSegment20(String segment20) {
        this.segment20 = segment20;
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
    @Column(name = "PURCHASING_ITEM_FLAG", nullable = true, length = 1)
    public String getPurchasingItemFlag() {
        return purchasingItemFlag;
    }

    public void setPurchasingItemFlag(String purchasingItemFlag) {
        this.purchasingItemFlag = purchasingItemFlag;
    }

    @Basic
    @Column(name = "SHIPPABLE_ITEM_FLAG", nullable = true, length = 1)
    public String getShippableItemFlag() {
        return shippableItemFlag;
    }

    public void setShippableItemFlag(String shippableItemFlag) {
        this.shippableItemFlag = shippableItemFlag;
    }

    @Basic
    @Column(name = "CUSTOMER_ORDER_FLAG", nullable = true, length = 1)
    public String getCustomerOrderFlag() {
        return customerOrderFlag;
    }

    public void setCustomerOrderFlag(String customerOrderFlag) {
        this.customerOrderFlag = customerOrderFlag;
    }

    @Basic
    @Column(name = "INTERNAL_ORDER_FLAG", nullable = true, length = 1)
    public String getInternalOrderFlag() {
        return internalOrderFlag;
    }

    public void setInternalOrderFlag(String internalOrderFlag) {
        this.internalOrderFlag = internalOrderFlag;
    }

    @Basic
    @Column(name = "SERVICE_ITEM_FLAG", nullable = true, length = 1)
    public String getServiceItemFlag() {
        return serviceItemFlag;
    }

    public void setServiceItemFlag(String serviceItemFlag) {
        this.serviceItemFlag = serviceItemFlag;
    }

    @Basic
    @Column(name = "INVENTORY_ITEM_FLAG", nullable = true, length = 1)
    public String getInventoryItemFlag() {
        return inventoryItemFlag;
    }

    public void setInventoryItemFlag(String inventoryItemFlag) {
        this.inventoryItemFlag = inventoryItemFlag;
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
    @Column(name = "INVENTORY_ASSET_FLAG", nullable = true, length = 1)
    public String getInventoryAssetFlag() {
        return inventoryAssetFlag;
    }

    public void setInventoryAssetFlag(String inventoryAssetFlag) {
        this.inventoryAssetFlag = inventoryAssetFlag;
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
    @Column(name = "CUSTOMER_ORDER_ENABLED_FLAG", nullable = true, length = 1)
    public String getCustomerOrderEnabledFlag() {
        return customerOrderEnabledFlag;
    }

    public void setCustomerOrderEnabledFlag(String customerOrderEnabledFlag) {
        this.customerOrderEnabledFlag = customerOrderEnabledFlag;
    }

    @Basic
    @Column(name = "INTERNAL_ORDER_ENABLED_FLAG", nullable = true, length = 1)
    public String getInternalOrderEnabledFlag() {
        return internalOrderEnabledFlag;
    }

    public void setInternalOrderEnabledFlag(String internalOrderEnabledFlag) {
        this.internalOrderEnabledFlag = internalOrderEnabledFlag;
    }

    @Basic
    @Column(name = "SO_TRANSACTIONS_FLAG", nullable = true, length = 1)
    public String getSoTransactionsFlag() {
        return soTransactionsFlag;
    }

    public void setSoTransactionsFlag(String soTransactionsFlag) {
        this.soTransactionsFlag = soTransactionsFlag;
    }

    @Basic
    @Column(name = "MTL_TRANSACTIONS_ENABLED_FLAG", nullable = true, length = 1)
    public String getMtlTransactionsEnabledFlag() {
        return mtlTransactionsEnabledFlag;
    }

    public void setMtlTransactionsEnabledFlag(String mtlTransactionsEnabledFlag) {
        this.mtlTransactionsEnabledFlag = mtlTransactionsEnabledFlag;
    }

    @Basic
    @Column(name = "STOCK_ENABLED_FLAG", nullable = true, length = 1)
    public String getStockEnabledFlag() {
        return stockEnabledFlag;
    }

    public void setStockEnabledFlag(String stockEnabledFlag) {
        this.stockEnabledFlag = stockEnabledFlag;
    }

    @Basic
    @Column(name = "BOM_ENABLED_FLAG", nullable = true, length = 1)
    public String getBomEnabledFlag() {
        return bomEnabledFlag;
    }

    public void setBomEnabledFlag(String bomEnabledFlag) {
        this.bomEnabledFlag = bomEnabledFlag;
    }

    @Basic
    @Column(name = "BUILD_IN_WIP_FLAG", nullable = true, length = 1)
    public String getBuildInWipFlag() {
        return buildInWipFlag;
    }

    public void setBuildInWipFlag(String buildInWipFlag) {
        this.buildInWipFlag = buildInWipFlag;
    }

    @Basic
    @Column(name = "REVISION_QTY_CONTROL_CODE", nullable = true, precision = 0)
    public Long getRevisionQtyControlCode() {
        return revisionQtyControlCode;
    }

    public void setRevisionQtyControlCode(Long revisionQtyControlCode) {
        this.revisionQtyControlCode = revisionQtyControlCode;
    }

    @Basic
    @Column(name = "ITEM_CATALOG_GROUP_ID", nullable = true, precision = 0)
    public Long getItemCatalogGroupId() {
        return itemCatalogGroupId;
    }

    public void setItemCatalogGroupId(Long itemCatalogGroupId) {
        this.itemCatalogGroupId = itemCatalogGroupId;
    }

    @Basic
    @Column(name = "CATALOG_STATUS_FLAG", nullable = true, length = 1)
    public String getCatalogStatusFlag() {
        return catalogStatusFlag;
    }

    public void setCatalogStatusFlag(String catalogStatusFlag) {
        this.catalogStatusFlag = catalogStatusFlag;
    }

    @Basic
    @Column(name = "CHECK_SHORTAGES_FLAG", nullable = true, length = 1)
    public String getCheckShortagesFlag() {
        return checkShortagesFlag;
    }

    public void setCheckShortagesFlag(String checkShortagesFlag) {
        this.checkShortagesFlag = checkShortagesFlag;
    }

    @Basic
    @Column(name = "RETURNABLE_FLAG", nullable = true, length = 1)
    public String getReturnableFlag() {
        return returnableFlag;
    }

    public void setReturnableFlag(String returnableFlag) {
        this.returnableFlag = returnableFlag;
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
    @Column(name = "COLLATERAL_FLAG", nullable = true, length = 1)
    public String getCollateralFlag() {
        return collateralFlag;
    }

    public void setCollateralFlag(String collateralFlag) {
        this.collateralFlag = collateralFlag;
    }

    @Basic
    @Column(name = "TAXABLE_FLAG", nullable = true, length = 1)
    public String getTaxableFlag() {
        return taxableFlag;
    }

    public void setTaxableFlag(String taxableFlag) {
        this.taxableFlag = taxableFlag;
    }

    @Basic
    @Column(name = "QTY_RCV_EXCEPTION_CODE", nullable = true, length = 25)
    public String getQtyRcvExceptionCode() {
        return qtyRcvExceptionCode;
    }

    public void setQtyRcvExceptionCode(String qtyRcvExceptionCode) {
        this.qtyRcvExceptionCode = qtyRcvExceptionCode;
    }

    @Basic
    @Column(name = "ALLOW_ITEM_DESC_UPDATE_FLAG", nullable = true, length = 1)
    public String getAllowItemDescUpdateFlag() {
        return allowItemDescUpdateFlag;
    }

    public void setAllowItemDescUpdateFlag(String allowItemDescUpdateFlag) {
        this.allowItemDescUpdateFlag = allowItemDescUpdateFlag;
    }

    @Basic
    @Column(name = "INSPECTION_REQUIRED_FLAG", nullable = true, length = 1)
    public String getInspectionRequiredFlag() {
        return inspectionRequiredFlag;
    }

    public void setInspectionRequiredFlag(String inspectionRequiredFlag) {
        this.inspectionRequiredFlag = inspectionRequiredFlag;
    }

    @Basic
    @Column(name = "RECEIPT_REQUIRED_FLAG", nullable = true, length = 1)
    public String getReceiptRequiredFlag() {
        return receiptRequiredFlag;
    }

    public void setReceiptRequiredFlag(String receiptRequiredFlag) {
        this.receiptRequiredFlag = receiptRequiredFlag;
    }

    @Basic
    @Column(name = "MARKET_PRICE", nullable = true, precision = 0)
    public Long getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Basic
    @Column(name = "HAZARD_CLASS_ID", nullable = true, precision = 0)
    public Long getHazardClassId() {
        return hazardClassId;
    }

    public void setHazardClassId(Long hazardClassId) {
        this.hazardClassId = hazardClassId;
    }

    @Basic
    @Column(name = "RFQ_REQUIRED_FLAG", nullable = true, length = 1)
    public String getRfqRequiredFlag() {
        return rfqRequiredFlag;
    }

    public void setRfqRequiredFlag(String rfqRequiredFlag) {
        this.rfqRequiredFlag = rfqRequiredFlag;
    }

    @Basic
    @Column(name = "QTY_RCV_TOLERANCE", nullable = true, precision = 0)
    public Long getQtyRcvTolerance() {
        return qtyRcvTolerance;
    }

    public void setQtyRcvTolerance(Long qtyRcvTolerance) {
        this.qtyRcvTolerance = qtyRcvTolerance;
    }

    @Basic
    @Column(name = "LIST_PRICE_PER_UNIT", nullable = true, precision = 0)
    public Long getListPricePerUnit() {
        return listPricePerUnit;
    }

    public void setListPricePerUnit(Long listPricePerUnit) {
        this.listPricePerUnit = listPricePerUnit;
    }

    @Basic
    @Column(name = "UN_NUMBER_ID", nullable = true, precision = 0)
    public Long getUnNumberId() {
        return unNumberId;
    }

    public void setUnNumberId(Long unNumberId) {
        this.unNumberId = unNumberId;
    }

    @Basic
    @Column(name = "PRICE_TOLERANCE_PERCENT", nullable = true, precision = 0)
    public Long getPriceTolerancePercent() {
        return priceTolerancePercent;
    }

    public void setPriceTolerancePercent(Long priceTolerancePercent) {
        this.priceTolerancePercent = priceTolerancePercent;
    }

    @Basic
    @Column(name = "ASSET_CATEGORY_ID", nullable = true, precision = 0)
    public Long getAssetCategoryId() {
        return assetCategoryId;
    }

    public void setAssetCategoryId(Long assetCategoryId) {
        this.assetCategoryId = assetCategoryId;
    }

    @Basic
    @Column(name = "ROUNDING_FACTOR", nullable = true, precision = 0)
    public Long getRoundingFactor() {
        return roundingFactor;
    }

    public void setRoundingFactor(Long roundingFactor) {
        this.roundingFactor = roundingFactor;
    }

    @Basic
    @Column(name = "UNIT_OF_ISSUE", nullable = true, length = 25)
    public String getUnitOfIssue() {
        return unitOfIssue;
    }

    public void setUnitOfIssue(String unitOfIssue) {
        this.unitOfIssue = unitOfIssue;
    }

    @Basic
    @Column(name = "ENFORCE_SHIP_TO_LOCATION_CODE", nullable = true, length = 25)
    public String getEnforceShipToLocationCode() {
        return enforceShipToLocationCode;
    }

    public void setEnforceShipToLocationCode(String enforceShipToLocationCode) {
        this.enforceShipToLocationCode = enforceShipToLocationCode;
    }

    @Basic
    @Column(name = "ALLOW_SUBSTITUTE_RECEIPTS_FLAG", nullable = true, length = 1)
    public String getAllowSubstituteReceiptsFlag() {
        return allowSubstituteReceiptsFlag;
    }

    public void setAllowSubstituteReceiptsFlag(String allowSubstituteReceiptsFlag) {
        this.allowSubstituteReceiptsFlag = allowSubstituteReceiptsFlag;
    }

    @Basic
    @Column(name = "ALLOW_UNORDERED_RECEIPTS_FLAG", nullable = true, length = 1)
    public String getAllowUnorderedReceiptsFlag() {
        return allowUnorderedReceiptsFlag;
    }

    public void setAllowUnorderedReceiptsFlag(String allowUnorderedReceiptsFlag) {
        this.allowUnorderedReceiptsFlag = allowUnorderedReceiptsFlag;
    }

    @Basic
    @Column(name = "ALLOW_EXPRESS_DELIVERY_FLAG", nullable = true, length = 1)
    public String getAllowExpressDeliveryFlag() {
        return allowExpressDeliveryFlag;
    }

    public void setAllowExpressDeliveryFlag(String allowExpressDeliveryFlag) {
        this.allowExpressDeliveryFlag = allowExpressDeliveryFlag;
    }

    @Basic
    @Column(name = "DAYS_EARLY_RECEIPT_ALLOWED", nullable = true, precision = 0)
    public Long getDaysEarlyReceiptAllowed() {
        return daysEarlyReceiptAllowed;
    }

    public void setDaysEarlyReceiptAllowed(Long daysEarlyReceiptAllowed) {
        this.daysEarlyReceiptAllowed = daysEarlyReceiptAllowed;
    }

    @Basic
    @Column(name = "DAYS_LATE_RECEIPT_ALLOWED", nullable = true, precision = 0)
    public Long getDaysLateReceiptAllowed() {
        return daysLateReceiptAllowed;
    }

    public void setDaysLateReceiptAllowed(Long daysLateReceiptAllowed) {
        this.daysLateReceiptAllowed = daysLateReceiptAllowed;
    }

    @Basic
    @Column(name = "RECEIPT_DAYS_EXCEPTION_CODE", nullable = true, length = 25)
    public String getReceiptDaysExceptionCode() {
        return receiptDaysExceptionCode;
    }

    public void setReceiptDaysExceptionCode(String receiptDaysExceptionCode) {
        this.receiptDaysExceptionCode = receiptDaysExceptionCode;
    }

    @Basic
    @Column(name = "RECEIVING_ROUTING_ID", nullable = true, precision = 0)
    public Long getReceivingRoutingId() {
        return receivingRoutingId;
    }

    public void setReceivingRoutingId(Long receivingRoutingId) {
        this.receivingRoutingId = receivingRoutingId;
    }

    @Basic
    @Column(name = "INVOICE_CLOSE_TOLERANCE", nullable = true, precision = 0)
    public Long getInvoiceCloseTolerance() {
        return invoiceCloseTolerance;
    }

    public void setInvoiceCloseTolerance(Long invoiceCloseTolerance) {
        this.invoiceCloseTolerance = invoiceCloseTolerance;
    }

    @Basic
    @Column(name = "RECEIVE_CLOSE_TOLERANCE", nullable = true, precision = 0)
    public Long getReceiveCloseTolerance() {
        return receiveCloseTolerance;
    }

    public void setReceiveCloseTolerance(Long receiveCloseTolerance) {
        this.receiveCloseTolerance = receiveCloseTolerance;
    }

    @Basic
    @Column(name = "AUTO_LOT_ALPHA_PREFIX", nullable = true, length = 30)
    public String getAutoLotAlphaPrefix() {
        return autoLotAlphaPrefix;
    }

    public void setAutoLotAlphaPrefix(String autoLotAlphaPrefix) {
        this.autoLotAlphaPrefix = autoLotAlphaPrefix;
    }

    @Basic
    @Column(name = "START_AUTO_LOT_NUMBER", nullable = true, length = 30)
    public String getStartAutoLotNumber() {
        return startAutoLotNumber;
    }

    public void setStartAutoLotNumber(String startAutoLotNumber) {
        this.startAutoLotNumber = startAutoLotNumber;
    }

    @Basic
    @Column(name = "LOT_CONTROL_CODE", nullable = true, precision = 0)
    public Long getLotControlCode() {
        return lotControlCode;
    }

    public void setLotControlCode(Long lotControlCode) {
        this.lotControlCode = lotControlCode;
    }

    @Basic
    @Column(name = "SHELF_LIFE_CODE", nullable = true, precision = 0)
    public Long getShelfLifeCode() {
        return shelfLifeCode;
    }

    public void setShelfLifeCode(Long shelfLifeCode) {
        this.shelfLifeCode = shelfLifeCode;
    }

    @Basic
    @Column(name = "SHELF_LIFE_DAYS", nullable = true, precision = 0)
    public Long getShelfLifeDays() {
        return shelfLifeDays;
    }

    public void setShelfLifeDays(Long shelfLifeDays) {
        this.shelfLifeDays = shelfLifeDays;
    }

    @Basic
    @Column(name = "SERIAL_NUMBER_CONTROL_CODE", nullable = true, precision = 0)
    public Long getSerialNumberControlCode() {
        return serialNumberControlCode;
    }

    public void setSerialNumberControlCode(Long serialNumberControlCode) {
        this.serialNumberControlCode = serialNumberControlCode;
    }

    @Basic
    @Column(name = "START_AUTO_SERIAL_NUMBER", nullable = true, length = 30)
    public String getStartAutoSerialNumber() {
        return startAutoSerialNumber;
    }

    public void setStartAutoSerialNumber(String startAutoSerialNumber) {
        this.startAutoSerialNumber = startAutoSerialNumber;
    }

    @Basic
    @Column(name = "AUTO_SERIAL_ALPHA_PREFIX", nullable = true, length = 30)
    public String getAutoSerialAlphaPrefix() {
        return autoSerialAlphaPrefix;
    }

    public void setAutoSerialAlphaPrefix(String autoSerialAlphaPrefix) {
        this.autoSerialAlphaPrefix = autoSerialAlphaPrefix;
    }

    @Basic
    @Column(name = "SOURCE_TYPE", nullable = true, precision = 0)
    public Long getSourceType() {
        return sourceType;
    }

    public void setSourceType(Long sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "SOURCE_ORGANIZATION_ID", nullable = true, precision = 0)
    public Long getSourceOrganizationId() {
        return sourceOrganizationId;
    }

    public void setSourceOrganizationId(Long sourceOrganizationId) {
        this.sourceOrganizationId = sourceOrganizationId;
    }

    @Basic
    @Column(name = "SOURCE_SUBINVENTORY", nullable = true, length = 10)
    public String getSourceSubinventory() {
        return sourceSubinventory;
    }

    public void setSourceSubinventory(String sourceSubinventory) {
        this.sourceSubinventory = sourceSubinventory;
    }

    @Basic
    @Column(name = "EXPENSE_ACCOUNT", nullable = true, precision = 0)
    public Long getExpenseAccount() {
        return expenseAccount;
    }

    public void setExpenseAccount(Long expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    @Basic
    @Column(name = "ENCUMBRANCE_ACCOUNT", nullable = true, precision = 0)
    public Long getEncumbranceAccount() {
        return encumbranceAccount;
    }

    public void setEncumbranceAccount(Long encumbranceAccount) {
        this.encumbranceAccount = encumbranceAccount;
    }

    @Basic
    @Column(name = "RESTRICT_SUBINVENTORIES_CODE", nullable = true, precision = 0)
    public Long getRestrictSubinventoriesCode() {
        return restrictSubinventoriesCode;
    }

    public void setRestrictSubinventoriesCode(Long restrictSubinventoriesCode) {
        this.restrictSubinventoriesCode = restrictSubinventoriesCode;
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
    @Column(name = "WEIGHT_UOM_CODE", nullable = true, length = 3)
    public String getWeightUomCode() {
        return weightUomCode;
    }

    public void setWeightUomCode(String weightUomCode) {
        this.weightUomCode = weightUomCode;
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
    @Column(name = "RESTRICT_LOCATORS_CODE", nullable = true, precision = 0)
    public Long getRestrictLocatorsCode() {
        return restrictLocatorsCode;
    }

    public void setRestrictLocatorsCode(Long restrictLocatorsCode) {
        this.restrictLocatorsCode = restrictLocatorsCode;
    }

    @Basic
    @Column(name = "LOCATION_CONTROL_CODE", nullable = true, precision = 0)
    public Long getLocationControlCode() {
        return locationControlCode;
    }

    public void setLocationControlCode(Long locationControlCode) {
        this.locationControlCode = locationControlCode;
    }

    @Basic
    @Column(name = "SHRINKAGE_RATE", nullable = true, precision = 0)
    public Long getShrinkageRate() {
        return shrinkageRate;
    }

    public void setShrinkageRate(Long shrinkageRate) {
        this.shrinkageRate = shrinkageRate;
    }

    @Basic
    @Column(name = "ACCEPTABLE_EARLY_DAYS", nullable = true, precision = 0)
    public Long getAcceptableEarlyDays() {
        return acceptableEarlyDays;
    }

    public void setAcceptableEarlyDays(Long acceptableEarlyDays) {
        this.acceptableEarlyDays = acceptableEarlyDays;
    }

    @Basic
    @Column(name = "PLANNING_TIME_FENCE_CODE", nullable = true, precision = 0)
    public Long getPlanningTimeFenceCode() {
        return planningTimeFenceCode;
    }

    public void setPlanningTimeFenceCode(Long planningTimeFenceCode) {
        this.planningTimeFenceCode = planningTimeFenceCode;
    }

    @Basic
    @Column(name = "DEMAND_TIME_FENCE_CODE", nullable = true, precision = 0)
    public Long getDemandTimeFenceCode() {
        return demandTimeFenceCode;
    }

    public void setDemandTimeFenceCode(Long demandTimeFenceCode) {
        this.demandTimeFenceCode = demandTimeFenceCode;
    }

    @Basic
    @Column(name = "LEAD_TIME_LOT_SIZE", nullable = true, precision = 0)
    public Long getLeadTimeLotSize() {
        return leadTimeLotSize;
    }

    public void setLeadTimeLotSize(Long leadTimeLotSize) {
        this.leadTimeLotSize = leadTimeLotSize;
    }

    @Basic
    @Column(name = "STD_LOT_SIZE", nullable = true, precision = 0)
    public Long getStdLotSize() {
        return stdLotSize;
    }

    public void setStdLotSize(Long stdLotSize) {
        this.stdLotSize = stdLotSize;
    }

    @Basic
    @Column(name = "CUM_MANUFACTURING_LEAD_TIME", nullable = true, precision = 0)
    public Long getCumManufacturingLeadTime() {
        return cumManufacturingLeadTime;
    }

    public void setCumManufacturingLeadTime(Long cumManufacturingLeadTime) {
        this.cumManufacturingLeadTime = cumManufacturingLeadTime;
    }

    @Basic
    @Column(name = "OVERRUN_PERCENTAGE", nullable = true, precision = 0)
    public Long getOverrunPercentage() {
        return overrunPercentage;
    }

    public void setOverrunPercentage(Long overrunPercentage) {
        this.overrunPercentage = overrunPercentage;
    }

    @Basic
    @Column(name = "MRP_CALCULATE_ATP_FLAG", nullable = true, length = 1)
    public String getMrpCalculateAtpFlag() {
        return mrpCalculateAtpFlag;
    }

    public void setMrpCalculateAtpFlag(String mrpCalculateAtpFlag) {
        this.mrpCalculateAtpFlag = mrpCalculateAtpFlag;
    }

    @Basic
    @Column(name = "ACCEPTABLE_RATE_INCREASE", nullable = true, precision = 0)
    public Long getAcceptableRateIncrease() {
        return acceptableRateIncrease;
    }

    public void setAcceptableRateIncrease(Long acceptableRateIncrease) {
        this.acceptableRateIncrease = acceptableRateIncrease;
    }

    @Basic
    @Column(name = "ACCEPTABLE_RATE_DECREASE", nullable = true, precision = 0)
    public Long getAcceptableRateDecrease() {
        return acceptableRateDecrease;
    }

    public void setAcceptableRateDecrease(Long acceptableRateDecrease) {
        this.acceptableRateDecrease = acceptableRateDecrease;
    }

    @Basic
    @Column(name = "CUMULATIVE_TOTAL_LEAD_TIME", nullable = true, precision = 0)
    public Long getCumulativeTotalLeadTime() {
        return cumulativeTotalLeadTime;
    }

    public void setCumulativeTotalLeadTime(Long cumulativeTotalLeadTime) {
        this.cumulativeTotalLeadTime = cumulativeTotalLeadTime;
    }

    @Basic
    @Column(name = "PLANNING_TIME_FENCE_DAYS", nullable = true, precision = 0)
    public Long getPlanningTimeFenceDays() {
        return planningTimeFenceDays;
    }

    public void setPlanningTimeFenceDays(Long planningTimeFenceDays) {
        this.planningTimeFenceDays = planningTimeFenceDays;
    }

    @Basic
    @Column(name = "DEMAND_TIME_FENCE_DAYS", nullable = true, precision = 0)
    public Long getDemandTimeFenceDays() {
        return demandTimeFenceDays;
    }

    public void setDemandTimeFenceDays(Long demandTimeFenceDays) {
        this.demandTimeFenceDays = demandTimeFenceDays;
    }

    @Basic
    @Column(name = "END_ASSEMBLY_PEGGING_FLAG", nullable = true, length = 1)
    public String getEndAssemblyPeggingFlag() {
        return endAssemblyPeggingFlag;
    }

    public void setEndAssemblyPeggingFlag(String endAssemblyPeggingFlag) {
        this.endAssemblyPeggingFlag = endAssemblyPeggingFlag;
    }

    @Basic
    @Column(name = "REPETITIVE_PLANNING_FLAG", nullable = true, length = 1)
    public String getRepetitivePlanningFlag() {
        return repetitivePlanningFlag;
    }

    public void setRepetitivePlanningFlag(String repetitivePlanningFlag) {
        this.repetitivePlanningFlag = repetitivePlanningFlag;
    }

    @Basic
    @Column(name = "PLANNING_EXCEPTION_SET", nullable = true, length = 10)
    public String getPlanningExceptionSet() {
        return planningExceptionSet;
    }

    public void setPlanningExceptionSet(String planningExceptionSet) {
        this.planningExceptionSet = planningExceptionSet;
    }

    @Basic
    @Column(name = "BOM_ITEM_TYPE", nullable = true, precision = 0)
    public Long getBomItemType() {
        return bomItemType;
    }

    public void setBomItemType(Long bomItemType) {
        this.bomItemType = bomItemType;
    }

    @Basic
    @Column(name = "PICK_COMPONENTS_FLAG", nullable = true, length = 1)
    public String getPickComponentsFlag() {
        return pickComponentsFlag;
    }

    public void setPickComponentsFlag(String pickComponentsFlag) {
        this.pickComponentsFlag = pickComponentsFlag;
    }

    @Basic
    @Column(name = "REPLENISH_TO_ORDER_FLAG", nullable = true, length = 1)
    public String getReplenishToOrderFlag() {
        return replenishToOrderFlag;
    }

    public void setReplenishToOrderFlag(String replenishToOrderFlag) {
        this.replenishToOrderFlag = replenishToOrderFlag;
    }

    @Basic
    @Column(name = "BASE_ITEM_ID", nullable = true, precision = 0)
    public Long getBaseItemId() {
        return baseItemId;
    }

    public void setBaseItemId(Long baseItemId) {
        this.baseItemId = baseItemId;
    }

    @Basic
    @Column(name = "ATP_COMPONENTS_FLAG", nullable = true, length = 1)
    public String getAtpComponentsFlag() {
        return atpComponentsFlag;
    }

    public void setAtpComponentsFlag(String atpComponentsFlag) {
        this.atpComponentsFlag = atpComponentsFlag;
    }

    @Basic
    @Column(name = "ATP_FLAG", nullable = true, length = 1)
    public String getAtpFlag() {
        return atpFlag;
    }

    public void setAtpFlag(String atpFlag) {
        this.atpFlag = atpFlag;
    }

    @Basic
    @Column(name = "FIXED_LEAD_TIME", nullable = true, precision = 0)
    public Long getFixedLeadTime() {
        return fixedLeadTime;
    }

    public void setFixedLeadTime(Long fixedLeadTime) {
        this.fixedLeadTime = fixedLeadTime;
    }

    @Basic
    @Column(name = "VARIABLE_LEAD_TIME", nullable = true, precision = 0)
    public Long getVariableLeadTime() {
        return variableLeadTime;
    }

    public void setVariableLeadTime(Long variableLeadTime) {
        this.variableLeadTime = variableLeadTime;
    }

    @Basic
    @Column(name = "WIP_SUPPLY_LOCATOR_ID", nullable = true, precision = 0)
    public Long getWipSupplyLocatorId() {
        return wipSupplyLocatorId;
    }

    public void setWipSupplyLocatorId(Long wipSupplyLocatorId) {
        this.wipSupplyLocatorId = wipSupplyLocatorId;
    }

    @Basic
    @Column(name = "WIP_SUPPLY_TYPE", nullable = true, precision = 0)
    public Long getWipSupplyType() {
        return wipSupplyType;
    }

    public void setWipSupplyType(Long wipSupplyType) {
        this.wipSupplyType = wipSupplyType;
    }

    @Basic
    @Column(name = "WIP_SUPPLY_SUBINVENTORY", nullable = true, length = 10)
    public String getWipSupplySubinventory() {
        return wipSupplySubinventory;
    }

    public void setWipSupplySubinventory(String wipSupplySubinventory) {
        this.wipSupplySubinventory = wipSupplySubinventory;
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
    @Column(name = "PRIMARY_UNIT_OF_MEASURE", nullable = true, length = 25)
    public String getPrimaryUnitOfMeasure() {
        return primaryUnitOfMeasure;
    }

    public void setPrimaryUnitOfMeasure(String primaryUnitOfMeasure) {
        this.primaryUnitOfMeasure = primaryUnitOfMeasure;
    }

    @Basic
    @Column(name = "ALLOWED_UNITS_LOOKUP_CODE", nullable = true, precision = 0)
    public Long getAllowedUnitsLookupCode() {
        return allowedUnitsLookupCode;
    }

    public void setAllowedUnitsLookupCode(Long allowedUnitsLookupCode) {
        this.allowedUnitsLookupCode = allowedUnitsLookupCode;
    }

    @Basic
    @Column(name = "COST_OF_SALES_ACCOUNT", nullable = true, precision = 0)
    public Long getCostOfSalesAccount() {
        return costOfSalesAccount;
    }

    public void setCostOfSalesAccount(Long costOfSalesAccount) {
        this.costOfSalesAccount = costOfSalesAccount;
    }

    @Basic
    @Column(name = "SALES_ACCOUNT", nullable = true, precision = 0)
    public Long getSalesAccount() {
        return salesAccount;
    }

    public void setSalesAccount(Long salesAccount) {
        this.salesAccount = salesAccount;
    }

    @Basic
    @Column(name = "DEFAULT_INCLUDE_IN_ROLLUP_FLAG", nullable = true, length = 1)
    public String getDefaultIncludeInRollupFlag() {
        return defaultIncludeInRollupFlag;
    }

    public void setDefaultIncludeInRollupFlag(String defaultIncludeInRollupFlag) {
        this.defaultIncludeInRollupFlag = defaultIncludeInRollupFlag;
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
    @Column(name = "INVENTORY_PLANNING_CODE", nullable = true, precision = 0)
    public Long getInventoryPlanningCode() {
        return inventoryPlanningCode;
    }

    public void setInventoryPlanningCode(Long inventoryPlanningCode) {
        this.inventoryPlanningCode = inventoryPlanningCode;
    }

    @Basic
    @Column(name = "PLANNER_CODE", nullable = true, length = 10)
    public String getPlannerCode() {
        return plannerCode;
    }

    public void setPlannerCode(String plannerCode) {
        this.plannerCode = plannerCode;
    }

    @Basic
    @Column(name = "PLANNING_MAKE_BUY_CODE", nullable = true, precision = 0)
    public Long getPlanningMakeBuyCode() {
        return planningMakeBuyCode;
    }

    public void setPlanningMakeBuyCode(Long planningMakeBuyCode) {
        this.planningMakeBuyCode = planningMakeBuyCode;
    }

    @Basic
    @Column(name = "FIXED_LOT_MULTIPLIER", nullable = true, precision = 0)
    public Long getFixedLotMultiplier() {
        return fixedLotMultiplier;
    }

    public void setFixedLotMultiplier(Long fixedLotMultiplier) {
        this.fixedLotMultiplier = fixedLotMultiplier;
    }

    @Basic
    @Column(name = "ROUNDING_CONTROL_TYPE", nullable = true, precision = 0)
    public Long getRoundingControlType() {
        return roundingControlType;
    }

    public void setRoundingControlType(Long roundingControlType) {
        this.roundingControlType = roundingControlType;
    }

    @Basic
    @Column(name = "CARRYING_COST", nullable = true, precision = 0)
    public Long getCarryingCost() {
        return carryingCost;
    }

    public void setCarryingCost(Long carryingCost) {
        this.carryingCost = carryingCost;
    }

    @Basic
    @Column(name = "POSTPROCESSING_LEAD_TIME", nullable = true, precision = 0)
    public Long getPostprocessingLeadTime() {
        return postprocessingLeadTime;
    }

    public void setPostprocessingLeadTime(Long postprocessingLeadTime) {
        this.postprocessingLeadTime = postprocessingLeadTime;
    }

    @Basic
    @Column(name = "PREPROCESSING_LEAD_TIME", nullable = true, precision = 0)
    public Long getPreprocessingLeadTime() {
        return preprocessingLeadTime;
    }

    public void setPreprocessingLeadTime(Long preprocessingLeadTime) {
        this.preprocessingLeadTime = preprocessingLeadTime;
    }

    @Basic
    @Column(name = "FULL_LEAD_TIME", nullable = true, precision = 0)
    public Long getFullLeadTime() {
        return fullLeadTime;
    }

    public void setFullLeadTime(Long fullLeadTime) {
        this.fullLeadTime = fullLeadTime;
    }

    @Basic
    @Column(name = "ORDER_COST", nullable = true, precision = 0)
    public Long getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(Long orderCost) {
        this.orderCost = orderCost;
    }

    @Basic
    @Column(name = "MRP_SAFETY_STOCK_PERCENT", nullable = true, precision = 0)
    public Long getMrpSafetyStockPercent() {
        return mrpSafetyStockPercent;
    }

    public void setMrpSafetyStockPercent(Long mrpSafetyStockPercent) {
        this.mrpSafetyStockPercent = mrpSafetyStockPercent;
    }

    @Basic
    @Column(name = "MRP_SAFETY_STOCK_CODE", nullable = true, precision = 0)
    public Long getMrpSafetyStockCode() {
        return mrpSafetyStockCode;
    }

    public void setMrpSafetyStockCode(Long mrpSafetyStockCode) {
        this.mrpSafetyStockCode = mrpSafetyStockCode;
    }

    @Basic
    @Column(name = "MIN_MINMAX_QUANTITY", nullable = true, precision = 0)
    public Long getMinMinmaxQuantity() {
        return minMinmaxQuantity;
    }

    public void setMinMinmaxQuantity(Long minMinmaxQuantity) {
        this.minMinmaxQuantity = minMinmaxQuantity;
    }

    @Basic
    @Column(name = "MAX_MINMAX_QUANTITY", nullable = true, precision = 0)
    public Long getMaxMinmaxQuantity() {
        return maxMinmaxQuantity;
    }

    public void setMaxMinmaxQuantity(Long maxMinmaxQuantity) {
        this.maxMinmaxQuantity = maxMinmaxQuantity;
    }

    @Basic
    @Column(name = "MINIMUM_ORDER_QUANTITY", nullable = true, precision = 0)
    public Long getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(Long minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    @Basic
    @Column(name = "FIXED_ORDER_QUANTITY", nullable = true, precision = 0)
    public Long getFixedOrderQuantity() {
        return fixedOrderQuantity;
    }

    public void setFixedOrderQuantity(Long fixedOrderQuantity) {
        this.fixedOrderQuantity = fixedOrderQuantity;
    }

    @Basic
    @Column(name = "FIXED_DAYS_SUPPLY", nullable = true, precision = 0)
    public Long getFixedDaysSupply() {
        return fixedDaysSupply;
    }

    public void setFixedDaysSupply(Long fixedDaysSupply) {
        this.fixedDaysSupply = fixedDaysSupply;
    }

    @Basic
    @Column(name = "MAXIMUM_ORDER_QUANTITY", nullable = true, precision = 0)
    public Long getMaximumOrderQuantity() {
        return maximumOrderQuantity;
    }

    public void setMaximumOrderQuantity(Long maximumOrderQuantity) {
        this.maximumOrderQuantity = maximumOrderQuantity;
    }

    @Basic
    @Column(name = "ATP_RULE_ID", nullable = true, precision = 0)
    public Long getAtpRuleId() {
        return atpRuleId;
    }

    public void setAtpRuleId(Long atpRuleId) {
        this.atpRuleId = atpRuleId;
    }

    @Basic
    @Column(name = "PICKING_RULE_ID", nullable = true, precision = 0)
    public Long getPickingRuleId() {
        return pickingRuleId;
    }

    public void setPickingRuleId(Long pickingRuleId) {
        this.pickingRuleId = pickingRuleId;
    }

    @Basic
    @Column(name = "RESERVABLE_TYPE", nullable = true, precision = 0)
    public Long getReservableType() {
        return reservableType;
    }

    public void setReservableType(Long reservableType) {
        this.reservableType = reservableType;
    }

    @Basic
    @Column(name = "POSITIVE_MEASUREMENT_ERROR", nullable = true, precision = 0)
    public Long getPositiveMeasurementError() {
        return positiveMeasurementError;
    }

    public void setPositiveMeasurementError(Long positiveMeasurementError) {
        this.positiveMeasurementError = positiveMeasurementError;
    }

    @Basic
    @Column(name = "NEGATIVE_MEASUREMENT_ERROR", nullable = true, precision = 0)
    public Long getNegativeMeasurementError() {
        return negativeMeasurementError;
    }

    public void setNegativeMeasurementError(Long negativeMeasurementError) {
        this.negativeMeasurementError = negativeMeasurementError;
    }

    @Basic
    @Column(name = "ENGINEERING_ECN_CODE", nullable = true, length = 50)
    public String getEngineeringEcnCode() {
        return engineeringEcnCode;
    }

    public void setEngineeringEcnCode(String engineeringEcnCode) {
        this.engineeringEcnCode = engineeringEcnCode;
    }

    @Basic
    @Column(name = "ENGINEERING_ITEM_ID", nullable = true, precision = 0)
    public Long getEngineeringItemId() {
        return engineeringItemId;
    }

    public void setEngineeringItemId(Long engineeringItemId) {
        this.engineeringItemId = engineeringItemId;
    }

    @Basic
    @Column(name = "ENGINEERING_DATE", nullable = true)
    public Time getEngineeringDate() {
        return engineeringDate;
    }

    public void setEngineeringDate(Time engineeringDate) {
        this.engineeringDate = engineeringDate;
    }

    @Basic
    @Column(name = "SERVICE_STARTING_DELAY", nullable = true, precision = 0)
    public Long getServiceStartingDelay() {
        return serviceStartingDelay;
    }

    public void setServiceStartingDelay(Long serviceStartingDelay) {
        this.serviceStartingDelay = serviceStartingDelay;
    }

    @Basic
    @Column(name = "VENDOR_WARRANTY_FLAG", nullable = true, length = 1)
    public String getVendorWarrantyFlag() {
        return vendorWarrantyFlag;
    }

    public void setVendorWarrantyFlag(String vendorWarrantyFlag) {
        this.vendorWarrantyFlag = vendorWarrantyFlag;
    }

    @Basic
    @Column(name = "SERVICEABLE_COMPONENT_FLAG", nullable = true, length = 1)
    public String getServiceableComponentFlag() {
        return serviceableComponentFlag;
    }

    public void setServiceableComponentFlag(String serviceableComponentFlag) {
        this.serviceableComponentFlag = serviceableComponentFlag;
    }

    @Basic
    @Column(name = "SERVICEABLE_PRODUCT_FLAG", nullable = true, length = 1)
    public String getServiceableProductFlag() {
        return serviceableProductFlag;
    }

    public void setServiceableProductFlag(String serviceableProductFlag) {
        this.serviceableProductFlag = serviceableProductFlag;
    }

    @Basic
    @Column(name = "BASE_WARRANTY_SERVICE_ID", nullable = true, precision = 0)
    public Long getBaseWarrantyServiceId() {
        return baseWarrantyServiceId;
    }

    public void setBaseWarrantyServiceId(Long baseWarrantyServiceId) {
        this.baseWarrantyServiceId = baseWarrantyServiceId;
    }

    @Basic
    @Column(name = "PAYMENT_TERMS_ID", nullable = true, precision = 0)
    public Long getPaymentTermsId() {
        return paymentTermsId;
    }

    public void setPaymentTermsId(Long paymentTermsId) {
        this.paymentTermsId = paymentTermsId;
    }

    @Basic
    @Column(name = "PREVENTIVE_MAINTENANCE_FLAG", nullable = true, length = 1)
    public String getPreventiveMaintenanceFlag() {
        return preventiveMaintenanceFlag;
    }

    public void setPreventiveMaintenanceFlag(String preventiveMaintenanceFlag) {
        this.preventiveMaintenanceFlag = preventiveMaintenanceFlag;
    }

    @Basic
    @Column(name = "PRIMARY_SPECIALIST_ID", nullable = true, precision = 0)
    public Long getPrimarySpecialistId() {
        return primarySpecialistId;
    }

    public void setPrimarySpecialistId(Long primarySpecialistId) {
        this.primarySpecialistId = primarySpecialistId;
    }

    @Basic
    @Column(name = "SECONDARY_SPECIALIST_ID", nullable = true, precision = 0)
    public Long getSecondarySpecialistId() {
        return secondarySpecialistId;
    }

    public void setSecondarySpecialistId(Long secondarySpecialistId) {
        this.secondarySpecialistId = secondarySpecialistId;
    }

    @Basic
    @Column(name = "SERVICEABLE_ITEM_CLASS_ID", nullable = true, precision = 0)
    public Long getServiceableItemClassId() {
        return serviceableItemClassId;
    }

    public void setServiceableItemClassId(Long serviceableItemClassId) {
        this.serviceableItemClassId = serviceableItemClassId;
    }

    @Basic
    @Column(name = "TIME_BILLABLE_FLAG", nullable = true, length = 1)
    public String getTimeBillableFlag() {
        return timeBillableFlag;
    }

    public void setTimeBillableFlag(String timeBillableFlag) {
        this.timeBillableFlag = timeBillableFlag;
    }

    @Basic
    @Column(name = "MATERIAL_BILLABLE_FLAG", nullable = true, length = 30)
    public String getMaterialBillableFlag() {
        return materialBillableFlag;
    }

    public void setMaterialBillableFlag(String materialBillableFlag) {
        this.materialBillableFlag = materialBillableFlag;
    }

    @Basic
    @Column(name = "EXPENSE_BILLABLE_FLAG", nullable = true, length = 1)
    public String getExpenseBillableFlag() {
        return expenseBillableFlag;
    }

    public void setExpenseBillableFlag(String expenseBillableFlag) {
        this.expenseBillableFlag = expenseBillableFlag;
    }

    @Basic
    @Column(name = "PRORATE_SERVICE_FLAG", nullable = true, length = 1)
    public String getProrateServiceFlag() {
        return prorateServiceFlag;
    }

    public void setProrateServiceFlag(String prorateServiceFlag) {
        this.prorateServiceFlag = prorateServiceFlag;
    }

    @Basic
    @Column(name = "COVERAGE_SCHEDULE_ID", nullable = true, precision = 0)
    public Long getCoverageScheduleId() {
        return coverageScheduleId;
    }

    public void setCoverageScheduleId(Long coverageScheduleId) {
        this.coverageScheduleId = coverageScheduleId;
    }

    @Basic
    @Column(name = "SERVICE_DURATION_PERIOD_CODE", nullable = true, length = 10)
    public String getServiceDurationPeriodCode() {
        return serviceDurationPeriodCode;
    }

    public void setServiceDurationPeriodCode(String serviceDurationPeriodCode) {
        this.serviceDurationPeriodCode = serviceDurationPeriodCode;
    }

    @Basic
    @Column(name = "SERVICE_DURATION", nullable = true, precision = 0)
    public Long getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(Long serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    @Basic
    @Column(name = "WARRANTY_VENDOR_ID", nullable = true, precision = 0)
    public Long getWarrantyVendorId() {
        return warrantyVendorId;
    }

    public void setWarrantyVendorId(Long warrantyVendorId) {
        this.warrantyVendorId = warrantyVendorId;
    }

    @Basic
    @Column(name = "MAX_WARRANTY_AMOUNT", nullable = true, precision = 0)
    public Long getMaxWarrantyAmount() {
        return maxWarrantyAmount;
    }

    public void setMaxWarrantyAmount(Long maxWarrantyAmount) {
        this.maxWarrantyAmount = maxWarrantyAmount;
    }

    @Basic
    @Column(name = "RESPONSE_TIME_PERIOD_CODE", nullable = true, length = 30)
    public String getResponseTimePeriodCode() {
        return responseTimePeriodCode;
    }

    public void setResponseTimePeriodCode(String responseTimePeriodCode) {
        this.responseTimePeriodCode = responseTimePeriodCode;
    }

    @Basic
    @Column(name = "RESPONSE_TIME_VALUE", nullable = true, precision = 0)
    public Long getResponseTimeValue() {
        return responseTimeValue;
    }

    public void setResponseTimeValue(Long responseTimeValue) {
        this.responseTimeValue = responseTimeValue;
    }

    @Basic
    @Column(name = "NEW_REVISION_CODE", nullable = true, length = 30)
    public String getNewRevisionCode() {
        return newRevisionCode;
    }

    public void setNewRevisionCode(String newRevisionCode) {
        this.newRevisionCode = newRevisionCode;
    }

    @Basic
    @Column(name = "INVOICEABLE_ITEM_FLAG", nullable = true, length = 1)
    public String getInvoiceableItemFlag() {
        return invoiceableItemFlag;
    }

    public void setInvoiceableItemFlag(String invoiceableItemFlag) {
        this.invoiceableItemFlag = invoiceableItemFlag;
    }

    @Basic
    @Column(name = "TAX_CODE", nullable = true, length = 50)
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @Basic
    @Column(name = "INVOICE_ENABLED_FLAG", nullable = true, length = 1)
    public String getInvoiceEnabledFlag() {
        return invoiceEnabledFlag;
    }

    public void setInvoiceEnabledFlag(String invoiceEnabledFlag) {
        this.invoiceEnabledFlag = invoiceEnabledFlag;
    }

    @Basic
    @Column(name = "MUST_USE_APPROVED_VENDOR_FLAG", nullable = true, length = 1)
    public String getMustUseApprovedVendorFlag() {
        return mustUseApprovedVendorFlag;
    }

    public void setMustUseApprovedVendorFlag(String mustUseApprovedVendorFlag) {
        this.mustUseApprovedVendorFlag = mustUseApprovedVendorFlag;
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
    @Column(name = "OUTSIDE_OPERATION_FLAG", nullable = true, length = 1)
    public String getOutsideOperationFlag() {
        return outsideOperationFlag;
    }

    public void setOutsideOperationFlag(String outsideOperationFlag) {
        this.outsideOperationFlag = outsideOperationFlag;
    }

    @Basic
    @Column(name = "OUTSIDE_OPERATION_UOM_TYPE", nullable = true, length = 25)
    public String getOutsideOperationUomType() {
        return outsideOperationUomType;
    }

    public void setOutsideOperationUomType(String outsideOperationUomType) {
        this.outsideOperationUomType = outsideOperationUomType;
    }

    @Basic
    @Column(name = "SAFETY_STOCK_BUCKET_DAYS", nullable = true, precision = 0)
    public Long getSafetyStockBucketDays() {
        return safetyStockBucketDays;
    }

    public void setSafetyStockBucketDays(Long safetyStockBucketDays) {
        this.safetyStockBucketDays = safetyStockBucketDays;
    }

    @Basic
    @Column(name = "AUTO_REDUCE_MPS", nullable = true, precision = 0)
    public Long getAutoReduceMps() {
        return autoReduceMps;
    }

    public void setAutoReduceMps(Long autoReduceMps) {
        this.autoReduceMps = autoReduceMps;
    }

    @Basic
    @Column(name = "COSTING_ENABLED_FLAG", nullable = true, length = 1)
    public String getCostingEnabledFlag() {
        return costingEnabledFlag;
    }

    public void setCostingEnabledFlag(String costingEnabledFlag) {
        this.costingEnabledFlag = costingEnabledFlag;
    }

    @Basic
    @Column(name = "CYCLE_COUNT_ENABLED_FLAG", nullable = true, length = 1)
    public String getCycleCountEnabledFlag() {
        return cycleCountEnabledFlag;
    }

    public void setCycleCountEnabledFlag(String cycleCountEnabledFlag) {
        this.cycleCountEnabledFlag = cycleCountEnabledFlag;
    }

    @Basic
    @Column(name = "DEMAND_SOURCE_LINE", nullable = true, length = 30)
    public String getDemandSourceLine() {
        return demandSourceLine;
    }

    public void setDemandSourceLine(String demandSourceLine) {
        this.demandSourceLine = demandSourceLine;
    }

    @Basic
    @Column(name = "COPY_ITEM_ID", nullable = true, precision = 0)
    public Long getCopyItemId() {
        return copyItemId;
    }

    public void setCopyItemId(Long copyItemId) {
        this.copyItemId = copyItemId;
    }

    @Basic
    @Column(name = "SET_ID", nullable = true, length = 10)
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    @Basic
    @Column(name = "REVISION", nullable = true, length = 3)
    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    @Basic
    @Column(name = "AUTO_CREATED_CONFIG_FLAG", nullable = true, length = 1)
    public String getAutoCreatedConfigFlag() {
        return autoCreatedConfigFlag;
    }

    public void setAutoCreatedConfigFlag(String autoCreatedConfigFlag) {
        this.autoCreatedConfigFlag = autoCreatedConfigFlag;
    }

    @Basic
    @Column(name = "ITEM_TYPE", nullable = true, length = 30)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "MODEL_CONFIG_CLAUSE_NAME", nullable = true, length = 10)
    public String getModelConfigClauseName() {
        return modelConfigClauseName;
    }

    public void setModelConfigClauseName(String modelConfigClauseName) {
        this.modelConfigClauseName = modelConfigClauseName;
    }

    @Basic
    @Column(name = "SHIP_MODEL_COMPLETE_FLAG", nullable = true, length = 1)
    public String getShipModelCompleteFlag() {
        return shipModelCompleteFlag;
    }

    public void setShipModelCompleteFlag(String shipModelCompleteFlag) {
        this.shipModelCompleteFlag = shipModelCompleteFlag;
    }

    @Basic
    @Column(name = "MRP_PLANNING_CODE", nullable = true, precision = 0)
    public Long getMrpPlanningCode() {
        return mrpPlanningCode;
    }

    public void setMrpPlanningCode(Long mrpPlanningCode) {
        this.mrpPlanningCode = mrpPlanningCode;
    }

    @Basic
    @Column(name = "RETURN_INSPECTION_REQUIREMENT", nullable = true, precision = 0)
    public Long getReturnInspectionRequirement() {
        return returnInspectionRequirement;
    }

    public void setReturnInspectionRequirement(Long returnInspectionRequirement) {
        this.returnInspectionRequirement = returnInspectionRequirement;
    }

    @Basic
    @Column(name = "DEMAND_SOURCE_TYPE", nullable = true, precision = 0)
    public Long getDemandSourceType() {
        return demandSourceType;
    }

    public void setDemandSourceType(Long demandSourceType) {
        this.demandSourceType = demandSourceType;
    }

    @Basic
    @Column(name = "DEMAND_SOURCE_HEADER_ID", nullable = true, precision = 0)
    public Long getDemandSourceHeaderId() {
        return demandSourceHeaderId;
    }

    public void setDemandSourceHeaderId(Long demandSourceHeaderId) {
        this.demandSourceHeaderId = demandSourceHeaderId;
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
    @Column(name = "ORGANIZATION_CODE", nullable = true, length = 3)
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    @Basic
    @Column(name = "ITEM_NUMBER", nullable = true, length = 700)
    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Basic
    @Column(name = "COPY_ITEM_NUMBER", nullable = true, length = 81)
    public String getCopyItemNumber() {
        return copyItemNumber;
    }

    public void setCopyItemNumber(String copyItemNumber) {
        this.copyItemNumber = copyItemNumber;
    }

    @Basic
    @Column(name = "TEMPLATE_ID", nullable = true, precision = 0)
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
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
    @Column(name = "COPY_ORGANIZATION_ID", nullable = true, precision = 0)
    public Long getCopyOrganizationId() {
        return copyOrganizationId;
    }

    public void setCopyOrganizationId(Long copyOrganizationId) {
        this.copyOrganizationId = copyOrganizationId;
    }

    @Basic
    @Column(name = "COPY_ORGANIZATION_CODE", nullable = true, length = 3)
    public String getCopyOrganizationCode() {
        return copyOrganizationCode;
    }

    public void setCopyOrganizationCode(String copyOrganizationCode) {
        this.copyOrganizationCode = copyOrganizationCode;
    }

    @Basic
    @Column(name = "ATO_FORECAST_CONTROL", nullable = true, precision = 0)
    public Long getAtoForecastControl() {
        return atoForecastControl;
    }

    public void setAtoForecastControl(Long atoForecastControl) {
        this.atoForecastControl = atoForecastControl;
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
    @Column(name = "MATERIAL_COST", nullable = true, precision = 0)
    public Long getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(Long materialCost) {
        this.materialCost = materialCost;
    }

    @Basic
    @Column(name = "MATERIAL_SUB_ELEM", nullable = true, length = 10)
    public String getMaterialSubElem() {
        return materialSubElem;
    }

    public void setMaterialSubElem(String materialSubElem) {
        this.materialSubElem = materialSubElem;
    }

    @Basic
    @Column(name = "MATERIAL_OH_RATE", nullable = true, precision = 0)
    public Long getMaterialOhRate() {
        return materialOhRate;
    }

    public void setMaterialOhRate(Long materialOhRate) {
        this.materialOhRate = materialOhRate;
    }

    @Basic
    @Column(name = "MATERIAL_OH_SUB_ELEM", nullable = true, length = 10)
    public String getMaterialOhSubElem() {
        return materialOhSubElem;
    }

    public void setMaterialOhSubElem(String materialOhSubElem) {
        this.materialOhSubElem = materialOhSubElem;
    }

    @Basic
    @Column(name = "MATERIAL_SUB_ELEM_ID", nullable = true, precision = 0)
    public Long getMaterialSubElemId() {
        return materialSubElemId;
    }

    public void setMaterialSubElemId(Long materialSubElemId) {
        this.materialSubElemId = materialSubElemId;
    }

    @Basic
    @Column(name = "MATERIAL_OH_SUB_ELEM_ID", nullable = true, precision = 0)
    public Long getMaterialOhSubElemId() {
        return materialOhSubElemId;
    }

    public void setMaterialOhSubElemId(Long materialOhSubElemId) {
        this.materialOhSubElemId = materialOhSubElemId;
    }

    @Basic
    @Column(name = "RELEASE_TIME_FENCE_CODE", nullable = true, precision = 0)
    public Long getReleaseTimeFenceCode() {
        return releaseTimeFenceCode;
    }

    public void setReleaseTimeFenceCode(Long releaseTimeFenceCode) {
        this.releaseTimeFenceCode = releaseTimeFenceCode;
    }

    @Basic
    @Column(name = "RELEASE_TIME_FENCE_DAYS", nullable = true, precision = 0)
    public Long getReleaseTimeFenceDays() {
        return releaseTimeFenceDays;
    }

    public void setReleaseTimeFenceDays(Long releaseTimeFenceDays) {
        this.releaseTimeFenceDays = releaseTimeFenceDays;
    }

    @Basic
    @Column(name = "CONTAINER_ITEM_FLAG", nullable = true, length = 1)
    public String getContainerItemFlag() {
        return containerItemFlag;
    }

    public void setContainerItemFlag(String containerItemFlag) {
        this.containerItemFlag = containerItemFlag;
    }

    @Basic
    @Column(name = "VEHICLE_ITEM_FLAG", nullable = true, length = 1)
    public String getVehicleItemFlag() {
        return vehicleItemFlag;
    }

    public void setVehicleItemFlag(String vehicleItemFlag) {
        this.vehicleItemFlag = vehicleItemFlag;
    }

    @Basic
    @Column(name = "MAXIMUM_LOAD_WEIGHT", nullable = true, precision = 0)
    public Long getMaximumLoadWeight() {
        return maximumLoadWeight;
    }

    public void setMaximumLoadWeight(Long maximumLoadWeight) {
        this.maximumLoadWeight = maximumLoadWeight;
    }

    @Basic
    @Column(name = "MINIMUM_FILL_PERCENT", nullable = true, precision = 0)
    public Long getMinimumFillPercent() {
        return minimumFillPercent;
    }

    public void setMinimumFillPercent(Long minimumFillPercent) {
        this.minimumFillPercent = minimumFillPercent;
    }

    @Basic
    @Column(name = "CONTAINER_TYPE_CODE", nullable = true, length = 30)
    public String getContainerTypeCode() {
        return containerTypeCode;
    }

    public void setContainerTypeCode(String containerTypeCode) {
        this.containerTypeCode = containerTypeCode;
    }

    @Basic
    @Column(name = "INTERNAL_VOLUME", nullable = true, precision = 0)
    public Long getInternalVolume() {
        return internalVolume;
    }

    public void setInternalVolume(Long internalVolume) {
        this.internalVolume = internalVolume;
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
    @Column(name = "WH_UPDATE_DATE", nullable = true)
    public Time getWhUpdateDate() {
        return whUpdateDate;
    }

    public void setWhUpdateDate(Time whUpdateDate) {
        this.whUpdateDate = whUpdateDate;
    }

    @Basic
    @Column(name = "PRODUCT_FAMILY_ITEM_ID", nullable = true, precision = 0)
    public Long getProductFamilyItemId() {
        return productFamilyItemId;
    }

    public void setProductFamilyItemId(Long productFamilyItemId) {
        this.productFamilyItemId = productFamilyItemId;
    }

    @Basic
    @Column(name = "PURCHASING_TAX_CODE", nullable = true, length = 50)
    public String getPurchasingTaxCode() {
        return purchasingTaxCode;
    }

    public void setPurchasingTaxCode(String purchasingTaxCode) {
        this.purchasingTaxCode = purchasingTaxCode;
    }

    @Basic
    @Column(name = "OVERCOMPLETION_TOLERANCE_TYPE", nullable = true, precision = 0)
    public Long getOvercompletionToleranceType() {
        return overcompletionToleranceType;
    }

    public void setOvercompletionToleranceType(Long overcompletionToleranceType) {
        this.overcompletionToleranceType = overcompletionToleranceType;
    }

    @Basic
    @Column(name = "OVERCOMPLETION_TOLERANCE_VALUE", nullable = true, precision = 0)
    public Long getOvercompletionToleranceValue() {
        return overcompletionToleranceValue;
    }

    public void setOvercompletionToleranceValue(Long overcompletionToleranceValue) {
        this.overcompletionToleranceValue = overcompletionToleranceValue;
    }

    @Basic
    @Column(name = "EFFECTIVITY_CONTROL", nullable = true, precision = 0)
    public Long getEffectivityControl() {
        return effectivityControl;
    }

    public void setEffectivityControl(Long effectivityControl) {
        this.effectivityControl = effectivityControl;
    }

    @Basic
    @Column(name = "GLOBAL_ATTRIBUTE_CATEGORY", nullable = true, length = 150)
    public String getGlobalAttributeCategory() {
        return globalAttributeCategory;
    }

    public void setGlobalAttributeCategory(String globalAttributeCategory) {
        this.globalAttributeCategory = globalAttributeCategory;
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
    @Column(name = "OVER_SHIPMENT_TOLERANCE", nullable = true, precision = 0)
    public Long getOverShipmentTolerance() {
        return overShipmentTolerance;
    }

    public void setOverShipmentTolerance(Long overShipmentTolerance) {
        this.overShipmentTolerance = overShipmentTolerance;
    }

    @Basic
    @Column(name = "UNDER_SHIPMENT_TOLERANCE", nullable = true, precision = 0)
    public Long getUnderShipmentTolerance() {
        return underShipmentTolerance;
    }

    public void setUnderShipmentTolerance(Long underShipmentTolerance) {
        this.underShipmentTolerance = underShipmentTolerance;
    }

    @Basic
    @Column(name = "OVER_RETURN_TOLERANCE", nullable = true, precision = 0)
    public Long getOverReturnTolerance() {
        return overReturnTolerance;
    }

    public void setOverReturnTolerance(Long overReturnTolerance) {
        this.overReturnTolerance = overReturnTolerance;
    }

    @Basic
    @Column(name = "UNDER_RETURN_TOLERANCE", nullable = true, precision = 0)
    public Long getUnderReturnTolerance() {
        return underReturnTolerance;
    }

    public void setUnderReturnTolerance(Long underReturnTolerance) {
        this.underReturnTolerance = underReturnTolerance;
    }

    @Basic
    @Column(name = "EQUIPMENT_TYPE", nullable = true, precision = 0)
    public Long getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Long equipmentType) {
        this.equipmentType = equipmentType;
    }

    @Basic
    @Column(name = "RECOVERED_PART_DISP_CODE", nullable = true, length = 30)
    public String getRecoveredPartDispCode() {
        return recoveredPartDispCode;
    }

    public void setRecoveredPartDispCode(String recoveredPartDispCode) {
        this.recoveredPartDispCode = recoveredPartDispCode;
    }

    @Basic
    @Column(name = "DEFECT_TRACKING_ON_FLAG", nullable = true, length = 1)
    public String getDefectTrackingOnFlag() {
        return defectTrackingOnFlag;
    }

    public void setDefectTrackingOnFlag(String defectTrackingOnFlag) {
        this.defectTrackingOnFlag = defectTrackingOnFlag;
    }

    @Basic
    @Column(name = "USAGE_ITEM_FLAG", nullable = true, length = 1)
    public String getUsageItemFlag() {
        return usageItemFlag;
    }

    public void setUsageItemFlag(String usageItemFlag) {
        this.usageItemFlag = usageItemFlag;
    }

    @Basic
    @Column(name = "EVENT_FLAG", nullable = true, length = 1)
    public String getEventFlag() {
        return eventFlag;
    }

    public void setEventFlag(String eventFlag) {
        this.eventFlag = eventFlag;
    }

    @Basic
    @Column(name = "ELECTRONIC_FLAG", nullable = true, length = 1)
    public String getElectronicFlag() {
        return electronicFlag;
    }

    public void setElectronicFlag(String electronicFlag) {
        this.electronicFlag = electronicFlag;
    }

    @Basic
    @Column(name = "DOWNLOADABLE_FLAG", nullable = true, length = 1)
    public String getDownloadableFlag() {
        return downloadableFlag;
    }

    public void setDownloadableFlag(String downloadableFlag) {
        this.downloadableFlag = downloadableFlag;
    }

    @Basic
    @Column(name = "VOL_DISCOUNT_EXEMPT_FLAG", nullable = true, length = 1)
    public String getVolDiscountExemptFlag() {
        return volDiscountExemptFlag;
    }

    public void setVolDiscountExemptFlag(String volDiscountExemptFlag) {
        this.volDiscountExemptFlag = volDiscountExemptFlag;
    }

    @Basic
    @Column(name = "COUPON_EXEMPT_FLAG", nullable = true, length = 1)
    public String getCouponExemptFlag() {
        return couponExemptFlag;
    }

    public void setCouponExemptFlag(String couponExemptFlag) {
        this.couponExemptFlag = couponExemptFlag;
    }

    @Basic
    @Column(name = "COMMS_NL_TRACKABLE_FLAG", nullable = true, length = 1)
    public String getCommsNlTrackableFlag() {
        return commsNlTrackableFlag;
    }

    public void setCommsNlTrackableFlag(String commsNlTrackableFlag) {
        this.commsNlTrackableFlag = commsNlTrackableFlag;
    }

    @Basic
    @Column(name = "ASSET_CREATION_CODE", nullable = true, length = 30)
    public String getAssetCreationCode() {
        return assetCreationCode;
    }

    public void setAssetCreationCode(String assetCreationCode) {
        this.assetCreationCode = assetCreationCode;
    }

    @Basic
    @Column(name = "COMMS_ACTIVATION_REQD_FLAG", nullable = true, length = 1)
    public String getCommsActivationReqdFlag() {
        return commsActivationReqdFlag;
    }

    public void setCommsActivationReqdFlag(String commsActivationReqdFlag) {
        this.commsActivationReqdFlag = commsActivationReqdFlag;
    }

    @Basic
    @Column(name = "ORDERABLE_ON_WEB_FLAG", nullable = true, length = 1)
    public String getOrderableOnWebFlag() {
        return orderableOnWebFlag;
    }

    public void setOrderableOnWebFlag(String orderableOnWebFlag) {
        this.orderableOnWebFlag = orderableOnWebFlag;
    }

    @Basic
    @Column(name = "BACK_ORDERABLE_FLAG", nullable = true, length = 1)
    public String getBackOrderableFlag() {
        return backOrderableFlag;
    }

    public void setBackOrderableFlag(String backOrderableFlag) {
        this.backOrderableFlag = backOrderableFlag;
    }

    @Basic
    @Column(name = "WEB_STATUS", nullable = true, length = 30)
    public String getWebStatus() {
        return webStatus;
    }

    public void setWebStatus(String webStatus) {
        this.webStatus = webStatus;
    }

    @Basic
    @Column(name = "INDIVISIBLE_FLAG", nullable = true, length = 1)
    public String getIndivisibleFlag() {
        return indivisibleFlag;
    }

    public void setIndivisibleFlag(String indivisibleFlag) {
        this.indivisibleFlag = indivisibleFlag;
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
    @Column(name = "DIMENSION_UOM_CODE", nullable = true, length = 3)
    public String getDimensionUomCode() {
        return dimensionUomCode;
    }

    public void setDimensionUomCode(String dimensionUomCode) {
        this.dimensionUomCode = dimensionUomCode;
    }

    @Basic
    @Column(name = "UNIT_LENGTH", nullable = true, precision = 0)
    public Long getUnitLength() {
        return unitLength;
    }

    public void setUnitLength(Long unitLength) {
        this.unitLength = unitLength;
    }

    @Basic
    @Column(name = "UNIT_WIDTH", nullable = true, precision = 0)
    public Long getUnitWidth() {
        return unitWidth;
    }

    public void setUnitWidth(Long unitWidth) {
        this.unitWidth = unitWidth;
    }

    @Basic
    @Column(name = "UNIT_HEIGHT", nullable = true, precision = 0)
    public Long getUnitHeight() {
        return unitHeight;
    }

    public void setUnitHeight(Long unitHeight) {
        this.unitHeight = unitHeight;
    }

    @Basic
    @Column(name = "BULK_PICKED_FLAG", nullable = true, length = 1)
    public String getBulkPickedFlag() {
        return bulkPickedFlag;
    }

    public void setBulkPickedFlag(String bulkPickedFlag) {
        this.bulkPickedFlag = bulkPickedFlag;
    }

    @Basic
    @Column(name = "LOT_STATUS_ENABLED", nullable = true, length = 1)
    public String getLotStatusEnabled() {
        return lotStatusEnabled;
    }

    public void setLotStatusEnabled(String lotStatusEnabled) {
        this.lotStatusEnabled = lotStatusEnabled;
    }

    @Basic
    @Column(name = "DEFAULT_LOT_STATUS_ID", nullable = true, precision = 0)
    public Long getDefaultLotStatusId() {
        return defaultLotStatusId;
    }

    public void setDefaultLotStatusId(Long defaultLotStatusId) {
        this.defaultLotStatusId = defaultLotStatusId;
    }

    @Basic
    @Column(name = "SERIAL_STATUS_ENABLED", nullable = true, length = 1)
    public String getSerialStatusEnabled() {
        return serialStatusEnabled;
    }

    public void setSerialStatusEnabled(String serialStatusEnabled) {
        this.serialStatusEnabled = serialStatusEnabled;
    }

    @Basic
    @Column(name = "DEFAULT_SERIAL_STATUS_ID", nullable = true, precision = 0)
    public Long getDefaultSerialStatusId() {
        return defaultSerialStatusId;
    }

    public void setDefaultSerialStatusId(Long defaultSerialStatusId) {
        this.defaultSerialStatusId = defaultSerialStatusId;
    }

    @Basic
    @Column(name = "LOT_SPLIT_ENABLED", nullable = true, length = 1)
    public String getLotSplitEnabled() {
        return lotSplitEnabled;
    }

    public void setLotSplitEnabled(String lotSplitEnabled) {
        this.lotSplitEnabled = lotSplitEnabled;
    }

    @Basic
    @Column(name = "LOT_MERGE_ENABLED", nullable = true, length = 1)
    public String getLotMergeEnabled() {
        return lotMergeEnabled;
    }

    public void setLotMergeEnabled(String lotMergeEnabled) {
        this.lotMergeEnabled = lotMergeEnabled;
    }

    @Basic
    @Column(name = "INVENTORY_CARRY_PENALTY", nullable = true, precision = 0)
    public Long getInventoryCarryPenalty() {
        return inventoryCarryPenalty;
    }

    public void setInventoryCarryPenalty(Long inventoryCarryPenalty) {
        this.inventoryCarryPenalty = inventoryCarryPenalty;
    }

    @Basic
    @Column(name = "OPERATION_SLACK_PENALTY", nullable = true, precision = 0)
    public Long getOperationSlackPenalty() {
        return operationSlackPenalty;
    }

    public void setOperationSlackPenalty(Long operationSlackPenalty) {
        this.operationSlackPenalty = operationSlackPenalty;
    }

    @Basic
    @Column(name = "FINANCING_ALLOWED_FLAG", nullable = true, length = 1)
    public String getFinancingAllowedFlag() {
        return financingAllowedFlag;
    }

    public void setFinancingAllowedFlag(String financingAllowedFlag) {
        this.financingAllowedFlag = financingAllowedFlag;
    }

    @Basic
    @Column(name = "EAM_ITEM_TYPE", nullable = true, precision = 0)
    public Long getEamItemType() {
        return eamItemType;
    }

    public void setEamItemType(Long eamItemType) {
        this.eamItemType = eamItemType;
    }

    @Basic
    @Column(name = "EAM_ACTIVITY_TYPE_CODE", nullable = true, length = 30)
    public String getEamActivityTypeCode() {
        return eamActivityTypeCode;
    }

    public void setEamActivityTypeCode(String eamActivityTypeCode) {
        this.eamActivityTypeCode = eamActivityTypeCode;
    }

    @Basic
    @Column(name = "EAM_ACTIVITY_CAUSE_CODE", nullable = true, length = 30)
    public String getEamActivityCauseCode() {
        return eamActivityCauseCode;
    }

    public void setEamActivityCauseCode(String eamActivityCauseCode) {
        this.eamActivityCauseCode = eamActivityCauseCode;
    }

    @Basic
    @Column(name = "EAM_ACT_NOTIFICATION_FLAG", nullable = true, length = 1)
    public String getEamActNotificationFlag() {
        return eamActNotificationFlag;
    }

    public void setEamActNotificationFlag(String eamActNotificationFlag) {
        this.eamActNotificationFlag = eamActNotificationFlag;
    }

    @Basic
    @Column(name = "EAM_ACT_SHUTDOWN_STATUS", nullable = true, length = 30)
    public String getEamActShutdownStatus() {
        return eamActShutdownStatus;
    }

    public void setEamActShutdownStatus(String eamActShutdownStatus) {
        this.eamActShutdownStatus = eamActShutdownStatus;
    }

    @Basic
    @Column(name = "DUAL_UOM_CONTROL", nullable = true, precision = 0)
    public Long getDualUomControl() {
        return dualUomControl;
    }

    public void setDualUomControl(Long dualUomControl) {
        this.dualUomControl = dualUomControl;
    }

    @Basic
    @Column(name = "SECONDARY_UOM_CODE", nullable = true, length = 3)
    public String getSecondaryUomCode() {
        return secondaryUomCode;
    }

    public void setSecondaryUomCode(String secondaryUomCode) {
        this.secondaryUomCode = secondaryUomCode;
    }

    @Basic
    @Column(name = "DUAL_UOM_DEVIATION_HIGH", nullable = true, precision = 0)
    public Long getDualUomDeviationHigh() {
        return dualUomDeviationHigh;
    }

    public void setDualUomDeviationHigh(Long dualUomDeviationHigh) {
        this.dualUomDeviationHigh = dualUomDeviationHigh;
    }

    @Basic
    @Column(name = "DUAL_UOM_DEVIATION_LOW", nullable = true, precision = 0)
    public Long getDualUomDeviationLow() {
        return dualUomDeviationLow;
    }

    public void setDualUomDeviationLow(Long dualUomDeviationLow) {
        this.dualUomDeviationLow = dualUomDeviationLow;
    }

    @Basic
    @Column(name = "CONTRACT_ITEM_TYPE_CODE", nullable = true, length = 30)
    public String getContractItemTypeCode() {
        return contractItemTypeCode;
    }

    public void setContractItemTypeCode(String contractItemTypeCode) {
        this.contractItemTypeCode = contractItemTypeCode;
    }

    @Basic
    @Column(name = "SUBSCRIPTION_DEPEND_FLAG", nullable = true, length = 1)
    public String getSubscriptionDependFlag() {
        return subscriptionDependFlag;
    }

    public void setSubscriptionDependFlag(String subscriptionDependFlag) {
        this.subscriptionDependFlag = subscriptionDependFlag;
    }

    @Basic
    @Column(name = "SERV_REQ_ENABLED_CODE", nullable = true, length = 30)
    public String getServReqEnabledCode() {
        return servReqEnabledCode;
    }

    public void setServReqEnabledCode(String servReqEnabledCode) {
        this.servReqEnabledCode = servReqEnabledCode;
    }

    @Basic
    @Column(name = "SERV_BILLING_ENABLED_FLAG", nullable = true, length = 1)
    public String getServBillingEnabledFlag() {
        return servBillingEnabledFlag;
    }

    public void setServBillingEnabledFlag(String servBillingEnabledFlag) {
        this.servBillingEnabledFlag = servBillingEnabledFlag;
    }

    @Basic
    @Column(name = "SERV_IMPORTANCE_LEVEL", nullable = true, precision = 0)
    public Long getServImportanceLevel() {
        return servImportanceLevel;
    }

    public void setServImportanceLevel(Long servImportanceLevel) {
        this.servImportanceLevel = servImportanceLevel;
    }

    @Basic
    @Column(name = "PLANNED_INV_POINT_FLAG", nullable = true, length = 1)
    public String getPlannedInvPointFlag() {
        return plannedInvPointFlag;
    }

    public void setPlannedInvPointFlag(String plannedInvPointFlag) {
        this.plannedInvPointFlag = plannedInvPointFlag;
    }

    @Basic
    @Column(name = "LOT_TRANSLATE_ENABLED", nullable = true, length = 1)
    public String getLotTranslateEnabled() {
        return lotTranslateEnabled;
    }

    public void setLotTranslateEnabled(String lotTranslateEnabled) {
        this.lotTranslateEnabled = lotTranslateEnabled;
    }

    @Basic
    @Column(name = "DEFAULT_SO_SOURCE_TYPE", nullable = true, length = 30)
    public String getDefaultSoSourceType() {
        return defaultSoSourceType;
    }

    public void setDefaultSoSourceType(String defaultSoSourceType) {
        this.defaultSoSourceType = defaultSoSourceType;
    }

    @Basic
    @Column(name = "CREATE_SUPPLY_FLAG", nullable = true, length = 1)
    public String getCreateSupplyFlag() {
        return createSupplyFlag;
    }

    public void setCreateSupplyFlag(String createSupplyFlag) {
        this.createSupplyFlag = createSupplyFlag;
    }

    @Basic
    @Column(name = "SUBSTITUTION_WINDOW_CODE", nullable = true, precision = 0)
    public Long getSubstitutionWindowCode() {
        return substitutionWindowCode;
    }

    public void setSubstitutionWindowCode(Long substitutionWindowCode) {
        this.substitutionWindowCode = substitutionWindowCode;
    }

    @Basic
    @Column(name = "SUBSTITUTION_WINDOW_DAYS", nullable = true, precision = 0)
    public Long getSubstitutionWindowDays() {
        return substitutionWindowDays;
    }

    public void setSubstitutionWindowDays(Long substitutionWindowDays) {
        this.substitutionWindowDays = substitutionWindowDays;
    }

    @Basic
    @Column(name = "IB_ITEM_INSTANCE_CLASS", nullable = true, length = 30)
    public String getIbItemInstanceClass() {
        return ibItemInstanceClass;
    }

    public void setIbItemInstanceClass(String ibItemInstanceClass) {
        this.ibItemInstanceClass = ibItemInstanceClass;
    }

    @Basic
    @Column(name = "CONFIG_MODEL_TYPE", nullable = true, length = 30)
    public String getConfigModelType() {
        return configModelType;
    }

    public void setConfigModelType(String configModelType) {
        this.configModelType = configModelType;
    }

    @Basic
    @Column(name = "LOT_SUBSTITUTION_ENABLED", nullable = true, length = 1)
    public String getLotSubstitutionEnabled() {
        return lotSubstitutionEnabled;
    }

    public void setLotSubstitutionEnabled(String lotSubstitutionEnabled) {
        this.lotSubstitutionEnabled = lotSubstitutionEnabled;
    }

    @Basic
    @Column(name = "MINIMUM_LICENSE_QUANTITY", nullable = true, precision = 0)
    public Long getMinimumLicenseQuantity() {
        return minimumLicenseQuantity;
    }

    public void setMinimumLicenseQuantity(Long minimumLicenseQuantity) {
        this.minimumLicenseQuantity = minimumLicenseQuantity;
    }

    @Basic
    @Column(name = "EAM_ACTIVITY_SOURCE_CODE", nullable = true, length = 30)
    public String getEamActivitySourceCode() {
        return eamActivitySourceCode;
    }

    public void setEamActivitySourceCode(String eamActivitySourceCode) {
        this.eamActivitySourceCode = eamActivitySourceCode;
    }

    @Basic
    @Column(name = "LIFECYCLE_ID", nullable = true, precision = 0)
    public Long getLifecycleId() {
        return lifecycleId;
    }

    public void setLifecycleId(Long lifecycleId) {
        this.lifecycleId = lifecycleId;
    }

    @Basic
    @Column(name = "CURRENT_PHASE_ID", nullable = true, precision = 0)
    public Long getCurrentPhaseId() {
        return currentPhaseId;
    }

    public void setCurrentPhaseId(Long currentPhaseId) {
        this.currentPhaseId = currentPhaseId;
    }

    @Basic
    @Column(name = "TRACKING_QUANTITY_IND", nullable = true, length = 30)
    public String getTrackingQuantityInd() {
        return trackingQuantityInd;
    }

    public void setTrackingQuantityInd(String trackingQuantityInd) {
        this.trackingQuantityInd = trackingQuantityInd;
    }

    @Basic
    @Column(name = "ONT_PRICING_QTY_SOURCE", nullable = true, length = 30)
    public String getOntPricingQtySource() {
        return ontPricingQtySource;
    }

    public void setOntPricingQtySource(String ontPricingQtySource) {
        this.ontPricingQtySource = ontPricingQtySource;
    }

    @Basic
    @Column(name = "SECONDARY_DEFAULT_IND", nullable = true, length = 30)
    public String getSecondaryDefaultInd() {
        return secondaryDefaultInd;
    }

    public void setSecondaryDefaultInd(String secondaryDefaultInd) {
        this.secondaryDefaultInd = secondaryDefaultInd;
    }

    @Basic
    @Column(name = "VMI_MINIMUM_UNITS", nullable = true, precision = 0)
    public Long getVmiMinimumUnits() {
        return vmiMinimumUnits;
    }

    public void setVmiMinimumUnits(Long vmiMinimumUnits) {
        this.vmiMinimumUnits = vmiMinimumUnits;
    }

    @Basic
    @Column(name = "VMI_MINIMUM_DAYS", nullable = true, precision = 0)
    public Long getVmiMinimumDays() {
        return vmiMinimumDays;
    }

    public void setVmiMinimumDays(Long vmiMinimumDays) {
        this.vmiMinimumDays = vmiMinimumDays;
    }

    @Basic
    @Column(name = "VMI_MAXIMUM_UNITS", nullable = true, precision = 0)
    public Long getVmiMaximumUnits() {
        return vmiMaximumUnits;
    }

    public void setVmiMaximumUnits(Long vmiMaximumUnits) {
        this.vmiMaximumUnits = vmiMaximumUnits;
    }

    @Basic
    @Column(name = "VMI_MAXIMUM_DAYS", nullable = true, precision = 0)
    public Long getVmiMaximumDays() {
        return vmiMaximumDays;
    }

    public void setVmiMaximumDays(Long vmiMaximumDays) {
        this.vmiMaximumDays = vmiMaximumDays;
    }

    @Basic
    @Column(name = "VMI_FIXED_ORDER_QUANTITY", nullable = true, precision = 0)
    public Long getVmiFixedOrderQuantity() {
        return vmiFixedOrderQuantity;
    }

    public void setVmiFixedOrderQuantity(Long vmiFixedOrderQuantity) {
        this.vmiFixedOrderQuantity = vmiFixedOrderQuantity;
    }

    @Basic
    @Column(name = "SO_AUTHORIZATION_FLAG", nullable = true, precision = 0)
    public Long getSoAuthorizationFlag() {
        return soAuthorizationFlag;
    }

    public void setSoAuthorizationFlag(Long soAuthorizationFlag) {
        this.soAuthorizationFlag = soAuthorizationFlag;
    }

    @Basic
    @Column(name = "CONSIGNED_FLAG", nullable = true, precision = 0)
    public Long getConsignedFlag() {
        return consignedFlag;
    }

    public void setConsignedFlag(Long consignedFlag) {
        this.consignedFlag = consignedFlag;
    }

    @Basic
    @Column(name = "ASN_AUTOEXPIRE_FLAG", nullable = true, precision = 0)
    public Long getAsnAutoexpireFlag() {
        return asnAutoexpireFlag;
    }

    public void setAsnAutoexpireFlag(Long asnAutoexpireFlag) {
        this.asnAutoexpireFlag = asnAutoexpireFlag;
    }

    @Basic
    @Column(name = "VMI_FORECAST_TYPE", nullable = true, precision = 0)
    public Long getVmiForecastType() {
        return vmiForecastType;
    }

    public void setVmiForecastType(Long vmiForecastType) {
        this.vmiForecastType = vmiForecastType;
    }

    @Basic
    @Column(name = "FORECAST_HORIZON", nullable = true, precision = 0)
    public Long getForecastHorizon() {
        return forecastHorizon;
    }

    public void setForecastHorizon(Long forecastHorizon) {
        this.forecastHorizon = forecastHorizon;
    }

    @Basic
    @Column(name = "EXCLUDE_FROM_BUDGET_FLAG", nullable = true, precision = 0)
    public Long getExcludeFromBudgetFlag() {
        return excludeFromBudgetFlag;
    }

    public void setExcludeFromBudgetFlag(Long excludeFromBudgetFlag) {
        this.excludeFromBudgetFlag = excludeFromBudgetFlag;
    }

    @Basic
    @Column(name = "DAYS_TGT_INV_SUPPLY", nullable = true, precision = 0)
    public Long getDaysTgtInvSupply() {
        return daysTgtInvSupply;
    }

    public void setDaysTgtInvSupply(Long daysTgtInvSupply) {
        this.daysTgtInvSupply = daysTgtInvSupply;
    }

    @Basic
    @Column(name = "DAYS_TGT_INV_WINDOW", nullable = true, precision = 0)
    public Long getDaysTgtInvWindow() {
        return daysTgtInvWindow;
    }

    public void setDaysTgtInvWindow(Long daysTgtInvWindow) {
        this.daysTgtInvWindow = daysTgtInvWindow;
    }

    @Basic
    @Column(name = "DAYS_MAX_INV_SUPPLY", nullable = true, precision = 0)
    public Long getDaysMaxInvSupply() {
        return daysMaxInvSupply;
    }

    public void setDaysMaxInvSupply(Long daysMaxInvSupply) {
        this.daysMaxInvSupply = daysMaxInvSupply;
    }

    @Basic
    @Column(name = "DAYS_MAX_INV_WINDOW", nullable = true, precision = 0)
    public Long getDaysMaxInvWindow() {
        return daysMaxInvWindow;
    }

    public void setDaysMaxInvWindow(Long daysMaxInvWindow) {
        this.daysMaxInvWindow = daysMaxInvWindow;
    }

    @Basic
    @Column(name = "DRP_PLANNED_FLAG", nullable = true, precision = 0)
    public Long getDrpPlannedFlag() {
        return drpPlannedFlag;
    }

    public void setDrpPlannedFlag(Long drpPlannedFlag) {
        this.drpPlannedFlag = drpPlannedFlag;
    }

    @Basic
    @Column(name = "CRITICAL_COMPONENT_FLAG", nullable = true, precision = 0)
    public Long getCriticalComponentFlag() {
        return criticalComponentFlag;
    }

    public void setCriticalComponentFlag(Long criticalComponentFlag) {
        this.criticalComponentFlag = criticalComponentFlag;
    }

    @Basic
    @Column(name = "CONTINOUS_TRANSFER", nullable = true, precision = 0)
    public Long getContinousTransfer() {
        return continousTransfer;
    }

    public void setContinousTransfer(Long continousTransfer) {
        this.continousTransfer = continousTransfer;
    }

    @Basic
    @Column(name = "CONVERGENCE", nullable = true, precision = 0)
    public Long getConvergence() {
        return convergence;
    }

    public void setConvergence(Long convergence) {
        this.convergence = convergence;
    }

    @Basic
    @Column(name = "DIVERGENCE", nullable = true, precision = 0)
    public Long getDivergence() {
        return divergence;
    }

    public void setDivergence(Long divergence) {
        this.divergence = divergence;
    }

    @Basic
    @Column(name = "CONFIG_ORGS", nullable = true, length = 30)
    public String getConfigOrgs() {
        return configOrgs;
    }

    public void setConfigOrgs(String configOrgs) {
        this.configOrgs = configOrgs;
    }

    @Basic
    @Column(name = "CONFIG_MATCH", nullable = true, length = 30)
    public String getConfigMatch() {
        return configMatch;
    }

    public void setConfigMatch(String configMatch) {
        this.configMatch = configMatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MtlSystemItemsInterface that = (MtlSystemItemsInterface) o;

        if (setProcessId != that.setProcessId) return false;
        if (inventoryItemId != null ? !inventoryItemId.equals(that.inventoryItemId) : that.inventoryItemId != null)
            return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(that.lastUpdatedBy) : that.lastUpdatedBy != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (lastUpdateLogin != null ? !lastUpdateLogin.equals(that.lastUpdateLogin) : that.lastUpdateLogin != null)
            return false;
        if (summaryFlag != null ? !summaryFlag.equals(that.summaryFlag) : that.summaryFlag != null) return false;
        if (enabledFlag != null ? !enabledFlag.equals(that.enabledFlag) : that.enabledFlag != null) return false;
        if (startDateActive != null ? !startDateActive.equals(that.startDateActive) : that.startDateActive != null)
            return false;
        if (endDateActive != null ? !endDateActive.equals(that.endDateActive) : that.endDateActive != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (buyerId != null ? !buyerId.equals(that.buyerId) : that.buyerId != null) return false;
        if (accountingRuleId != null ? !accountingRuleId.equals(that.accountingRuleId) : that.accountingRuleId != null)
            return false;
        if (invoicingRuleId != null ? !invoicingRuleId.equals(that.invoicingRuleId) : that.invoicingRuleId != null)
            return false;
        if (segment1 != null ? !segment1.equals(that.segment1) : that.segment1 != null) return false;
        if (segment2 != null ? !segment2.equals(that.segment2) : that.segment2 != null) return false;
        if (segment3 != null ? !segment3.equals(that.segment3) : that.segment3 != null) return false;
        if (segment4 != null ? !segment4.equals(that.segment4) : that.segment4 != null) return false;
        if (segment5 != null ? !segment5.equals(that.segment5) : that.segment5 != null) return false;
        if (segment6 != null ? !segment6.equals(that.segment6) : that.segment6 != null) return false;
        if (segment7 != null ? !segment7.equals(that.segment7) : that.segment7 != null) return false;
        if (segment8 != null ? !segment8.equals(that.segment8) : that.segment8 != null) return false;
        if (segment9 != null ? !segment9.equals(that.segment9) : that.segment9 != null) return false;
        if (segment10 != null ? !segment10.equals(that.segment10) : that.segment10 != null) return false;
        if (segment11 != null ? !segment11.equals(that.segment11) : that.segment11 != null) return false;
        if (segment12 != null ? !segment12.equals(that.segment12) : that.segment12 != null) return false;
        if (segment13 != null ? !segment13.equals(that.segment13) : that.segment13 != null) return false;
        if (segment14 != null ? !segment14.equals(that.segment14) : that.segment14 != null) return false;
        if (segment15 != null ? !segment15.equals(that.segment15) : that.segment15 != null) return false;
        if (segment16 != null ? !segment16.equals(that.segment16) : that.segment16 != null) return false;
        if (segment17 != null ? !segment17.equals(that.segment17) : that.segment17 != null) return false;
        if (segment18 != null ? !segment18.equals(that.segment18) : that.segment18 != null) return false;
        if (segment19 != null ? !segment19.equals(that.segment19) : that.segment19 != null) return false;
        if (segment20 != null ? !segment20.equals(that.segment20) : that.segment20 != null) return false;
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
        if (purchasingItemFlag != null ? !purchasingItemFlag.equals(that.purchasingItemFlag) : that.purchasingItemFlag != null)
            return false;
        if (shippableItemFlag != null ? !shippableItemFlag.equals(that.shippableItemFlag) : that.shippableItemFlag != null)
            return false;
        if (customerOrderFlag != null ? !customerOrderFlag.equals(that.customerOrderFlag) : that.customerOrderFlag != null)
            return false;
        if (internalOrderFlag != null ? !internalOrderFlag.equals(that.internalOrderFlag) : that.internalOrderFlag != null)
            return false;
        if (serviceItemFlag != null ? !serviceItemFlag.equals(that.serviceItemFlag) : that.serviceItemFlag != null)
            return false;
        if (inventoryItemFlag != null ? !inventoryItemFlag.equals(that.inventoryItemFlag) : that.inventoryItemFlag != null)
            return false;
        if (engItemFlag != null ? !engItemFlag.equals(that.engItemFlag) : that.engItemFlag != null) return false;
        if (inventoryAssetFlag != null ? !inventoryAssetFlag.equals(that.inventoryAssetFlag) : that.inventoryAssetFlag != null)
            return false;
        if (purchasingEnabledFlag != null ? !purchasingEnabledFlag.equals(that.purchasingEnabledFlag) : that.purchasingEnabledFlag != null)
            return false;
        if (customerOrderEnabledFlag != null ? !customerOrderEnabledFlag.equals(that.customerOrderEnabledFlag) : that.customerOrderEnabledFlag != null)
            return false;
        if (internalOrderEnabledFlag != null ? !internalOrderEnabledFlag.equals(that.internalOrderEnabledFlag) : that.internalOrderEnabledFlag != null)
            return false;
        if (soTransactionsFlag != null ? !soTransactionsFlag.equals(that.soTransactionsFlag) : that.soTransactionsFlag != null)
            return false;
        if (mtlTransactionsEnabledFlag != null ? !mtlTransactionsEnabledFlag.equals(that.mtlTransactionsEnabledFlag) : that.mtlTransactionsEnabledFlag != null)
            return false;
        if (stockEnabledFlag != null ? !stockEnabledFlag.equals(that.stockEnabledFlag) : that.stockEnabledFlag != null)
            return false;
        if (bomEnabledFlag != null ? !bomEnabledFlag.equals(that.bomEnabledFlag) : that.bomEnabledFlag != null)
            return false;
        if (buildInWipFlag != null ? !buildInWipFlag.equals(that.buildInWipFlag) : that.buildInWipFlag != null)
            return false;
        if (revisionQtyControlCode != null ? !revisionQtyControlCode.equals(that.revisionQtyControlCode) : that.revisionQtyControlCode != null)
            return false;
        if (itemCatalogGroupId != null ? !itemCatalogGroupId.equals(that.itemCatalogGroupId) : that.itemCatalogGroupId != null)
            return false;
        if (catalogStatusFlag != null ? !catalogStatusFlag.equals(that.catalogStatusFlag) : that.catalogStatusFlag != null)
            return false;
        if (checkShortagesFlag != null ? !checkShortagesFlag.equals(that.checkShortagesFlag) : that.checkShortagesFlag != null)
            return false;
        if (returnableFlag != null ? !returnableFlag.equals(that.returnableFlag) : that.returnableFlag != null)
            return false;
        if (defaultShippingOrg != null ? !defaultShippingOrg.equals(that.defaultShippingOrg) : that.defaultShippingOrg != null)
            return false;
        if (collateralFlag != null ? !collateralFlag.equals(that.collateralFlag) : that.collateralFlag != null)
            return false;
        if (taxableFlag != null ? !taxableFlag.equals(that.taxableFlag) : that.taxableFlag != null) return false;
        if (qtyRcvExceptionCode != null ? !qtyRcvExceptionCode.equals(that.qtyRcvExceptionCode) : that.qtyRcvExceptionCode != null)
            return false;
        if (allowItemDescUpdateFlag != null ? !allowItemDescUpdateFlag.equals(that.allowItemDescUpdateFlag) : that.allowItemDescUpdateFlag != null)
            return false;
        if (inspectionRequiredFlag != null ? !inspectionRequiredFlag.equals(that.inspectionRequiredFlag) : that.inspectionRequiredFlag != null)
            return false;
        if (receiptRequiredFlag != null ? !receiptRequiredFlag.equals(that.receiptRequiredFlag) : that.receiptRequiredFlag != null)
            return false;
        if (marketPrice != null ? !marketPrice.equals(that.marketPrice) : that.marketPrice != null) return false;
        if (hazardClassId != null ? !hazardClassId.equals(that.hazardClassId) : that.hazardClassId != null)
            return false;
        if (rfqRequiredFlag != null ? !rfqRequiredFlag.equals(that.rfqRequiredFlag) : that.rfqRequiredFlag != null)
            return false;
        if (qtyRcvTolerance != null ? !qtyRcvTolerance.equals(that.qtyRcvTolerance) : that.qtyRcvTolerance != null)
            return false;
        if (listPricePerUnit != null ? !listPricePerUnit.equals(that.listPricePerUnit) : that.listPricePerUnit != null)
            return false;
        if (unNumberId != null ? !unNumberId.equals(that.unNumberId) : that.unNumberId != null) return false;
        if (priceTolerancePercent != null ? !priceTolerancePercent.equals(that.priceTolerancePercent) : that.priceTolerancePercent != null)
            return false;
        if (assetCategoryId != null ? !assetCategoryId.equals(that.assetCategoryId) : that.assetCategoryId != null)
            return false;
        if (roundingFactor != null ? !roundingFactor.equals(that.roundingFactor) : that.roundingFactor != null)
            return false;
        if (unitOfIssue != null ? !unitOfIssue.equals(that.unitOfIssue) : that.unitOfIssue != null) return false;
        if (enforceShipToLocationCode != null ? !enforceShipToLocationCode.equals(that.enforceShipToLocationCode) : that.enforceShipToLocationCode != null)
            return false;
        if (allowSubstituteReceiptsFlag != null ? !allowSubstituteReceiptsFlag.equals(that.allowSubstituteReceiptsFlag) : that.allowSubstituteReceiptsFlag != null)
            return false;
        if (allowUnorderedReceiptsFlag != null ? !allowUnorderedReceiptsFlag.equals(that.allowUnorderedReceiptsFlag) : that.allowUnorderedReceiptsFlag != null)
            return false;
        if (allowExpressDeliveryFlag != null ? !allowExpressDeliveryFlag.equals(that.allowExpressDeliveryFlag) : that.allowExpressDeliveryFlag != null)
            return false;
        if (daysEarlyReceiptAllowed != null ? !daysEarlyReceiptAllowed.equals(that.daysEarlyReceiptAllowed) : that.daysEarlyReceiptAllowed != null)
            return false;
        if (daysLateReceiptAllowed != null ? !daysLateReceiptAllowed.equals(that.daysLateReceiptAllowed) : that.daysLateReceiptAllowed != null)
            return false;
        if (receiptDaysExceptionCode != null ? !receiptDaysExceptionCode.equals(that.receiptDaysExceptionCode) : that.receiptDaysExceptionCode != null)
            return false;
        if (receivingRoutingId != null ? !receivingRoutingId.equals(that.receivingRoutingId) : that.receivingRoutingId != null)
            return false;
        if (invoiceCloseTolerance != null ? !invoiceCloseTolerance.equals(that.invoiceCloseTolerance) : that.invoiceCloseTolerance != null)
            return false;
        if (receiveCloseTolerance != null ? !receiveCloseTolerance.equals(that.receiveCloseTolerance) : that.receiveCloseTolerance != null)
            return false;
        if (autoLotAlphaPrefix != null ? !autoLotAlphaPrefix.equals(that.autoLotAlphaPrefix) : that.autoLotAlphaPrefix != null)
            return false;
        if (startAutoLotNumber != null ? !startAutoLotNumber.equals(that.startAutoLotNumber) : that.startAutoLotNumber != null)
            return false;
        if (lotControlCode != null ? !lotControlCode.equals(that.lotControlCode) : that.lotControlCode != null)
            return false;
        if (shelfLifeCode != null ? !shelfLifeCode.equals(that.shelfLifeCode) : that.shelfLifeCode != null)
            return false;
        if (shelfLifeDays != null ? !shelfLifeDays.equals(that.shelfLifeDays) : that.shelfLifeDays != null)
            return false;
        if (serialNumberControlCode != null ? !serialNumberControlCode.equals(that.serialNumberControlCode) : that.serialNumberControlCode != null)
            return false;
        if (startAutoSerialNumber != null ? !startAutoSerialNumber.equals(that.startAutoSerialNumber) : that.startAutoSerialNumber != null)
            return false;
        if (autoSerialAlphaPrefix != null ? !autoSerialAlphaPrefix.equals(that.autoSerialAlphaPrefix) : that.autoSerialAlphaPrefix != null)
            return false;
        if (sourceType != null ? !sourceType.equals(that.sourceType) : that.sourceType != null) return false;
        if (sourceOrganizationId != null ? !sourceOrganizationId.equals(that.sourceOrganizationId) : that.sourceOrganizationId != null)
            return false;
        if (sourceSubinventory != null ? !sourceSubinventory.equals(that.sourceSubinventory) : that.sourceSubinventory != null)
            return false;
        if (expenseAccount != null ? !expenseAccount.equals(that.expenseAccount) : that.expenseAccount != null)
            return false;
        if (encumbranceAccount != null ? !encumbranceAccount.equals(that.encumbranceAccount) : that.encumbranceAccount != null)
            return false;
        if (restrictSubinventoriesCode != null ? !restrictSubinventoriesCode.equals(that.restrictSubinventoriesCode) : that.restrictSubinventoriesCode != null)
            return false;
        if (unitWeight != null ? !unitWeight.equals(that.unitWeight) : that.unitWeight != null) return false;
        if (weightUomCode != null ? !weightUomCode.equals(that.weightUomCode) : that.weightUomCode != null)
            return false;
        if (volumeUomCode != null ? !volumeUomCode.equals(that.volumeUomCode) : that.volumeUomCode != null)
            return false;
        if (unitVolume != null ? !unitVolume.equals(that.unitVolume) : that.unitVolume != null) return false;
        if (restrictLocatorsCode != null ? !restrictLocatorsCode.equals(that.restrictLocatorsCode) : that.restrictLocatorsCode != null)
            return false;
        if (locationControlCode != null ? !locationControlCode.equals(that.locationControlCode) : that.locationControlCode != null)
            return false;
        if (shrinkageRate != null ? !shrinkageRate.equals(that.shrinkageRate) : that.shrinkageRate != null)
            return false;
        if (acceptableEarlyDays != null ? !acceptableEarlyDays.equals(that.acceptableEarlyDays) : that.acceptableEarlyDays != null)
            return false;
        if (planningTimeFenceCode != null ? !planningTimeFenceCode.equals(that.planningTimeFenceCode) : that.planningTimeFenceCode != null)
            return false;
        if (demandTimeFenceCode != null ? !demandTimeFenceCode.equals(that.demandTimeFenceCode) : that.demandTimeFenceCode != null)
            return false;
        if (leadTimeLotSize != null ? !leadTimeLotSize.equals(that.leadTimeLotSize) : that.leadTimeLotSize != null)
            return false;
        if (stdLotSize != null ? !stdLotSize.equals(that.stdLotSize) : that.stdLotSize != null) return false;
        if (cumManufacturingLeadTime != null ? !cumManufacturingLeadTime.equals(that.cumManufacturingLeadTime) : that.cumManufacturingLeadTime != null)
            return false;
        if (overrunPercentage != null ? !overrunPercentage.equals(that.overrunPercentage) : that.overrunPercentage != null)
            return false;
        if (mrpCalculateAtpFlag != null ? !mrpCalculateAtpFlag.equals(that.mrpCalculateAtpFlag) : that.mrpCalculateAtpFlag != null)
            return false;
        if (acceptableRateIncrease != null ? !acceptableRateIncrease.equals(that.acceptableRateIncrease) : that.acceptableRateIncrease != null)
            return false;
        if (acceptableRateDecrease != null ? !acceptableRateDecrease.equals(that.acceptableRateDecrease) : that.acceptableRateDecrease != null)
            return false;
        if (cumulativeTotalLeadTime != null ? !cumulativeTotalLeadTime.equals(that.cumulativeTotalLeadTime) : that.cumulativeTotalLeadTime != null)
            return false;
        if (planningTimeFenceDays != null ? !planningTimeFenceDays.equals(that.planningTimeFenceDays) : that.planningTimeFenceDays != null)
            return false;
        if (demandTimeFenceDays != null ? !demandTimeFenceDays.equals(that.demandTimeFenceDays) : that.demandTimeFenceDays != null)
            return false;
        if (endAssemblyPeggingFlag != null ? !endAssemblyPeggingFlag.equals(that.endAssemblyPeggingFlag) : that.endAssemblyPeggingFlag != null)
            return false;
        if (repetitivePlanningFlag != null ? !repetitivePlanningFlag.equals(that.repetitivePlanningFlag) : that.repetitivePlanningFlag != null)
            return false;
        if (planningExceptionSet != null ? !planningExceptionSet.equals(that.planningExceptionSet) : that.planningExceptionSet != null)
            return false;
        if (bomItemType != null ? !bomItemType.equals(that.bomItemType) : that.bomItemType != null) return false;
        if (pickComponentsFlag != null ? !pickComponentsFlag.equals(that.pickComponentsFlag) : that.pickComponentsFlag != null)
            return false;
        if (replenishToOrderFlag != null ? !replenishToOrderFlag.equals(that.replenishToOrderFlag) : that.replenishToOrderFlag != null)
            return false;
        if (baseItemId != null ? !baseItemId.equals(that.baseItemId) : that.baseItemId != null) return false;
        if (atpComponentsFlag != null ? !atpComponentsFlag.equals(that.atpComponentsFlag) : that.atpComponentsFlag != null)
            return false;
        if (atpFlag != null ? !atpFlag.equals(that.atpFlag) : that.atpFlag != null) return false;
        if (fixedLeadTime != null ? !fixedLeadTime.equals(that.fixedLeadTime) : that.fixedLeadTime != null)
            return false;
        if (variableLeadTime != null ? !variableLeadTime.equals(that.variableLeadTime) : that.variableLeadTime != null)
            return false;
        if (wipSupplyLocatorId != null ? !wipSupplyLocatorId.equals(that.wipSupplyLocatorId) : that.wipSupplyLocatorId != null)
            return false;
        if (wipSupplyType != null ? !wipSupplyType.equals(that.wipSupplyType) : that.wipSupplyType != null)
            return false;
        if (wipSupplySubinventory != null ? !wipSupplySubinventory.equals(that.wipSupplySubinventory) : that.wipSupplySubinventory != null)
            return false;
        if (primaryUomCode != null ? !primaryUomCode.equals(that.primaryUomCode) : that.primaryUomCode != null)
            return false;
        if (primaryUnitOfMeasure != null ? !primaryUnitOfMeasure.equals(that.primaryUnitOfMeasure) : that.primaryUnitOfMeasure != null)
            return false;
        if (allowedUnitsLookupCode != null ? !allowedUnitsLookupCode.equals(that.allowedUnitsLookupCode) : that.allowedUnitsLookupCode != null)
            return false;
        if (costOfSalesAccount != null ? !costOfSalesAccount.equals(that.costOfSalesAccount) : that.costOfSalesAccount != null)
            return false;
        if (salesAccount != null ? !salesAccount.equals(that.salesAccount) : that.salesAccount != null) return false;
        if (defaultIncludeInRollupFlag != null ? !defaultIncludeInRollupFlag.equals(that.defaultIncludeInRollupFlag) : that.defaultIncludeInRollupFlag != null)
            return false;
        if (inventoryItemStatusCode != null ? !inventoryItemStatusCode.equals(that.inventoryItemStatusCode) : that.inventoryItemStatusCode != null)
            return false;
        if (inventoryPlanningCode != null ? !inventoryPlanningCode.equals(that.inventoryPlanningCode) : that.inventoryPlanningCode != null)
            return false;
        if (plannerCode != null ? !plannerCode.equals(that.plannerCode) : that.plannerCode != null) return false;
        if (planningMakeBuyCode != null ? !planningMakeBuyCode.equals(that.planningMakeBuyCode) : that.planningMakeBuyCode != null)
            return false;
        if (fixedLotMultiplier != null ? !fixedLotMultiplier.equals(that.fixedLotMultiplier) : that.fixedLotMultiplier != null)
            return false;
        if (roundingControlType != null ? !roundingControlType.equals(that.roundingControlType) : that.roundingControlType != null)
            return false;
        if (carryingCost != null ? !carryingCost.equals(that.carryingCost) : that.carryingCost != null) return false;
        if (postprocessingLeadTime != null ? !postprocessingLeadTime.equals(that.postprocessingLeadTime) : that.postprocessingLeadTime != null)
            return false;
        if (preprocessingLeadTime != null ? !preprocessingLeadTime.equals(that.preprocessingLeadTime) : that.preprocessingLeadTime != null)
            return false;
        if (fullLeadTime != null ? !fullLeadTime.equals(that.fullLeadTime) : that.fullLeadTime != null) return false;
        if (orderCost != null ? !orderCost.equals(that.orderCost) : that.orderCost != null) return false;
        if (mrpSafetyStockPercent != null ? !mrpSafetyStockPercent.equals(that.mrpSafetyStockPercent) : that.mrpSafetyStockPercent != null)
            return false;
        if (mrpSafetyStockCode != null ? !mrpSafetyStockCode.equals(that.mrpSafetyStockCode) : that.mrpSafetyStockCode != null)
            return false;
        if (minMinmaxQuantity != null ? !minMinmaxQuantity.equals(that.minMinmaxQuantity) : that.minMinmaxQuantity != null)
            return false;
        if (maxMinmaxQuantity != null ? !maxMinmaxQuantity.equals(that.maxMinmaxQuantity) : that.maxMinmaxQuantity != null)
            return false;
        if (minimumOrderQuantity != null ? !minimumOrderQuantity.equals(that.minimumOrderQuantity) : that.minimumOrderQuantity != null)
            return false;
        if (fixedOrderQuantity != null ? !fixedOrderQuantity.equals(that.fixedOrderQuantity) : that.fixedOrderQuantity != null)
            return false;
        if (fixedDaysSupply != null ? !fixedDaysSupply.equals(that.fixedDaysSupply) : that.fixedDaysSupply != null)
            return false;
        if (maximumOrderQuantity != null ? !maximumOrderQuantity.equals(that.maximumOrderQuantity) : that.maximumOrderQuantity != null)
            return false;
        if (atpRuleId != null ? !atpRuleId.equals(that.atpRuleId) : that.atpRuleId != null) return false;
        if (pickingRuleId != null ? !pickingRuleId.equals(that.pickingRuleId) : that.pickingRuleId != null)
            return false;
        if (reservableType != null ? !reservableType.equals(that.reservableType) : that.reservableType != null)
            return false;
        if (positiveMeasurementError != null ? !positiveMeasurementError.equals(that.positiveMeasurementError) : that.positiveMeasurementError != null)
            return false;
        if (negativeMeasurementError != null ? !negativeMeasurementError.equals(that.negativeMeasurementError) : that.negativeMeasurementError != null)
            return false;
        if (engineeringEcnCode != null ? !engineeringEcnCode.equals(that.engineeringEcnCode) : that.engineeringEcnCode != null)
            return false;
        if (engineeringItemId != null ? !engineeringItemId.equals(that.engineeringItemId) : that.engineeringItemId != null)
            return false;
        if (engineeringDate != null ? !engineeringDate.equals(that.engineeringDate) : that.engineeringDate != null)
            return false;
        if (serviceStartingDelay != null ? !serviceStartingDelay.equals(that.serviceStartingDelay) : that.serviceStartingDelay != null)
            return false;
        if (vendorWarrantyFlag != null ? !vendorWarrantyFlag.equals(that.vendorWarrantyFlag) : that.vendorWarrantyFlag != null)
            return false;
        if (serviceableComponentFlag != null ? !serviceableComponentFlag.equals(that.serviceableComponentFlag) : that.serviceableComponentFlag != null)
            return false;
        if (serviceableProductFlag != null ? !serviceableProductFlag.equals(that.serviceableProductFlag) : that.serviceableProductFlag != null)
            return false;
        if (baseWarrantyServiceId != null ? !baseWarrantyServiceId.equals(that.baseWarrantyServiceId) : that.baseWarrantyServiceId != null)
            return false;
        if (paymentTermsId != null ? !paymentTermsId.equals(that.paymentTermsId) : that.paymentTermsId != null)
            return false;
        if (preventiveMaintenanceFlag != null ? !preventiveMaintenanceFlag.equals(that.preventiveMaintenanceFlag) : that.preventiveMaintenanceFlag != null)
            return false;
        if (primarySpecialistId != null ? !primarySpecialistId.equals(that.primarySpecialistId) : that.primarySpecialistId != null)
            return false;
        if (secondarySpecialistId != null ? !secondarySpecialistId.equals(that.secondarySpecialistId) : that.secondarySpecialistId != null)
            return false;
        if (serviceableItemClassId != null ? !serviceableItemClassId.equals(that.serviceableItemClassId) : that.serviceableItemClassId != null)
            return false;
        if (timeBillableFlag != null ? !timeBillableFlag.equals(that.timeBillableFlag) : that.timeBillableFlag != null)
            return false;
        if (materialBillableFlag != null ? !materialBillableFlag.equals(that.materialBillableFlag) : that.materialBillableFlag != null)
            return false;
        if (expenseBillableFlag != null ? !expenseBillableFlag.equals(that.expenseBillableFlag) : that.expenseBillableFlag != null)
            return false;
        if (prorateServiceFlag != null ? !prorateServiceFlag.equals(that.prorateServiceFlag) : that.prorateServiceFlag != null)
            return false;
        if (coverageScheduleId != null ? !coverageScheduleId.equals(that.coverageScheduleId) : that.coverageScheduleId != null)
            return false;
        if (serviceDurationPeriodCode != null ? !serviceDurationPeriodCode.equals(that.serviceDurationPeriodCode) : that.serviceDurationPeriodCode != null)
            return false;
        if (serviceDuration != null ? !serviceDuration.equals(that.serviceDuration) : that.serviceDuration != null)
            return false;
        if (warrantyVendorId != null ? !warrantyVendorId.equals(that.warrantyVendorId) : that.warrantyVendorId != null)
            return false;
        if (maxWarrantyAmount != null ? !maxWarrantyAmount.equals(that.maxWarrantyAmount) : that.maxWarrantyAmount != null)
            return false;
        if (responseTimePeriodCode != null ? !responseTimePeriodCode.equals(that.responseTimePeriodCode) : that.responseTimePeriodCode != null)
            return false;
        if (responseTimeValue != null ? !responseTimeValue.equals(that.responseTimeValue) : that.responseTimeValue != null)
            return false;
        if (newRevisionCode != null ? !newRevisionCode.equals(that.newRevisionCode) : that.newRevisionCode != null)
            return false;
        if (invoiceableItemFlag != null ? !invoiceableItemFlag.equals(that.invoiceableItemFlag) : that.invoiceableItemFlag != null)
            return false;
        if (taxCode != null ? !taxCode.equals(that.taxCode) : that.taxCode != null) return false;
        if (invoiceEnabledFlag != null ? !invoiceEnabledFlag.equals(that.invoiceEnabledFlag) : that.invoiceEnabledFlag != null)
            return false;
        if (mustUseApprovedVendorFlag != null ? !mustUseApprovedVendorFlag.equals(that.mustUseApprovedVendorFlag) : that.mustUseApprovedVendorFlag != null)
            return false;
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;
        if (programApplicationId != null ? !programApplicationId.equals(that.programApplicationId) : that.programApplicationId != null)
            return false;
        if (programId != null ? !programId.equals(that.programId) : that.programId != null) return false;
        if (programUpdateDate != null ? !programUpdateDate.equals(that.programUpdateDate) : that.programUpdateDate != null)
            return false;
        if (outsideOperationFlag != null ? !outsideOperationFlag.equals(that.outsideOperationFlag) : that.outsideOperationFlag != null)
            return false;
        if (outsideOperationUomType != null ? !outsideOperationUomType.equals(that.outsideOperationUomType) : that.outsideOperationUomType != null)
            return false;
        if (safetyStockBucketDays != null ? !safetyStockBucketDays.equals(that.safetyStockBucketDays) : that.safetyStockBucketDays != null)
            return false;
        if (autoReduceMps != null ? !autoReduceMps.equals(that.autoReduceMps) : that.autoReduceMps != null)
            return false;
        if (costingEnabledFlag != null ? !costingEnabledFlag.equals(that.costingEnabledFlag) : that.costingEnabledFlag != null)
            return false;
        if (cycleCountEnabledFlag != null ? !cycleCountEnabledFlag.equals(that.cycleCountEnabledFlag) : that.cycleCountEnabledFlag != null)
            return false;
        if (demandSourceLine != null ? !demandSourceLine.equals(that.demandSourceLine) : that.demandSourceLine != null)
            return false;
        if (copyItemId != null ? !copyItemId.equals(that.copyItemId) : that.copyItemId != null) return false;
        if (setId != null ? !setId.equals(that.setId) : that.setId != null) return false;
        if (revision != null ? !revision.equals(that.revision) : that.revision != null) return false;
        if (autoCreatedConfigFlag != null ? !autoCreatedConfigFlag.equals(that.autoCreatedConfigFlag) : that.autoCreatedConfigFlag != null)
            return false;
        if (itemType != null ? !itemType.equals(that.itemType) : that.itemType != null) return false;
        if (modelConfigClauseName != null ? !modelConfigClauseName.equals(that.modelConfigClauseName) : that.modelConfigClauseName != null)
            return false;
        if (shipModelCompleteFlag != null ? !shipModelCompleteFlag.equals(that.shipModelCompleteFlag) : that.shipModelCompleteFlag != null)
            return false;
        if (mrpPlanningCode != null ? !mrpPlanningCode.equals(that.mrpPlanningCode) : that.mrpPlanningCode != null)
            return false;
        if (returnInspectionRequirement != null ? !returnInspectionRequirement.equals(that.returnInspectionRequirement) : that.returnInspectionRequirement != null)
            return false;
        if (demandSourceType != null ? !demandSourceType.equals(that.demandSourceType) : that.demandSourceType != null)
            return false;
        if (demandSourceHeaderId != null ? !demandSourceHeaderId.equals(that.demandSourceHeaderId) : that.demandSourceHeaderId != null)
            return false;
        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null)
            return false;
        if (processFlag != null ? !processFlag.equals(that.processFlag) : that.processFlag != null) return false;
        if (organizationCode != null ? !organizationCode.equals(that.organizationCode) : that.organizationCode != null)
            return false;
        if (itemNumber != null ? !itemNumber.equals(that.itemNumber) : that.itemNumber != null) return false;
        if (copyItemNumber != null ? !copyItemNumber.equals(that.copyItemNumber) : that.copyItemNumber != null)
            return false;
        if (templateId != null ? !templateId.equals(that.templateId) : that.templateId != null) return false;
        if (templateName != null ? !templateName.equals(that.templateName) : that.templateName != null) return false;
        if (copyOrganizationId != null ? !copyOrganizationId.equals(that.copyOrganizationId) : that.copyOrganizationId != null)
            return false;
        if (copyOrganizationCode != null ? !copyOrganizationCode.equals(that.copyOrganizationCode) : that.copyOrganizationCode != null)
            return false;
        if (atoForecastControl != null ? !atoForecastControl.equals(that.atoForecastControl) : that.atoForecastControl != null)
            return false;
        if (transactionType != null ? !transactionType.equals(that.transactionType) : that.transactionType != null)
            return false;
        if (materialCost != null ? !materialCost.equals(that.materialCost) : that.materialCost != null) return false;
        if (materialSubElem != null ? !materialSubElem.equals(that.materialSubElem) : that.materialSubElem != null)
            return false;
        if (materialOhRate != null ? !materialOhRate.equals(that.materialOhRate) : that.materialOhRate != null)
            return false;
        if (materialOhSubElem != null ? !materialOhSubElem.equals(that.materialOhSubElem) : that.materialOhSubElem != null)
            return false;
        if (materialSubElemId != null ? !materialSubElemId.equals(that.materialSubElemId) : that.materialSubElemId != null)
            return false;
        if (materialOhSubElemId != null ? !materialOhSubElemId.equals(that.materialOhSubElemId) : that.materialOhSubElemId != null)
            return false;
        if (releaseTimeFenceCode != null ? !releaseTimeFenceCode.equals(that.releaseTimeFenceCode) : that.releaseTimeFenceCode != null)
            return false;
        if (releaseTimeFenceDays != null ? !releaseTimeFenceDays.equals(that.releaseTimeFenceDays) : that.releaseTimeFenceDays != null)
            return false;
        if (containerItemFlag != null ? !containerItemFlag.equals(that.containerItemFlag) : that.containerItemFlag != null)
            return false;
        if (vehicleItemFlag != null ? !vehicleItemFlag.equals(that.vehicleItemFlag) : that.vehicleItemFlag != null)
            return false;
        if (maximumLoadWeight != null ? !maximumLoadWeight.equals(that.maximumLoadWeight) : that.maximumLoadWeight != null)
            return false;
        if (minimumFillPercent != null ? !minimumFillPercent.equals(that.minimumFillPercent) : that.minimumFillPercent != null)
            return false;
        if (containerTypeCode != null ? !containerTypeCode.equals(that.containerTypeCode) : that.containerTypeCode != null)
            return false;
        if (internalVolume != null ? !internalVolume.equals(that.internalVolume) : that.internalVolume != null)
            return false;
        if (whUpdateDate != null ? !whUpdateDate.equals(that.whUpdateDate) : that.whUpdateDate != null) return false;
        if (productFamilyItemId != null ? !productFamilyItemId.equals(that.productFamilyItemId) : that.productFamilyItemId != null)
            return false;
        if (purchasingTaxCode != null ? !purchasingTaxCode.equals(that.purchasingTaxCode) : that.purchasingTaxCode != null)
            return false;
        if (overcompletionToleranceType != null ? !overcompletionToleranceType.equals(that.overcompletionToleranceType) : that.overcompletionToleranceType != null)
            return false;
        if (overcompletionToleranceValue != null ? !overcompletionToleranceValue.equals(that.overcompletionToleranceValue) : that.overcompletionToleranceValue != null)
            return false;
        if (effectivityControl != null ? !effectivityControl.equals(that.effectivityControl) : that.effectivityControl != null)
            return false;
        if (globalAttributeCategory != null ? !globalAttributeCategory.equals(that.globalAttributeCategory) : that.globalAttributeCategory != null)
            return false;
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
        if (globalAttribute6 != null ? !globalAttribute6.equals(that.globalAttribute6) : that.globalAttribute6 != null)
            return false;
        if (globalAttribute7 != null ? !globalAttribute7.equals(that.globalAttribute7) : that.globalAttribute7 != null)
            return false;
        if (globalAttribute8 != null ? !globalAttribute8.equals(that.globalAttribute8) : that.globalAttribute8 != null)
            return false;
        if (globalAttribute9 != null ? !globalAttribute9.equals(that.globalAttribute9) : that.globalAttribute9 != null)
            return false;
        if (globalAttribute10 != null ? !globalAttribute10.equals(that.globalAttribute10) : that.globalAttribute10 != null)
            return false;
        if (overShipmentTolerance != null ? !overShipmentTolerance.equals(that.overShipmentTolerance) : that.overShipmentTolerance != null)
            return false;
        if (underShipmentTolerance != null ? !underShipmentTolerance.equals(that.underShipmentTolerance) : that.underShipmentTolerance != null)
            return false;
        if (overReturnTolerance != null ? !overReturnTolerance.equals(that.overReturnTolerance) : that.overReturnTolerance != null)
            return false;
        if (underReturnTolerance != null ? !underReturnTolerance.equals(that.underReturnTolerance) : that.underReturnTolerance != null)
            return false;
        if (equipmentType != null ? !equipmentType.equals(that.equipmentType) : that.equipmentType != null)
            return false;
        if (recoveredPartDispCode != null ? !recoveredPartDispCode.equals(that.recoveredPartDispCode) : that.recoveredPartDispCode != null)
            return false;
        if (defectTrackingOnFlag != null ? !defectTrackingOnFlag.equals(that.defectTrackingOnFlag) : that.defectTrackingOnFlag != null)
            return false;
        if (usageItemFlag != null ? !usageItemFlag.equals(that.usageItemFlag) : that.usageItemFlag != null)
            return false;
        if (eventFlag != null ? !eventFlag.equals(that.eventFlag) : that.eventFlag != null) return false;
        if (electronicFlag != null ? !electronicFlag.equals(that.electronicFlag) : that.electronicFlag != null)
            return false;
        if (downloadableFlag != null ? !downloadableFlag.equals(that.downloadableFlag) : that.downloadableFlag != null)
            return false;
        if (volDiscountExemptFlag != null ? !volDiscountExemptFlag.equals(that.volDiscountExemptFlag) : that.volDiscountExemptFlag != null)
            return false;
        if (couponExemptFlag != null ? !couponExemptFlag.equals(that.couponExemptFlag) : that.couponExemptFlag != null)
            return false;
        if (commsNlTrackableFlag != null ? !commsNlTrackableFlag.equals(that.commsNlTrackableFlag) : that.commsNlTrackableFlag != null)
            return false;
        if (assetCreationCode != null ? !assetCreationCode.equals(that.assetCreationCode) : that.assetCreationCode != null)
            return false;
        if (commsActivationReqdFlag != null ? !commsActivationReqdFlag.equals(that.commsActivationReqdFlag) : that.commsActivationReqdFlag != null)
            return false;
        if (orderableOnWebFlag != null ? !orderableOnWebFlag.equals(that.orderableOnWebFlag) : that.orderableOnWebFlag != null)
            return false;
        if (backOrderableFlag != null ? !backOrderableFlag.equals(that.backOrderableFlag) : that.backOrderableFlag != null)
            return false;
        if (webStatus != null ? !webStatus.equals(that.webStatus) : that.webStatus != null) return false;
        if (indivisibleFlag != null ? !indivisibleFlag.equals(that.indivisibleFlag) : that.indivisibleFlag != null)
            return false;
        if (longDescription != null ? !longDescription.equals(that.longDescription) : that.longDescription != null)
            return false;
        if (dimensionUomCode != null ? !dimensionUomCode.equals(that.dimensionUomCode) : that.dimensionUomCode != null)
            return false;
        if (unitLength != null ? !unitLength.equals(that.unitLength) : that.unitLength != null) return false;
        if (unitWidth != null ? !unitWidth.equals(that.unitWidth) : that.unitWidth != null) return false;
        if (unitHeight != null ? !unitHeight.equals(that.unitHeight) : that.unitHeight != null) return false;
        if (bulkPickedFlag != null ? !bulkPickedFlag.equals(that.bulkPickedFlag) : that.bulkPickedFlag != null)
            return false;
        if (lotStatusEnabled != null ? !lotStatusEnabled.equals(that.lotStatusEnabled) : that.lotStatusEnabled != null)
            return false;
        if (defaultLotStatusId != null ? !defaultLotStatusId.equals(that.defaultLotStatusId) : that.defaultLotStatusId != null)
            return false;
        if (serialStatusEnabled != null ? !serialStatusEnabled.equals(that.serialStatusEnabled) : that.serialStatusEnabled != null)
            return false;
        if (defaultSerialStatusId != null ? !defaultSerialStatusId.equals(that.defaultSerialStatusId) : that.defaultSerialStatusId != null)
            return false;
        if (lotSplitEnabled != null ? !lotSplitEnabled.equals(that.lotSplitEnabled) : that.lotSplitEnabled != null)
            return false;
        if (lotMergeEnabled != null ? !lotMergeEnabled.equals(that.lotMergeEnabled) : that.lotMergeEnabled != null)
            return false;
        if (inventoryCarryPenalty != null ? !inventoryCarryPenalty.equals(that.inventoryCarryPenalty) : that.inventoryCarryPenalty != null)
            return false;
        if (operationSlackPenalty != null ? !operationSlackPenalty.equals(that.operationSlackPenalty) : that.operationSlackPenalty != null)
            return false;
        if (financingAllowedFlag != null ? !financingAllowedFlag.equals(that.financingAllowedFlag) : that.financingAllowedFlag != null)
            return false;
        if (eamItemType != null ? !eamItemType.equals(that.eamItemType) : that.eamItemType != null) return false;
        if (eamActivityTypeCode != null ? !eamActivityTypeCode.equals(that.eamActivityTypeCode) : that.eamActivityTypeCode != null)
            return false;
        if (eamActivityCauseCode != null ? !eamActivityCauseCode.equals(that.eamActivityCauseCode) : that.eamActivityCauseCode != null)
            return false;
        if (eamActNotificationFlag != null ? !eamActNotificationFlag.equals(that.eamActNotificationFlag) : that.eamActNotificationFlag != null)
            return false;
        if (eamActShutdownStatus != null ? !eamActShutdownStatus.equals(that.eamActShutdownStatus) : that.eamActShutdownStatus != null)
            return false;
        if (dualUomControl != null ? !dualUomControl.equals(that.dualUomControl) : that.dualUomControl != null)
            return false;
        if (secondaryUomCode != null ? !secondaryUomCode.equals(that.secondaryUomCode) : that.secondaryUomCode != null)
            return false;
        if (dualUomDeviationHigh != null ? !dualUomDeviationHigh.equals(that.dualUomDeviationHigh) : that.dualUomDeviationHigh != null)
            return false;
        if (dualUomDeviationLow != null ? !dualUomDeviationLow.equals(that.dualUomDeviationLow) : that.dualUomDeviationLow != null)
            return false;
        if (contractItemTypeCode != null ? !contractItemTypeCode.equals(that.contractItemTypeCode) : that.contractItemTypeCode != null)
            return false;
        if (subscriptionDependFlag != null ? !subscriptionDependFlag.equals(that.subscriptionDependFlag) : that.subscriptionDependFlag != null)
            return false;
        if (servReqEnabledCode != null ? !servReqEnabledCode.equals(that.servReqEnabledCode) : that.servReqEnabledCode != null)
            return false;
        if (servBillingEnabledFlag != null ? !servBillingEnabledFlag.equals(that.servBillingEnabledFlag) : that.servBillingEnabledFlag != null)
            return false;
        if (servImportanceLevel != null ? !servImportanceLevel.equals(that.servImportanceLevel) : that.servImportanceLevel != null)
            return false;
        if (plannedInvPointFlag != null ? !plannedInvPointFlag.equals(that.plannedInvPointFlag) : that.plannedInvPointFlag != null)
            return false;
        if (lotTranslateEnabled != null ? !lotTranslateEnabled.equals(that.lotTranslateEnabled) : that.lotTranslateEnabled != null)
            return false;
        if (defaultSoSourceType != null ? !defaultSoSourceType.equals(that.defaultSoSourceType) : that.defaultSoSourceType != null)
            return false;
        if (createSupplyFlag != null ? !createSupplyFlag.equals(that.createSupplyFlag) : that.createSupplyFlag != null)
            return false;
        if (substitutionWindowCode != null ? !substitutionWindowCode.equals(that.substitutionWindowCode) : that.substitutionWindowCode != null)
            return false;
        if (substitutionWindowDays != null ? !substitutionWindowDays.equals(that.substitutionWindowDays) : that.substitutionWindowDays != null)
            return false;
        if (ibItemInstanceClass != null ? !ibItemInstanceClass.equals(that.ibItemInstanceClass) : that.ibItemInstanceClass != null)
            return false;
        if (configModelType != null ? !configModelType.equals(that.configModelType) : that.configModelType != null)
            return false;
        if (lotSubstitutionEnabled != null ? !lotSubstitutionEnabled.equals(that.lotSubstitutionEnabled) : that.lotSubstitutionEnabled != null)
            return false;
        if (minimumLicenseQuantity != null ? !minimumLicenseQuantity.equals(that.minimumLicenseQuantity) : that.minimumLicenseQuantity != null)
            return false;
        if (eamActivitySourceCode != null ? !eamActivitySourceCode.equals(that.eamActivitySourceCode) : that.eamActivitySourceCode != null)
            return false;
        if (lifecycleId != null ? !lifecycleId.equals(that.lifecycleId) : that.lifecycleId != null) return false;
        if (currentPhaseId != null ? !currentPhaseId.equals(that.currentPhaseId) : that.currentPhaseId != null)
            return false;
        if (trackingQuantityInd != null ? !trackingQuantityInd.equals(that.trackingQuantityInd) : that.trackingQuantityInd != null)
            return false;
        if (ontPricingQtySource != null ? !ontPricingQtySource.equals(that.ontPricingQtySource) : that.ontPricingQtySource != null)
            return false;
        if (secondaryDefaultInd != null ? !secondaryDefaultInd.equals(that.secondaryDefaultInd) : that.secondaryDefaultInd != null)
            return false;
        if (vmiMinimumUnits != null ? !vmiMinimumUnits.equals(that.vmiMinimumUnits) : that.vmiMinimumUnits != null)
            return false;
        if (vmiMinimumDays != null ? !vmiMinimumDays.equals(that.vmiMinimumDays) : that.vmiMinimumDays != null)
            return false;
        if (vmiMaximumUnits != null ? !vmiMaximumUnits.equals(that.vmiMaximumUnits) : that.vmiMaximumUnits != null)
            return false;
        if (vmiMaximumDays != null ? !vmiMaximumDays.equals(that.vmiMaximumDays) : that.vmiMaximumDays != null)
            return false;
        if (vmiFixedOrderQuantity != null ? !vmiFixedOrderQuantity.equals(that.vmiFixedOrderQuantity) : that.vmiFixedOrderQuantity != null)
            return false;
        if (soAuthorizationFlag != null ? !soAuthorizationFlag.equals(that.soAuthorizationFlag) : that.soAuthorizationFlag != null)
            return false;
        if (consignedFlag != null ? !consignedFlag.equals(that.consignedFlag) : that.consignedFlag != null)
            return false;
        if (asnAutoexpireFlag != null ? !asnAutoexpireFlag.equals(that.asnAutoexpireFlag) : that.asnAutoexpireFlag != null)
            return false;
        if (vmiForecastType != null ? !vmiForecastType.equals(that.vmiForecastType) : that.vmiForecastType != null)
            return false;
        if (forecastHorizon != null ? !forecastHorizon.equals(that.forecastHorizon) : that.forecastHorizon != null)
            return false;
        if (excludeFromBudgetFlag != null ? !excludeFromBudgetFlag.equals(that.excludeFromBudgetFlag) : that.excludeFromBudgetFlag != null)
            return false;
        if (daysTgtInvSupply != null ? !daysTgtInvSupply.equals(that.daysTgtInvSupply) : that.daysTgtInvSupply != null)
            return false;
        if (daysTgtInvWindow != null ? !daysTgtInvWindow.equals(that.daysTgtInvWindow) : that.daysTgtInvWindow != null)
            return false;
        if (daysMaxInvSupply != null ? !daysMaxInvSupply.equals(that.daysMaxInvSupply) : that.daysMaxInvSupply != null)
            return false;
        if (daysMaxInvWindow != null ? !daysMaxInvWindow.equals(that.daysMaxInvWindow) : that.daysMaxInvWindow != null)
            return false;
        if (drpPlannedFlag != null ? !drpPlannedFlag.equals(that.drpPlannedFlag) : that.drpPlannedFlag != null)
            return false;
        if (criticalComponentFlag != null ? !criticalComponentFlag.equals(that.criticalComponentFlag) : that.criticalComponentFlag != null)
            return false;
        if (continousTransfer != null ? !continousTransfer.equals(that.continousTransfer) : that.continousTransfer != null)
            return false;
        if (convergence != null ? !convergence.equals(that.convergence) : that.convergence != null) return false;
        if (divergence != null ? !divergence.equals(that.divergence) : that.divergence != null) return false;
        if (configOrgs != null ? !configOrgs.equals(that.configOrgs) : that.configOrgs != null) return false;
        if (configMatch != null ? !configMatch.equals(that.configMatch) : that.configMatch != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inventoryItemId != null ? inventoryItemId.hashCode() : 0;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (lastUpdateLogin != null ? lastUpdateLogin.hashCode() : 0);
        result = 31 * result + (summaryFlag != null ? summaryFlag.hashCode() : 0);
        result = 31 * result + (enabledFlag != null ? enabledFlag.hashCode() : 0);
        result = 31 * result + (startDateActive != null ? startDateActive.hashCode() : 0);
        result = 31 * result + (endDateActive != null ? endDateActive.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (buyerId != null ? buyerId.hashCode() : 0);
        result = 31 * result + (accountingRuleId != null ? accountingRuleId.hashCode() : 0);
        result = 31 * result + (invoicingRuleId != null ? invoicingRuleId.hashCode() : 0);
        result = 31 * result + (segment1 != null ? segment1.hashCode() : 0);
        result = 31 * result + (segment2 != null ? segment2.hashCode() : 0);
        result = 31 * result + (segment3 != null ? segment3.hashCode() : 0);
        result = 31 * result + (segment4 != null ? segment4.hashCode() : 0);
        result = 31 * result + (segment5 != null ? segment5.hashCode() : 0);
        result = 31 * result + (segment6 != null ? segment6.hashCode() : 0);
        result = 31 * result + (segment7 != null ? segment7.hashCode() : 0);
        result = 31 * result + (segment8 != null ? segment8.hashCode() : 0);
        result = 31 * result + (segment9 != null ? segment9.hashCode() : 0);
        result = 31 * result + (segment10 != null ? segment10.hashCode() : 0);
        result = 31 * result + (segment11 != null ? segment11.hashCode() : 0);
        result = 31 * result + (segment12 != null ? segment12.hashCode() : 0);
        result = 31 * result + (segment13 != null ? segment13.hashCode() : 0);
        result = 31 * result + (segment14 != null ? segment14.hashCode() : 0);
        result = 31 * result + (segment15 != null ? segment15.hashCode() : 0);
        result = 31 * result + (segment16 != null ? segment16.hashCode() : 0);
        result = 31 * result + (segment17 != null ? segment17.hashCode() : 0);
        result = 31 * result + (segment18 != null ? segment18.hashCode() : 0);
        result = 31 * result + (segment19 != null ? segment19.hashCode() : 0);
        result = 31 * result + (segment20 != null ? segment20.hashCode() : 0);
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
        result = 31 * result + (purchasingItemFlag != null ? purchasingItemFlag.hashCode() : 0);
        result = 31 * result + (shippableItemFlag != null ? shippableItemFlag.hashCode() : 0);
        result = 31 * result + (customerOrderFlag != null ? customerOrderFlag.hashCode() : 0);
        result = 31 * result + (internalOrderFlag != null ? internalOrderFlag.hashCode() : 0);
        result = 31 * result + (serviceItemFlag != null ? serviceItemFlag.hashCode() : 0);
        result = 31 * result + (inventoryItemFlag != null ? inventoryItemFlag.hashCode() : 0);
        result = 31 * result + (engItemFlag != null ? engItemFlag.hashCode() : 0);
        result = 31 * result + (inventoryAssetFlag != null ? inventoryAssetFlag.hashCode() : 0);
        result = 31 * result + (purchasingEnabledFlag != null ? purchasingEnabledFlag.hashCode() : 0);
        result = 31 * result + (customerOrderEnabledFlag != null ? customerOrderEnabledFlag.hashCode() : 0);
        result = 31 * result + (internalOrderEnabledFlag != null ? internalOrderEnabledFlag.hashCode() : 0);
        result = 31 * result + (soTransactionsFlag != null ? soTransactionsFlag.hashCode() : 0);
        result = 31 * result + (mtlTransactionsEnabledFlag != null ? mtlTransactionsEnabledFlag.hashCode() : 0);
        result = 31 * result + (stockEnabledFlag != null ? stockEnabledFlag.hashCode() : 0);
        result = 31 * result + (bomEnabledFlag != null ? bomEnabledFlag.hashCode() : 0);
        result = 31 * result + (buildInWipFlag != null ? buildInWipFlag.hashCode() : 0);
        result = 31 * result + (revisionQtyControlCode != null ? revisionQtyControlCode.hashCode() : 0);
        result = 31 * result + (itemCatalogGroupId != null ? itemCatalogGroupId.hashCode() : 0);
        result = 31 * result + (catalogStatusFlag != null ? catalogStatusFlag.hashCode() : 0);
        result = 31 * result + (checkShortagesFlag != null ? checkShortagesFlag.hashCode() : 0);
        result = 31 * result + (returnableFlag != null ? returnableFlag.hashCode() : 0);
        result = 31 * result + (defaultShippingOrg != null ? defaultShippingOrg.hashCode() : 0);
        result = 31 * result + (collateralFlag != null ? collateralFlag.hashCode() : 0);
        result = 31 * result + (taxableFlag != null ? taxableFlag.hashCode() : 0);
        result = 31 * result + (qtyRcvExceptionCode != null ? qtyRcvExceptionCode.hashCode() : 0);
        result = 31 * result + (allowItemDescUpdateFlag != null ? allowItemDescUpdateFlag.hashCode() : 0);
        result = 31 * result + (inspectionRequiredFlag != null ? inspectionRequiredFlag.hashCode() : 0);
        result = 31 * result + (receiptRequiredFlag != null ? receiptRequiredFlag.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (hazardClassId != null ? hazardClassId.hashCode() : 0);
        result = 31 * result + (rfqRequiredFlag != null ? rfqRequiredFlag.hashCode() : 0);
        result = 31 * result + (qtyRcvTolerance != null ? qtyRcvTolerance.hashCode() : 0);
        result = 31 * result + (listPricePerUnit != null ? listPricePerUnit.hashCode() : 0);
        result = 31 * result + (unNumberId != null ? unNumberId.hashCode() : 0);
        result = 31 * result + (priceTolerancePercent != null ? priceTolerancePercent.hashCode() : 0);
        result = 31 * result + (assetCategoryId != null ? assetCategoryId.hashCode() : 0);
        result = 31 * result + (roundingFactor != null ? roundingFactor.hashCode() : 0);
        result = 31 * result + (unitOfIssue != null ? unitOfIssue.hashCode() : 0);
        result = 31 * result + (enforceShipToLocationCode != null ? enforceShipToLocationCode.hashCode() : 0);
        result = 31 * result + (allowSubstituteReceiptsFlag != null ? allowSubstituteReceiptsFlag.hashCode() : 0);
        result = 31 * result + (allowUnorderedReceiptsFlag != null ? allowUnorderedReceiptsFlag.hashCode() : 0);
        result = 31 * result + (allowExpressDeliveryFlag != null ? allowExpressDeliveryFlag.hashCode() : 0);
        result = 31 * result + (daysEarlyReceiptAllowed != null ? daysEarlyReceiptAllowed.hashCode() : 0);
        result = 31 * result + (daysLateReceiptAllowed != null ? daysLateReceiptAllowed.hashCode() : 0);
        result = 31 * result + (receiptDaysExceptionCode != null ? receiptDaysExceptionCode.hashCode() : 0);
        result = 31 * result + (receivingRoutingId != null ? receivingRoutingId.hashCode() : 0);
        result = 31 * result + (invoiceCloseTolerance != null ? invoiceCloseTolerance.hashCode() : 0);
        result = 31 * result + (receiveCloseTolerance != null ? receiveCloseTolerance.hashCode() : 0);
        result = 31 * result + (autoLotAlphaPrefix != null ? autoLotAlphaPrefix.hashCode() : 0);
        result = 31 * result + (startAutoLotNumber != null ? startAutoLotNumber.hashCode() : 0);
        result = 31 * result + (lotControlCode != null ? lotControlCode.hashCode() : 0);
        result = 31 * result + (shelfLifeCode != null ? shelfLifeCode.hashCode() : 0);
        result = 31 * result + (shelfLifeDays != null ? shelfLifeDays.hashCode() : 0);
        result = 31 * result + (serialNumberControlCode != null ? serialNumberControlCode.hashCode() : 0);
        result = 31 * result + (startAutoSerialNumber != null ? startAutoSerialNumber.hashCode() : 0);
        result = 31 * result + (autoSerialAlphaPrefix != null ? autoSerialAlphaPrefix.hashCode() : 0);
        result = 31 * result + (sourceType != null ? sourceType.hashCode() : 0);
        result = 31 * result + (sourceOrganizationId != null ? sourceOrganizationId.hashCode() : 0);
        result = 31 * result + (sourceSubinventory != null ? sourceSubinventory.hashCode() : 0);
        result = 31 * result + (expenseAccount != null ? expenseAccount.hashCode() : 0);
        result = 31 * result + (encumbranceAccount != null ? encumbranceAccount.hashCode() : 0);
        result = 31 * result + (restrictSubinventoriesCode != null ? restrictSubinventoriesCode.hashCode() : 0);
        result = 31 * result + (unitWeight != null ? unitWeight.hashCode() : 0);
        result = 31 * result + (weightUomCode != null ? weightUomCode.hashCode() : 0);
        result = 31 * result + (volumeUomCode != null ? volumeUomCode.hashCode() : 0);
        result = 31 * result + (unitVolume != null ? unitVolume.hashCode() : 0);
        result = 31 * result + (restrictLocatorsCode != null ? restrictLocatorsCode.hashCode() : 0);
        result = 31 * result + (locationControlCode != null ? locationControlCode.hashCode() : 0);
        result = 31 * result + (shrinkageRate != null ? shrinkageRate.hashCode() : 0);
        result = 31 * result + (acceptableEarlyDays != null ? acceptableEarlyDays.hashCode() : 0);
        result = 31 * result + (planningTimeFenceCode != null ? planningTimeFenceCode.hashCode() : 0);
        result = 31 * result + (demandTimeFenceCode != null ? demandTimeFenceCode.hashCode() : 0);
        result = 31 * result + (leadTimeLotSize != null ? leadTimeLotSize.hashCode() : 0);
        result = 31 * result + (stdLotSize != null ? stdLotSize.hashCode() : 0);
        result = 31 * result + (cumManufacturingLeadTime != null ? cumManufacturingLeadTime.hashCode() : 0);
        result = 31 * result + (overrunPercentage != null ? overrunPercentage.hashCode() : 0);
        result = 31 * result + (mrpCalculateAtpFlag != null ? mrpCalculateAtpFlag.hashCode() : 0);
        result = 31 * result + (acceptableRateIncrease != null ? acceptableRateIncrease.hashCode() : 0);
        result = 31 * result + (acceptableRateDecrease != null ? acceptableRateDecrease.hashCode() : 0);
        result = 31 * result + (cumulativeTotalLeadTime != null ? cumulativeTotalLeadTime.hashCode() : 0);
        result = 31 * result + (planningTimeFenceDays != null ? planningTimeFenceDays.hashCode() : 0);
        result = 31 * result + (demandTimeFenceDays != null ? demandTimeFenceDays.hashCode() : 0);
        result = 31 * result + (endAssemblyPeggingFlag != null ? endAssemblyPeggingFlag.hashCode() : 0);
        result = 31 * result + (repetitivePlanningFlag != null ? repetitivePlanningFlag.hashCode() : 0);
        result = 31 * result + (planningExceptionSet != null ? planningExceptionSet.hashCode() : 0);
        result = 31 * result + (bomItemType != null ? bomItemType.hashCode() : 0);
        result = 31 * result + (pickComponentsFlag != null ? pickComponentsFlag.hashCode() : 0);
        result = 31 * result + (replenishToOrderFlag != null ? replenishToOrderFlag.hashCode() : 0);
        result = 31 * result + (baseItemId != null ? baseItemId.hashCode() : 0);
        result = 31 * result + (atpComponentsFlag != null ? atpComponentsFlag.hashCode() : 0);
        result = 31 * result + (atpFlag != null ? atpFlag.hashCode() : 0);
        result = 31 * result + (fixedLeadTime != null ? fixedLeadTime.hashCode() : 0);
        result = 31 * result + (variableLeadTime != null ? variableLeadTime.hashCode() : 0);
        result = 31 * result + (wipSupplyLocatorId != null ? wipSupplyLocatorId.hashCode() : 0);
        result = 31 * result + (wipSupplyType != null ? wipSupplyType.hashCode() : 0);
        result = 31 * result + (wipSupplySubinventory != null ? wipSupplySubinventory.hashCode() : 0);
        result = 31 * result + (primaryUomCode != null ? primaryUomCode.hashCode() : 0);
        result = 31 * result + (primaryUnitOfMeasure != null ? primaryUnitOfMeasure.hashCode() : 0);
        result = 31 * result + (allowedUnitsLookupCode != null ? allowedUnitsLookupCode.hashCode() : 0);
        result = 31 * result + (costOfSalesAccount != null ? costOfSalesAccount.hashCode() : 0);
        result = 31 * result + (salesAccount != null ? salesAccount.hashCode() : 0);
        result = 31 * result + (defaultIncludeInRollupFlag != null ? defaultIncludeInRollupFlag.hashCode() : 0);
        result = 31 * result + (inventoryItemStatusCode != null ? inventoryItemStatusCode.hashCode() : 0);
        result = 31 * result + (inventoryPlanningCode != null ? inventoryPlanningCode.hashCode() : 0);
        result = 31 * result + (plannerCode != null ? plannerCode.hashCode() : 0);
        result = 31 * result + (planningMakeBuyCode != null ? planningMakeBuyCode.hashCode() : 0);
        result = 31 * result + (fixedLotMultiplier != null ? fixedLotMultiplier.hashCode() : 0);
        result = 31 * result + (roundingControlType != null ? roundingControlType.hashCode() : 0);
        result = 31 * result + (carryingCost != null ? carryingCost.hashCode() : 0);
        result = 31 * result + (postprocessingLeadTime != null ? postprocessingLeadTime.hashCode() : 0);
        result = 31 * result + (preprocessingLeadTime != null ? preprocessingLeadTime.hashCode() : 0);
        result = 31 * result + (fullLeadTime != null ? fullLeadTime.hashCode() : 0);
        result = 31 * result + (orderCost != null ? orderCost.hashCode() : 0);
        result = 31 * result + (mrpSafetyStockPercent != null ? mrpSafetyStockPercent.hashCode() : 0);
        result = 31 * result + (mrpSafetyStockCode != null ? mrpSafetyStockCode.hashCode() : 0);
        result = 31 * result + (minMinmaxQuantity != null ? minMinmaxQuantity.hashCode() : 0);
        result = 31 * result + (maxMinmaxQuantity != null ? maxMinmaxQuantity.hashCode() : 0);
        result = 31 * result + (minimumOrderQuantity != null ? minimumOrderQuantity.hashCode() : 0);
        result = 31 * result + (fixedOrderQuantity != null ? fixedOrderQuantity.hashCode() : 0);
        result = 31 * result + (fixedDaysSupply != null ? fixedDaysSupply.hashCode() : 0);
        result = 31 * result + (maximumOrderQuantity != null ? maximumOrderQuantity.hashCode() : 0);
        result = 31 * result + (atpRuleId != null ? atpRuleId.hashCode() : 0);
        result = 31 * result + (pickingRuleId != null ? pickingRuleId.hashCode() : 0);
        result = 31 * result + (reservableType != null ? reservableType.hashCode() : 0);
        result = 31 * result + (positiveMeasurementError != null ? positiveMeasurementError.hashCode() : 0);
        result = 31 * result + (negativeMeasurementError != null ? negativeMeasurementError.hashCode() : 0);
        result = 31 * result + (engineeringEcnCode != null ? engineeringEcnCode.hashCode() : 0);
        result = 31 * result + (engineeringItemId != null ? engineeringItemId.hashCode() : 0);
        result = 31 * result + (engineeringDate != null ? engineeringDate.hashCode() : 0);
        result = 31 * result + (serviceStartingDelay != null ? serviceStartingDelay.hashCode() : 0);
        result = 31 * result + (vendorWarrantyFlag != null ? vendorWarrantyFlag.hashCode() : 0);
        result = 31 * result + (serviceableComponentFlag != null ? serviceableComponentFlag.hashCode() : 0);
        result = 31 * result + (serviceableProductFlag != null ? serviceableProductFlag.hashCode() : 0);
        result = 31 * result + (baseWarrantyServiceId != null ? baseWarrantyServiceId.hashCode() : 0);
        result = 31 * result + (paymentTermsId != null ? paymentTermsId.hashCode() : 0);
        result = 31 * result + (preventiveMaintenanceFlag != null ? preventiveMaintenanceFlag.hashCode() : 0);
        result = 31 * result + (primarySpecialistId != null ? primarySpecialistId.hashCode() : 0);
        result = 31 * result + (secondarySpecialistId != null ? secondarySpecialistId.hashCode() : 0);
        result = 31 * result + (serviceableItemClassId != null ? serviceableItemClassId.hashCode() : 0);
        result = 31 * result + (timeBillableFlag != null ? timeBillableFlag.hashCode() : 0);
        result = 31 * result + (materialBillableFlag != null ? materialBillableFlag.hashCode() : 0);
        result = 31 * result + (expenseBillableFlag != null ? expenseBillableFlag.hashCode() : 0);
        result = 31 * result + (prorateServiceFlag != null ? prorateServiceFlag.hashCode() : 0);
        result = 31 * result + (coverageScheduleId != null ? coverageScheduleId.hashCode() : 0);
        result = 31 * result + (serviceDurationPeriodCode != null ? serviceDurationPeriodCode.hashCode() : 0);
        result = 31 * result + (serviceDuration != null ? serviceDuration.hashCode() : 0);
        result = 31 * result + (warrantyVendorId != null ? warrantyVendorId.hashCode() : 0);
        result = 31 * result + (maxWarrantyAmount != null ? maxWarrantyAmount.hashCode() : 0);
        result = 31 * result + (responseTimePeriodCode != null ? responseTimePeriodCode.hashCode() : 0);
        result = 31 * result + (responseTimeValue != null ? responseTimeValue.hashCode() : 0);
        result = 31 * result + (newRevisionCode != null ? newRevisionCode.hashCode() : 0);
        result = 31 * result + (invoiceableItemFlag != null ? invoiceableItemFlag.hashCode() : 0);
        result = 31 * result + (taxCode != null ? taxCode.hashCode() : 0);
        result = 31 * result + (invoiceEnabledFlag != null ? invoiceEnabledFlag.hashCode() : 0);
        result = 31 * result + (mustUseApprovedVendorFlag != null ? mustUseApprovedVendorFlag.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (programApplicationId != null ? programApplicationId.hashCode() : 0);
        result = 31 * result + (programId != null ? programId.hashCode() : 0);
        result = 31 * result + (programUpdateDate != null ? programUpdateDate.hashCode() : 0);
        result = 31 * result + (outsideOperationFlag != null ? outsideOperationFlag.hashCode() : 0);
        result = 31 * result + (outsideOperationUomType != null ? outsideOperationUomType.hashCode() : 0);
        result = 31 * result + (safetyStockBucketDays != null ? safetyStockBucketDays.hashCode() : 0);
        result = 31 * result + (autoReduceMps != null ? autoReduceMps.hashCode() : 0);
        result = 31 * result + (costingEnabledFlag != null ? costingEnabledFlag.hashCode() : 0);
        result = 31 * result + (cycleCountEnabledFlag != null ? cycleCountEnabledFlag.hashCode() : 0);
        result = 31 * result + (demandSourceLine != null ? demandSourceLine.hashCode() : 0);
        result = 31 * result + (copyItemId != null ? copyItemId.hashCode() : 0);
        result = 31 * result + (setId != null ? setId.hashCode() : 0);
        result = 31 * result + (revision != null ? revision.hashCode() : 0);
        result = 31 * result + (autoCreatedConfigFlag != null ? autoCreatedConfigFlag.hashCode() : 0);
        result = 31 * result + (itemType != null ? itemType.hashCode() : 0);
        result = 31 * result + (modelConfigClauseName != null ? modelConfigClauseName.hashCode() : 0);
        result = 31 * result + (shipModelCompleteFlag != null ? shipModelCompleteFlag.hashCode() : 0);
        result = 31 * result + (mrpPlanningCode != null ? mrpPlanningCode.hashCode() : 0);
        result = 31 * result + (returnInspectionRequirement != null ? returnInspectionRequirement.hashCode() : 0);
        result = 31 * result + (demandSourceType != null ? demandSourceType.hashCode() : 0);
        result = 31 * result + (demandSourceHeaderId != null ? demandSourceHeaderId.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (processFlag != null ? processFlag.hashCode() : 0);
        result = 31 * result + (organizationCode != null ? organizationCode.hashCode() : 0);
        result = 31 * result + (itemNumber != null ? itemNumber.hashCode() : 0);
        result = 31 * result + (copyItemNumber != null ? copyItemNumber.hashCode() : 0);
        result = 31 * result + (templateId != null ? templateId.hashCode() : 0);
        result = 31 * result + (templateName != null ? templateName.hashCode() : 0);
        result = 31 * result + (copyOrganizationId != null ? copyOrganizationId.hashCode() : 0);
        result = 31 * result + (copyOrganizationCode != null ? copyOrganizationCode.hashCode() : 0);
        result = 31 * result + (atoForecastControl != null ? atoForecastControl.hashCode() : 0);
        result = 31 * result + (transactionType != null ? transactionType.hashCode() : 0);
        result = 31 * result + (materialCost != null ? materialCost.hashCode() : 0);
        result = 31 * result + (materialSubElem != null ? materialSubElem.hashCode() : 0);
        result = 31 * result + (materialOhRate != null ? materialOhRate.hashCode() : 0);
        result = 31 * result + (materialOhSubElem != null ? materialOhSubElem.hashCode() : 0);
        result = 31 * result + (materialSubElemId != null ? materialSubElemId.hashCode() : 0);
        result = 31 * result + (materialOhSubElemId != null ? materialOhSubElemId.hashCode() : 0);
        result = 31 * result + (releaseTimeFenceCode != null ? releaseTimeFenceCode.hashCode() : 0);
        result = 31 * result + (releaseTimeFenceDays != null ? releaseTimeFenceDays.hashCode() : 0);
        result = 31 * result + (containerItemFlag != null ? containerItemFlag.hashCode() : 0);
        result = 31 * result + (vehicleItemFlag != null ? vehicleItemFlag.hashCode() : 0);
        result = 31 * result + (maximumLoadWeight != null ? maximumLoadWeight.hashCode() : 0);
        result = 31 * result + (minimumFillPercent != null ? minimumFillPercent.hashCode() : 0);
        result = 31 * result + (containerTypeCode != null ? containerTypeCode.hashCode() : 0);
        result = 31 * result + (internalVolume != null ? internalVolume.hashCode() : 0);
        result = 31 * result + (int) (setProcessId ^ (setProcessId >>> 32));
        result = 31 * result + (whUpdateDate != null ? whUpdateDate.hashCode() : 0);
        result = 31 * result + (productFamilyItemId != null ? productFamilyItemId.hashCode() : 0);
        result = 31 * result + (purchasingTaxCode != null ? purchasingTaxCode.hashCode() : 0);
        result = 31 * result + (overcompletionToleranceType != null ? overcompletionToleranceType.hashCode() : 0);
        result = 31 * result + (overcompletionToleranceValue != null ? overcompletionToleranceValue.hashCode() : 0);
        result = 31 * result + (effectivityControl != null ? effectivityControl.hashCode() : 0);
        result = 31 * result + (globalAttributeCategory != null ? globalAttributeCategory.hashCode() : 0);
        result = 31 * result + (globalAttribute1 != null ? globalAttribute1.hashCode() : 0);
        result = 31 * result + (globalAttribute2 != null ? globalAttribute2.hashCode() : 0);
        result = 31 * result + (globalAttribute3 != null ? globalAttribute3.hashCode() : 0);
        result = 31 * result + (globalAttribute4 != null ? globalAttribute4.hashCode() : 0);
        result = 31 * result + (globalAttribute5 != null ? globalAttribute5.hashCode() : 0);
        result = 31 * result + (globalAttribute6 != null ? globalAttribute6.hashCode() : 0);
        result = 31 * result + (globalAttribute7 != null ? globalAttribute7.hashCode() : 0);
        result = 31 * result + (globalAttribute8 != null ? globalAttribute8.hashCode() : 0);
        result = 31 * result + (globalAttribute9 != null ? globalAttribute9.hashCode() : 0);
        result = 31 * result + (globalAttribute10 != null ? globalAttribute10.hashCode() : 0);
        result = 31 * result + (overShipmentTolerance != null ? overShipmentTolerance.hashCode() : 0);
        result = 31 * result + (underShipmentTolerance != null ? underShipmentTolerance.hashCode() : 0);
        result = 31 * result + (overReturnTolerance != null ? overReturnTolerance.hashCode() : 0);
        result = 31 * result + (underReturnTolerance != null ? underReturnTolerance.hashCode() : 0);
        result = 31 * result + (equipmentType != null ? equipmentType.hashCode() : 0);
        result = 31 * result + (recoveredPartDispCode != null ? recoveredPartDispCode.hashCode() : 0);
        result = 31 * result + (defectTrackingOnFlag != null ? defectTrackingOnFlag.hashCode() : 0);
        result = 31 * result + (usageItemFlag != null ? usageItemFlag.hashCode() : 0);
        result = 31 * result + (eventFlag != null ? eventFlag.hashCode() : 0);
        result = 31 * result + (electronicFlag != null ? electronicFlag.hashCode() : 0);
        result = 31 * result + (downloadableFlag != null ? downloadableFlag.hashCode() : 0);
        result = 31 * result + (volDiscountExemptFlag != null ? volDiscountExemptFlag.hashCode() : 0);
        result = 31 * result + (couponExemptFlag != null ? couponExemptFlag.hashCode() : 0);
        result = 31 * result + (commsNlTrackableFlag != null ? commsNlTrackableFlag.hashCode() : 0);
        result = 31 * result + (assetCreationCode != null ? assetCreationCode.hashCode() : 0);
        result = 31 * result + (commsActivationReqdFlag != null ? commsActivationReqdFlag.hashCode() : 0);
        result = 31 * result + (orderableOnWebFlag != null ? orderableOnWebFlag.hashCode() : 0);
        result = 31 * result + (backOrderableFlag != null ? backOrderableFlag.hashCode() : 0);
        result = 31 * result + (webStatus != null ? webStatus.hashCode() : 0);
        result = 31 * result + (indivisibleFlag != null ? indivisibleFlag.hashCode() : 0);
        result = 31 * result + (longDescription != null ? longDescription.hashCode() : 0);
        result = 31 * result + (dimensionUomCode != null ? dimensionUomCode.hashCode() : 0);
        result = 31 * result + (unitLength != null ? unitLength.hashCode() : 0);
        result = 31 * result + (unitWidth != null ? unitWidth.hashCode() : 0);
        result = 31 * result + (unitHeight != null ? unitHeight.hashCode() : 0);
        result = 31 * result + (bulkPickedFlag != null ? bulkPickedFlag.hashCode() : 0);
        result = 31 * result + (lotStatusEnabled != null ? lotStatusEnabled.hashCode() : 0);
        result = 31 * result + (defaultLotStatusId != null ? defaultLotStatusId.hashCode() : 0);
        result = 31 * result + (serialStatusEnabled != null ? serialStatusEnabled.hashCode() : 0);
        result = 31 * result + (defaultSerialStatusId != null ? defaultSerialStatusId.hashCode() : 0);
        result = 31 * result + (lotSplitEnabled != null ? lotSplitEnabled.hashCode() : 0);
        result = 31 * result + (lotMergeEnabled != null ? lotMergeEnabled.hashCode() : 0);
        result = 31 * result + (inventoryCarryPenalty != null ? inventoryCarryPenalty.hashCode() : 0);
        result = 31 * result + (operationSlackPenalty != null ? operationSlackPenalty.hashCode() : 0);
        result = 31 * result + (financingAllowedFlag != null ? financingAllowedFlag.hashCode() : 0);
        result = 31 * result + (eamItemType != null ? eamItemType.hashCode() : 0);
        result = 31 * result + (eamActivityTypeCode != null ? eamActivityTypeCode.hashCode() : 0);
        result = 31 * result + (eamActivityCauseCode != null ? eamActivityCauseCode.hashCode() : 0);
        result = 31 * result + (eamActNotificationFlag != null ? eamActNotificationFlag.hashCode() : 0);
        result = 31 * result + (eamActShutdownStatus != null ? eamActShutdownStatus.hashCode() : 0);
        result = 31 * result + (dualUomControl != null ? dualUomControl.hashCode() : 0);
        result = 31 * result + (secondaryUomCode != null ? secondaryUomCode.hashCode() : 0);
        result = 31 * result + (dualUomDeviationHigh != null ? dualUomDeviationHigh.hashCode() : 0);
        result = 31 * result + (dualUomDeviationLow != null ? dualUomDeviationLow.hashCode() : 0);
        result = 31 * result + (contractItemTypeCode != null ? contractItemTypeCode.hashCode() : 0);
        result = 31 * result + (subscriptionDependFlag != null ? subscriptionDependFlag.hashCode() : 0);
        result = 31 * result + (servReqEnabledCode != null ? servReqEnabledCode.hashCode() : 0);
        result = 31 * result + (servBillingEnabledFlag != null ? servBillingEnabledFlag.hashCode() : 0);
        result = 31 * result + (servImportanceLevel != null ? servImportanceLevel.hashCode() : 0);
        result = 31 * result + (plannedInvPointFlag != null ? plannedInvPointFlag.hashCode() : 0);
        result = 31 * result + (lotTranslateEnabled != null ? lotTranslateEnabled.hashCode() : 0);
        result = 31 * result + (defaultSoSourceType != null ? defaultSoSourceType.hashCode() : 0);
        result = 31 * result + (createSupplyFlag != null ? createSupplyFlag.hashCode() : 0);
        result = 31 * result + (substitutionWindowCode != null ? substitutionWindowCode.hashCode() : 0);
        result = 31 * result + (substitutionWindowDays != null ? substitutionWindowDays.hashCode() : 0);
        result = 31 * result + (ibItemInstanceClass != null ? ibItemInstanceClass.hashCode() : 0);
        result = 31 * result + (configModelType != null ? configModelType.hashCode() : 0);
        result = 31 * result + (lotSubstitutionEnabled != null ? lotSubstitutionEnabled.hashCode() : 0);
        result = 31 * result + (minimumLicenseQuantity != null ? minimumLicenseQuantity.hashCode() : 0);
        result = 31 * result + (eamActivitySourceCode != null ? eamActivitySourceCode.hashCode() : 0);
        result = 31 * result + (lifecycleId != null ? lifecycleId.hashCode() : 0);
        result = 31 * result + (currentPhaseId != null ? currentPhaseId.hashCode() : 0);
        result = 31 * result + (trackingQuantityInd != null ? trackingQuantityInd.hashCode() : 0);
        result = 31 * result + (ontPricingQtySource != null ? ontPricingQtySource.hashCode() : 0);
        result = 31 * result + (secondaryDefaultInd != null ? secondaryDefaultInd.hashCode() : 0);
        result = 31 * result + (vmiMinimumUnits != null ? vmiMinimumUnits.hashCode() : 0);
        result = 31 * result + (vmiMinimumDays != null ? vmiMinimumDays.hashCode() : 0);
        result = 31 * result + (vmiMaximumUnits != null ? vmiMaximumUnits.hashCode() : 0);
        result = 31 * result + (vmiMaximumDays != null ? vmiMaximumDays.hashCode() : 0);
        result = 31 * result + (vmiFixedOrderQuantity != null ? vmiFixedOrderQuantity.hashCode() : 0);
        result = 31 * result + (soAuthorizationFlag != null ? soAuthorizationFlag.hashCode() : 0);
        result = 31 * result + (consignedFlag != null ? consignedFlag.hashCode() : 0);
        result = 31 * result + (asnAutoexpireFlag != null ? asnAutoexpireFlag.hashCode() : 0);
        result = 31 * result + (vmiForecastType != null ? vmiForecastType.hashCode() : 0);
        result = 31 * result + (forecastHorizon != null ? forecastHorizon.hashCode() : 0);
        result = 31 * result + (excludeFromBudgetFlag != null ? excludeFromBudgetFlag.hashCode() : 0);
        result = 31 * result + (daysTgtInvSupply != null ? daysTgtInvSupply.hashCode() : 0);
        result = 31 * result + (daysTgtInvWindow != null ? daysTgtInvWindow.hashCode() : 0);
        result = 31 * result + (daysMaxInvSupply != null ? daysMaxInvSupply.hashCode() : 0);
        result = 31 * result + (daysMaxInvWindow != null ? daysMaxInvWindow.hashCode() : 0);
        result = 31 * result + (drpPlannedFlag != null ? drpPlannedFlag.hashCode() : 0);
        result = 31 * result + (criticalComponentFlag != null ? criticalComponentFlag.hashCode() : 0);
        result = 31 * result + (continousTransfer != null ? continousTransfer.hashCode() : 0);
        result = 31 * result + (convergence != null ? convergence.hashCode() : 0);
        result = 31 * result + (divergence != null ? divergence.hashCode() : 0);
        result = 31 * result + (configOrgs != null ? configOrgs.hashCode() : 0);
        result = 31 * result + (configMatch != null ? configMatch.hashCode() : 0);
        return result;
    }
}
