package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMtlSystemItemsInterface is a Querydsl query type for MtlSystemItemsInterface
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMtlSystemItemsInterface extends EntityPathBase<MtlSystemItemsInterface> {

    private static final long serialVersionUID = 597308280L;

    public static final QMtlSystemItemsInterface mtlSystemItemsInterface = new QMtlSystemItemsInterface("mtlSystemItemsInterface");

    public final NumberPath<Long> acceptableEarlyDays = createNumber("acceptableEarlyDays", Long.class);

    public final NumberPath<Long> acceptableRateDecrease = createNumber("acceptableRateDecrease", Long.class);

    public final NumberPath<Long> acceptableRateIncrease = createNumber("acceptableRateIncrease", Long.class);

    public final NumberPath<Long> accountingRuleId = createNumber("accountingRuleId", Long.class);

    public final NumberPath<Long> allowedUnitsLookupCode = createNumber("allowedUnitsLookupCode", Long.class);

    public final StringPath allowExpressDeliveryFlag = createString("allowExpressDeliveryFlag");

    public final StringPath allowItemDescUpdateFlag = createString("allowItemDescUpdateFlag");

    public final StringPath allowSubstituteReceiptsFlag = createString("allowSubstituteReceiptsFlag");

    public final StringPath allowUnorderedReceiptsFlag = createString("allowUnorderedReceiptsFlag");

    public final NumberPath<Long> asnAutoexpireFlag = createNumber("asnAutoexpireFlag", Long.class);

    public final NumberPath<Long> assetCategoryId = createNumber("assetCategoryId", Long.class);

    public final StringPath assetCreationCode = createString("assetCreationCode");

    public final NumberPath<Long> atoForecastControl = createNumber("atoForecastControl", Long.class);

    public final StringPath atpComponentsFlag = createString("atpComponentsFlag");

    public final StringPath atpFlag = createString("atpFlag");

    public final NumberPath<Long> atpRuleId = createNumber("atpRuleId", Long.class);

    public final StringPath attribute1 = createString("attribute1");

    public final StringPath attribute10 = createString("attribute10");

    public final StringPath attribute11 = createString("attribute11");

    public final StringPath attribute12 = createString("attribute12");

    public final StringPath attribute13 = createString("attribute13");

    public final StringPath attribute14 = createString("attribute14");

    public final StringPath attribute15 = createString("attribute15");

    public final StringPath attribute2 = createString("attribute2");

    public final StringPath attribute3 = createString("attribute3");

    public final StringPath attribute4 = createString("attribute4");

    public final StringPath attribute5 = createString("attribute5");

    public final StringPath attribute6 = createString("attribute6");

    public final StringPath attribute7 = createString("attribute7");

    public final StringPath attribute8 = createString("attribute8");

    public final StringPath attribute9 = createString("attribute9");

    public final StringPath attributeCategory = createString("attributeCategory");

    public final StringPath autoCreatedConfigFlag = createString("autoCreatedConfigFlag");

    public final StringPath autoLotAlphaPrefix = createString("autoLotAlphaPrefix");

    public final NumberPath<Long> autoReduceMps = createNumber("autoReduceMps", Long.class);

    public final StringPath autoSerialAlphaPrefix = createString("autoSerialAlphaPrefix");

    public final StringPath backOrderableFlag = createString("backOrderableFlag");

    public final NumberPath<Long> baseItemId = createNumber("baseItemId", Long.class);

    public final NumberPath<Long> baseWarrantyServiceId = createNumber("baseWarrantyServiceId", Long.class);

    public final StringPath bomEnabledFlag = createString("bomEnabledFlag");

    public final NumberPath<Long> bomItemType = createNumber("bomItemType", Long.class);

    public final StringPath buildInWipFlag = createString("buildInWipFlag");

    public final StringPath bulkPickedFlag = createString("bulkPickedFlag");

    public final NumberPath<Long> buyerId = createNumber("buyerId", Long.class);

    public final NumberPath<Long> carryingCost = createNumber("carryingCost", Long.class);

    public final StringPath catalogStatusFlag = createString("catalogStatusFlag");

    public final StringPath checkShortagesFlag = createString("checkShortagesFlag");

    public final StringPath collateralFlag = createString("collateralFlag");

    public final StringPath commsActivationReqdFlag = createString("commsActivationReqdFlag");

    public final StringPath commsNlTrackableFlag = createString("commsNlTrackableFlag");

    public final StringPath configMatch = createString("configMatch");

    public final StringPath configModelType = createString("configModelType");

    public final StringPath configOrgs = createString("configOrgs");

    public final NumberPath<Long> consignedFlag = createNumber("consignedFlag", Long.class);

    public final StringPath containerItemFlag = createString("containerItemFlag");

    public final StringPath containerTypeCode = createString("containerTypeCode");

    public final NumberPath<Long> continousTransfer = createNumber("continousTransfer", Long.class);

    public final StringPath contractItemTypeCode = createString("contractItemTypeCode");

    public final NumberPath<Long> convergence = createNumber("convergence", Long.class);

    public final NumberPath<Long> copyItemId = createNumber("copyItemId", Long.class);

    public final StringPath copyItemNumber = createString("copyItemNumber");

    public final StringPath copyOrganizationCode = createString("copyOrganizationCode");

    public final NumberPath<Long> copyOrganizationId = createNumber("copyOrganizationId", Long.class);

    public final StringPath costingEnabledFlag = createString("costingEnabledFlag");

    public final NumberPath<Long> costOfSalesAccount = createNumber("costOfSalesAccount", Long.class);

    public final StringPath couponExemptFlag = createString("couponExemptFlag");

    public final NumberPath<Long> coverageScheduleId = createNumber("coverageScheduleId", Long.class);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final StringPath createSupplyFlag = createString("createSupplyFlag");

    public final TimePath<java.sql.Time> creationDate = createTime("creationDate", java.sql.Time.class);

    public final NumberPath<Long> criticalComponentFlag = createNumber("criticalComponentFlag", Long.class);

    public final NumberPath<Long> cumManufacturingLeadTime = createNumber("cumManufacturingLeadTime", Long.class);

    public final NumberPath<Long> cumulativeTotalLeadTime = createNumber("cumulativeTotalLeadTime", Long.class);

    public final NumberPath<Long> currentPhaseId = createNumber("currentPhaseId", Long.class);

    public final StringPath customerOrderEnabledFlag = createString("customerOrderEnabledFlag");

    public final StringPath customerOrderFlag = createString("customerOrderFlag");

    public final StringPath cycleCountEnabledFlag = createString("cycleCountEnabledFlag");

    public final NumberPath<Long> daysEarlyReceiptAllowed = createNumber("daysEarlyReceiptAllowed", Long.class);

    public final NumberPath<Long> daysLateReceiptAllowed = createNumber("daysLateReceiptAllowed", Long.class);

    public final NumberPath<Long> daysMaxInvSupply = createNumber("daysMaxInvSupply", Long.class);

    public final NumberPath<Long> daysMaxInvWindow = createNumber("daysMaxInvWindow", Long.class);

    public final NumberPath<Long> daysTgtInvSupply = createNumber("daysTgtInvSupply", Long.class);

    public final NumberPath<Long> daysTgtInvWindow = createNumber("daysTgtInvWindow", Long.class);

    public final StringPath defaultIncludeInRollupFlag = createString("defaultIncludeInRollupFlag");

    public final NumberPath<Long> defaultLotStatusId = createNumber("defaultLotStatusId", Long.class);

    public final NumberPath<Long> defaultSerialStatusId = createNumber("defaultSerialStatusId", Long.class);

    public final NumberPath<Long> defaultShippingOrg = createNumber("defaultShippingOrg", Long.class);

    public final StringPath defaultSoSourceType = createString("defaultSoSourceType");

    public final StringPath defectTrackingOnFlag = createString("defectTrackingOnFlag");

    public final NumberPath<Long> demandSourceHeaderId = createNumber("demandSourceHeaderId", Long.class);

    public final StringPath demandSourceLine = createString("demandSourceLine");

    public final NumberPath<Long> demandSourceType = createNumber("demandSourceType", Long.class);

    public final NumberPath<Long> demandTimeFenceCode = createNumber("demandTimeFenceCode", Long.class);

    public final NumberPath<Long> demandTimeFenceDays = createNumber("demandTimeFenceDays", Long.class);

    public final StringPath description = createString("description");

    public final StringPath dimensionUomCode = createString("dimensionUomCode");

    public final NumberPath<Long> divergence = createNumber("divergence", Long.class);

    public final StringPath downloadableFlag = createString("downloadableFlag");

    public final NumberPath<Long> drpPlannedFlag = createNumber("drpPlannedFlag", Long.class);

    public final NumberPath<Long> dualUomControl = createNumber("dualUomControl", Long.class);

    public final NumberPath<Long> dualUomDeviationHigh = createNumber("dualUomDeviationHigh", Long.class);

    public final NumberPath<Long> dualUomDeviationLow = createNumber("dualUomDeviationLow", Long.class);

    public final StringPath eamActivityCauseCode = createString("eamActivityCauseCode");

    public final StringPath eamActivitySourceCode = createString("eamActivitySourceCode");

    public final StringPath eamActivityTypeCode = createString("eamActivityTypeCode");

    public final StringPath eamActNotificationFlag = createString("eamActNotificationFlag");

    public final StringPath eamActShutdownStatus = createString("eamActShutdownStatus");

    public final NumberPath<Long> eamItemType = createNumber("eamItemType", Long.class);

    public final NumberPath<Long> effectivityControl = createNumber("effectivityControl", Long.class);

    public final StringPath electronicFlag = createString("electronicFlag");

    public final StringPath enabledFlag = createString("enabledFlag");

    public final NumberPath<Long> encumbranceAccount = createNumber("encumbranceAccount", Long.class);

    public final StringPath endAssemblyPeggingFlag = createString("endAssemblyPeggingFlag");

    public final TimePath<java.sql.Time> endDateActive = createTime("endDateActive", java.sql.Time.class);

    public final StringPath enforceShipToLocationCode = createString("enforceShipToLocationCode");

    public final TimePath<java.sql.Time> engineeringDate = createTime("engineeringDate", java.sql.Time.class);

    public final StringPath engineeringEcnCode = createString("engineeringEcnCode");

    public final NumberPath<Long> engineeringItemId = createNumber("engineeringItemId", Long.class);

    public final StringPath engItemFlag = createString("engItemFlag");

    public final NumberPath<Long> equipmentType = createNumber("equipmentType", Long.class);

    public final StringPath eventFlag = createString("eventFlag");

    public final NumberPath<Long> excludeFromBudgetFlag = createNumber("excludeFromBudgetFlag", Long.class);

    public final NumberPath<Long> expenseAccount = createNumber("expenseAccount", Long.class);

    public final StringPath expenseBillableFlag = createString("expenseBillableFlag");

    public final StringPath financingAllowedFlag = createString("financingAllowedFlag");

    public final NumberPath<Long> fixedDaysSupply = createNumber("fixedDaysSupply", Long.class);

    public final NumberPath<Long> fixedLeadTime = createNumber("fixedLeadTime", Long.class);

    public final NumberPath<Long> fixedLotMultiplier = createNumber("fixedLotMultiplier", Long.class);

    public final NumberPath<Long> fixedOrderQuantity = createNumber("fixedOrderQuantity", Long.class);

    public final NumberPath<Long> forecastHorizon = createNumber("forecastHorizon", Long.class);

    public final NumberPath<Long> fullLeadTime = createNumber("fullLeadTime", Long.class);

    public final StringPath globalAttribute1 = createString("globalAttribute1");

    public final StringPath globalAttribute10 = createString("globalAttribute10");

    public final StringPath globalAttribute2 = createString("globalAttribute2");

    public final StringPath globalAttribute3 = createString("globalAttribute3");

    public final StringPath globalAttribute4 = createString("globalAttribute4");

    public final StringPath globalAttribute5 = createString("globalAttribute5");

    public final StringPath globalAttribute6 = createString("globalAttribute6");

    public final StringPath globalAttribute7 = createString("globalAttribute7");

    public final StringPath globalAttribute8 = createString("globalAttribute8");

    public final StringPath globalAttribute9 = createString("globalAttribute9");

    public final StringPath globalAttributeCategory = createString("globalAttributeCategory");

    public final NumberPath<Long> hazardClassId = createNumber("hazardClassId", Long.class);

    public final StringPath ibItemInstanceClass = createString("ibItemInstanceClass");

    public final StringPath indivisibleFlag = createString("indivisibleFlag");

    public final StringPath inspectionRequiredFlag = createString("inspectionRequiredFlag");

    public final StringPath internalOrderEnabledFlag = createString("internalOrderEnabledFlag");

    public final StringPath internalOrderFlag = createString("internalOrderFlag");

    public final NumberPath<Long> internalVolume = createNumber("internalVolume", Long.class);

    public final StringPath inventoryAssetFlag = createString("inventoryAssetFlag");

    public final NumberPath<Long> inventoryCarryPenalty = createNumber("inventoryCarryPenalty", Long.class);

    public final StringPath inventoryItemFlag = createString("inventoryItemFlag");

    public final NumberPath<Long> inventoryItemId = createNumber("inventoryItemId", Long.class);

    public final StringPath inventoryItemStatusCode = createString("inventoryItemStatusCode");

    public final NumberPath<Long> inventoryPlanningCode = createNumber("inventoryPlanningCode", Long.class);

    public final StringPath invoiceableItemFlag = createString("invoiceableItemFlag");

    public final NumberPath<Long> invoiceCloseTolerance = createNumber("invoiceCloseTolerance", Long.class);

    public final StringPath invoiceEnabledFlag = createString("invoiceEnabledFlag");

    public final NumberPath<Long> invoicingRuleId = createNumber("invoicingRuleId", Long.class);

    public final NumberPath<Long> itemCatalogGroupId = createNumber("itemCatalogGroupId", Long.class);

    public final StringPath itemNumber = createString("itemNumber");

    public final StringPath itemType = createString("itemType");

    public final TimePath<java.sql.Time> lastUpdateDate = createTime("lastUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> lastUpdatedBy = createNumber("lastUpdatedBy", Long.class);

    public final NumberPath<Long> lastUpdateLogin = createNumber("lastUpdateLogin", Long.class);

    public final NumberPath<Long> leadTimeLotSize = createNumber("leadTimeLotSize", Long.class);

    public final NumberPath<Long> lifecycleId = createNumber("lifecycleId", Long.class);

    public final NumberPath<Long> listPricePerUnit = createNumber("listPricePerUnit", Long.class);

    public final NumberPath<Long> locationControlCode = createNumber("locationControlCode", Long.class);

    public final StringPath longDescription = createString("longDescription");

    public final NumberPath<Long> lotControlCode = createNumber("lotControlCode", Long.class);

    public final StringPath lotMergeEnabled = createString("lotMergeEnabled");

    public final StringPath lotSplitEnabled = createString("lotSplitEnabled");

    public final StringPath lotStatusEnabled = createString("lotStatusEnabled");

    public final StringPath lotSubstitutionEnabled = createString("lotSubstitutionEnabled");

    public final StringPath lotTranslateEnabled = createString("lotTranslateEnabled");

    public final NumberPath<Long> marketPrice = createNumber("marketPrice", Long.class);

    public final StringPath materialBillableFlag = createString("materialBillableFlag");

    public final NumberPath<Long> materialCost = createNumber("materialCost", Long.class);

    public final NumberPath<Long> materialOhRate = createNumber("materialOhRate", Long.class);

    public final StringPath materialOhSubElem = createString("materialOhSubElem");

    public final NumberPath<Long> materialOhSubElemId = createNumber("materialOhSubElemId", Long.class);

    public final StringPath materialSubElem = createString("materialSubElem");

    public final NumberPath<Long> materialSubElemId = createNumber("materialSubElemId", Long.class);

    public final NumberPath<Long> maximumLoadWeight = createNumber("maximumLoadWeight", Long.class);

    public final NumberPath<Long> maximumOrderQuantity = createNumber("maximumOrderQuantity", Long.class);

    public final NumberPath<Long> maxMinmaxQuantity = createNumber("maxMinmaxQuantity", Long.class);

    public final NumberPath<Long> maxWarrantyAmount = createNumber("maxWarrantyAmount", Long.class);

    public final NumberPath<Long> minimumFillPercent = createNumber("minimumFillPercent", Long.class);

    public final NumberPath<Long> minimumLicenseQuantity = createNumber("minimumLicenseQuantity", Long.class);

    public final NumberPath<Long> minimumOrderQuantity = createNumber("minimumOrderQuantity", Long.class);

    public final NumberPath<Long> minMinmaxQuantity = createNumber("minMinmaxQuantity", Long.class);

    public final StringPath modelConfigClauseName = createString("modelConfigClauseName");

    public final StringPath mrpCalculateAtpFlag = createString("mrpCalculateAtpFlag");

    public final NumberPath<Long> mrpPlanningCode = createNumber("mrpPlanningCode", Long.class);

    public final NumberPath<Long> mrpSafetyStockCode = createNumber("mrpSafetyStockCode", Long.class);

    public final NumberPath<Long> mrpSafetyStockPercent = createNumber("mrpSafetyStockPercent", Long.class);

    public final StringPath mtlTransactionsEnabledFlag = createString("mtlTransactionsEnabledFlag");

    public final StringPath mustUseApprovedVendorFlag = createString("mustUseApprovedVendorFlag");

    public final NumberPath<Long> negativeMeasurementError = createNumber("negativeMeasurementError", Long.class);

    public final StringPath newRevisionCode = createString("newRevisionCode");

    public final StringPath ontPricingQtySource = createString("ontPricingQtySource");

    public final NumberPath<Long> operationSlackPenalty = createNumber("operationSlackPenalty", Long.class);

    public final StringPath orderableOnWebFlag = createString("orderableOnWebFlag");

    public final NumberPath<Long> orderCost = createNumber("orderCost", Long.class);

    public final StringPath organizationCode = createString("organizationCode");

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final StringPath outsideOperationFlag = createString("outsideOperationFlag");

    public final StringPath outsideOperationUomType = createString("outsideOperationUomType");

    public final NumberPath<Long> overcompletionToleranceType = createNumber("overcompletionToleranceType", Long.class);

    public final NumberPath<Long> overcompletionToleranceValue = createNumber("overcompletionToleranceValue", Long.class);

    public final NumberPath<Long> overReturnTolerance = createNumber("overReturnTolerance", Long.class);

    public final NumberPath<Long> overrunPercentage = createNumber("overrunPercentage", Long.class);

    public final NumberPath<Long> overShipmentTolerance = createNumber("overShipmentTolerance", Long.class);

    public final NumberPath<Long> paymentTermsId = createNumber("paymentTermsId", Long.class);

    public final StringPath pickComponentsFlag = createString("pickComponentsFlag");

    public final NumberPath<Long> pickingRuleId = createNumber("pickingRuleId", Long.class);

    public final StringPath plannedInvPointFlag = createString("plannedInvPointFlag");

    public final StringPath plannerCode = createString("plannerCode");

    public final StringPath planningExceptionSet = createString("planningExceptionSet");

    public final NumberPath<Long> planningMakeBuyCode = createNumber("planningMakeBuyCode", Long.class);

    public final NumberPath<Long> planningTimeFenceCode = createNumber("planningTimeFenceCode", Long.class);

    public final NumberPath<Long> planningTimeFenceDays = createNumber("planningTimeFenceDays", Long.class);

    public final NumberPath<Long> positiveMeasurementError = createNumber("positiveMeasurementError", Long.class);

    public final NumberPath<Long> postprocessingLeadTime = createNumber("postprocessingLeadTime", Long.class);

    public final NumberPath<Long> preprocessingLeadTime = createNumber("preprocessingLeadTime", Long.class);

    public final StringPath preventiveMaintenanceFlag = createString("preventiveMaintenanceFlag");

    public final NumberPath<Long> priceTolerancePercent = createNumber("priceTolerancePercent", Long.class);

    public final NumberPath<Long> primarySpecialistId = createNumber("primarySpecialistId", Long.class);

    public final StringPath primaryUnitOfMeasure = createString("primaryUnitOfMeasure");

    public final StringPath primaryUomCode = createString("primaryUomCode");

    public final NumberPath<Long> processFlag = createNumber("processFlag", Long.class);

    public final NumberPath<Long> productFamilyItemId = createNumber("productFamilyItemId", Long.class);

    public final NumberPath<Long> programApplicationId = createNumber("programApplicationId", Long.class);

    public final NumberPath<Long> programId = createNumber("programId", Long.class);

    public final TimePath<java.sql.Time> programUpdateDate = createTime("programUpdateDate", java.sql.Time.class);

    public final StringPath prorateServiceFlag = createString("prorateServiceFlag");

    public final StringPath purchasingEnabledFlag = createString("purchasingEnabledFlag");

    public final StringPath purchasingItemFlag = createString("purchasingItemFlag");

    public final StringPath purchasingTaxCode = createString("purchasingTaxCode");

    public final StringPath qtyRcvExceptionCode = createString("qtyRcvExceptionCode");

    public final NumberPath<Long> qtyRcvTolerance = createNumber("qtyRcvTolerance", Long.class);

    public final StringPath receiptDaysExceptionCode = createString("receiptDaysExceptionCode");

    public final StringPath receiptRequiredFlag = createString("receiptRequiredFlag");

    public final NumberPath<Long> receiveCloseTolerance = createNumber("receiveCloseTolerance", Long.class);

    public final NumberPath<Long> receivingRoutingId = createNumber("receivingRoutingId", Long.class);

    public final StringPath recoveredPartDispCode = createString("recoveredPartDispCode");

    public final NumberPath<Long> releaseTimeFenceCode = createNumber("releaseTimeFenceCode", Long.class);

    public final NumberPath<Long> releaseTimeFenceDays = createNumber("releaseTimeFenceDays", Long.class);

    public final StringPath repetitivePlanningFlag = createString("repetitivePlanningFlag");

    public final StringPath replenishToOrderFlag = createString("replenishToOrderFlag");

    public final NumberPath<Long> requestId = createNumber("requestId", Long.class);

    public final NumberPath<Long> reservableType = createNumber("reservableType", Long.class);

    public final StringPath responseTimePeriodCode = createString("responseTimePeriodCode");

    public final NumberPath<Long> responseTimeValue = createNumber("responseTimeValue", Long.class);

    public final NumberPath<Long> restrictLocatorsCode = createNumber("restrictLocatorsCode", Long.class);

    public final NumberPath<Long> restrictSubinventoriesCode = createNumber("restrictSubinventoriesCode", Long.class);

    public final StringPath returnableFlag = createString("returnableFlag");

    public final NumberPath<Long> returnInspectionRequirement = createNumber("returnInspectionRequirement", Long.class);

    public final StringPath revision = createString("revision");

    public final NumberPath<Long> revisionQtyControlCode = createNumber("revisionQtyControlCode", Long.class);

    public final StringPath rfqRequiredFlag = createString("rfqRequiredFlag");

    public final NumberPath<Long> roundingControlType = createNumber("roundingControlType", Long.class);

    public final NumberPath<Long> roundingFactor = createNumber("roundingFactor", Long.class);

    public final NumberPath<Long> safetyStockBucketDays = createNumber("safetyStockBucketDays", Long.class);

    public final NumberPath<Long> salesAccount = createNumber("salesAccount", Long.class);

    public final StringPath secondaryDefaultInd = createString("secondaryDefaultInd");

    public final NumberPath<Long> secondarySpecialistId = createNumber("secondarySpecialistId", Long.class);

    public final StringPath secondaryUomCode = createString("secondaryUomCode");

    public final StringPath segment1 = createString("segment1");

    public final StringPath segment10 = createString("segment10");

    public final StringPath segment11 = createString("segment11");

    public final StringPath segment12 = createString("segment12");

    public final StringPath segment13 = createString("segment13");

    public final StringPath segment14 = createString("segment14");

    public final StringPath segment15 = createString("segment15");

    public final StringPath segment16 = createString("segment16");

    public final StringPath segment17 = createString("segment17");

    public final StringPath segment18 = createString("segment18");

    public final StringPath segment19 = createString("segment19");

    public final StringPath segment2 = createString("segment2");

    public final StringPath segment20 = createString("segment20");

    public final StringPath segment3 = createString("segment3");

    public final StringPath segment4 = createString("segment4");

    public final StringPath segment5 = createString("segment5");

    public final StringPath segment6 = createString("segment6");

    public final StringPath segment7 = createString("segment7");

    public final StringPath segment8 = createString("segment8");

    public final StringPath segment9 = createString("segment9");

    public final NumberPath<Long> serialNumberControlCode = createNumber("serialNumberControlCode", Long.class);

    public final StringPath serialStatusEnabled = createString("serialStatusEnabled");

    public final StringPath servBillingEnabledFlag = createString("servBillingEnabledFlag");

    public final StringPath serviceableComponentFlag = createString("serviceableComponentFlag");

    public final NumberPath<Long> serviceableItemClassId = createNumber("serviceableItemClassId", Long.class);

    public final StringPath serviceableProductFlag = createString("serviceableProductFlag");

    public final NumberPath<Long> serviceDuration = createNumber("serviceDuration", Long.class);

    public final StringPath serviceDurationPeriodCode = createString("serviceDurationPeriodCode");

    public final StringPath serviceItemFlag = createString("serviceItemFlag");

    public final NumberPath<Long> serviceStartingDelay = createNumber("serviceStartingDelay", Long.class);

    public final NumberPath<Long> servImportanceLevel = createNumber("servImportanceLevel", Long.class);

    public final StringPath servReqEnabledCode = createString("servReqEnabledCode");

    public final StringPath setId = createString("setId");

    public final NumberPath<Long> setProcessId = createNumber("setProcessId", Long.class);

    public final NumberPath<Long> shelfLifeCode = createNumber("shelfLifeCode", Long.class);

    public final NumberPath<Long> shelfLifeDays = createNumber("shelfLifeDays", Long.class);

    public final StringPath shipModelCompleteFlag = createString("shipModelCompleteFlag");

    public final StringPath shippableItemFlag = createString("shippableItemFlag");

    public final NumberPath<Long> shrinkageRate = createNumber("shrinkageRate", Long.class);

    public final NumberPath<Long> soAuthorizationFlag = createNumber("soAuthorizationFlag", Long.class);

    public final StringPath soTransactionsFlag = createString("soTransactionsFlag");

    public final NumberPath<Long> sourceOrganizationId = createNumber("sourceOrganizationId", Long.class);

    public final StringPath sourceSubinventory = createString("sourceSubinventory");

    public final NumberPath<Long> sourceType = createNumber("sourceType", Long.class);

    public final StringPath startAutoLotNumber = createString("startAutoLotNumber");

    public final StringPath startAutoSerialNumber = createString("startAutoSerialNumber");

    public final TimePath<java.sql.Time> startDateActive = createTime("startDateActive", java.sql.Time.class);

    public final NumberPath<Long> stdLotSize = createNumber("stdLotSize", Long.class);

    public final StringPath stockEnabledFlag = createString("stockEnabledFlag");

    public final StringPath subscriptionDependFlag = createString("subscriptionDependFlag");

    public final NumberPath<Long> substitutionWindowCode = createNumber("substitutionWindowCode", Long.class);

    public final NumberPath<Long> substitutionWindowDays = createNumber("substitutionWindowDays", Long.class);

    public final StringPath summaryFlag = createString("summaryFlag");

    public final StringPath taxableFlag = createString("taxableFlag");

    public final StringPath taxCode = createString("taxCode");

    public final NumberPath<Long> templateId = createNumber("templateId", Long.class);

    public final StringPath templateName = createString("templateName");

    public final StringPath timeBillableFlag = createString("timeBillableFlag");

    public final StringPath trackingQuantityInd = createString("trackingQuantityInd");

    public final NumberPath<Long> transactionId = createNumber("transactionId", Long.class);

    public final StringPath transactionType = createString("transactionType");

    public final NumberPath<Long> underReturnTolerance = createNumber("underReturnTolerance", Long.class);

    public final NumberPath<Long> underShipmentTolerance = createNumber("underShipmentTolerance", Long.class);

    public final NumberPath<Long> unitHeight = createNumber("unitHeight", Long.class);

    public final NumberPath<Long> unitLength = createNumber("unitLength", Long.class);

    public final StringPath unitOfIssue = createString("unitOfIssue");

    public final NumberPath<Long> unitVolume = createNumber("unitVolume", Long.class);

    public final NumberPath<Long> unitWeight = createNumber("unitWeight", Long.class);

    public final NumberPath<Long> unitWidth = createNumber("unitWidth", Long.class);

    public final NumberPath<Long> unNumberId = createNumber("unNumberId", Long.class);

    public final StringPath usageItemFlag = createString("usageItemFlag");

    public final NumberPath<Long> variableLeadTime = createNumber("variableLeadTime", Long.class);

    public final StringPath vehicleItemFlag = createString("vehicleItemFlag");

    public final StringPath vendorWarrantyFlag = createString("vendorWarrantyFlag");

    public final NumberPath<Long> vmiFixedOrderQuantity = createNumber("vmiFixedOrderQuantity", Long.class);

    public final NumberPath<Long> vmiForecastType = createNumber("vmiForecastType", Long.class);

    public final NumberPath<Long> vmiMaximumDays = createNumber("vmiMaximumDays", Long.class);

    public final NumberPath<Long> vmiMaximumUnits = createNumber("vmiMaximumUnits", Long.class);

    public final NumberPath<Long> vmiMinimumDays = createNumber("vmiMinimumDays", Long.class);

    public final NumberPath<Long> vmiMinimumUnits = createNumber("vmiMinimumUnits", Long.class);

    public final StringPath volDiscountExemptFlag = createString("volDiscountExemptFlag");

    public final StringPath volumeUomCode = createString("volumeUomCode");

    public final NumberPath<Long> warrantyVendorId = createNumber("warrantyVendorId", Long.class);

    public final StringPath webStatus = createString("webStatus");

    public final StringPath weightUomCode = createString("weightUomCode");

    public final TimePath<java.sql.Time> whUpdateDate = createTime("whUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> wipSupplyLocatorId = createNumber("wipSupplyLocatorId", Long.class);

    public final StringPath wipSupplySubinventory = createString("wipSupplySubinventory");

    public final NumberPath<Long> wipSupplyType = createNumber("wipSupplyType", Long.class);

    public QMtlSystemItemsInterface(String variable) {
        super(MtlSystemItemsInterface.class, forVariable(variable));
    }

    public QMtlSystemItemsInterface(Path<? extends MtlSystemItemsInterface> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMtlSystemItemsInterface(PathMetadata metadata) {
        super(MtlSystemItemsInterface.class, metadata);
    }

}

