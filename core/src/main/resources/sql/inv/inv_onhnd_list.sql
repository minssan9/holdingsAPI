select ORGANIZATION_ID, ORGANIZATION_CODE, SUBINVENTORY_CODE, LOCATOR_ID, LOCATOR, INVENTORY_ITEM_ID, ITEM_DESCRIPTION, ITEM, REVISION, UOM, sum(ON_HAND) onhnd, sum(UNPACKED) unpacked, PACKED, COST_GROUP_ID, LPN_ID, LPN, LOT_NUMBER, SERIAL_NUMBER, UNIT_NUMBER, PROJECT_ID, TASK_ID, SUBINVENTORY_STATUS_ID, LOCATOR_STATUS_ID, LOT_STATUS_ID, SERIAL_STATUS_ID, CONTAINERIZED_FLAG, STATUS_LEVEL, PLANNING_TP_TYPE, PLANNING_ORGANIZATION_ID, OWNING_TP_TYPE, OWNING_ORGANIZATION_ID, ITEM_LOT_CONTROL, ITEM_SERIAL_CONTROL
from MTL_ONHAND_TOTAL_V
where organization_id= :조직 and ITEM in ( ::품번)
group by ORGANIZATION_ID, ORGANIZATION_CODE, SUBINVENTORY_CODE, LOCATOR_ID, LOCATOR, INVENTORY_ITEM_ID, ITEM_DESCRIPTION, ITEM, REVISION, UOM, PACKED, COST_GROUP_ID, LPN_ID, LPN, LOT_NUMBER, SERIAL_NUMBER, UNIT_NUMBER, PROJECT_ID, TASK_ID, SUBINVENTORY_STATUS_ID, LOCATOR_STATUS_ID, LOT_STATUS_ID, SERIAL_STATUS_ID, CONTAINERIZED_FLAG, STATUS_LEVEL, PLANNING_TP_TYPE, PLANNING_ORGANIZATION_ID, OWNING_TP_TYPE, OWNING_ORGANIZATION_ID, ITEM_LOT_CONTROL, ITEM_SERIAL_CONTROL
-- 출처 민상훈 프로 2021. 02. 22