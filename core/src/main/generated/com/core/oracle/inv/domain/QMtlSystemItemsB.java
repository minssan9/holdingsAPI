package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMtlSystemItemsB is a Querydsl query type for MtlSystemItemsB
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMtlSystemItemsB extends EntityPathBase<MtlSystemItemsB> {

    private static final long serialVersionUID = 1947366817L;

    public static final QMtlSystemItemsB mtlSystemItemsB = new QMtlSystemItemsB("mtlSystemItemsB");

    public final NumberPath<Double> acceptable_early_days = createNumber("acceptable_early_days", Double.class);

    public final NumberPath<Double> acceptable_rate_decrease = createNumber("acceptable_rate_decrease", Double.class);

    public final NumberPath<Double> acceptable_rate_increase = createNumber("acceptable_rate_increase", Double.class);

    public final NumberPath<Double> accounting_rule_id = createNumber("accounting_rule_id", Double.class);

    public final StringPath allow_express_delivery_flag = createString("allow_express_delivery_flag");

    public final StringPath allow_item_desc_update_flag = createString("allow_item_desc_update_flag");

    public final StringPath allow_substitute_receipts_flag = createString("allow_substitute_receipts_flag");

    public final StringPath allow_unordered_receipts_flag = createString("allow_unordered_receipts_flag");

    public final NumberPath<Double> allowed_units_lookup_code = createNumber("allowed_units_lookup_code", Double.class);

    public final StringPath approval_status = createString("approval_status");

    public final NumberPath<Double> asn_autoexpire_flag = createNumber("asn_autoexpire_flag", Double.class);

    public final NumberPath<Double> asset_category_id = createNumber("asset_category_id", Double.class);

    public final StringPath asset_creation_code = createString("asset_creation_code");

    public final NumberPath<Double> ato_forecast_control = createNumber("ato_forecast_control", Double.class);

    public final StringPath atp_components_flag = createString("atp_components_flag");

    public final StringPath atp_flag = createString("atp_flag");

    public final NumberPath<Double> atp_rule_id = createNumber("atp_rule_id", Double.class);

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

    public final StringPath attribute_category = createString("attribute_category");

    public final StringPath auto_created_config_flag = createString("auto_created_config_flag");

    public final StringPath auto_lot_alpha_prefix = createString("auto_lot_alpha_prefix");

    public final NumberPath<Double> auto_reduce_mps = createNumber("auto_reduce_mps", Double.class);

    public final StringPath auto_serial_alpha_prefix = createString("auto_serial_alpha_prefix");

    public final StringPath back_orderable_flag = createString("back_orderable_flag");

    public final NumberPath<Double> base_item_id = createNumber("base_item_id", Double.class);

    public final NumberPath<Double> base_warranty_service_id = createNumber("base_warranty_service_id", Double.class);

    public final StringPath bom_enabled_flag = createString("bom_enabled_flag");

    public final NumberPath<Double> bom_item_type = createNumber("bom_item_type", Double.class);

    public final StringPath build_in_wip_flag = createString("build_in_wip_flag");

    public final StringPath bulk_picked_flag = createString("bulk_picked_flag");

    public final NumberPath<Double> buyer_id = createNumber("buyer_id", Double.class);

    public final NumberPath<Double> carrying_cost = createNumber("carrying_cost", Double.class);

    public final StringPath catalog_status_flag = createString("catalog_status_flag");

    public final StringPath check_shortages_flag = createString("check_shortages_flag");

    public final StringPath collateral_flag = createString("collateral_flag");

    public final StringPath comms_activation_reqd_flag = createString("comms_activation_reqd_flag");

    public final StringPath comms_nl_trackable_flag = createString("comms_nl_trackable_flag");

    public final StringPath config_match = createString("config_match");

    public final StringPath config_model_type = createString("config_model_type");

    public final StringPath config_orgs = createString("config_orgs");

    public final NumberPath<Double> consigned_flag = createNumber("consigned_flag", Double.class);

    public final StringPath container_item_flag = createString("container_item_flag");

    public final StringPath container_type_code = createString("container_type_code");

    public final NumberPath<Double> continous_transfer = createNumber("continous_transfer", Double.class);

    public final StringPath contract_item_type_code = createString("contract_item_type_code");

    public final NumberPath<Double> convergence = createNumber("convergence", Double.class);

    public final NumberPath<Double> cost_of_sales_account = createNumber("cost_of_sales_account", Double.class);

    public final StringPath costing_enabled_flag = createString("costing_enabled_flag");

    public final StringPath coupon_exempt_flag = createString("coupon_exempt_flag");

    public final NumberPath<Double> coverage_schedule_id = createNumber("coverage_schedule_id", Double.class);

    public final StringPath create_supply_flag = createString("create_supply_flag");

    public final NumberPath<Double> created_by = createNumber("created_by", Double.class);

    public final DateTimePath<java.time.LocalDateTime> creation_date = createDateTime("creation_date", java.time.LocalDateTime.class);

    public final NumberPath<Double> critical_component_flag = createNumber("critical_component_flag", Double.class);

    public final NumberPath<Double> cum_manufacturing_lead_time = createNumber("cum_manufacturing_lead_time", Double.class);

    public final NumberPath<Double> cumulative_total_lead_time = createNumber("cumulative_total_lead_time", Double.class);

    public final NumberPath<Double> current_phase_id = createNumber("current_phase_id", Double.class);

    public final StringPath customer_order_enabled_flag = createString("customer_order_enabled_flag");

    public final StringPath customer_order_flag = createString("customer_order_flag");

    public final StringPath cycle_count_enabled_flag = createString("cycle_count_enabled_flag");

    public final NumberPath<Double> days_early_receipt_allowed = createNumber("days_early_receipt_allowed", Double.class);

    public final NumberPath<Double> days_late_receipt_allowed = createNumber("days_late_receipt_allowed", Double.class);

    public final NumberPath<Double> days_max_inv_supply = createNumber("days_max_inv_supply", Double.class);

    public final NumberPath<Double> days_max_inv_window = createNumber("days_max_inv_window", Double.class);

    public final NumberPath<Double> days_tgt_inv_supply = createNumber("days_tgt_inv_supply", Double.class);

    public final NumberPath<Double> days_tgt_inv_window = createNumber("days_tgt_inv_window", Double.class);

    public final StringPath default_include_in_rollup_flag = createString("default_include_in_rollup_flag");

    public final NumberPath<Double> default_lot_status_id = createNumber("default_lot_status_id", Double.class);

    public final NumberPath<Double> default_serial_status_id = createNumber("default_serial_status_id", Double.class);

    public final NumberPath<Double> default_shipping_org = createNumber("default_shipping_org", Double.class);

    public final StringPath default_so_source_type = createString("default_so_source_type");

    public final StringPath defect_tracking_on_flag = createString("defect_tracking_on_flag");

    public final NumberPath<Double> demand_time_fence_code = createNumber("demand_time_fence_code", Double.class);

    public final NumberPath<Double> demand_time_fence_days = createNumber("demand_time_fence_days", Double.class);

    public final StringPath description = createString("description");

    public final StringPath dimension_uom_code = createString("dimension_uom_code");

    public final NumberPath<Double> divergence = createNumber("divergence", Double.class);

    public final StringPath downloadable_flag = createString("downloadable_flag");

    public final NumberPath<Double> drp_planned_flag = createNumber("drp_planned_flag", Double.class);

    public final NumberPath<Double> dual_uom_control = createNumber("dual_uom_control", Double.class);

    public final NumberPath<Double> dual_uom_deviation_high = createNumber("dual_uom_deviation_high", Double.class);

    public final NumberPath<Double> dual_uom_deviation_low = createNumber("dual_uom_deviation_low", Double.class);

    public final StringPath eam_act_notification_flag = createString("eam_act_notification_flag");

    public final StringPath eam_act_shutdown_status = createString("eam_act_shutdown_status");

    public final StringPath eam_activity_cause_code = createString("eam_activity_cause_code");

    public final StringPath eam_activity_source_code = createString("eam_activity_source_code");

    public final StringPath eam_activity_type_code = createString("eam_activity_type_code");

    public final NumberPath<Double> eam_item_type = createNumber("eam_item_type", Double.class);

    public final NumberPath<Double> effectivity_control = createNumber("effectivity_control", Double.class);

    public final StringPath electronic_flag = createString("electronic_flag");

    public final StringPath enabled_flag = createString("enabled_flag");

    public final NumberPath<Double> encumbrance_account = createNumber("encumbrance_account", Double.class);

    public final StringPath end_assembly_pegging_flag = createString("end_assembly_pegging_flag");

    public final DateTimePath<java.time.LocalDateTime> end_date_active = createDateTime("end_date_active", java.time.LocalDateTime.class);

    public final StringPath enforce_ship_to_location_code = createString("enforce_ship_to_location_code");

    public final StringPath eng_item_flag = createString("eng_item_flag");

    public final DateTimePath<java.time.LocalDateTime> engineering_date = createDateTime("engineering_date", java.time.LocalDateTime.class);

    public final StringPath engineering_ecn_code = createString("engineering_ecn_code");

    public final NumberPath<Double> engineering_item_id = createNumber("engineering_item_id", Double.class);

    public final NumberPath<Double> equipment_type = createNumber("equipment_type", Double.class);

    public final StringPath event_flag = createString("event_flag");

    public final NumberPath<Double> exclude_from_budget_flag = createNumber("exclude_from_budget_flag", Double.class);

    public final NumberPath<Double> expense_account = createNumber("expense_account", Double.class);

    public final StringPath expense_billable_flag = createString("expense_billable_flag");

    public final StringPath financing_allowed_flag = createString("financing_allowed_flag");

    public final NumberPath<Double> fixed_days_supply = createNumber("fixed_days_supply", Double.class);

    public final NumberPath<Double> fixed_lead_time = createNumber("fixed_lead_time", Double.class);

    public final NumberPath<Double> fixed_lot_multiplier = createNumber("fixed_lot_multiplier", Double.class);

    public final NumberPath<Double> fixed_order_quantity = createNumber("fixed_order_quantity", Double.class);

    public final NumberPath<Double> forecast_horizon = createNumber("forecast_horizon", Double.class);

    public final NumberPath<Double> full_lead_time = createNumber("full_lead_time", Double.class);

    public final StringPath global_attribute1 = createString("global_attribute1");

    public final StringPath global_attribute10 = createString("global_attribute10");

    public final StringPath global_attribute2 = createString("global_attribute2");

    public final StringPath global_attribute3 = createString("global_attribute3");

    public final StringPath global_attribute4 = createString("global_attribute4");

    public final StringPath global_attribute5 = createString("global_attribute5");

    public final StringPath global_attribute6 = createString("global_attribute6");

    public final StringPath global_attribute7 = createString("global_attribute7");

    public final StringPath global_attribute8 = createString("global_attribute8");

    public final StringPath global_attribute9 = createString("global_attribute9");

    public final StringPath global_attribute_category = createString("global_attribute_category");

    public final NumberPath<Double> hazard_class_id = createNumber("hazard_class_id", Double.class);

    public final StringPath ib_item_instance_class = createString("ib_item_instance_class");

    public final StringPath indivisible_flag = createString("indivisible_flag");

    public final StringPath inspection_required_flag = createString("inspection_required_flag");

    public final StringPath internal_order_enabled_flag = createString("internal_order_enabled_flag");

    public final StringPath internal_order_flag = createString("internal_order_flag");

    public final NumberPath<Double> internal_volume = createNumber("internal_volume", Double.class);

    public final StringPath inventory_asset_flag = createString("inventory_asset_flag");

    public final NumberPath<Double> inventory_carry_penalty = createNumber("inventory_carry_penalty", Double.class);

    public final StringPath inventory_item_flag = createString("inventory_item_flag");

    public final NumberPath<Long> inventory_item_id = createNumber("inventory_item_id", Long.class);

    public final StringPath inventory_item_status_code = createString("inventory_item_status_code");

    public final NumberPath<Double> inventory_planning_code = createNumber("inventory_planning_code", Double.class);

    public final NumberPath<Double> invoice_close_tolerance = createNumber("invoice_close_tolerance", Double.class);

    public final StringPath invoice_enabled_flag = createString("invoice_enabled_flag");

    public final StringPath invoiceable_item_flag = createString("invoiceable_item_flag");

    public final NumberPath<Double> invoicing_rule_id = createNumber("invoicing_rule_id", Double.class);

    public final NumberPath<Double> item_catalog_group_id = createNumber("item_catalog_group_id", Double.class);

    public final StringPath item_type = createString("item_type");

    public final DateTimePath<java.time.LocalDateTime> last_update_date = createDateTime("last_update_date", java.time.LocalDateTime.class);

    public final NumberPath<Double> last_update_login = createNumber("last_update_login", Double.class);

    public final NumberPath<Double> last_updated_by = createNumber("last_updated_by", Double.class);

    public final NumberPath<Double> lead_time_lot_size = createNumber("lead_time_lot_size", Double.class);

    public final NumberPath<Double> lifecycle_id = createNumber("lifecycle_id", Double.class);

    public final NumberPath<Double> list_price_per_unit = createNumber("list_price_per_unit", Double.class);

    public final NumberPath<Double> location_control_code = createNumber("location_control_code", Double.class);

    public final NumberPath<Double> lot_control_code = createNumber("lot_control_code", Double.class);

    public final StringPath lot_merge_enabled = createString("lot_merge_enabled");

    public final StringPath lot_split_enabled = createString("lot_split_enabled");

    public final StringPath lot_status_enabled = createString("lot_status_enabled");

    public final StringPath lot_substitution_enabled = createString("lot_substitution_enabled");

    public final StringPath lot_translate_enabled = createString("lot_translate_enabled");

    public final NumberPath<Double> market_price = createNumber("market_price", Double.class);

    public final StringPath material_billable_flag = createString("material_billable_flag");

    public final NumberPath<Double> max_minmax_quantity = createNumber("max_minmax_quantity", Double.class);

    public final NumberPath<Double> max_warranty_amount = createNumber("max_warranty_amount", Double.class);

    public final NumberPath<Double> maximum_load_weight = createNumber("maximum_load_weight", Double.class);

    public final NumberPath<Double> maximum_order_quantity = createNumber("maximum_order_quantity", Double.class);

    public final NumberPath<Double> min_minmax_quantity = createNumber("min_minmax_quantity", Double.class);

    public final NumberPath<Double> minimum_fill_percent = createNumber("minimum_fill_percent", Double.class);

    public final NumberPath<Double> minimum_license_quantity = createNumber("minimum_license_quantity", Double.class);

    public final NumberPath<Double> minimum_order_quantity = createNumber("minimum_order_quantity", Double.class);

    public final StringPath model_config_clause_name = createString("model_config_clause_name");

    public final StringPath mrp_calculate_atp_flag = createString("mrp_calculate_atp_flag");

    public final NumberPath<Double> mrp_planning_code = createNumber("mrp_planning_code", Double.class);

    public final NumberPath<Double> mrp_safety_stock_code = createNumber("mrp_safety_stock_code", Double.class);

    public final NumberPath<Double> mrp_safety_stock_percent = createNumber("mrp_safety_stock_percent", Double.class);

    public final StringPath mtl_transactions_enabled_flag = createString("mtl_transactions_enabled_flag");

    public final StringPath must_use_approved_vendor_flag = createString("must_use_approved_vendor_flag");

    public final NumberPath<Double> negative_measurement_error = createNumber("negative_measurement_error", Double.class);

    public final StringPath new_revision_code = createString("new_revision_code");

    public final NumberPath<Double> object_version_number = createNumber("object_version_number", Double.class);

    public final StringPath ont_pricing_qty_source = createString("ont_pricing_qty_source");

    public final NumberPath<Double> operation_slack_penalty = createNumber("operation_slack_penalty", Double.class);

    public final NumberPath<Double> option_specific_sourced = createNumber("option_specific_sourced", Double.class);

    public final NumberPath<Double> order_cost = createNumber("order_cost", Double.class);

    public final StringPath orderable_on_web_flag = createString("orderable_on_web_flag");

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final StringPath outside_operation_flag = createString("outside_operation_flag");

    public final StringPath outside_operation_uom_type = createString("outside_operation_uom_type");

    public final NumberPath<Double> over_return_tolerance = createNumber("over_return_tolerance", Double.class);

    public final NumberPath<Double> over_shipment_tolerance = createNumber("over_shipment_tolerance", Double.class);

    public final NumberPath<Double> overcompletion_tolerance_type = createNumber("overcompletion_tolerance_type", Double.class);

    public final NumberPath<Double> overcompletion_tolerance_value = createNumber("overcompletion_tolerance_value", Double.class);

    public final NumberPath<Double> overrun_percentage = createNumber("overrun_percentage", Double.class);

    public final NumberPath<Double> payment_terms_id = createNumber("payment_terms_id", Double.class);

    public final StringPath pick_components_flag = createString("pick_components_flag");

    public final NumberPath<Double> picking_rule_id = createNumber("picking_rule_id", Double.class);

    public final StringPath planned_inv_point_flag = createString("planned_inv_point_flag");

    public final StringPath planner_code = createString("planner_code");

    public final StringPath planning_exception_set = createString("planning_exception_set");

    public final NumberPath<Double> planning_make_buy_code = createNumber("planning_make_buy_code", Double.class);

    public final NumberPath<Double> planning_time_fence_code = createNumber("planning_time_fence_code", Double.class);

    public final NumberPath<Double> planning_time_fence_days = createNumber("planning_time_fence_days", Double.class);

    public final NumberPath<Double> positive_measurement_error = createNumber("positive_measurement_error", Double.class);

    public final NumberPath<Double> postprocessing_lead_time = createNumber("postprocessing_lead_time", Double.class);

    public final NumberPath<Double> preprocessing_lead_time = createNumber("preprocessing_lead_time", Double.class);

    public final StringPath preventive_maintenance_flag = createString("preventive_maintenance_flag");

    public final NumberPath<Double> price_tolerance_percent = createNumber("price_tolerance_percent", Double.class);

    public final NumberPath<Double> primary_specialist_id = createNumber("primary_specialist_id", Double.class);

    public final StringPath primary_unit_of_measure = createString("primary_unit_of_measure");

    public final StringPath primary_uom_code = createString("primary_uom_code");

    public final NumberPath<Double> product_family_item_id = createNumber("product_family_item_id", Double.class);

    public final NumberPath<Double> program_application_id = createNumber("program_application_id", Double.class);

    public final NumberPath<Double> program_id = createNumber("program_id", Double.class);

    public final DateTimePath<java.time.LocalDateTime> program_update_date = createDateTime("program_update_date", java.time.LocalDateTime.class);

    public final StringPath prorate_service_flag = createString("prorate_service_flag");

    public final StringPath purchasing_enabled_flag = createString("purchasing_enabled_flag");

    public final StringPath purchasing_item_flag = createString("purchasing_item_flag");

    public final StringPath purchasing_tax_code = createString("purchasing_tax_code");

    public final StringPath qty_rcv_exception_code = createString("qty_rcv_exception_code");

    public final NumberPath<Double> qty_rcv_tolerance = createNumber("qty_rcv_tolerance", Double.class);

    public final StringPath receipt_days_exception_code = createString("receipt_days_exception_code");

    public final StringPath receipt_required_flag = createString("receipt_required_flag");

    public final NumberPath<Double> receive_close_tolerance = createNumber("receive_close_tolerance", Double.class);

    public final NumberPath<Double> receiving_routing_id = createNumber("receiving_routing_id", Double.class);

    public final StringPath recovered_part_disp_code = createString("recovered_part_disp_code");

    public final NumberPath<Double> release_time_fence_code = createNumber("release_time_fence_code", Double.class);

    public final NumberPath<Double> release_time_fence_days = createNumber("release_time_fence_days", Double.class);

    public final StringPath repetitive_planning_flag = createString("repetitive_planning_flag");

    public final StringPath replenish_to_order_flag = createString("replenish_to_order_flag");

    public final NumberPath<Double> request_id = createNumber("request_id", Double.class);

    public final NumberPath<Double> reservable_type = createNumber("reservable_type", Double.class);

    public final StringPath response_time_period_code = createString("response_time_period_code");

    public final NumberPath<Double> response_time_value = createNumber("response_time_value", Double.class);

    public final NumberPath<Double> restrict_locators_code = createNumber("restrict_locators_code", Double.class);

    public final NumberPath<Double> restrict_subinventories_code = createNumber("restrict_subinventories_code", Double.class);

    public final NumberPath<Double> return_inspection_requirement = createNumber("return_inspection_requirement", Double.class);

    public final StringPath returnable_flag = createString("returnable_flag");

    public final NumberPath<Double> revision_qty_control_code = createNumber("revision_qty_control_code", Double.class);

    public final StringPath rfq_required_flag = createString("rfq_required_flag");

    public final NumberPath<Double> rounding_control_type = createNumber("rounding_control_type", Double.class);

    public final NumberPath<Double> rounding_factor = createNumber("rounding_factor", Double.class);

    public final NumberPath<Double> safety_stock_bucket_days = createNumber("safety_stock_bucket_days", Double.class);

    public final NumberPath<Double> sales_account = createNumber("sales_account", Double.class);

    public final StringPath secondary_default_ind = createString("secondary_default_ind");

    public final NumberPath<Double> secondary_specialist_id = createNumber("secondary_specialist_id", Double.class);

    public final StringPath secondary_uom_code = createString("secondary_uom_code");

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

    public final NumberPath<Double> serial_number_control_code = createNumber("serial_number_control_code", Double.class);

    public final StringPath serial_status_enabled = createString("serial_status_enabled");

    public final StringPath serv_billing_enabled_flag = createString("serv_billing_enabled_flag");

    public final NumberPath<Double> serv_importance_level = createNumber("serv_importance_level", Double.class);

    public final StringPath serv_req_enabled_code = createString("serv_req_enabled_code");

    public final NumberPath<Double> service_duration = createNumber("service_duration", Double.class);

    public final StringPath service_duration_period_code = createString("service_duration_period_code");

    public final StringPath service_item_flag = createString("service_item_flag");

    public final NumberPath<Double> service_starting_delay = createNumber("service_starting_delay", Double.class);

    public final StringPath serviceable_component_flag = createString("serviceable_component_flag");

    public final NumberPath<Double> serviceable_item_class_id = createNumber("serviceable_item_class_id", Double.class);

    public final StringPath serviceable_product_flag = createString("serviceable_product_flag");

    public final NumberPath<Double> shelf_life_code = createNumber("shelf_life_code", Double.class);

    public final NumberPath<Double> shelf_life_days = createNumber("shelf_life_days", Double.class);

    public final StringPath ship_model_complete_flag = createString("ship_model_complete_flag");

    public final StringPath shippable_item_flag = createString("shippable_item_flag");

    public final NumberPath<Double> shrinkage_rate = createNumber("shrinkage_rate", Double.class);

    public final NumberPath<Double> so_authorization_flag = createNumber("so_authorization_flag", Double.class);

    public final StringPath so_transactions_flag = createString("so_transactions_flag");

    public final NumberPath<Double> source_organization_id = createNumber("source_organization_id", Double.class);

    public final StringPath source_subinventory = createString("source_subinventory");

    public final NumberPath<Double> source_type = createNumber("source_type", Double.class);

    public final StringPath start_auto_lot_number = createString("start_auto_lot_number");

    public final StringPath start_auto_serial_number = createString("start_auto_serial_number");

    public final DateTimePath<java.time.LocalDateTime> start_date_active = createDateTime("start_date_active", java.time.LocalDateTime.class);

    public final NumberPath<Double> std_lot_size = createNumber("std_lot_size", Double.class);

    public final StringPath stock_enabled_flag = createString("stock_enabled_flag");

    public final StringPath subscription_depend_flag = createString("subscription_depend_flag");

    public final NumberPath<Double> substitution_window_code = createNumber("substitution_window_code", Double.class);

    public final NumberPath<Double> substitution_window_days = createNumber("substitution_window_days", Double.class);

    public final StringPath summary_flag = createString("summary_flag");

    public final StringPath tax_code = createString("tax_code");

    public final StringPath taxable_flag = createString("taxable_flag");

    public final StringPath time_billable_flag = createString("time_billable_flag");

    public final StringPath tracking_quantity_ind = createString("tracking_quantity_ind");

    public final NumberPath<Double> un_number_id = createNumber("un_number_id", Double.class);

    public final NumberPath<Double> under_return_tolerance = createNumber("under_return_tolerance", Double.class);

    public final NumberPath<Double> under_shipment_tolerance = createNumber("under_shipment_tolerance", Double.class);

    public final NumberPath<Double> unit_height = createNumber("unit_height", Double.class);

    public final NumberPath<Double> unit_length = createNumber("unit_length", Double.class);

    public final StringPath unit_of_issue = createString("unit_of_issue");

    public final NumberPath<Double> unit_volume = createNumber("unit_volume", Double.class);

    public final NumberPath<Double> unit_weight = createNumber("unit_weight", Double.class);

    public final NumberPath<Double> unit_width = createNumber("unit_width", Double.class);

    public final StringPath usage_item_flag = createString("usage_item_flag");

    public final NumberPath<Double> variable_lead_time = createNumber("variable_lead_time", Double.class);

    public final StringPath vehicle_item_flag = createString("vehicle_item_flag");

    public final StringPath vendor_warranty_flag = createString("vendor_warranty_flag");

    public final NumberPath<Double> vmi_fixed_order_quantity = createNumber("vmi_fixed_order_quantity", Double.class);

    public final NumberPath<Double> vmi_forecast_type = createNumber("vmi_forecast_type", Double.class);

    public final NumberPath<Double> vmi_maximum_days = createNumber("vmi_maximum_days", Double.class);

    public final NumberPath<Double> vmi_maximum_units = createNumber("vmi_maximum_units", Double.class);

    public final NumberPath<Double> vmi_minimum_days = createNumber("vmi_minimum_days", Double.class);

    public final NumberPath<Double> vmi_minimum_units = createNumber("vmi_minimum_units", Double.class);

    public final StringPath vol_discount_exempt_flag = createString("vol_discount_exempt_flag");

    public final StringPath volume_uom_code = createString("volume_uom_code");

    public final NumberPath<Double> warranty_vendor_id = createNumber("warranty_vendor_id", Double.class);

    public final StringPath web_status = createString("web_status");

    public final StringPath weight_uom_code = createString("weight_uom_code");

    public final DateTimePath<java.time.LocalDateTime> wh_update_date = createDateTime("wh_update_date", java.time.LocalDateTime.class);

    public final NumberPath<Double> wip_supply_locator_id = createNumber("wip_supply_locator_id", Double.class);

    public final StringPath wip_supply_subinventory = createString("wip_supply_subinventory");

    public final NumberPath<Double> wip_supply_type = createNumber("wip_supply_type", Double.class);

    public QMtlSystemItemsB(String variable) {
        super(MtlSystemItemsB.class, forVariable(variable));
    }

    public QMtlSystemItemsB(Path<? extends MtlSystemItemsB> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMtlSystemItemsB(PathMetadata metadata) {
        super(MtlSystemItemsB.class, metadata);
    }

}

