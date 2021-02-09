package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMtlTransactionsInterface is a Querydsl query type for MtlTransactionsInterface
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMtlTransactionsInterface extends EntityPathBase<MtlTransactionsInterface> {

    private static final long serialVersionUID = 134340436L;

    public static final QMtlTransactionsInterface mtlTransactionsInterface = new QMtlTransactionsInterface("mtlTransactionsInterface");

    public final StringPath accountingClass = createString("accountingClass");

    public final NumberPath<Long> acctPeriodId = createNumber("acctPeriodId", Long.class);

    public final StringPath alternateBomDesignator = createString("alternateBomDesignator");

    public final StringPath alternateRoutingDesignator = createString("alternateRoutingDesignator");

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

    public final StringPath bomRevision = createString("bomRevision");

    public final TimePath<java.sql.Time> bomRevisionDate = createTime("bomRevisionDate", java.sql.Time.class);

    public final NumberPath<Long> buildSequence = createNumber("buildSequence", Long.class);

    public final NumberPath<Long> completionTransactionId = createNumber("completionTransactionId", Long.class);

    public final NumberPath<Long> containers = createNumber("containers", Long.class);

    public final NumberPath<Long> contentLpnId = createNumber("contentLpnId", Long.class);

    public final NumberPath<Long> costGroupId = createNumber("costGroupId", Long.class);

    public final NumberPath<Long> costTypeId = createNumber("costTypeId", Long.class);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final TimePath<java.sql.Time> creationDate = createTime("creationDate", java.sql.Time.class);

    public final StringPath currencyCode = createString("currencyCode");

    public final TimePath<java.sql.Time> currencyConversionDate = createTime("currencyConversionDate", java.sql.Time.class);

    public final NumberPath<Long> currencyConversionRate = createNumber("currencyConversionRate", Long.class);

    public final StringPath currencyConversionType = createString("currencyConversionType");

    public final NumberPath<Long> customerShipId = createNumber("customerShipId", Long.class);

    public final StringPath demandClass = createString("demandClass");

    public final NumberPath<Long> demandId = createNumber("demandId", Long.class);

    public final StringPath demandSourceDelivery = createString("demandSourceDelivery");

    public final NumberPath<Long> demandSourceHeaderId = createNumber("demandSourceHeaderId", Long.class);

    public final StringPath demandSourceLine = createString("demandSourceLine");

    public final NumberPath<Long> departmentId = createNumber("departmentId", Long.class);

    public final NumberPath<Long> distributionAccountId = createNumber("distributionAccountId", Long.class);

    public final StringPath dspSegment1 = createString("dspSegment1");

    public final StringPath dspSegment10 = createString("dspSegment10");

    public final StringPath dspSegment11 = createString("dspSegment11");

    public final StringPath dspSegment12 = createString("dspSegment12");

    public final StringPath dspSegment13 = createString("dspSegment13");

    public final StringPath dspSegment14 = createString("dspSegment14");

    public final StringPath dspSegment15 = createString("dspSegment15");

    public final StringPath dspSegment16 = createString("dspSegment16");

    public final StringPath dspSegment17 = createString("dspSegment17");

    public final StringPath dspSegment18 = createString("dspSegment18");

    public final StringPath dspSegment19 = createString("dspSegment19");

    public final StringPath dspSegment2 = createString("dspSegment2");

    public final StringPath dspSegment20 = createString("dspSegment20");

    public final StringPath dspSegment21 = createString("dspSegment21");

    public final StringPath dspSegment22 = createString("dspSegment22");

    public final StringPath dspSegment23 = createString("dspSegment23");

    public final StringPath dspSegment24 = createString("dspSegment24");

    public final StringPath dspSegment25 = createString("dspSegment25");

    public final StringPath dspSegment26 = createString("dspSegment26");

    public final StringPath dspSegment27 = createString("dspSegment27");

    public final StringPath dspSegment28 = createString("dspSegment28");

    public final StringPath dspSegment29 = createString("dspSegment29");

    public final StringPath dspSegment3 = createString("dspSegment3");

    public final StringPath dspSegment30 = createString("dspSegment30");

    public final StringPath dspSegment4 = createString("dspSegment4");

    public final StringPath dspSegment5 = createString("dspSegment5");

    public final StringPath dspSegment6 = createString("dspSegment6");

    public final StringPath dspSegment7 = createString("dspSegment7");

    public final StringPath dspSegment8 = createString("dspSegment8");

    public final StringPath dspSegment9 = createString("dspSegment9");

    public final StringPath dstSegment1 = createString("dstSegment1");

    public final StringPath dstSegment10 = createString("dstSegment10");

    public final StringPath dstSegment11 = createString("dstSegment11");

    public final StringPath dstSegment12 = createString("dstSegment12");

    public final StringPath dstSegment13 = createString("dstSegment13");

    public final StringPath dstSegment14 = createString("dstSegment14");

    public final StringPath dstSegment15 = createString("dstSegment15");

    public final StringPath dstSegment16 = createString("dstSegment16");

    public final StringPath dstSegment17 = createString("dstSegment17");

    public final StringPath dstSegment18 = createString("dstSegment18");

    public final StringPath dstSegment19 = createString("dstSegment19");

    public final StringPath dstSegment2 = createString("dstSegment2");

    public final StringPath dstSegment20 = createString("dstSegment20");

    public final StringPath dstSegment21 = createString("dstSegment21");

    public final StringPath dstSegment22 = createString("dstSegment22");

    public final StringPath dstSegment23 = createString("dstSegment23");

    public final StringPath dstSegment24 = createString("dstSegment24");

    public final StringPath dstSegment25 = createString("dstSegment25");

    public final StringPath dstSegment26 = createString("dstSegment26");

    public final StringPath dstSegment27 = createString("dstSegment27");

    public final StringPath dstSegment28 = createString("dstSegment28");

    public final StringPath dstSegment29 = createString("dstSegment29");

    public final StringPath dstSegment3 = createString("dstSegment3");

    public final StringPath dstSegment30 = createString("dstSegment30");

    public final StringPath dstSegment4 = createString("dstSegment4");

    public final StringPath dstSegment5 = createString("dstSegment5");

    public final StringPath dstSegment6 = createString("dstSegment6");

    public final StringPath dstSegment7 = createString("dstSegment7");

    public final StringPath dstSegment8 = createString("dstSegment8");

    public final StringPath dstSegment9 = createString("dstSegment9");

    public final StringPath employeeCode = createString("employeeCode");

    public final NumberPath<Long> encumbranceAccount = createNumber("encumbranceAccount", Long.class);

    public final NumberPath<Long> encumbranceAmount = createNumber("encumbranceAmount", Long.class);

    public final StringPath endItemUnitNumber = createString("endItemUnitNumber");

    public final StringPath errorCode = createString("errorCode");

    public final StringPath errorExplanation = createString("errorExplanation");

    public final TimePath<java.sql.Time> expectedArrivalDate = createTime("expectedArrivalDate", java.sql.Time.class);

    public final StringPath expenditureType = createString("expenditureType");

    public final StringPath finalCompletionFlag = createString("finalCompletionFlag");

    public final StringPath flowSchedule = createString("flowSchedule");

    public final StringPath freightCode = createString("freightCode");

    public final StringPath inventoryItem = createString("inventoryItem");

    public final NumberPath<Long> inventoryItemId = createNumber("inventoryItemId", Long.class);

    public final StringPath itemSegment1 = createString("itemSegment1");

    public final StringPath itemSegment10 = createString("itemSegment10");

    public final StringPath itemSegment11 = createString("itemSegment11");

    public final StringPath itemSegment12 = createString("itemSegment12");

    public final StringPath itemSegment13 = createString("itemSegment13");

    public final StringPath itemSegment14 = createString("itemSegment14");

    public final StringPath itemSegment15 = createString("itemSegment15");

    public final StringPath itemSegment16 = createString("itemSegment16");

    public final StringPath itemSegment17 = createString("itemSegment17");

    public final StringPath itemSegment18 = createString("itemSegment18");

    public final StringPath itemSegment19 = createString("itemSegment19");

    public final StringPath itemSegment2 = createString("itemSegment2");

    public final StringPath itemSegment20 = createString("itemSegment20");

    public final StringPath itemSegment3 = createString("itemSegment3");

    public final StringPath itemSegment4 = createString("itemSegment4");

    public final StringPath itemSegment5 = createString("itemSegment5");

    public final StringPath itemSegment6 = createString("itemSegment6");

    public final StringPath itemSegment7 = createString("itemSegment7");

    public final StringPath itemSegment8 = createString("itemSegment8");

    public final StringPath itemSegment9 = createString("itemSegment9");

    public final NumberPath<Long> kanbanCardId = createNumber("kanbanCardId", Long.class);

    public final TimePath<java.sql.Time> lastUpdateDate = createTime("lastUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> lastUpdatedBy = createNumber("lastUpdatedBy", Long.class);

    public final NumberPath<Long> lastUpdateLogin = createNumber("lastUpdateLogin", Long.class);

    public final NumberPath<Long> lineItemNum = createNumber("lineItemNum", Long.class);

    public final NumberPath<Long> locatorId = createNumber("locatorId", Long.class);

    public final StringPath locatorName = createString("locatorName");

    public final BooleanPath lockFlag = createBoolean("lockFlag");

    public final StringPath locSegment1 = createString("locSegment1");

    public final StringPath locSegment10 = createString("locSegment10");

    public final StringPath locSegment11 = createString("locSegment11");

    public final StringPath locSegment12 = createString("locSegment12");

    public final StringPath locSegment13 = createString("locSegment13");

    public final StringPath locSegment14 = createString("locSegment14");

    public final StringPath locSegment15 = createString("locSegment15");

    public final StringPath locSegment16 = createString("locSegment16");

    public final StringPath locSegment17 = createString("locSegment17");

    public final StringPath locSegment18 = createString("locSegment18");

    public final StringPath locSegment19 = createString("locSegment19");

    public final StringPath locSegment2 = createString("locSegment2");

    public final StringPath locSegment20 = createString("locSegment20");

    public final StringPath locSegment3 = createString("locSegment3");

    public final StringPath locSegment4 = createString("locSegment4");

    public final StringPath locSegment5 = createString("locSegment5");

    public final StringPath locSegment6 = createString("locSegment6");

    public final StringPath locSegment7 = createString("locSegment7");

    public final StringPath locSegment8 = createString("locSegment8");

    public final StringPath locSegment9 = createString("locSegment9");

    public final NumberPath<Long> lpnId = createNumber("lpnId", Long.class);

    public final NumberPath<Long> materialAccount = createNumber("materialAccount", Long.class);

    public final NumberPath<Long> materialOverheadAccount = createNumber("materialOverheadAccount", Long.class);

    public final NumberPath<Long> movementId = createNumber("movementId", Long.class);

    public final NumberPath<Long> moveTransactionId = createNumber("moveTransactionId", Long.class);

    public final NumberPath<Long> mrpCode = createNumber("mrpCode", Long.class);

    public final NumberPath<Long> negativeReqFlag = createNumber("negativeReqFlag", Long.class);

    public final NumberPath<Long> newAverageCost = createNumber("newAverageCost", Long.class);

    public final NumberPath<Long> operationSeqNum = createNumber("operationSeqNum", Long.class);

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final NumberPath<Long> organizationType = createNumber("organizationType", Long.class);

    public final NumberPath<Long> orgCostGroupId = createNumber("orgCostGroupId", Long.class);

    public final NumberPath<Long> outsideProcessingAccount = createNumber("outsideProcessingAccount", Long.class);

    public final NumberPath<Long> overcompletionPrimaryQty = createNumber("overcompletionPrimaryQty", Long.class);

    public final NumberPath<Long> overcompletionTransactionId = createNumber("overcompletionTransactionId", Long.class);

    public final NumberPath<Long> overcompletionTransactionQty = createNumber("overcompletionTransactionQty", Long.class);

    public final NumberPath<Long> overheadAccount = createNumber("overheadAccount", Long.class);

    public final NumberPath<Long> owningOrganizationId = createNumber("owningOrganizationId", Long.class);

    public final NumberPath<Long> owningTpType = createNumber("owningTpType", Long.class);

    public final NumberPath<Long> paExpenditureOrgId = createNumber("paExpenditureOrgId", Long.class);

    public final NumberPath<Long> parentId = createNumber("parentId", Long.class);

    public final NumberPath<Long> percentageChange = createNumber("percentageChange", Long.class);

    public final NumberPath<Long> pickingLineId = createNumber("pickingLineId", Long.class);

    public final NumberPath<Long> planningOrganizationId = createNumber("planningOrganizationId", Long.class);

    public final NumberPath<Long> planningTpType = createNumber("planningTpType", Long.class);

    public final NumberPath<Long> primaryQuantity = createNumber("primaryQuantity", Long.class);

    public final NumberPath<Long> primarySwitch = createNumber("primarySwitch", Long.class);

    public final BooleanPath processFlag = createBoolean("processFlag");

    public final NumberPath<Long> programApplicationId = createNumber("programApplicationId", Long.class);

    public final NumberPath<Long> programId = createNumber("programId", Long.class);

    public final TimePath<java.sql.Time> programUpdateDate = createTime("programUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> projectId = createNumber("projectId", Long.class);

    public final NumberPath<Long> qaCollectionId = createNumber("qaCollectionId", Long.class);

    public final NumberPath<Long> rcvTransactionId = createNumber("rcvTransactionId", Long.class);

    public final NumberPath<Long> reasonId = createNumber("reasonId", Long.class);

    public final NumberPath<Long> rebuildActivityId = createNumber("rebuildActivityId", Long.class);

    public final NumberPath<Long> rebuildItemId = createNumber("rebuildItemId", Long.class);

    public final StringPath rebuildJobName = createString("rebuildJobName");

    public final StringPath rebuildSerialNumber = createString("rebuildSerialNumber");

    public final StringPath receivingDocument = createString("receivingDocument");

    public final NumberPath<Long> repetitiveLineId = createNumber("repetitiveLineId", Long.class);

    public final StringPath representativeLotNumber = createString("representativeLotNumber");

    public final NumberPath<Long> requestId = createNumber("requestId", Long.class);

    public final StringPath requiredFlag = createString("requiredFlag");

    public final NumberPath<Long> requisitionDistributionId = createNumber("requisitionDistributionId", Long.class);

    public final NumberPath<Long> requisitionLineId = createNumber("requisitionLineId", Long.class);

    public final NumberPath<Long> reservationQuantity = createNumber("reservationQuantity", Long.class);

    public final NumberPath<Long> resourceAccount = createNumber("resourceAccount", Long.class);

    public final StringPath revision = createString("revision");

    public final StringPath routingRevision = createString("routingRevision");

    public final TimePath<java.sql.Time> routingRevisionDate = createTime("routingRevisionDate", java.sql.Time.class);

    public final NumberPath<Long> scheduledFlag = createNumber("scheduledFlag", Long.class);

    public final TimePath<java.sql.Time> scheduledPaybackDate = createTime("scheduledPaybackDate", java.sql.Time.class);

    public final NumberPath<Long> scheduleGroup = createNumber("scheduleGroup", Long.class);

    public final NumberPath<Long> scheduleId = createNumber("scheduleId", Long.class);

    public final StringPath scheduleNumber = createString("scheduleNumber");

    public final NumberPath<Long> scheduleUpdateCode = createNumber("scheduleUpdateCode", Long.class);

    public final NumberPath<Long> secondaryTransactionQuantity = createNumber("secondaryTransactionQuantity", Long.class);

    public final StringPath secondaryUomCode = createString("secondaryUomCode");

    public final NumberPath<Long> setupTeardownCode = createNumber("setupTeardownCode", Long.class);

    public final StringPath shipmentNumber = createString("shipmentNumber");

    public final StringPath shippableFlag = createString("shippableFlag");

    public final NumberPath<Long> shippedQuantity = createNumber("shippedQuantity", Long.class);

    public final NumberPath<Long> shipToLocationId = createNumber("shipToLocationId", Long.class);

    public final StringPath sourceCode = createString("sourceCode");

    public final NumberPath<Long> sourceHeaderId = createNumber("sourceHeaderId", Long.class);

    public final NumberPath<Long> sourceLineId = createNumber("sourceLineId", Long.class);

    public final StringPath sourceLotNumber = createString("sourceLotNumber");

    public final NumberPath<Long> sourceProjectId = createNumber("sourceProjectId", Long.class);

    public final NumberPath<Long> sourceTaskId = createNumber("sourceTaskId", Long.class);

    public final StringPath subinventoryCode = createString("subinventoryCode");

    public final NumberPath<Long> substitutionItemId = createNumber("substitutionItemId", Long.class);

    public final NumberPath<Long> substitutionTypeId = createNumber("substitutionTypeId", Long.class);

    public final NumberPath<Long> taskId = createNumber("taskId", Long.class);

    public final NumberPath<Long> toProjectId = createNumber("toProjectId", Long.class);

    public final NumberPath<Long> toTaskId = createNumber("toTaskId", Long.class);

    public final NumberPath<Long> transactionActionId = createNumber("transactionActionId", Long.class);

    public final NumberPath<Long> transactionBatchId = createNumber("transactionBatchId", Long.class);

    public final NumberPath<Long> transactionBatchSeq = createNumber("transactionBatchSeq", Long.class);

    public final NumberPath<Long> transactionCost = createNumber("transactionCost", Long.class);

    public final TimePath<java.sql.Time> transactionDate = createTime("transactionDate", java.sql.Time.class);

    public final NumberPath<Long> transactionGroupId = createNumber("transactionGroupId", Long.class);

    public final NumberPath<Long> transactionGroupSeq = createNumber("transactionGroupSeq", Long.class);

    public final NumberPath<Long> transactionHeaderId = createNumber("transactionHeaderId", Long.class);

    public final NumberPath<Long> transactionInterfaceId = createNumber("transactionInterfaceId", Long.class);

    public final NumberPath<Long> transactionMode = createNumber("transactionMode", Long.class);

    public final NumberPath<Long> transactionQuantity = createNumber("transactionQuantity", Long.class);

    public final StringPath transactionReference = createString("transactionReference");

    public final NumberPath<Long> transactionSequenceId = createNumber("transactionSequenceId", Long.class);

    public final NumberPath<Long> transactionSourceId = createNumber("transactionSourceId", Long.class);

    public final StringPath transactionSourceName = createString("transactionSourceName");

    public final NumberPath<Long> transactionSourceTypeId = createNumber("transactionSourceTypeId", Long.class);

    public final NumberPath<Long> transactionTypeId = createNumber("transactionTypeId", Long.class);

    public final StringPath transactionUom = createString("transactionUom");

    public final NumberPath<Long> transferCost = createNumber("transferCost", Long.class);

    public final NumberPath<Long> transferCostGroupId = createNumber("transferCostGroupId", Long.class);

    public final NumberPath<Long> transferLocator = createNumber("transferLocator", Long.class);

    public final NumberPath<Long> transferLpnId = createNumber("transferLpnId", Long.class);

    public final NumberPath<Long> transferOrganization = createNumber("transferOrganization", Long.class);

    public final NumberPath<Long> transferOrganizationType = createNumber("transferOrganizationType", Long.class);

    public final NumberPath<Long> transferOwningTpType = createNumber("transferOwningTpType", Long.class);

    public final NumberPath<Long> transferPercentage = createNumber("transferPercentage", Long.class);

    public final NumberPath<Long> transferPlanningTpType = createNumber("transferPlanningTpType", Long.class);

    public final StringPath transferSubinventory = createString("transferSubinventory");

    public final NumberPath<Long> transportationAccount = createNumber("transportationAccount", Long.class);

    public final NumberPath<Long> transportationCost = createNumber("transportationCost", Long.class);

    public final NumberPath<Long> trxSourceDeliveryId = createNumber("trxSourceDeliveryId", Long.class);

    public final NumberPath<Long> trxSourceLineId = createNumber("trxSourceLineId", Long.class);

    public final StringPath ussglTransactionCode = createString("ussglTransactionCode");

    public final NumberPath<Long> validationRequired = createNumber("validationRequired", Long.class);

    public final NumberPath<Long> valueChange = createNumber("valueChange", Long.class);

    public final StringPath vendorLotNumber = createString("vendorLotNumber");

    public final StringPath waybillAirbill = createString("waybillAirbill");

    public final NumberPath<Long> wipEntityType = createNumber("wipEntityType", Long.class);

    public final NumberPath<Long> wipSupplyType = createNumber("wipSupplyType", Long.class);

    public final StringPath xferLocSegment1 = createString("xferLocSegment1");

    public final StringPath xferLocSegment10 = createString("xferLocSegment10");

    public final StringPath xferLocSegment11 = createString("xferLocSegment11");

    public final StringPath xferLocSegment12 = createString("xferLocSegment12");

    public final StringPath xferLocSegment13 = createString("xferLocSegment13");

    public final StringPath xferLocSegment14 = createString("xferLocSegment14");

    public final StringPath xferLocSegment15 = createString("xferLocSegment15");

    public final StringPath xferLocSegment16 = createString("xferLocSegment16");

    public final StringPath xferLocSegment17 = createString("xferLocSegment17");

    public final StringPath xferLocSegment18 = createString("xferLocSegment18");

    public final StringPath xferLocSegment19 = createString("xferLocSegment19");

    public final StringPath xferLocSegment2 = createString("xferLocSegment2");

    public final StringPath xferLocSegment20 = createString("xferLocSegment20");

    public final StringPath xferLocSegment3 = createString("xferLocSegment3");

    public final StringPath xferLocSegment4 = createString("xferLocSegment4");

    public final StringPath xferLocSegment5 = createString("xferLocSegment5");

    public final StringPath xferLocSegment6 = createString("xferLocSegment6");

    public final StringPath xferLocSegment7 = createString("xferLocSegment7");

    public final StringPath xferLocSegment8 = createString("xferLocSegment8");

    public final StringPath xferLocSegment9 = createString("xferLocSegment9");

    public final NumberPath<Long> xfrOwningOrganizationId = createNumber("xfrOwningOrganizationId", Long.class);

    public final NumberPath<Long> xfrPlanningOrganizationId = createNumber("xfrPlanningOrganizationId", Long.class);

    public final StringPath xmlDocumentId = createString("xmlDocumentId");

    public QMtlTransactionsInterface(String variable) {
        super(MtlTransactionsInterface.class, forVariable(variable));
    }

    public QMtlTransactionsInterface(Path<? extends MtlTransactionsInterface> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMtlTransactionsInterface(PathMetadata metadata) {
        super(MtlTransactionsInterface.class, metadata);
    }

}

