package com.inv.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;

@Table(name = "MTL_SYSTEM_ITEMS_B")
@Entity
@Data
public class MtlSystemItemsB implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "INVENTORY_ITEM_ID", nullable = false)
    private String inventoryItemId;

    @Column(name = "ORGANIZATION_ID", nullable = false)
    private String organizationId;

    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private LocalDate lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY", nullable = false)
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDate creationDate;

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;

    @Column(name = "LAST_UPDATE_LOGIN")
    private String lastUpdateLogin;

    @Column(name = "SUMMARY_FLAG", nullable = false)
    private String summaryFlag;

    @Column(name = "ENABLED_FLAG", nullable = false)
    private String enabledFlag;

    @Column(name = "START_DATE_ACTIVE")
    private LocalDate startDateActive;

    @Column(name = "END_DATE_ACTIVE")
    private LocalDate endDateActive;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "BUYER_ID")
    private String buyerId;

    @Column(name = "ACCOUNTING_RULE_ID")
    private String accountingRuleId;

    @Column(name = "INVOICING_RULE_ID")
    private String invoicingRuleId;
    @Column(name = "SEGMENT1")private String segment1;
    @Column(name = "SEGMENT2")private String segment2;
    @Column(name = "SEGMENT3")private String segment3;
    @Column(name = "SEGMENT4")private String segment4;
    @Column(name = "SEGMENT5")private String segment5;
    @Column(name = "SEGMENT6")private String segment6;
    @Column(name = "SEGMENT7")private String segment7;
    @Column(name = "SEGMENT8")private String segment8;
    @Column(name = "SEGMENT9")private String segment9;
    @Column(name = "SEGMENT10")private String segment10;
    @Column(name = "SEGMENT11")private String segment11;
    @Column(name = "SEGMENT12")private String segment12;
    @Column(name = "SEGMENT13")private String segment13;
    @Column(name = "SEGMENT14")private String segment14;
    @Column(name = "SEGMENT15")private String segment15;
    @Column(name = "SEGMENT16")private String segment16;
    @Column(name = "SEGMENT17")private String segment17;
    @Column(name = "SEGMENT18")private String segment18;
    @Column(name = "SEGMENT19")private String segment19;
    @Column(name = "SEGMENT20")private String segment20;
    @Column(name = "ATTRIBUTE_CATEGORY")private String attributeCategory;
    @Column(name = "ATTRIBUTE1")private String attribute1;
    @Column(name = "ATTRIBUTE2")private String attribute2;
    @Column(name = "ATTRIBUTE3")private String attribute3;
    @Column(name = "ATTRIBUTE4")private String attribute4;
    @Column(name = "ATTRIBUTE5")private String attribute5;
    @Column(name = "ATTRIBUTE6")private String attribute6;
    @Column(name = "ATTRIBUTE7")private String attribute7;
    @Column(name = "ATTRIBUTE8")private String attribute8;
    @Column(name = "ATTRIBUTE9")private String attribute9;
    @Column(name = "ATTRIBUTE10")private String attribute10;
    @Column(name = "ATTRIBUTE11")private String attribute11;
    @Column(name = "ATTRIBUTE12")private String attribute12;
    @Column(name = "ATTRIBUTE13")private String attribute13;
    @Column(name = "ATTRIBUTE14")private String attribute14;
    @Column(name = "ATTRIBUTE15")private String attribute15;
    @Column(name = "PURCHASING_ITEM_FLAG", nullable = false)
    private String purchasingItemFlag;
    @Column(name = "SHIPPABLE_ITEM_FLAG", nullable = false)
    private String shippableItemFlag;

    @Column(name = "CUSTOMER_ORDER_FLAG", nullable = false)
    private String customerOrderFlag;

    @Column(name = "INTERNAL_ORDER_FLAG", nullable = false)
    private String internalOrderFlag;

    @Column(name = "SERVICE_ITEM_FLAG", nullable = false)
    private String serviceItemFlag;

    @Column(name = "INVENTORY_ITEM_FLAG", nullable = false)
    private String inventoryItemFlag;

    @Column(name = "ENG_ITEM_FLAG", nullable = false)
    private String engItemFlag;

    @Column(name = "INVENTORY_ASSET_FLAG", nullable = false)
    private String inventoryAssetFlag;

    @Column(name = "PURCHASING_ENABLED_FLAG", nullable = false)
    private String purchasingEnabledFlag;

    @Column(name = "CUSTOMER_ORDER_ENABLED_FLAG", nullable = false)
    private String customerOrderEnabledFlag;

    @Column(name = "INTERNAL_ORDER_ENABLED_FLAG", nullable = false)
    private String internalOrderEnabledFlag;

    @Column(name = "SO_TRANSACTIONS_FLAG", nullable = false)
    private String soTransactionsFlag;

    @Column(name = "MTL_TRANSACTIONS_ENABLED_FLAG", nullable = false)
    private String mtlTransactionsEnabledFlag;

    @Column(name = "STOCK_ENABLED_FLAG", nullable = false)
    private String stockEnabledFlag;

    @Column(name = "BOM_ENABLED_FLAG", nullable = false)
    private String bomEnabledFlag;

    @Column(name = "BUILD_IN_WIP_FLAG", nullable = false)
    private String buildInWipFlag;

    @Column(name = "REVISION_QTY_CONTROL_CODE")
    private String revisionQtyControlCode;

    @Column(name = "ITEM_CATALOG_GROUP_ID")
    private String itemCatalogGroupId;

    @Column(name = "CATALOG_STATUS_FLAG")
    private String catalogStatusFlag;

    @Column(name = "RETURNABLE_FLAG")
    private String returnableFlag;

    @Column(name = "DEFAULT_SHIPPING_ORG")
    private String defaultShippingOrg;

    @Column(name = "COLLATERAL_FLAG")
    private String collateralFlag;

    @Column(name = "TAXABLE_FLAG")
    private String taxableFlag;

    @Column(name = "QTY_RCV_EXCEPTION_CODE")
    private String qtyRcvExceptionCode;

    @Column(name = "ALLOW_ITEM_DESC_UPDATE_FLAG")
    private String allowItemDescUpdateFlag;

    @Column(name = "INSPECTION_REQUIRED_FLAG")
    private String inspectionRequiredFlag;

    @Column(name = "RECEIPT_REQUIRED_FLAG")
    private String receiptRequiredFlag;

    @Column(name = "MARKET_PRICE")
    private String marketPrice;

    @Column(name = "HAZARD_CLASS_ID")
    private String hazardClassId;

    @Column(name = "RFQ_REQUIRED_FLAG")
    private String rfqRequiredFlag;

    @Column(name = "QTY_RCV_TOLERANCE")
    private String qtyRcvTolerance;

    @Column(name = "LIST_PRICE_PER_UNIT")
    private String listPricePerUnit;

    @Column(name = "UN_NUMBER_ID")
    private String unNumberId;

    @Column(name = "PRICE_TOLERANCE_PERCENT")
    private String priceTolerancePercent;

    @Column(name = "ASSET_CATEGORY_ID")
    private String assetCategoryId;

    @Column(name = "ROUNDING_FACTOR")
    private String roundingFactor;

    @Column(name = "UNIT_OF_ISSUE")
    private String unitOfIssue;

    @Column(name = "ENFORCE_SHIP_TO_LOCATION_CODE")
    private String enforceShipToLocationCode;

    @Column(name = "ALLOW_SUBSTITUTE_RECEIPTS_FLAG")
    private String allowSubstituteReceiptsFlag;

    @Column(name = "ALLOW_UNORDERED_RECEIPTS_FLAG")
    private String allowUnorderedReceiptsFlag;

    @Column(name = "ALLOW_EXPRESS_DELIVERY_FLAG")
    private String allowExpressDeliveryFlag;

    @Column(name = "DAYS_EARLY_RECEIPT_ALLOWED")
    private String daysEarlyReceiptAllowed;

    @Column(name = "DAYS_LATE_RECEIPT_ALLOWED")
    private String daysLateReceiptAllowed;

    @Column(name = "RECEIPT_DAYS_EXCEPTION_CODE")
    private String receiptDaysExceptionCode;

    @Column(name = "RECEIVING_ROUTING_ID")
    private String receivingRoutingId;

    @Column(name = "INVOICE_CLOSE_TOLERANCE")
    private String invoiceCloseTolerance;

    @Column(name = "RECEIVE_CLOSE_TOLERANCE")
    private String receiveCloseTolerance;

    @Column(name = "AUTO_LOT_ALPHA_PREFIX")
    private String autoLotAlphaPrefix;

    @Column(name = "START_AUTO_LOT_NUMBER")
    private String startAutoLotNumber;

    @Column(name = "LOT_CONTROL_CODE")
    private String lotControlCode;

    @Column(name = "SHELF_LIFE_CODE")
    private String shelfLifeCode;

    @Column(name = "SHELF_LIFE_DAYS")
    private String shelfLifeDays;

    @Column(name = "SERIAL_NUMBER_CONTROL_CODE")
    private String serialNumberControlCode;

    @Column(name = "START_AUTO_SERIAL_NUMBER")
    private String startAutoSerialNumber;

    @Column(name = "AUTO_SERIAL_ALPHA_PREFIX")
    private String autoSerialAlphaPrefix;

    @Column(name = "SOURCE_TYPE")
    private String sourceType;

    @Column(name = "SOURCE_ORGANIZATION_ID")
    private String sourceOrganizationId;

    @Column(name = "SOURCE_SUBINVENTORY")
    private String sourceSubinventory;

    @Column(name = "EXPENSE_ACCOUNT")
    private String expenseAccount;

    @Column(name = "ENCUMBRANCE_ACCOUNT")
    private String encumbranceAccount;

    @Column(name = "RESTRICT_SUBINVENTORIES_CODE")
    private String restrictSubinventoriesCode;

    @Column(name = "UNIT_WEIGHT")
    private String unitWeight;

    @Column(name = "WEIGHT_UOM_CODE")
    private String weightUomCode;

    @Column(name = "VOLUME_UOM_CODE")
    private String volumeUomCode;

    @Column(name = "UNIT_VOLUME")
    private String unitVolume;

    @Column(name = "RESTRICT_LOCATORS_CODE")
    private String restrictLocatorsCode;

    @Column(name = "LOCATION_CONTROL_CODE")
    private String locationControlCode;

    @Column(name = "SHRINKAGE_RATE")
    private String shrinkageRate;

    @Column(name = "ACCEPTABLE_EARLY_DAYS")
    private String acceptableEarlyDays;

    @Column(name = "PLANNING_TIME_FENCE_CODE")
    private String planningTimeFenceCode;

    @Column(name = "DEMAND_TIME_FENCE_CODE")
    private String demandTimeFenceCode;

    @Column(name = "LEAD_TIME_LOT_SIZE")
    private String leadTimeLotSize;

    @Column(name = "STD_LOT_SIZE")
    private String stdLotSize;

    @Column(name = "CUM_MANUFACTURING_LEAD_TIME")
    private String cumManufacturingLeadTime;

    @Column(name = "OVERRUN_PERCENTAGE")
    private String overrunPercentage;

    @Column(name = "MRP_CALCULATE_ATP_FLAG")
    private String mrpCalculateAtpFlag;

    @Column(name = "ACCEPTABLE_RATE_INCREASE")
    private String acceptableRateIncrease;

    @Column(name = "ACCEPTABLE_RATE_DECREASE")
    private String acceptableRateDecrease;

    @Column(name = "CUMULATIVE_TOTAL_LEAD_TIME")
    private String cumulativeTotalLeadTime;

    @Column(name = "PLANNING_TIME_FENCE_DAYS")
    private String planningTimeFenceDays;

    @Column(name = "DEMAND_TIME_FENCE_DAYS")
    private String demandTimeFenceDays;

    @Column(name = "END_ASSEMBLY_PEGGING_FLAG")
    private String endAssemblyPeggingFlag;

    @Column(name = "REPETITIVE_PLANNING_FLAG")
    private String repetitivePlanningFlag;

    @Column(name = "PLANNING_EXCEPTION_SET")
    private String planningExceptionSet;

    @Column(name = "BOM_ITEM_TYPE", nullable = false)
    private String bomItemType;

    @Column(name = "PICK_COMPONENTS_FLAG", nullable = false)
    private String pickComponentsFlag;

    @Column(name = "REPLENISH_TO_ORDER_FLAG", nullable = false)
    private String replenishToOrderFlag;

    @Column(name = "BASE_ITEM_ID")
    private String baseItemId;

    @Column(name = "ATP_COMPONENTS_FLAG", nullable = false)
    private String atpComponentsFlag;

    @Column(name = "ATP_FLAG", nullable = false)
    private String atpFlag;

    @Column(name = "FIXED_LEAD_TIME")
    private String fixedLeadTime;

    @Column(name = "VARIABLE_LEAD_TIME")
    private String variableLeadTime;

    @Column(name = "WIP_SUPPLY_LOCATOR_ID")
    private String wipSupplyLocatorId;

    @Column(name = "WIP_SUPPLY_TYPE")
    private String wipSupplyType;

    @Column(name = "WIP_SUPPLY_SUBINVENTORY")
    private String wipSupplySubinventory;

    @Column(name = "PRIMARY_UOM_CODE")
    private String primaryUomCode;

    @Column(name = "PRIMARY_UNIT_OF_MEASURE")
    private String primaryUnitOfMeasure;

    @Column(name = "ALLOWED_UNITS_LOOKUP_CODE")
    private String allowedUnitsLookupCode;

    @Column(name = "COST_OF_SALES_ACCOUNT")
    private String costOfSalesAccount;

    @Column(name = "SALES_ACCOUNT")
    private String salesAccount;

    @Column(name = "DEFAULT_INCLUDE_IN_ROLLUP_FLAG")
    private String defaultIncludeInRollupFlag;

    @Column(name = "INVENTORY_ITEM_STATUS_CODE", nullable = false)
    private String inventoryItemStatusCode;

    @Column(name = "INVENTORY_PLANNING_CODE")
    private String inventoryPlanningCode;

    @Column(name = "PLANNER_CODE")
    private String plannerCode;

    @Column(name = "PLANNING_MAKE_BUY_CODE")
    private String planningMakeBuyCode;

    @Column(name = "FIXED_LOT_MULTIPLIER")
    private String fixedLotMultiplier;

    @Column(name = "ROUNDING_CONTROL_TYPE")
    private String roundingControlType;

    @Column(name = "CARRYING_COST")
    private String carryingCost;

    @Column(name = "POSTPROCESSING_LEAD_TIME")
    private String postprocessingLeadTime;

    @Column(name = "PREPROCESSING_LEAD_TIME")
    private String preprocessingLeadTime;

    @Column(name = "FULL_LEAD_TIME")
    private String fullLeadTime;

    @Column(name = "ORDER_COST")
    private String orderCost;

    @Column(name = "MRP_SAFETY_STOCK_PERCENT")
    private String mrpSafetyStockPercent;

    @Column(name = "MRP_SAFETY_STOCK_CODE")
    private String mrpSafetyStockCode;

    @Column(name = "MIN_MINMAX_QUANTITY")
    private String minMinmaxQuantity;

    @Column(name = "MAX_MINMAX_QUANTITY")
    private String maxMinmaxQuantity;

    @Column(name = "MINIMUM_ORDER_QUANTITY")
    private String minimumOrderQuantity;

    @Column(name = "FIXED_ORDER_QUANTITY")
    private String fixedOrderQuantity;

    @Column(name = "FIXED_DAYS_SUPPLY")
    private String fixedDaysSupply;

    @Column(name = "MAXIMUM_ORDER_QUANTITY")
    private String maximumOrderQuantity;

    @Column(name = "ATP_RULE_ID")
    private String atpRuleId;

    @Column(name = "PICKING_RULE_ID")
    private String pickingRuleId;

    @Column(name = "RESERVABLE_TYPE")
    private String reservableType;

    @Column(name = "POSITIVE_MEASUREMENT_ERROR")
    private String positiveMeasurementError;

    @Column(name = "NEGATIVE_MEASUREMENT_ERROR")
    private String negativeMeasurementError;

    @Column(name = "ENGINEERING_ECN_CODE")
    private String engineeringEcnCode;

    @Column(name = "ENGINEERING_ITEM_ID")
    private String engineeringItemId;

    @Column(name = "ENGINEERING_DATE")
    private LocalDate engineeringDate;

    @Column(name = "SERVICE_STARTING_DELAY")
    private String serviceStartingDelay;

    @Column(name = "VENDOR_WARRANTY_FLAG", nullable = false)
    private String vendorWarrantyFlag;

    @Column(name = "SERVICEABLE_COMPONENT_FLAG")
    private String serviceableComponentFlag;

    @Column(name = "SERVICEABLE_PRODUCT_FLAG", nullable = false)
    private String serviceableProductFlag;

    @Column(name = "BASE_WARRANTY_SERVICE_ID")
    private String baseWarrantyServiceId;

    @Column(name = "PAYMENT_TERMS_ID")
    private String paymentTermsId;

    @Column(name = "PREVENTIVE_MAINTENANCE_FLAG")
    private String preventiveMaintenanceFlag;

    @Column(name = "PRIMARY_SPECIALIST_ID")
    private String primarySpecialistId;

    @Column(name = "SECONDARY_SPECIALIST_ID")
    private String secondarySpecialistId;

    @Column(name = "SERVICEABLE_ITEM_CLASS_ID")
    private String serviceableItemClassId;

    @Column(name = "TIME_BILLABLE_FLAG")
    private String timeBillableFlag;

    @Column(name = "MATERIAL_BILLABLE_FLAG")
    private String materialBillableFlag;

    @Column(name = "EXPENSE_BILLABLE_FLAG")
    private String expenseBillableFlag;

    @Column(name = "PRORATE_SERVICE_FLAG")
    private String prorateServiceFlag;

    @Column(name = "COVERAGE_SCHEDULE_ID")
    private String coverageScheduleId;

    @Column(name = "SERVICE_DURATION_PERIOD_CODE")
    private String serviceDurationPeriodCode;

    @Column(name = "SERVICE_DURATION")
    private String serviceDuration;

    @Column(name = "WARRANTY_VENDOR_ID")
    private String warrantyVendorId;

    @Column(name = "MAX_WARRANTY_AMOUNT")
    private String maxWarrantyAmount;

    @Column(name = "RESPONSE_TIME_PERIOD_CODE")
    private String responseTimePeriodCode;

    @Column(name = "RESPONSE_TIME_VALUE")
    private String responseTimeValue;

    @Column(name = "NEW_REVISION_CODE")
    private String newRevisionCode;

    @Column(name = "INVOICEABLE_ITEM_FLAG", nullable = false)
    private String invoiceableItemFlag;

    @Column(name = "TAX_CODE")
    private String taxCode;

    @Column(name = "INVOICE_ENABLED_FLAG", nullable = false)
    private String invoiceEnabledFlag;

    @Column(name = "MUST_USE_APPROVED_VENDOR_FLAG", nullable = false)
    private String mustUseApprovedVendorFlag;

    @Column(name = "REQUEST_ID")
    private String requestId;

    @Column(name = "PROGRAM_APPLICATION_ID")
    private String programApplicationId;

    @Column(name = "PROGRAM_ID")
    private String programId;

    @Column(name = "PROGRAM_UPDATE_DATE")
    private LocalDate programUpdateDate;

    @Column(name = "OUTSIDE_OPERATION_FLAG", nullable = false)
    private String outsideOperationFlag;

    @Column(name = "OUTSIDE_OPERATION_UOM_TYPE")
    private String outsideOperationUomType;

    @Column(name = "SAFETY_STOCK_BUCKET_DAYS")
    private String safetyStockBucketDays;

    @Column(name = "AUTO_REDUCE_MPS")
    private String autoReduceMps;

    @Column(name = "COSTING_ENABLED_FLAG", nullable = false)
    private String costingEnabledFlag;

    @Column(name = "AUTO_CREATED_CONFIG_FLAG", nullable = false)
    private String autoCreatedConfigFlag;

    @Column(name = "CYCLE_COUNT_ENABLED_FLAG", nullable = false)
    private String cycleCountEnabledFlag;

    @Column(name = "ITEM_TYPE")
    private String itemType;

    @Column(name = "MODEL_CONFIG_CLAUSE_NAME")
    private String modelConfigClauseName;

    @Column(name = "SHIP_MODEL_COMPLETE_FLAG")
    private String shipModelCompleteFlag;

    @Column(name = "MRP_PLANNING_CODE")
    private String mrpPlanningCode;

    @Column(name = "RETURN_INSPECTION_REQUIREMENT")
    private String returnInspectionRequirement;

    @Column(name = "ATO_FORECAST_CONTROL")
    private String atoForecastControl;

    @Column(name = "RELEASE_TIME_FENCE_CODE")
    private String releaseTimeFenceCode;

    @Column(name = "RELEASE_TIME_FENCE_DAYS")
    private String releaseTimeFenceDays;

    @Column(name = "CONTAINER_ITEM_FLAG")
    private String containerItemFlag;

    @Column(name = "VEHICLE_ITEM_FLAG")
    private String vehicleItemFlag;

    @Column(name = "MAXIMUM_LOAD_WEIGHT")
    private String maximumLoadWeight;

    @Column(name = "MINIMUM_FILL_PERCENT")
    private String minimumFillPercent;

    @Column(name = "CONTAINER_TYPE_CODE")
    private String containerTypeCode;

    @Column(name = "INTERNAL_VOLUME")
    private String internalVolume;

    @Column(name = "WH_UPDATE_DATE")
    private LocalDate whUpdateDate;

    @Column(name = "PRODUCT_FAMILY_ITEM_ID")
    private String productFamilyItemId;

    @Column(name = "GLOBAL_ATTRIBUTE_CATEGORY")
    private String globalAttributeCategory;

    @Column(name = "GLOBAL_ATTRIBUTE1")
    private String globalAttribute1;

    @Column(name = "GLOBAL_ATTRIBUTE2")
    private String globalAttribute2;

    @Column(name = "GLOBAL_ATTRIBUTE3")
    private String globalAttribute3;

    @Column(name = "GLOBAL_ATTRIBUTE4")
    private String globalAttribute4;

    @Column(name = "GLOBAL_ATTRIBUTE5")
    private String globalAttribute5;

    @Column(name = "GLOBAL_ATTRIBUTE6")
    private String globalAttribute6;

    @Column(name = "GLOBAL_ATTRIBUTE7")
    private String globalAttribute7;

    @Column(name = "GLOBAL_ATTRIBUTE8")
    private String globalAttribute8;

    @Column(name = "GLOBAL_ATTRIBUTE9")
    private String globalAttribute9;

    @Column(name = "GLOBAL_ATTRIBUTE10")
    private String globalAttribute10;

    @Column(name = "PURCHASING_TAX_CODE")
    private String purchasingTaxCode;

    @Column(name = "OVERCOMPLETION_TOLERANCE_TYPE")
    private String overcompletionToleranceType;

    @Column(name = "OVERCOMPLETION_TOLERANCE_VALUE")
    private String overcompletionToleranceValue;

    @Column(name = "EFFECTIVITY_CONTROL")
    private String effectivityControl;

    @Column(name = "CHECK_SHORTAGES_FLAG")
    private String checkShortagesFlag;

    @Column(name = "OVER_SHIPMENT_TOLERANCE")
    private String overShipmentTolerance;

    @Column(name = "UNDER_SHIPMENT_TOLERANCE")
    private String underShipmentTolerance;

    @Column(name = "OVER_RETURN_TOLERANCE")
    private String overReturnTolerance;

    @Column(name = "UNDER_RETURN_TOLERANCE")
    private String underReturnTolerance;

    @Column(name = "EQUIPMENT_TYPE")
    private String equipmentType;

    @Column(name = "RECOVERED_PART_DISP_CODE")
    private String recoveredPartDispCode;

    @Column(name = "DEFECT_TRACKING_ON_FLAG")
    private String defectTrackingOnFlag;

    @Column(name = "USAGE_ITEM_FLAG")
    private String usageItemFlag;

    @Column(name = "EVENT_FLAG")
    private String eventFlag;

    @Column(name = "ELECTRONIC_FLAG")
    private String electronicFlag;

    @Column(name = "DOWNLOADABLE_FLAG")
    private String downloadableFlag;

    @Column(name = "VOL_DISCOUNT_EXEMPT_FLAG")
    private String volDiscountExemptFlag;

    @Column(name = "COUPON_EXEMPT_FLAG")
    private String couponExemptFlag;

    @Column(name = "COMMS_NL_TRACKABLE_FLAG")
    private String commsNlTrackableFlag;

    @Column(name = "ASSET_CREATION_CODE")
    private String assetCreationCode;

    @Column(name = "COMMS_ACTIVATION_REQD_FLAG")
    private String commsActivationReqdFlag;

    @Column(name = "ORDERABLE_ON_WEB_FLAG")
    private String orderableOnWebFlag;

    @Column(name = "BACK_ORDERABLE_FLAG")
    private String backOrderableFlag;

    @Column(name = "WEB_STATUS")
    private String webStatus;

    @Column(name = "INDIVISIBLE_FLAG")
    private String indivisibleFlag;

    @Column(name = "DIMENSION_UOM_CODE")
    private String dimensionUomCode;

    @Column(name = "UNIT_LENGTH")
    private String unitLength;

    @Column(name = "UNIT_WIDTH")
    private String unitWidth;

    @Column(name = "UNIT_HEIGHT")
    private String unitHeight;

    @Column(name = "BULK_PICKED_FLAG")
    private String bulkPickedFlag;

    @Column(name = "LOT_STATUS_ENABLED")
    private String lotStatusEnabled;

    @Column(name = "DEFAULT_LOT_STATUS_ID")
    private String defaultLotStatusId;

    @Column(name = "SERIAL_STATUS_ENABLED")
    private String serialStatusEnabled;

    @Column(name = "DEFAULT_SERIAL_STATUS_ID")
    private String defaultSerialStatusId;

    @Column(name = "LOT_SPLIT_ENABLED")
    private String lotSplitEnabled;

    @Column(name = "LOT_MERGE_ENABLED")
    private String lotMergeEnabled;

    @Column(name = "INVENTORY_CARRY_PENALTY")
    private String inventoryCarryPenalty;

    @Column(name = "OPERATION_SLACK_PENALTY")
    private String operationSlackPenalty;

    @Column(name = "FINANCING_ALLOWED_FLAG")
    private String financingAllowedFlag;

    @Column(name = "EAM_ITEM_TYPE")
    private String eamItemType;

    @Column(name = "EAM_ACTIVITY_TYPE_CODE")
    private String eamActivityTypeCode;

    @Column(name = "EAM_ACTIVITY_CAUSE_CODE")
    private String eamActivityCauseCode;

    @Column(name = "EAM_ACT_NOTIFICATION_FLAG")
    private String eamActNotificationFlag;

    @Column(name = "EAM_ACT_SHUTDOWN_STATUS")
    private String eamActShutdownStatus;

    @Column(name = "DUAL_UOM_CONTROL")
    private String dualUomControl;

    @Column(name = "SECONDARY_UOM_CODE")
    private String secondaryUomCode;

    @Column(name = "DUAL_UOM_DEVIATION_HIGH")
    private String dualUomDeviationHigh;

    @Column(name = "DUAL_UOM_DEVIATION_LOW")
    private String dualUomDeviationLow;

    @Column(name = "CONTRACT_ITEM_TYPE_CODE")
    private String contractItemTypeCode;

    @Column(name = "SUBSCRIPTION_DEPEND_FLAG")
    private String subscriptionDependFlag;

    @Column(name = "SERV_REQ_ENABLED_CODE")
    private String servReqEnabledCode;

    @Column(name = "SERV_BILLING_ENABLED_FLAG")
    private String servBillingEnabledFlag;

    @Column(name = "SERV_IMPORTANCE_LEVEL")
    private String servImportanceLevel;

    @Column(name = "PLANNED_INV_POINT_FLAG")
    private String plannedInvPointFlag;

    @Column(name = "LOT_TRANSLATE_ENABLED")
    private String lotTranslateEnabled;

    @Column(name = "DEFAULT_SO_SOURCE_TYPE")
    private String defaultSoSourceType;

    @Column(name = "CREATE_SUPPLY_FLAG")
    private String createSupplyFlag;

    @Column(name = "SUBSTITUTION_WINDOW_CODE")
    private String substitutionWindowCode;

    @Column(name = "SUBSTITUTION_WINDOW_DAYS")
    private String substitutionWindowDays;

    @Column(name = "IB_ITEM_INSTANCE_CLASS")
    private String ibItemInstanceClass;

    @Column(name = "CONFIG_MODEL_TYPE")
    private String configModelType;

    @Column(name = "LOT_SUBSTITUTION_ENABLED")
    private String lotSubstitutionEnabled;

    @Column(name = "MINIMUM_LICENSE_QUANTITY")
    private String minimumLicenseQuantity;

    @Column(name = "EAM_ACTIVITY_SOURCE_CODE")
    private String eamActivitySourceCode;

    @Column(name = "LIFECYCLE_ID")
    private String lifecycleId;

    @Column(name = "CURRENT_PHASE_ID")
    private String currentPhaseId;

    @Column(name = "OBJECT_VERSION_NUMBER")
    private String objectVersionNumber;

    @Column(name = "TRACKING_QUANTITY_IND")
    private String trackingQuantityInd;

    @Column(name = "ONT_PRICING_QTY_SOURCE")
    private String ontPricingQtySource;

    @Column(name = "SECONDARY_DEFAULT_IND")
    private String secondaryDefaultInd;

    @Column(name = "OPTION_SPECIFIC_SOURCED")
    private String optionSpecificSourced;

    @Column(name = "APPROVAL_STATUS")
    private String approvalStatus;

    @Column(name = "VMI_MINIMUM_UNITS")
    private String vmiMinimumUnits;

    @Column(name = "VMI_MINIMUM_DAYS")
    private String vmiMinimumDays;

    @Column(name = "VMI_MAXIMUM_UNITS")
    private String vmiMaximumUnits;

    @Column(name = "VMI_MAXIMUM_DAYS")
    private String vmiMaximumDays;

    @Column(name = "VMI_FIXED_ORDER_QUANTITY")
    private String vmiFixedOrderQuantity;

    @Column(name = "SO_AUTHORIZATION_FLAG")
    private String soAuthorizationFlag;

    @Column(name = "CONSIGNED_FLAG")
    private String consignedFlag;

    @Column(name = "ASN_AUTOEXPIRE_FLAG")
    private String asnAutoexpireFlag;

    @Column(name = "VMI_FORECAST_TYPE")
    private String vmiForecastType;

    @Column(name = "FORECAST_HORIZON")
    private String forecastHorizon;

    @Column(name = "EXCLUDE_FROM_BUDGET_FLAG")
    private String excludeFromBudgetFlag;

    @Column(name = "DAYS_TGT_INV_SUPPLY")
    private String daysTgtInvSupply;

    @Column(name = "DAYS_TGT_INV_WINDOW")
    private String daysTgtInvWindow;

    @Column(name = "DAYS_MAX_INV_SUPPLY")
    private String daysMaxInvSupply;

    @Column(name = "DAYS_MAX_INV_WINDOW")
    private String daysMaxInvWindow;

    @Column(name = "DRP_PLANNED_FLAG")
    private String drpPlannedFlag;

    @Column(name = "CRITICAL_COMPONENT_FLAG")
    private String criticalComponentFlag;

    @Column(name = "CONTINOUS_TRANSFER")
    private String continousTransfer;

    @Column(name = "CONVERGENCE")
    private String convergence;

    @Column(name = "DIVERGENCE")
    private String divergence;

    @Column(name = "CONFIG_ORGS")
    private String configOrgs;

    @Column(name = "CONFIG_MATCH")
    private String configMatch;


}
