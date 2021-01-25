package halla.holdings.oracle.inv.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "MTL_SYSTEM_ITEMS_B", schema = "INV", catalog = "")
@Setter
@Getter
@IdClass(MtlSystemItemsBId.class)
public class MtlSystemItemsB implements Serializable
{
    @Id
    @Column(name = "INVENTORY_ITEM_ID")private long inventory_item_id;
    @Id
    @Column(name = "ORGANIZATION_ID")private long organizationId;
    @Column(name = "LAST_UPDATE_DATE")private LocalDateTime last_update_date;
    @Column(name = "LAST_UPDATED_BY")private Double last_updated_by;
    @Column(name = "CREATION_DATE")private LocalDateTime creation_date;
    @Column(name = "CREATED_BY")private Double created_by;
    @Column(name = "LAST_UPDATE_LOGIN")private Double last_update_login;
    @Column(name = "SUMMARY_FLAG")private String summary_flag;
    @Column(name = "ENABLED_FLAG")private String enabled_flag;
    @Column(name = "START_DATE_ACTIVE")private LocalDateTime start_date_active;
    @Column(name = "END_DATE_ACTIVE")private LocalDateTime end_date_active;
    @Column(name = "DESCRIPTION")private String description;
    @Column(name = "BUYER_ID")private Double buyer_id;
    @Column(name = "ACCOUNTING_RULE_ID")private Double accounting_rule_id;
    @Column(name = "INVOICING_RULE_ID")private Double invoicing_rule_id;
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
    @Column(name = "ATTRIBUTE_CATEGORY")private String attribute_category;
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
    @Column(name = "PURCHASING_ITEM_FLAG")private String purchasing_item_flag;
    @Column(name = "SHIPPABLE_ITEM_FLAG")private String shippable_item_flag;
    @Column(name = "CUSTOMER_ORDER_FLAG")private String customer_order_flag;
    @Column(name = "INTERNAL_ORDER_FLAG")private String internal_order_flag;
    @Column(name = "SERVICE_ITEM_FLAG")private String service_item_flag;
    @Column(name = "INVENTORY_ITEM_FLAG")private String inventory_item_flag;
    @Column(name = "ENG_ITEM_FLAG")private String eng_item_flag;
    @Column(name = "INVENTORY_ASSET_FLAG")private String inventory_asset_flag;
    @Column(name = "PURCHASING_ENABLED_FLAG")private String purchasing_enabled_flag;
    @Column(name = "CUSTOMER_ORDER_ENABLED_FLAG")private String customer_order_enabled_flag;
    @Column(name = "INTERNAL_ORDER_ENABLED_FLAG")private String internal_order_enabled_flag;
    @Column(name = "SO_TRANSACTIONS_FLAG")private String so_transactions_flag;
    @Column(name = "MTL_TRANSACTIONS_ENABLED_FLAG")private String mtl_transactions_enabled_flag;
    @Column(name = "STOCK_ENABLED_FLAG")private String stock_enabled_flag;
    @Column(name = "BOM_ENABLED_FLAG")private String bom_enabled_flag;
    @Column(name = "BUILD_IN_WIP_FLAG")private String build_in_wip_flag;
    @Column(name = "REVISION_QTY_CONTROL_CODE")private Double revision_qty_control_code;
    @Column(name = "ITEM_CATALOG_GROUP_ID")private Double item_catalog_group_id;
    @Column(name = "CATALOG_STATUS_FLAG")private String catalog_status_flag;
    @Column(name = "RETURNABLE_FLAG")private String returnable_flag;
    @Column(name = "DEFAULT_SHIPPING_ORG")private Double default_shipping_org;
    @Column(name = "COLLATERAL_FLAG")private String collateral_flag;
    @Column(name = "TAXABLE_FLAG")private String taxable_flag;
    @Column(name = "QTY_RCV_EXCEPTION_CODE")private String qty_rcv_exception_code;
    @Column(name = "ALLOW_ITEM_DESC_UPDATE_FLAG")private String allow_item_desc_update_flag;
    @Column(name = "INSPECTION_REQUIRED_FLAG")private String inspection_required_flag;
    @Column(name = "RECEIPT_REQUIRED_FLAG")private String receipt_required_flag;
    @Column(name = "MARKET_PRICE")private Double market_price;
    @Column(name = "HAZARD_CLASS_ID")private Double hazard_class_id;
    @Column(name = "RFQ_REQUIRED_FLAG")private String rfq_required_flag;
    @Column(name = "QTY_RCV_TOLERANCE")private Double qty_rcv_tolerance;
    @Column(name = "LIST_PRICE_PER_UNIT")private Double list_price_per_unit;
    @Column(name = "UN_NUMBER_ID")private Double un_number_id;
    @Column(name = "PRICE_TOLERANCE_PERCENT")private Double price_tolerance_percent;
    @Column(name = "ASSET_CATEGORY_ID")private Double asset_category_id;
    @Column(name = "ROUNDING_FACTOR")private Double rounding_factor;
    @Column(name = "UNIT_OF_ISSUE")private String unit_of_issue;
    @Column(name = "ENFORCE_SHIP_TO_LOCATION_CODE")private String enforce_ship_to_location_code;
    @Column(name = "ALLOW_SUBSTITUTE_RECEIPTS_FLAG")private String allow_substitute_receipts_flag;
    @Column(name = "ALLOW_UNORDERED_RECEIPTS_FLAG")private String allow_unordered_receipts_flag;
    @Column(name = "ALLOW_EXPRESS_DELIVERY_FLAG")private String allow_express_delivery_flag;
    @Column(name = "DAYS_EARLY_RECEIPT_ALLOWED")private Double days_early_receipt_allowed;
    @Column(name = "DAYS_LATE_RECEIPT_ALLOWED")private Double days_late_receipt_allowed;
    @Column(name = "RECEIPT_DAYS_EXCEPTION_CODE")private String receipt_days_exception_code;
    @Column(name = "RECEIVING_ROUTING_ID")private Double receiving_routing_id;
    @Column(name = "INVOICE_CLOSE_TOLERANCE")private Double invoice_close_tolerance;
    @Column(name = "RECEIVE_CLOSE_TOLERANCE")private Double receive_close_tolerance;
    @Column(name = "AUTO_LOT_ALPHA_PREFIX")private String auto_lot_alpha_prefix;
    @Column(name = "START_AUTO_LOT_NUMBER")private String start_auto_lot_number;
    @Column(name = "LOT_CONTROL_CODE")private Double lot_control_code;
    @Column(name = "SHELF_LIFE_CODE")private Double shelf_life_code;
    @Column(name = "SHELF_LIFE_DAYS")private Double shelf_life_days;
    @Column(name = "SERIAL_NUMBER_CONTROL_CODE")private Double serial_number_control_code;
    @Column(name = "START_AUTO_SERIAL_NUMBER")private String start_auto_serial_number;
    @Column(name = "AUTO_SERIAL_ALPHA_PREFIX")private String auto_serial_alpha_prefix;
    @Column(name = "SOURCE_TYPE")private Double source_type;
    @Column(name = "SOURCE_ORGANIZATION_ID")private Double source_organization_id;
    @Column(name = "SOURCE_SUBINVENTORY")private String source_subinventory;
    @Column(name = "EXPENSE_ACCOUNT")private Double expense_account;
    @Column(name = "ENCUMBRANCE_ACCOUNT")private Double encumbrance_account;
    @Column(name = "RESTRICT_SUBINVENTORIES_CODE")private Double restrict_subinventories_code;
    @Column(name = "UNIT_WEIGHT")private Double unit_weight;
    @Column(name = "WEIGHT_UOM_CODE")private String weight_uom_code;
    @Column(name = "VOLUME_UOM_CODE")private String volume_uom_code;
    @Column(name = "UNIT_VOLUME")private Double unit_volume;
    @Column(name = "RESTRICT_LOCATORS_CODE")private Double restrict_locators_code;
    @Column(name = "LOCATION_CONTROL_CODE")private Double location_control_code;
    @Column(name = "SHRINKAGE_RATE")private Double shrinkage_rate;
    @Column(name = "ACCEPTABLE_EARLY_DAYS")private Double acceptable_early_days;
    @Column(name = "PLANNING_TIME_FENCE_CODE")private Double planning_time_fence_code;
    @Column(name = "DEMAND_TIME_FENCE_CODE")private Double demand_time_fence_code;
    @Column(name = "LEAD_TIME_LOT_SIZE")private Double lead_time_lot_size;
    @Column(name = "STD_LOT_SIZE")private Double std_lot_size;
    @Column(name = "CUM_MANUFACTURING_LEAD_TIME")private Double cum_manufacturing_lead_time;
    @Column(name = "OVERRUN_PERCENTAGE")private Double overrun_percentage;
    @Column(name = "MRP_CALCULATE_ATP_FLAG")private String mrp_calculate_atp_flag;
    @Column(name = "ACCEPTABLE_RATE_INCREASE")private Double acceptable_rate_increase;
    @Column(name = "ACCEPTABLE_RATE_DECREASE")private Double acceptable_rate_decrease;
    @Column(name = "CUMULATIVE_TOTAL_LEAD_TIME")private Double cumulative_total_lead_time;
    @Column(name = "PLANNING_TIME_FENCE_DAYS")private Double planning_time_fence_days;
    @Column(name = "DEMAND_TIME_FENCE_DAYS")private Double demand_time_fence_days;
    @Column(name = "END_ASSEMBLY_PEGGING_FLAG")private String end_assembly_pegging_flag;
    @Column(name = "REPETITIVE_PLANNING_FLAG")private String repetitive_planning_flag;
    @Column(name = "PLANNING_EXCEPTION_SET")private String planning_exception_set;
    @Column(name = "BOM_ITEM_TYPE")private Double bom_item_type;
    @Column(name = "PICK_COMPONENTS_FLAG")private String pick_components_flag;
    @Column(name = "REPLENISH_TO_ORDER_FLAG")private String replenish_to_order_flag;
    @Column(name = "BASE_ITEM_ID")private Double base_item_id;
    @Column(name = "ATP_COMPONENTS_FLAG")private String atp_components_flag;
    @Column(name = "ATP_FLAG")private String atp_flag;
    @Column(name = "FIXED_LEAD_TIME")private Double fixed_lead_time;
    @Column(name = "VARIABLE_LEAD_TIME")private Double variable_lead_time;
    @Column(name = "WIP_SUPPLY_LOCATOR_ID")private Double wip_supply_locator_id;
    @Column(name = "WIP_SUPPLY_TYPE")private Double wip_supply_type;
    @Column(name = "WIP_SUPPLY_SUBINVENTORY")private String wip_supply_subinventory;
    @Column(name = "PRIMARY_UOM_CODE")private String primary_uom_code;
    @Column(name = "PRIMARY_UNIT_OF_MEASURE")private String primary_unit_of_measure;
    @Column(name = "ALLOWED_UNITS_LOOKUP_CODE")private Double allowed_units_lookup_code;
    @Column(name = "COST_OF_SALES_ACCOUNT")private Double cost_of_sales_account;
    @Column(name = "SALES_ACCOUNT")private Double sales_account;
    @Column(name = "DEFAULT_INCLUDE_IN_ROLLUP_FLAG")private String default_include_in_rollup_flag;
    @Column(name = "INVENTORY_ITEM_STATUS_CODE")private String inventory_item_status_code;
    @Column(name = "INVENTORY_PLANNING_CODE")private Double inventory_planning_code;
    @Column(name = "PLANNER_CODE")private String planner_code;
    @Column(name = "PLANNING_MAKE_BUY_CODE")private Double planning_make_buy_code;
    @Column(name = "FIXED_LOT_MULTIPLIER")private Double fixed_lot_multiplier;
    @Column(name = "ROUNDING_CONTROL_TYPE")private Double rounding_control_type;
    @Column(name = "CARRYING_COST")private Double carrying_cost;
    @Column(name = "POSTPROCESSING_LEAD_TIME")private Double postprocessing_lead_time;
    @Column(name = "PREPROCESSING_LEAD_TIME")private Double preprocessing_lead_time;
    @Column(name = "FULL_LEAD_TIME")private Double full_lead_time;
    @Column(name = "ORDER_COST")private Double order_cost;
    @Column(name = "MRP_SAFETY_STOCK_PERCENT")private Double mrp_safety_stock_percent;
    @Column(name = "MRP_SAFETY_STOCK_CODE")private Double mrp_safety_stock_code;
    @Column(name = "MIN_MINMAX_QUANTITY")private Double min_minmax_quantity;
    @Column(name = "MAX_MINMAX_QUANTITY")private Double max_minmax_quantity;
    @Column(name = "MINIMUM_ORDER_QUANTITY")private Double minimum_order_quantity;
    @Column(name = "FIXED_ORDER_QUANTITY")private Double fixed_order_quantity;
    @Column(name = "FIXED_DAYS_SUPPLY")private Double fixed_days_supply;
    @Column(name = "MAXIMUM_ORDER_QUANTITY")private Double maximum_order_quantity;
    @Column(name = "ATP_RULE_ID")private Double atp_rule_id;
    @Column(name = "PICKING_RULE_ID")private Double picking_rule_id;
    @Column(name = "RESERVABLE_TYPE")private Double reservable_type;
    @Column(name = "POSITIVE_MEASUREMENT_ERROR")private Double positive_measurement_error;
    @Column(name = "NEGATIVE_MEASUREMENT_ERROR")private Double negative_measurement_error;
    @Column(name = "ENGINEERING_ECN_CODE")private String engineering_ecn_code;
    @Column(name = "ENGINEERING_ITEM_ID")private Double engineering_item_id;
    @Column(name = "ENGINEERING_DATE")private LocalDateTime engineering_date;
    @Column(name = "SERVICE_STARTING_DELAY")private Double service_starting_delay;
    @Column(name = "VENDOR_WARRANTY_FLAG")private String vendor_warranty_flag;
    @Column(name = "SERVICEABLE_COMPONENT_FLAG")private String serviceable_component_flag;
    @Column(name = "SERVICEABLE_PRODUCT_FLAG")private String serviceable_product_flag;
    @Column(name = "BASE_WARRANTY_SERVICE_ID")private Double base_warranty_service_id;
    @Column(name = "PAYMENT_TERMS_ID")private Double payment_terms_id;
    @Column(name = "PREVENTIVE_MAINTENANCE_FLAG")private String preventive_maintenance_flag;
    @Column(name = "PRIMARY_SPECIALIST_ID")private Double primary_specialist_id;
    @Column(name = "SECONDARY_SPECIALIST_ID")private Double secondary_specialist_id;
    @Column(name = "SERVICEABLE_ITEM_CLASS_ID")private Double serviceable_item_class_id;
    @Column(name = "TIME_BILLABLE_FLAG")private String time_billable_flag;
    @Column(name = "MATERIAL_BILLABLE_FLAG")private String material_billable_flag;
    @Column(name = "EXPENSE_BILLABLE_FLAG")private String expense_billable_flag;
    @Column(name = "PRORATE_SERVICE_FLAG")private String prorate_service_flag;
    @Column(name = "COVERAGE_SCHEDULE_ID")private Double coverage_schedule_id;
    @Column(name = "SERVICE_DURATION_PERIOD_CODE")private String service_duration_period_code;
    @Column(name = "SERVICE_DURATION")private Double service_duration;
    @Column(name = "WARRANTY_VENDOR_ID")private Double warranty_vendor_id;
    @Column(name = "MAX_WARRANTY_AMOUNT")private Double max_warranty_amount;
    @Column(name = "RESPONSE_TIME_PERIOD_CODE")private String response_time_period_code;
    @Column(name = "RESPONSE_TIME_VALUE")private Double response_time_value;
    @Column(name = "NEW_REVISION_CODE")private String new_revision_code;
    @Column(name = "INVOICEABLE_ITEM_FLAG")private String invoiceable_item_flag;
    @Column(name = "TAX_CODE")private String tax_code;
    @Column(name = "INVOICE_ENABLED_FLAG")private String invoice_enabled_flag;
    @Column(name = "MUST_USE_APPROVED_VENDOR_FLAG")private String must_use_approved_vendor_flag;
    @Column(name = "REQUEST_ID")private Double request_id;
    @Column(name = "PROGRAM_APPLICATION_ID")private Double program_application_id;
    @Column(name = "PROGRAM_ID")private Double program_id;
    @Column(name = "PROGRAM_UPDATE_DATE")private LocalDateTime program_update_date;
    @Column(name = "OUTSIDE_OPERATION_FLAG")private String outside_operation_flag;
    @Column(name = "OUTSIDE_OPERATION_UOM_TYPE")private String outside_operation_uom_type;
    @Column(name = "SAFETY_STOCK_BUCKET_DAYS")private Double safety_stock_bucket_days;
    @Column(name = "AUTO_REDUCE_MPS")private Double auto_reduce_mps;
    @Column(name = "COSTING_ENABLED_FLAG")private String costing_enabled_flag;
    @Column(name = "AUTO_CREATED_CONFIG_FLAG")private String auto_created_config_flag;
    @Column(name = "CYCLE_COUNT_ENABLED_FLAG")private String cycle_count_enabled_flag;
    @Column(name = "ITEM_TYPE")private String item_type;
    @Column(name = "MODEL_CONFIG_CLAUSE_NAME")private String model_config_clause_name;
    @Column(name = "SHIP_MODEL_COMPLETE_FLAG")private String ship_model_complete_flag;
    @Column(name = "MRP_PLANNING_CODE")private Double mrp_planning_code;
    @Column(name = "RETURN_INSPECTION_REQUIREMENT")private Double return_inspection_requirement;
    @Column(name = "ATO_FORECAST_CONTROL")private Double ato_forecast_control;
    @Column(name = "RELEASE_TIME_FENCE_CODE")private Double release_time_fence_code;
    @Column(name = "RELEASE_TIME_FENCE_DAYS")private Double release_time_fence_days;
    @Column(name = "CONTAINER_ITEM_FLAG")private String container_item_flag;
    @Column(name = "VEHICLE_ITEM_FLAG")private String vehicle_item_flag;
    @Column(name = "MAXIMUM_LOAD_WEIGHT")private Double maximum_load_weight;
    @Column(name = "MINIMUM_FILL_PERCENT")private Double minimum_fill_percent;
    @Column(name = "CONTAINER_TYPE_CODE")private String container_type_code;
    @Column(name = "INTERNAL_VOLUME")private Double internal_volume;
    @Column(name = "WH_UPDATE_DATE")private LocalDateTime wh_update_date;
    @Column(name = "PRODUCT_FAMILY_ITEM_ID")private Double product_family_item_id;
    @Column(name = "GLOBAL_ATTRIBUTE_CATEGORY")private String global_attribute_category;
    @Column(name = "GLOBAL_ATTRIBUTE1")private String global_attribute1;
    @Column(name = "GLOBAL_ATTRIBUTE2")private String global_attribute2;
    @Column(name = "GLOBAL_ATTRIBUTE3")private String global_attribute3;
    @Column(name = "GLOBAL_ATTRIBUTE4")private String global_attribute4;
    @Column(name = "GLOBAL_ATTRIBUTE5")private String global_attribute5;
    @Column(name = "GLOBAL_ATTRIBUTE6")private String global_attribute6;
    @Column(name = "GLOBAL_ATTRIBUTE7")private String global_attribute7;
    @Column(name = "GLOBAL_ATTRIBUTE8")private String global_attribute8;
    @Column(name = "GLOBAL_ATTRIBUTE9")private String global_attribute9;
    @Column(name = "GLOBAL_ATTRIBUTE10")private String global_attribute10;
    @Column(name = "PURCHASING_TAX_CODE")private String purchasing_tax_code;
    @Column(name = "OVERCOMPLETION_TOLERANCE_TYPE")private Double overcompletion_tolerance_type;
    @Column(name = "OVERCOMPLETION_TOLERANCE_VALUE")private Double overcompletion_tolerance_value;
    @Column(name = "EFFECTIVITY_CONTROL")private Double effectivity_control;
    @Column(name = "CHECK_SHORTAGES_FLAG")private String check_shortages_flag;
    @Column(name = "OVER_SHIPMENT_TOLERANCE")private Double over_shipment_tolerance;
    @Column(name = "UNDER_SHIPMENT_TOLERANCE")private Double under_shipment_tolerance;
    @Column(name = "OVER_RETURN_TOLERANCE")private Double over_return_tolerance;
    @Column(name = "UNDER_RETURN_TOLERANCE")private Double under_return_tolerance;
    @Column(name = "EQUIPMENT_TYPE")private Double equipment_type;
    @Column(name = "RECOVERED_PART_DISP_CODE")private String recovered_part_disp_code;
    @Column(name = "DEFECT_TRACKING_ON_FLAG")private String defect_tracking_on_flag;
    @Column(name = "USAGE_ITEM_FLAG")private String usage_item_flag;
    @Column(name = "EVENT_FLAG")private String event_flag;
    @Column(name = "ELECTRONIC_FLAG")private String electronic_flag;
    @Column(name = "DOWNLOADABLE_FLAG")private String downloadable_flag;
    @Column(name = "VOL_DISCOUNT_EXEMPT_FLAG")private String vol_discount_exempt_flag;
    @Column(name = "COUPON_EXEMPT_FLAG")private String coupon_exempt_flag;
    @Column(name = "COMMS_NL_TRACKABLE_FLAG")private String comms_nl_trackable_flag;
    @Column(name = "ASSET_CREATION_CODE")private String asset_creation_code;
    @Column(name = "COMMS_ACTIVATION_REQD_FLAG")private String comms_activation_reqd_flag;
    @Column(name = "ORDERABLE_ON_WEB_FLAG")private String orderable_on_web_flag;
    @Column(name = "BACK_ORDERABLE_FLAG")private String back_orderable_flag;
    @Column(name = "WEB_STATUS")private String web_status;
    @Column(name = "INDIVISIBLE_FLAG")private String indivisible_flag;
    @Column(name = "DIMENSION_UOM_CODE")private String dimension_uom_code;
    @Column(name = "UNIT_LENGTH")private Double unit_length;
    @Column(name = "UNIT_WIDTH")private Double unit_width;
    @Column(name = "UNIT_HEIGHT")private Double unit_height;
    @Column(name = "BULK_PICKED_FLAG")private String bulk_picked_flag;
    @Column(name = "LOT_STATUS_ENABLED")private String lot_status_enabled;
    @Column(name = "DEFAULT_LOT_STATUS_ID")private Double default_lot_status_id;
    @Column(name = "SERIAL_STATUS_ENABLED")private String serial_status_enabled;
    @Column(name = "DEFAULT_SERIAL_STATUS_ID")private Double default_serial_status_id;
    @Column(name = "LOT_SPLIT_ENABLED")private String lot_split_enabled;
    @Column(name = "LOT_MERGE_ENABLED")private String lot_merge_enabled;
    @Column(name = "INVENTORY_CARRY_PENALTY")private Double inventory_carry_penalty;
    @Column(name = "OPERATION_SLACK_PENALTY")private Double operation_slack_penalty;
    @Column(name = "FINANCING_ALLOWED_FLAG")private String financing_allowed_flag;
    @Column(name = "EAM_ITEM_TYPE")private Double eam_item_type;
    @Column(name = "EAM_ACTIVITY_TYPE_CODE")private String eam_activity_type_code;
    @Column(name = "EAM_ACTIVITY_CAUSE_CODE")private String eam_activity_cause_code;
    @Column(name = "EAM_ACT_NOTIFICATION_FLAG")private String eam_act_notification_flag;
    @Column(name = "EAM_ACT_SHUTDOWN_STATUS")private String eam_act_shutdown_status;
    @Column(name = "DUAL_UOM_CONTROL")private Double dual_uom_control;
    @Column(name = "SECONDARY_UOM_CODE")private String secondary_uom_code;
    @Column(name = "DUAL_UOM_DEVIATION_HIGH")private Double dual_uom_deviation_high;
    @Column(name = "DUAL_UOM_DEVIATION_LOW")private Double dual_uom_deviation_low;
    @Column(name = "CONTRACT_ITEM_TYPE_CODE")private String contract_item_type_code;
    @Column(name = "SUBSCRIPTION_DEPEND_FLAG")private String subscription_depend_flag;
    @Column(name = "SERV_REQ_ENABLED_CODE")private String serv_req_enabled_code;
    @Column(name = "SERV_BILLING_ENABLED_FLAG")private String serv_billing_enabled_flag;
    @Column(name = "SERV_IMPORTANCE_LEVEL")private Double serv_importance_level;
    @Column(name = "PLANNED_INV_POINT_FLAG")private String planned_inv_point_flag;
    @Column(name = "LOT_TRANSLATE_ENABLED")private String lot_translate_enabled;
    @Column(name = "DEFAULT_SO_SOURCE_TYPE")private String default_so_source_type;
    @Column(name = "CREATE_SUPPLY_FLAG")private String create_supply_flag;
    @Column(name = "SUBSTITUTION_WINDOW_CODE")private Double substitution_window_code;
    @Column(name = "SUBSTITUTION_WINDOW_DAYS")private Double substitution_window_days;
    @Column(name = "IB_ITEM_INSTANCE_CLASS")private String ib_item_instance_class;
    @Column(name = "CONFIG_MODEL_TYPE")private String config_model_type;
    @Column(name = "LOT_SUBSTITUTION_ENABLED")private String lot_substitution_enabled;
    @Column(name = "MINIMUM_LICENSE_QUANTITY")private Double minimum_license_quantity;
    @Column(name = "EAM_ACTIVITY_SOURCE_CODE")private String eam_activity_source_code;
    @Column(name = "LIFECYCLE_ID")private Double lifecycle_id;
    @Column(name = "CURRENT_PHASE_ID")private Double current_phase_id;
    @Column(name = "OBJECT_VERSION_NUMBER")private Double object_version_number;
    @Column(name = "TRACKING_QUANTITY_IND")private String tracking_quantity_ind;
    @Column(name = "ONT_PRICING_QTY_SOURCE")private String ont_pricing_qty_source;
    @Column(name = "SECONDARY_DEFAULT_IND")private String secondary_default_ind;
    @Column(name = "OPTION_SPECIFIC_SOURCED")private Double option_specific_sourced;
    @Column(name = "APPROVAL_STATUS")private String approval_status;
    @Column(name = "VMI_MINIMUM_UNITS")private Double vmi_minimum_units;
    @Column(name = "VMI_MINIMUM_DAYS")private Double vmi_minimum_days;
    @Column(name = "VMI_MAXIMUM_UNITS")private Double vmi_maximum_units;
    @Column(name = "VMI_MAXIMUM_DAYS")private Double vmi_maximum_days;
    @Column(name = "VMI_FIXED_ORDER_QUANTITY")private Double vmi_fixed_order_quantity;
    @Column(name = "SO_AUTHORIZATION_FLAG")private Double so_authorization_flag;
    @Column(name = "CONSIGNED_FLAG")private Double consigned_flag;
    @Column(name = "ASN_AUTOEXPIRE_FLAG")private Double asn_autoexpire_flag;
    @Column(name = "VMI_FORECAST_TYPE")private Double vmi_forecast_type;
    @Column(name = "FORECAST_HORIZON")private Double forecast_horizon;
    @Column(name = "EXCLUDE_FROM_BUDGET_FLAG")private Double exclude_from_budget_flag;
    @Column(name = "DAYS_TGT_INV_SUPPLY")private Double days_tgt_inv_supply;
    @Column(name = "DAYS_TGT_INV_WINDOW")private Double days_tgt_inv_window;
    @Column(name = "DAYS_MAX_INV_SUPPLY")private Double days_max_inv_supply;
    @Column(name = "DAYS_MAX_INV_WINDOW")private Double days_max_inv_window;
    @Column(name = "DRP_PLANNED_FLAG")private Double drp_planned_flag;
    @Column(name = "CRITICAL_COMPONENT_FLAG")private Double critical_component_flag;
    @Column(name = "CONTINOUS_TRANSFER")private Double continous_transfer;
    @Column(name = "CONVERGENCE")private Double convergence;
    @Column(name = "DIVERGENCE")private Double divergence;
    @Column(name = "CONFIG_ORGS")private String config_orgs;
    @Column(name = "CONFIG_MATCH")private String config_match;

}


