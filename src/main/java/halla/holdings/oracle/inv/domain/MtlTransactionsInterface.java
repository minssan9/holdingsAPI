package halla.holdings.oracle.inv.domain;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "MTL_TRANSACTIONS_INTERFACE", schema = "INV", catalog = "")
public class MtlTransactionsInterface {
    @Id
    private Long transactionInterfaceId;
    private Long transactionHeaderId;
    private String sourceCode;
    private long sourceLineId;
    private long sourceHeaderId;
    private boolean processFlag;
    private Long validationRequired;
    private long transactionMode;
    private Boolean lockFlag;
    private Time lastUpdateDate;
    private long lastUpdatedBy;
    private Time creationDate;
    private long createdBy;
    private Long lastUpdateLogin;
    private Long requestId;
    private Long programApplicationId;
    private Long programId;
    private Time programUpdateDate;
    private Long inventoryItemId;
    private String itemSegment1;
    private String itemSegment2;
    private String itemSegment3;
    private String itemSegment4;
    private String itemSegment5;
    private String itemSegment6;
    private String itemSegment7;
    private String itemSegment8;
    private String itemSegment9;
    private String itemSegment10;
    private String itemSegment11;
    private String itemSegment12;
    private String itemSegment13;
    private String itemSegment14;
    private String itemSegment15;
    private String itemSegment16;
    private String itemSegment17;
    private String itemSegment18;
    private String itemSegment19;
    private String itemSegment20;
    private String revision;
    private long organizationId;
    private long transactionQuantity;
    private Long primaryQuantity;
    private String transactionUom;
    private Time transactionDate;
    private Long acctPeriodId;
    private String subinventoryCode;
    private Long locatorId;
    private String locSegment1;
    private String locSegment2;
    private String locSegment3;
    private String locSegment4;
    private String locSegment5;
    private String locSegment6;
    private String locSegment7;
    private String locSegment8;
    private String locSegment9;
    private String locSegment10;
    private String locSegment11;
    private String locSegment12;
    private String locSegment13;
    private String locSegment14;
    private String locSegment15;
    private String locSegment16;
    private String locSegment17;
    private String locSegment18;
    private String locSegment19;
    private String locSegment20;
    private Long transactionSourceId;
    private String dspSegment1;
    private String dspSegment2;
    private String dspSegment3;
    private String dspSegment4;
    private String dspSegment5;
    private String dspSegment6;
    private String dspSegment7;
    private String dspSegment8;
    private String dspSegment9;
    private String dspSegment10;
    private String dspSegment11;
    private String dspSegment12;
    private String dspSegment13;
    private String dspSegment14;
    private String dspSegment15;
    private String dspSegment16;
    private String dspSegment17;
    private String dspSegment18;
    private String dspSegment19;
    private String dspSegment20;
    private String dspSegment21;
    private String dspSegment22;
    private String dspSegment23;
    private String dspSegment24;
    private String dspSegment25;
    private String dspSegment26;
    private String dspSegment27;
    private String dspSegment28;
    private String dspSegment29;
    private String dspSegment30;
    private String transactionSourceName;
    private Long transactionSourceTypeId;
    private Long transactionActionId;
    private long transactionTypeId;
    private Long reasonId;
    private String transactionReference;
    private Long transactionCost;
    private Long distributionAccountId;
    private String dstSegment1;
    private String dstSegment2;
    private String dstSegment3;
    private String dstSegment4;
    private String dstSegment5;
    private String dstSegment6;
    private String dstSegment7;
    private String dstSegment8;
    private String dstSegment9;
    private String dstSegment10;
    private String dstSegment11;
    private String dstSegment12;
    private String dstSegment13;
    private String dstSegment14;
    private String dstSegment15;
    private String dstSegment16;
    private String dstSegment17;
    private String dstSegment18;
    private String dstSegment19;
    private String dstSegment20;
    private String dstSegment21;
    private String dstSegment22;
    private String dstSegment23;
    private String dstSegment24;
    private String dstSegment25;
    private String dstSegment26;
    private String dstSegment27;
    private String dstSegment28;
    private String dstSegment29;
    private String dstSegment30;
    private Long requisitionLineId;
    private String currencyCode;
    private Time currencyConversionDate;
    private String currencyConversionType;
    private Long currencyConversionRate;
    private String ussglTransactionCode;
    private Long wipEntityType;
    private Long scheduleId;
    private String employeeCode;
    private Long departmentId;
    private Long scheduleUpdateCode;
    private Long setupTeardownCode;
    private Long primarySwitch;
    private Long mrpCode;
    private Long operationSeqNum;
    private Long repetitiveLineId;
    private Long pickingLineId;
    private Long trxSourceLineId;
    private Long trxSourceDeliveryId;
    private Long demandId;
    private Long customerShipId;
    private Long lineItemNum;
    private String receivingDocument;
    private Long rcvTransactionId;
    private Long shipToLocationId;
    private Long encumbranceAccount;
    private Long encumbranceAmount;
    private String vendorLotNumber;
    private String transferSubinventory;
    private Long transferOrganization;
    private Long transferLocator;
    private String xferLocSegment1;
    private String xferLocSegment2;
    private String xferLocSegment3;
    private String xferLocSegment4;
    private String xferLocSegment5;
    private String xferLocSegment6;
    private String xferLocSegment7;
    private String xferLocSegment8;
    private String xferLocSegment9;
    private String xferLocSegment10;
    private String xferLocSegment11;
    private String xferLocSegment12;
    private String xferLocSegment13;
    private String xferLocSegment14;
    private String xferLocSegment15;
    private String xferLocSegment16;
    private String xferLocSegment17;
    private String xferLocSegment18;
    private String xferLocSegment19;
    private String xferLocSegment20;
    private String shipmentNumber;
    private Long transportationCost;
    private Long transportationAccount;
    private Long transferCost;
    private String freightCode;
    private Long containers;
    private String waybillAirbill;
    private Time expectedArrivalDate;
    private Long newAverageCost;
    private Long valueChange;
    private Long percentageChange;
    private Long demandSourceHeaderId;
    private String demandSourceLine;
    private String demandSourceDelivery;
    private Long negativeReqFlag;
    private String errorExplanation;
    private String shippableFlag;
    private String errorCode;
    private String requiredFlag;
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
    private Long requisitionDistributionId;
    private Long movementId;
    private Long reservationQuantity;
    private Long shippedQuantity;
    private String inventoryItem;
    private String locatorName;
    private Long taskId;
    private Long toTaskId;
    private Long sourceTaskId;
    private Long projectId;
    private Long toProjectId;
    private Long sourceProjectId;
    private Long paExpenditureOrgId;
    private String expenditureType;
    private String finalCompletionFlag;
    private Long transferPercentage;
    private Long transactionSequenceId;
    private Long materialAccount;
    private Long materialOverheadAccount;
    private Long resourceAccount;
    private Long outsideProcessingAccount;
    private Long overheadAccount;
    private String bomRevision;
    private String routingRevision;
    private Time bomRevisionDate;
    private Time routingRevisionDate;
    private String alternateBomDesignator;
    private String alternateRoutingDesignator;
    private String accountingClass;
    private String demandClass;
    private Long parentId;
    private Long substitutionTypeId;
    private Long substitutionItemId;
    private Long scheduleGroup;
    private Long buildSequence;
    private String scheduleNumber;
    private Long scheduledFlag;
    private String flowSchedule;
    private Long costGroupId;
    private Long kanbanCardId;
    private Long qaCollectionId;
    private Long overcompletionTransactionQty;
    private Long overcompletionPrimaryQty;
    private Long overcompletionTransactionId;
    private String endItemUnitNumber;
    private Time scheduledPaybackDate;
    private Long orgCostGroupId;
    private Long costTypeId;
    private String sourceLotNumber;
    private Long transferCostGroupId;
    private Long lpnId;
    private Long transferLpnId;
    private Long contentLpnId;
    private String xmlDocumentId;
    private Long organizationType;
    private Long transferOrganizationType;
    private Long owningOrganizationId;
    private Long owningTpType;
    private Long xfrOwningOrganizationId;
    private Long transferOwningTpType;
    private Long planningOrganizationId;
    private Long planningTpType;
    private Long xfrPlanningOrganizationId;
    private Long transferPlanningTpType;
    private String secondaryUomCode;
    private Long secondaryTransactionQuantity;
    private Long transactionGroupId;
    private Long transactionGroupSeq;
    private String representativeLotNumber;
    private Long transactionBatchId;
    private Long transactionBatchSeq;
    private Long rebuildItemId;
    private String rebuildSerialNumber;
    private Long rebuildActivityId;
    private String rebuildJobName;
    private Long moveTransactionId;
    private Long completionTransactionId;
    private Long wipSupplyType;

    @Basic
    @Column(name = "TRANSACTION_INTERFACE_ID", nullable = true, precision = 0)
    public Long getTransactionInterfaceId() {
        return transactionInterfaceId;
    }

    public void setTransactionInterfaceId(Long transactionInterfaceId) {
        this.transactionInterfaceId = transactionInterfaceId;
    }

    @Basic
    @Column(name = "TRANSACTION_HEADER_ID", nullable = true, precision = 0)
    public Long getTransactionHeaderId() {
        return transactionHeaderId;
    }

    public void setTransactionHeaderId(Long transactionHeaderId) {
        this.transactionHeaderId = transactionHeaderId;
    }

    @Basic
    @Column(name = "SOURCE_CODE", nullable = false, length = 30)
    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Basic
    @Column(name = "SOURCE_LINE_ID", nullable = false, precision = 0)
    public long getSourceLineId() {
        return sourceLineId;
    }

    public void setSourceLineId(long sourceLineId) {
        this.sourceLineId = sourceLineId;
    }

    @Basic
    @Column(name = "SOURCE_HEADER_ID", nullable = false, precision = 0)
    public long getSourceHeaderId() {
        return sourceHeaderId;
    }

    public void setSourceHeaderId(long sourceHeaderId) {
        this.sourceHeaderId = sourceHeaderId;
    }

    @Basic
    @Column(name = "PROCESS_FLAG", nullable = false, precision = 0)
    public boolean isProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(boolean processFlag) {
        this.processFlag = processFlag;
    }

    @Basic
    @Column(name = "VALIDATION_REQUIRED", nullable = true, precision = 0)
    public Long getValidationRequired() {
        return validationRequired;
    }

    public void setValidationRequired(Long validationRequired) {
        this.validationRequired = validationRequired;
    }

    @Basic
    @Column(name = "TRANSACTION_MODE", nullable = false, precision = 0)
    public long getTransactionMode() {
        return transactionMode;
    }

    public void setTransactionMode(long transactionMode) {
        this.transactionMode = transactionMode;
    }

    @Basic
    @Column(name = "LOCK_FLAG", nullable = true, precision = 0)
    public Boolean getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Boolean lockFlag) {
        this.lockFlag = lockFlag;
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
    @Column(name = "INVENTORY_ITEM_ID", nullable = true, precision = 0)
    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT1", nullable = true, length = 40)
    public String getItemSegment1() {
        return itemSegment1;
    }

    public void setItemSegment1(String itemSegment1) {
        this.itemSegment1 = itemSegment1;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT2", nullable = true, length = 40)
    public String getItemSegment2() {
        return itemSegment2;
    }

    public void setItemSegment2(String itemSegment2) {
        this.itemSegment2 = itemSegment2;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT3", nullable = true, length = 40)
    public String getItemSegment3() {
        return itemSegment3;
    }

    public void setItemSegment3(String itemSegment3) {
        this.itemSegment3 = itemSegment3;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT4", nullable = true, length = 40)
    public String getItemSegment4() {
        return itemSegment4;
    }

    public void setItemSegment4(String itemSegment4) {
        this.itemSegment4 = itemSegment4;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT5", nullable = true, length = 40)
    public String getItemSegment5() {
        return itemSegment5;
    }

    public void setItemSegment5(String itemSegment5) {
        this.itemSegment5 = itemSegment5;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT6", nullable = true, length = 40)
    public String getItemSegment6() {
        return itemSegment6;
    }

    public void setItemSegment6(String itemSegment6) {
        this.itemSegment6 = itemSegment6;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT7", nullable = true, length = 40)
    public String getItemSegment7() {
        return itemSegment7;
    }

    public void setItemSegment7(String itemSegment7) {
        this.itemSegment7 = itemSegment7;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT8", nullable = true, length = 40)
    public String getItemSegment8() {
        return itemSegment8;
    }

    public void setItemSegment8(String itemSegment8) {
        this.itemSegment8 = itemSegment8;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT9", nullable = true, length = 40)
    public String getItemSegment9() {
        return itemSegment9;
    }

    public void setItemSegment9(String itemSegment9) {
        this.itemSegment9 = itemSegment9;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT10", nullable = true, length = 40)
    public String getItemSegment10() {
        return itemSegment10;
    }

    public void setItemSegment10(String itemSegment10) {
        this.itemSegment10 = itemSegment10;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT11", nullable = true, length = 40)
    public String getItemSegment11() {
        return itemSegment11;
    }

    public void setItemSegment11(String itemSegment11) {
        this.itemSegment11 = itemSegment11;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT12", nullable = true, length = 40)
    public String getItemSegment12() {
        return itemSegment12;
    }

    public void setItemSegment12(String itemSegment12) {
        this.itemSegment12 = itemSegment12;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT13", nullable = true, length = 40)
    public String getItemSegment13() {
        return itemSegment13;
    }

    public void setItemSegment13(String itemSegment13) {
        this.itemSegment13 = itemSegment13;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT14", nullable = true, length = 40)
    public String getItemSegment14() {
        return itemSegment14;
    }

    public void setItemSegment14(String itemSegment14) {
        this.itemSegment14 = itemSegment14;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT15", nullable = true, length = 40)
    public String getItemSegment15() {
        return itemSegment15;
    }

    public void setItemSegment15(String itemSegment15) {
        this.itemSegment15 = itemSegment15;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT16", nullable = true, length = 40)
    public String getItemSegment16() {
        return itemSegment16;
    }

    public void setItemSegment16(String itemSegment16) {
        this.itemSegment16 = itemSegment16;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT17", nullable = true, length = 40)
    public String getItemSegment17() {
        return itemSegment17;
    }

    public void setItemSegment17(String itemSegment17) {
        this.itemSegment17 = itemSegment17;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT18", nullable = true, length = 40)
    public String getItemSegment18() {
        return itemSegment18;
    }

    public void setItemSegment18(String itemSegment18) {
        this.itemSegment18 = itemSegment18;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT19", nullable = true, length = 40)
    public String getItemSegment19() {
        return itemSegment19;
    }

    public void setItemSegment19(String itemSegment19) {
        this.itemSegment19 = itemSegment19;
    }

    @Basic
    @Column(name = "ITEM_SEGMENT20", nullable = true, length = 40)
    public String getItemSegment20() {
        return itemSegment20;
    }

    public void setItemSegment20(String itemSegment20) {
        this.itemSegment20 = itemSegment20;
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
    @Column(name = "ORGANIZATION_ID", nullable = false, precision = 0)
    public long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
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
    @Column(name = "TRANSACTION_UOM", nullable = false, length = 3)
    public String getTransactionUom() {
        return transactionUom;
    }

    public void setTransactionUom(String transactionUom) {
        this.transactionUom = transactionUom;
    }

    @Basic
    @Column(name = "TRANSACTION_DATE", nullable = false)
    public Time getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Time transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Basic
    @Column(name = "ACCT_PERIOD_ID", nullable = true, precision = 0)
    public Long getAcctPeriodId() {
        return acctPeriodId;
    }

    public void setAcctPeriodId(Long acctPeriodId) {
        this.acctPeriodId = acctPeriodId;
    }

    @Basic
    @Column(name = "SUBINVENTORY_CODE", nullable = true, length = 10)
    public String getSubinventoryCode() {
        return subinventoryCode;
    }

    public void setSubinventoryCode(String subinventoryCode) {
        this.subinventoryCode = subinventoryCode;
    }

    @Basic
    @Column(name = "LOCATOR_ID", nullable = true, precision = 0)
    public Long getLocatorId() {
        return locatorId;
    }

    public void setLocatorId(Long locatorId) {
        this.locatorId = locatorId;
    }

    @Basic
    @Column(name = "LOC_SEGMENT1", nullable = true, length = 40)
    public String getLocSegment1() {
        return locSegment1;
    }

    public void setLocSegment1(String locSegment1) {
        this.locSegment1 = locSegment1;
    }

    @Basic
    @Column(name = "LOC_SEGMENT2", nullable = true, length = 40)
    public String getLocSegment2() {
        return locSegment2;
    }

    public void setLocSegment2(String locSegment2) {
        this.locSegment2 = locSegment2;
    }

    @Basic
    @Column(name = "LOC_SEGMENT3", nullable = true, length = 40)
    public String getLocSegment3() {
        return locSegment3;
    }

    public void setLocSegment3(String locSegment3) {
        this.locSegment3 = locSegment3;
    }

    @Basic
    @Column(name = "LOC_SEGMENT4", nullable = true, length = 40)
    public String getLocSegment4() {
        return locSegment4;
    }

    public void setLocSegment4(String locSegment4) {
        this.locSegment4 = locSegment4;
    }

    @Basic
    @Column(name = "LOC_SEGMENT5", nullable = true, length = 40)
    public String getLocSegment5() {
        return locSegment5;
    }

    public void setLocSegment5(String locSegment5) {
        this.locSegment5 = locSegment5;
    }

    @Basic
    @Column(name = "LOC_SEGMENT6", nullable = true, length = 40)
    public String getLocSegment6() {
        return locSegment6;
    }

    public void setLocSegment6(String locSegment6) {
        this.locSegment6 = locSegment6;
    }

    @Basic
    @Column(name = "LOC_SEGMENT7", nullable = true, length = 40)
    public String getLocSegment7() {
        return locSegment7;
    }

    public void setLocSegment7(String locSegment7) {
        this.locSegment7 = locSegment7;
    }

    @Basic
    @Column(name = "LOC_SEGMENT8", nullable = true, length = 40)
    public String getLocSegment8() {
        return locSegment8;
    }

    public void setLocSegment8(String locSegment8) {
        this.locSegment8 = locSegment8;
    }

    @Basic
    @Column(name = "LOC_SEGMENT9", nullable = true, length = 40)
    public String getLocSegment9() {
        return locSegment9;
    }

    public void setLocSegment9(String locSegment9) {
        this.locSegment9 = locSegment9;
    }

    @Basic
    @Column(name = "LOC_SEGMENT10", nullable = true, length = 40)
    public String getLocSegment10() {
        return locSegment10;
    }

    public void setLocSegment10(String locSegment10) {
        this.locSegment10 = locSegment10;
    }

    @Basic
    @Column(name = "LOC_SEGMENT11", nullable = true, length = 40)
    public String getLocSegment11() {
        return locSegment11;
    }

    public void setLocSegment11(String locSegment11) {
        this.locSegment11 = locSegment11;
    }

    @Basic
    @Column(name = "LOC_SEGMENT12", nullable = true, length = 40)
    public String getLocSegment12() {
        return locSegment12;
    }

    public void setLocSegment12(String locSegment12) {
        this.locSegment12 = locSegment12;
    }

    @Basic
    @Column(name = "LOC_SEGMENT13", nullable = true, length = 40)
    public String getLocSegment13() {
        return locSegment13;
    }

    public void setLocSegment13(String locSegment13) {
        this.locSegment13 = locSegment13;
    }

    @Basic
    @Column(name = "LOC_SEGMENT14", nullable = true, length = 40)
    public String getLocSegment14() {
        return locSegment14;
    }

    public void setLocSegment14(String locSegment14) {
        this.locSegment14 = locSegment14;
    }

    @Basic
    @Column(name = "LOC_SEGMENT15", nullable = true, length = 40)
    public String getLocSegment15() {
        return locSegment15;
    }

    public void setLocSegment15(String locSegment15) {
        this.locSegment15 = locSegment15;
    }

    @Basic
    @Column(name = "LOC_SEGMENT16", nullable = true, length = 40)
    public String getLocSegment16() {
        return locSegment16;
    }

    public void setLocSegment16(String locSegment16) {
        this.locSegment16 = locSegment16;
    }

    @Basic
    @Column(name = "LOC_SEGMENT17", nullable = true, length = 40)
    public String getLocSegment17() {
        return locSegment17;
    }

    public void setLocSegment17(String locSegment17) {
        this.locSegment17 = locSegment17;
    }

    @Basic
    @Column(name = "LOC_SEGMENT18", nullable = true, length = 40)
    public String getLocSegment18() {
        return locSegment18;
    }

    public void setLocSegment18(String locSegment18) {
        this.locSegment18 = locSegment18;
    }

    @Basic
    @Column(name = "LOC_SEGMENT19", nullable = true, length = 40)
    public String getLocSegment19() {
        return locSegment19;
    }

    public void setLocSegment19(String locSegment19) {
        this.locSegment19 = locSegment19;
    }

    @Basic
    @Column(name = "LOC_SEGMENT20", nullable = true, length = 40)
    public String getLocSegment20() {
        return locSegment20;
    }

    public void setLocSegment20(String locSegment20) {
        this.locSegment20 = locSegment20;
    }

    @Basic
    @Column(name = "TRANSACTION_SOURCE_ID", nullable = true, precision = 0)
    public Long getTransactionSourceId() {
        return transactionSourceId;
    }

    public void setTransactionSourceId(Long transactionSourceId) {
        this.transactionSourceId = transactionSourceId;
    }

    @Basic
    @Column(name = "DSP_SEGMENT1", nullable = true, length = 40)
    public String getDspSegment1() {
        return dspSegment1;
    }

    public void setDspSegment1(String dspSegment1) {
        this.dspSegment1 = dspSegment1;
    }

    @Basic
    @Column(name = "DSP_SEGMENT2", nullable = true, length = 40)
    public String getDspSegment2() {
        return dspSegment2;
    }

    public void setDspSegment2(String dspSegment2) {
        this.dspSegment2 = dspSegment2;
    }

    @Basic
    @Column(name = "DSP_SEGMENT3", nullable = true, length = 40)
    public String getDspSegment3() {
        return dspSegment3;
    }

    public void setDspSegment3(String dspSegment3) {
        this.dspSegment3 = dspSegment3;
    }

    @Basic
    @Column(name = "DSP_SEGMENT4", nullable = true, length = 40)
    public String getDspSegment4() {
        return dspSegment4;
    }

    public void setDspSegment4(String dspSegment4) {
        this.dspSegment4 = dspSegment4;
    }

    @Basic
    @Column(name = "DSP_SEGMENT5", nullable = true, length = 40)
    public String getDspSegment5() {
        return dspSegment5;
    }

    public void setDspSegment5(String dspSegment5) {
        this.dspSegment5 = dspSegment5;
    }

    @Basic
    @Column(name = "DSP_SEGMENT6", nullable = true, length = 40)
    public String getDspSegment6() {
        return dspSegment6;
    }

    public void setDspSegment6(String dspSegment6) {
        this.dspSegment6 = dspSegment6;
    }

    @Basic
    @Column(name = "DSP_SEGMENT7", nullable = true, length = 40)
    public String getDspSegment7() {
        return dspSegment7;
    }

    public void setDspSegment7(String dspSegment7) {
        this.dspSegment7 = dspSegment7;
    }

    @Basic
    @Column(name = "DSP_SEGMENT8", nullable = true, length = 40)
    public String getDspSegment8() {
        return dspSegment8;
    }

    public void setDspSegment8(String dspSegment8) {
        this.dspSegment8 = dspSegment8;
    }

    @Basic
    @Column(name = "DSP_SEGMENT9", nullable = true, length = 40)
    public String getDspSegment9() {
        return dspSegment9;
    }

    public void setDspSegment9(String dspSegment9) {
        this.dspSegment9 = dspSegment9;
    }

    @Basic
    @Column(name = "DSP_SEGMENT10", nullable = true, length = 40)
    public String getDspSegment10() {
        return dspSegment10;
    }

    public void setDspSegment10(String dspSegment10) {
        this.dspSegment10 = dspSegment10;
    }

    @Basic
    @Column(name = "DSP_SEGMENT11", nullable = true, length = 40)
    public String getDspSegment11() {
        return dspSegment11;
    }

    public void setDspSegment11(String dspSegment11) {
        this.dspSegment11 = dspSegment11;
    }

    @Basic
    @Column(name = "DSP_SEGMENT12", nullable = true, length = 40)
    public String getDspSegment12() {
        return dspSegment12;
    }

    public void setDspSegment12(String dspSegment12) {
        this.dspSegment12 = dspSegment12;
    }

    @Basic
    @Column(name = "DSP_SEGMENT13", nullable = true, length = 40)
    public String getDspSegment13() {
        return dspSegment13;
    }

    public void setDspSegment13(String dspSegment13) {
        this.dspSegment13 = dspSegment13;
    }

    @Basic
    @Column(name = "DSP_SEGMENT14", nullable = true, length = 40)
    public String getDspSegment14() {
        return dspSegment14;
    }

    public void setDspSegment14(String dspSegment14) {
        this.dspSegment14 = dspSegment14;
    }

    @Basic
    @Column(name = "DSP_SEGMENT15", nullable = true, length = 40)
    public String getDspSegment15() {
        return dspSegment15;
    }

    public void setDspSegment15(String dspSegment15) {
        this.dspSegment15 = dspSegment15;
    }

    @Basic
    @Column(name = "DSP_SEGMENT16", nullable = true, length = 40)
    public String getDspSegment16() {
        return dspSegment16;
    }

    public void setDspSegment16(String dspSegment16) {
        this.dspSegment16 = dspSegment16;
    }

    @Basic
    @Column(name = "DSP_SEGMENT17", nullable = true, length = 40)
    public String getDspSegment17() {
        return dspSegment17;
    }

    public void setDspSegment17(String dspSegment17) {
        this.dspSegment17 = dspSegment17;
    }

    @Basic
    @Column(name = "DSP_SEGMENT18", nullable = true, length = 40)
    public String getDspSegment18() {
        return dspSegment18;
    }

    public void setDspSegment18(String dspSegment18) {
        this.dspSegment18 = dspSegment18;
    }

    @Basic
    @Column(name = "DSP_SEGMENT19", nullable = true, length = 40)
    public String getDspSegment19() {
        return dspSegment19;
    }

    public void setDspSegment19(String dspSegment19) {
        this.dspSegment19 = dspSegment19;
    }

    @Basic
    @Column(name = "DSP_SEGMENT20", nullable = true, length = 40)
    public String getDspSegment20() {
        return dspSegment20;
    }

    public void setDspSegment20(String dspSegment20) {
        this.dspSegment20 = dspSegment20;
    }

    @Basic
    @Column(name = "DSP_SEGMENT21", nullable = true, length = 40)
    public String getDspSegment21() {
        return dspSegment21;
    }

    public void setDspSegment21(String dspSegment21) {
        this.dspSegment21 = dspSegment21;
    }

    @Basic
    @Column(name = "DSP_SEGMENT22", nullable = true, length = 40)
    public String getDspSegment22() {
        return dspSegment22;
    }

    public void setDspSegment22(String dspSegment22) {
        this.dspSegment22 = dspSegment22;
    }

    @Basic
    @Column(name = "DSP_SEGMENT23", nullable = true, length = 40)
    public String getDspSegment23() {
        return dspSegment23;
    }

    public void setDspSegment23(String dspSegment23) {
        this.dspSegment23 = dspSegment23;
    }

    @Basic
    @Column(name = "DSP_SEGMENT24", nullable = true, length = 40)
    public String getDspSegment24() {
        return dspSegment24;
    }

    public void setDspSegment24(String dspSegment24) {
        this.dspSegment24 = dspSegment24;
    }

    @Basic
    @Column(name = "DSP_SEGMENT25", nullable = true, length = 40)
    public String getDspSegment25() {
        return dspSegment25;
    }

    public void setDspSegment25(String dspSegment25) {
        this.dspSegment25 = dspSegment25;
    }

    @Basic
    @Column(name = "DSP_SEGMENT26", nullable = true, length = 40)
    public String getDspSegment26() {
        return dspSegment26;
    }

    public void setDspSegment26(String dspSegment26) {
        this.dspSegment26 = dspSegment26;
    }

    @Basic
    @Column(name = "DSP_SEGMENT27", nullable = true, length = 40)
    public String getDspSegment27() {
        return dspSegment27;
    }

    public void setDspSegment27(String dspSegment27) {
        this.dspSegment27 = dspSegment27;
    }

    @Basic
    @Column(name = "DSP_SEGMENT28", nullable = true, length = 40)
    public String getDspSegment28() {
        return dspSegment28;
    }

    public void setDspSegment28(String dspSegment28) {
        this.dspSegment28 = dspSegment28;
    }

    @Basic
    @Column(name = "DSP_SEGMENT29", nullable = true, length = 40)
    public String getDspSegment29() {
        return dspSegment29;
    }

    public void setDspSegment29(String dspSegment29) {
        this.dspSegment29 = dspSegment29;
    }

    @Basic
    @Column(name = "DSP_SEGMENT30", nullable = true, length = 40)
    public String getDspSegment30() {
        return dspSegment30;
    }

    public void setDspSegment30(String dspSegment30) {
        this.dspSegment30 = dspSegment30;
    }

    @Basic
    @Column(name = "TRANSACTION_SOURCE_NAME", nullable = true, length = 30)
    public String getTransactionSourceName() {
        return transactionSourceName;
    }

    public void setTransactionSourceName(String transactionSourceName) {
        this.transactionSourceName = transactionSourceName;
    }

    @Basic
    @Column(name = "TRANSACTION_SOURCE_TYPE_ID", nullable = true, precision = 0)
    public Long getTransactionSourceTypeId() {
        return transactionSourceTypeId;
    }

    public void setTransactionSourceTypeId(Long transactionSourceTypeId) {
        this.transactionSourceTypeId = transactionSourceTypeId;
    }

    @Basic
    @Column(name = "TRANSACTION_ACTION_ID", nullable = true, precision = 0)
    public Long getTransactionActionId() {
        return transactionActionId;
    }

    public void setTransactionActionId(Long transactionActionId) {
        this.transactionActionId = transactionActionId;
    }

    @Basic
    @Column(name = "TRANSACTION_TYPE_ID", nullable = false, precision = 0)
    public long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    @Basic
    @Column(name = "REASON_ID", nullable = true, precision = 0)
    public Long getReasonId() {
        return reasonId;
    }

    public void setReasonId(Long reasonId) {
        this.reasonId = reasonId;
    }

    @Basic
    @Column(name = "TRANSACTION_REFERENCE", nullable = true, length = 240)
    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    @Basic
    @Column(name = "TRANSACTION_COST", nullable = true, precision = 0)
    public Long getTransactionCost() {
        return transactionCost;
    }

    public void setTransactionCost(Long transactionCost) {
        this.transactionCost = transactionCost;
    }

    @Basic
    @Column(name = "DISTRIBUTION_ACCOUNT_ID", nullable = true, precision = 0)
    public Long getDistributionAccountId() {
        return distributionAccountId;
    }

    public void setDistributionAccountId(Long distributionAccountId) {
        this.distributionAccountId = distributionAccountId;
    }

    @Basic
    @Column(name = "DST_SEGMENT1", nullable = true, length = 25)
    public String getDstSegment1() {
        return dstSegment1;
    }

    public void setDstSegment1(String dstSegment1) {
        this.dstSegment1 = dstSegment1;
    }

    @Basic
    @Column(name = "DST_SEGMENT2", nullable = true, length = 25)
    public String getDstSegment2() {
        return dstSegment2;
    }

    public void setDstSegment2(String dstSegment2) {
        this.dstSegment2 = dstSegment2;
    }

    @Basic
    @Column(name = "DST_SEGMENT3", nullable = true, length = 25)
    public String getDstSegment3() {
        return dstSegment3;
    }

    public void setDstSegment3(String dstSegment3) {
        this.dstSegment3 = dstSegment3;
    }

    @Basic
    @Column(name = "DST_SEGMENT4", nullable = true, length = 25)
    public String getDstSegment4() {
        return dstSegment4;
    }

    public void setDstSegment4(String dstSegment4) {
        this.dstSegment4 = dstSegment4;
    }

    @Basic
    @Column(name = "DST_SEGMENT5", nullable = true, length = 25)
    public String getDstSegment5() {
        return dstSegment5;
    }

    public void setDstSegment5(String dstSegment5) {
        this.dstSegment5 = dstSegment5;
    }

    @Basic
    @Column(name = "DST_SEGMENT6", nullable = true, length = 25)
    public String getDstSegment6() {
        return dstSegment6;
    }

    public void setDstSegment6(String dstSegment6) {
        this.dstSegment6 = dstSegment6;
    }

    @Basic
    @Column(name = "DST_SEGMENT7", nullable = true, length = 25)
    public String getDstSegment7() {
        return dstSegment7;
    }

    public void setDstSegment7(String dstSegment7) {
        this.dstSegment7 = dstSegment7;
    }

    @Basic
    @Column(name = "DST_SEGMENT8", nullable = true, length = 25)
    public String getDstSegment8() {
        return dstSegment8;
    }

    public void setDstSegment8(String dstSegment8) {
        this.dstSegment8 = dstSegment8;
    }

    @Basic
    @Column(name = "DST_SEGMENT9", nullable = true, length = 25)
    public String getDstSegment9() {
        return dstSegment9;
    }

    public void setDstSegment9(String dstSegment9) {
        this.dstSegment9 = dstSegment9;
    }

    @Basic
    @Column(name = "DST_SEGMENT10", nullable = true, length = 25)
    public String getDstSegment10() {
        return dstSegment10;
    }

    public void setDstSegment10(String dstSegment10) {
        this.dstSegment10 = dstSegment10;
    }

    @Basic
    @Column(name = "DST_SEGMENT11", nullable = true, length = 25)
    public String getDstSegment11() {
        return dstSegment11;
    }

    public void setDstSegment11(String dstSegment11) {
        this.dstSegment11 = dstSegment11;
    }

    @Basic
    @Column(name = "DST_SEGMENT12", nullable = true, length = 25)
    public String getDstSegment12() {
        return dstSegment12;
    }

    public void setDstSegment12(String dstSegment12) {
        this.dstSegment12 = dstSegment12;
    }

    @Basic
    @Column(name = "DST_SEGMENT13", nullable = true, length = 25)
    public String getDstSegment13() {
        return dstSegment13;
    }

    public void setDstSegment13(String dstSegment13) {
        this.dstSegment13 = dstSegment13;
    }

    @Basic
    @Column(name = "DST_SEGMENT14", nullable = true, length = 25)
    public String getDstSegment14() {
        return dstSegment14;
    }

    public void setDstSegment14(String dstSegment14) {
        this.dstSegment14 = dstSegment14;
    }

    @Basic
    @Column(name = "DST_SEGMENT15", nullable = true, length = 25)
    public String getDstSegment15() {
        return dstSegment15;
    }

    public void setDstSegment15(String dstSegment15) {
        this.dstSegment15 = dstSegment15;
    }

    @Basic
    @Column(name = "DST_SEGMENT16", nullable = true, length = 25)
    public String getDstSegment16() {
        return dstSegment16;
    }

    public void setDstSegment16(String dstSegment16) {
        this.dstSegment16 = dstSegment16;
    }

    @Basic
    @Column(name = "DST_SEGMENT17", nullable = true, length = 25)
    public String getDstSegment17() {
        return dstSegment17;
    }

    public void setDstSegment17(String dstSegment17) {
        this.dstSegment17 = dstSegment17;
    }

    @Basic
    @Column(name = "DST_SEGMENT18", nullable = true, length = 25)
    public String getDstSegment18() {
        return dstSegment18;
    }

    public void setDstSegment18(String dstSegment18) {
        this.dstSegment18 = dstSegment18;
    }

    @Basic
    @Column(name = "DST_SEGMENT19", nullable = true, length = 25)
    public String getDstSegment19() {
        return dstSegment19;
    }

    public void setDstSegment19(String dstSegment19) {
        this.dstSegment19 = dstSegment19;
    }

    @Basic
    @Column(name = "DST_SEGMENT20", nullable = true, length = 25)
    public String getDstSegment20() {
        return dstSegment20;
    }

    public void setDstSegment20(String dstSegment20) {
        this.dstSegment20 = dstSegment20;
    }

    @Basic
    @Column(name = "DST_SEGMENT21", nullable = true, length = 25)
    public String getDstSegment21() {
        return dstSegment21;
    }

    public void setDstSegment21(String dstSegment21) {
        this.dstSegment21 = dstSegment21;
    }

    @Basic
    @Column(name = "DST_SEGMENT22", nullable = true, length = 25)
    public String getDstSegment22() {
        return dstSegment22;
    }

    public void setDstSegment22(String dstSegment22) {
        this.dstSegment22 = dstSegment22;
    }

    @Basic
    @Column(name = "DST_SEGMENT23", nullable = true, length = 25)
    public String getDstSegment23() {
        return dstSegment23;
    }

    public void setDstSegment23(String dstSegment23) {
        this.dstSegment23 = dstSegment23;
    }

    @Basic
    @Column(name = "DST_SEGMENT24", nullable = true, length = 25)
    public String getDstSegment24() {
        return dstSegment24;
    }

    public void setDstSegment24(String dstSegment24) {
        this.dstSegment24 = dstSegment24;
    }

    @Basic
    @Column(name = "DST_SEGMENT25", nullable = true, length = 25)
    public String getDstSegment25() {
        return dstSegment25;
    }

    public void setDstSegment25(String dstSegment25) {
        this.dstSegment25 = dstSegment25;
    }

    @Basic
    @Column(name = "DST_SEGMENT26", nullable = true, length = 25)
    public String getDstSegment26() {
        return dstSegment26;
    }

    public void setDstSegment26(String dstSegment26) {
        this.dstSegment26 = dstSegment26;
    }

    @Basic
    @Column(name = "DST_SEGMENT27", nullable = true, length = 25)
    public String getDstSegment27() {
        return dstSegment27;
    }

    public void setDstSegment27(String dstSegment27) {
        this.dstSegment27 = dstSegment27;
    }

    @Basic
    @Column(name = "DST_SEGMENT28", nullable = true, length = 25)
    public String getDstSegment28() {
        return dstSegment28;
    }

    public void setDstSegment28(String dstSegment28) {
        this.dstSegment28 = dstSegment28;
    }

    @Basic
    @Column(name = "DST_SEGMENT29", nullable = true, length = 25)
    public String getDstSegment29() {
        return dstSegment29;
    }

    public void setDstSegment29(String dstSegment29) {
        this.dstSegment29 = dstSegment29;
    }

    @Basic
    @Column(name = "DST_SEGMENT30", nullable = true, length = 25)
    public String getDstSegment30() {
        return dstSegment30;
    }

    public void setDstSegment30(String dstSegment30) {
        this.dstSegment30 = dstSegment30;
    }

    @Basic
    @Column(name = "REQUISITION_LINE_ID", nullable = true, precision = 0)
    public Long getRequisitionLineId() {
        return requisitionLineId;
    }

    public void setRequisitionLineId(Long requisitionLineId) {
        this.requisitionLineId = requisitionLineId;
    }

    @Basic
    @Column(name = "CURRENCY_CODE", nullable = true, length = 30)
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "CURRENCY_CONVERSION_DATE", nullable = true)
    public Time getCurrencyConversionDate() {
        return currencyConversionDate;
    }

    public void setCurrencyConversionDate(Time currencyConversionDate) {
        this.currencyConversionDate = currencyConversionDate;
    }

    @Basic
    @Column(name = "CURRENCY_CONVERSION_TYPE", nullable = true, length = 30)
    public String getCurrencyConversionType() {
        return currencyConversionType;
    }

    public void setCurrencyConversionType(String currencyConversionType) {
        this.currencyConversionType = currencyConversionType;
    }

    @Basic
    @Column(name = "CURRENCY_CONVERSION_RATE", nullable = true, precision = 0)
    public Long getCurrencyConversionRate() {
        return currencyConversionRate;
    }

    public void setCurrencyConversionRate(Long currencyConversionRate) {
        this.currencyConversionRate = currencyConversionRate;
    }

    @Basic
    @Column(name = "USSGL_TRANSACTION_CODE", nullable = true, length = 30)
    public String getUssglTransactionCode() {
        return ussglTransactionCode;
    }

    public void setUssglTransactionCode(String ussglTransactionCode) {
        this.ussglTransactionCode = ussglTransactionCode;
    }

    @Basic
    @Column(name = "WIP_ENTITY_TYPE", nullable = true, precision = 0)
    public Long getWipEntityType() {
        return wipEntityType;
    }

    public void setWipEntityType(Long wipEntityType) {
        this.wipEntityType = wipEntityType;
    }

    @Basic
    @Column(name = "SCHEDULE_ID", nullable = true, precision = 0)
    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Basic
    @Column(name = "EMPLOYEE_CODE", nullable = true, length = 10)
    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Basic
    @Column(name = "DEPARTMENT_ID", nullable = true, precision = 0)
    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "SCHEDULE_UPDATE_CODE", nullable = true, precision = 0)
    public Long getScheduleUpdateCode() {
        return scheduleUpdateCode;
    }

    public void setScheduleUpdateCode(Long scheduleUpdateCode) {
        this.scheduleUpdateCode = scheduleUpdateCode;
    }

    @Basic
    @Column(name = "SETUP_TEARDOWN_CODE", nullable = true, precision = 0)
    public Long getSetupTeardownCode() {
        return setupTeardownCode;
    }

    public void setSetupTeardownCode(Long setupTeardownCode) {
        this.setupTeardownCode = setupTeardownCode;
    }

    @Basic
    @Column(name = "PRIMARY_SWITCH", nullable = true, precision = 0)
    public Long getPrimarySwitch() {
        return primarySwitch;
    }

    public void setPrimarySwitch(Long primarySwitch) {
        this.primarySwitch = primarySwitch;
    }

    @Basic
    @Column(name = "MRP_CODE", nullable = true, precision = 0)
    public Long getMrpCode() {
        return mrpCode;
    }

    public void setMrpCode(Long mrpCode) {
        this.mrpCode = mrpCode;
    }

    @Basic
    @Column(name = "OPERATION_SEQ_NUM", nullable = true, precision = 0)
    public Long getOperationSeqNum() {
        return operationSeqNum;
    }

    public void setOperationSeqNum(Long operationSeqNum) {
        this.operationSeqNum = operationSeqNum;
    }

    @Basic
    @Column(name = "REPETITIVE_LINE_ID", nullable = true, precision = 0)
    public Long getRepetitiveLineId() {
        return repetitiveLineId;
    }

    public void setRepetitiveLineId(Long repetitiveLineId) {
        this.repetitiveLineId = repetitiveLineId;
    }

    @Basic
    @Column(name = "PICKING_LINE_ID", nullable = true, precision = 0)
    public Long getPickingLineId() {
        return pickingLineId;
    }

    public void setPickingLineId(Long pickingLineId) {
        this.pickingLineId = pickingLineId;
    }

    @Basic
    @Column(name = "TRX_SOURCE_LINE_ID", nullable = true, precision = 0)
    public Long getTrxSourceLineId() {
        return trxSourceLineId;
    }

    public void setTrxSourceLineId(Long trxSourceLineId) {
        this.trxSourceLineId = trxSourceLineId;
    }

    @Basic
    @Column(name = "TRX_SOURCE_DELIVERY_ID", nullable = true, precision = 0)
    public Long getTrxSourceDeliveryId() {
        return trxSourceDeliveryId;
    }

    public void setTrxSourceDeliveryId(Long trxSourceDeliveryId) {
        this.trxSourceDeliveryId = trxSourceDeliveryId;
    }

    @Basic
    @Column(name = "DEMAND_ID", nullable = true, precision = 0)
    public Long getDemandId() {
        return demandId;
    }

    public void setDemandId(Long demandId) {
        this.demandId = demandId;
    }

    @Basic
    @Column(name = "CUSTOMER_SHIP_ID", nullable = true, precision = 0)
    public Long getCustomerShipId() {
        return customerShipId;
    }

    public void setCustomerShipId(Long customerShipId) {
        this.customerShipId = customerShipId;
    }

    @Basic
    @Column(name = "LINE_ITEM_NUM", nullable = true, precision = 0)
    public Long getLineItemNum() {
        return lineItemNum;
    }

    public void setLineItemNum(Long lineItemNum) {
        this.lineItemNum = lineItemNum;
    }

    @Basic
    @Column(name = "RECEIVING_DOCUMENT", nullable = true, length = 10)
    public String getReceivingDocument() {
        return receivingDocument;
    }

    public void setReceivingDocument(String receivingDocument) {
        this.receivingDocument = receivingDocument;
    }

    @Basic
    @Column(name = "RCV_TRANSACTION_ID", nullable = true, precision = 0)
    public Long getRcvTransactionId() {
        return rcvTransactionId;
    }

    public void setRcvTransactionId(Long rcvTransactionId) {
        this.rcvTransactionId = rcvTransactionId;
    }

    @Basic
    @Column(name = "SHIP_TO_LOCATION_ID", nullable = true, precision = 0)
    public Long getShipToLocationId() {
        return shipToLocationId;
    }

    public void setShipToLocationId(Long shipToLocationId) {
        this.shipToLocationId = shipToLocationId;
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
    @Column(name = "ENCUMBRANCE_AMOUNT", nullable = true, precision = 0)
    public Long getEncumbranceAmount() {
        return encumbranceAmount;
    }

    public void setEncumbranceAmount(Long encumbranceAmount) {
        this.encumbranceAmount = encumbranceAmount;
    }

    @Basic
    @Column(name = "VENDOR_LOT_NUMBER", nullable = true, length = 30)
    public String getVendorLotNumber() {
        return vendorLotNumber;
    }

    public void setVendorLotNumber(String vendorLotNumber) {
        this.vendorLotNumber = vendorLotNumber;
    }

    @Basic
    @Column(name = "TRANSFER_SUBINVENTORY", nullable = true, length = 10)
    public String getTransferSubinventory() {
        return transferSubinventory;
    }

    public void setTransferSubinventory(String transferSubinventory) {
        this.transferSubinventory = transferSubinventory;
    }

    @Basic
    @Column(name = "TRANSFER_ORGANIZATION", nullable = true, precision = 0)
    public Long getTransferOrganization() {
        return transferOrganization;
    }

    public void setTransferOrganization(Long transferOrganization) {
        this.transferOrganization = transferOrganization;
    }

    @Basic
    @Column(name = "TRANSFER_LOCATOR", nullable = true, precision = 0)
    public Long getTransferLocator() {
        return transferLocator;
    }

    public void setTransferLocator(Long transferLocator) {
        this.transferLocator = transferLocator;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT1", nullable = true, length = 40)
    public String getXferLocSegment1() {
        return xferLocSegment1;
    }

    public void setXferLocSegment1(String xferLocSegment1) {
        this.xferLocSegment1 = xferLocSegment1;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT2", nullable = true, length = 40)
    public String getXferLocSegment2() {
        return xferLocSegment2;
    }

    public void setXferLocSegment2(String xferLocSegment2) {
        this.xferLocSegment2 = xferLocSegment2;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT3", nullable = true, length = 40)
    public String getXferLocSegment3() {
        return xferLocSegment3;
    }

    public void setXferLocSegment3(String xferLocSegment3) {
        this.xferLocSegment3 = xferLocSegment3;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT4", nullable = true, length = 40)
    public String getXferLocSegment4() {
        return xferLocSegment4;
    }

    public void setXferLocSegment4(String xferLocSegment4) {
        this.xferLocSegment4 = xferLocSegment4;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT5", nullable = true, length = 40)
    public String getXferLocSegment5() {
        return xferLocSegment5;
    }

    public void setXferLocSegment5(String xferLocSegment5) {
        this.xferLocSegment5 = xferLocSegment5;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT6", nullable = true, length = 40)
    public String getXferLocSegment6() {
        return xferLocSegment6;
    }

    public void setXferLocSegment6(String xferLocSegment6) {
        this.xferLocSegment6 = xferLocSegment6;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT7", nullable = true, length = 40)
    public String getXferLocSegment7() {
        return xferLocSegment7;
    }

    public void setXferLocSegment7(String xferLocSegment7) {
        this.xferLocSegment7 = xferLocSegment7;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT8", nullable = true, length = 40)
    public String getXferLocSegment8() {
        return xferLocSegment8;
    }

    public void setXferLocSegment8(String xferLocSegment8) {
        this.xferLocSegment8 = xferLocSegment8;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT9", nullable = true, length = 40)
    public String getXferLocSegment9() {
        return xferLocSegment9;
    }

    public void setXferLocSegment9(String xferLocSegment9) {
        this.xferLocSegment9 = xferLocSegment9;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT10", nullable = true, length = 40)
    public String getXferLocSegment10() {
        return xferLocSegment10;
    }

    public void setXferLocSegment10(String xferLocSegment10) {
        this.xferLocSegment10 = xferLocSegment10;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT11", nullable = true, length = 40)
    public String getXferLocSegment11() {
        return xferLocSegment11;
    }

    public void setXferLocSegment11(String xferLocSegment11) {
        this.xferLocSegment11 = xferLocSegment11;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT12", nullable = true, length = 40)
    public String getXferLocSegment12() {
        return xferLocSegment12;
    }

    public void setXferLocSegment12(String xferLocSegment12) {
        this.xferLocSegment12 = xferLocSegment12;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT13", nullable = true, length = 40)
    public String getXferLocSegment13() {
        return xferLocSegment13;
    }

    public void setXferLocSegment13(String xferLocSegment13) {
        this.xferLocSegment13 = xferLocSegment13;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT14", nullable = true, length = 40)
    public String getXferLocSegment14() {
        return xferLocSegment14;
    }

    public void setXferLocSegment14(String xferLocSegment14) {
        this.xferLocSegment14 = xferLocSegment14;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT15", nullable = true, length = 40)
    public String getXferLocSegment15() {
        return xferLocSegment15;
    }

    public void setXferLocSegment15(String xferLocSegment15) {
        this.xferLocSegment15 = xferLocSegment15;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT16", nullable = true, length = 40)
    public String getXferLocSegment16() {
        return xferLocSegment16;
    }

    public void setXferLocSegment16(String xferLocSegment16) {
        this.xferLocSegment16 = xferLocSegment16;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT17", nullable = true, length = 40)
    public String getXferLocSegment17() {
        return xferLocSegment17;
    }

    public void setXferLocSegment17(String xferLocSegment17) {
        this.xferLocSegment17 = xferLocSegment17;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT18", nullable = true, length = 40)
    public String getXferLocSegment18() {
        return xferLocSegment18;
    }

    public void setXferLocSegment18(String xferLocSegment18) {
        this.xferLocSegment18 = xferLocSegment18;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT19", nullable = true, length = 40)
    public String getXferLocSegment19() {
        return xferLocSegment19;
    }

    public void setXferLocSegment19(String xferLocSegment19) {
        this.xferLocSegment19 = xferLocSegment19;
    }

    @Basic
    @Column(name = "XFER_LOC_SEGMENT20", nullable = true, length = 40)
    public String getXferLocSegment20() {
        return xferLocSegment20;
    }

    public void setXferLocSegment20(String xferLocSegment20) {
        this.xferLocSegment20 = xferLocSegment20;
    }

    @Basic
    @Column(name = "SHIPMENT_NUMBER", nullable = true, length = 30)
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    @Basic
    @Column(name = "TRANSPORTATION_COST", nullable = true, precision = 0)
    public Long getTransportationCost() {
        return transportationCost;
    }

    public void setTransportationCost(Long transportationCost) {
        this.transportationCost = transportationCost;
    }

    @Basic
    @Column(name = "TRANSPORTATION_ACCOUNT", nullable = true, precision = 0)
    public Long getTransportationAccount() {
        return transportationAccount;
    }

    public void setTransportationAccount(Long transportationAccount) {
        this.transportationAccount = transportationAccount;
    }

    @Basic
    @Column(name = "TRANSFER_COST", nullable = true, precision = 0)
    public Long getTransferCost() {
        return transferCost;
    }

    public void setTransferCost(Long transferCost) {
        this.transferCost = transferCost;
    }

    @Basic
    @Column(name = "FREIGHT_CODE", nullable = true, length = 30)
    public String getFreightCode() {
        return freightCode;
    }

    public void setFreightCode(String freightCode) {
        this.freightCode = freightCode;
    }

    @Basic
    @Column(name = "CONTAINERS", nullable = true, precision = 0)
    public Long getContainers() {
        return containers;
    }

    public void setContainers(Long containers) {
        this.containers = containers;
    }

    @Basic
    @Column(name = "WAYBILL_AIRBILL", nullable = true, length = 20)
    public String getWaybillAirbill() {
        return waybillAirbill;
    }

    public void setWaybillAirbill(String waybillAirbill) {
        this.waybillAirbill = waybillAirbill;
    }

    @Basic
    @Column(name = "EXPECTED_ARRIVAL_DATE", nullable = true)
    public Time getExpectedArrivalDate() {
        return expectedArrivalDate;
    }

    public void setExpectedArrivalDate(Time expectedArrivalDate) {
        this.expectedArrivalDate = expectedArrivalDate;
    }

    @Basic
    @Column(name = "NEW_AVERAGE_COST", nullable = true, precision = 0)
    public Long getNewAverageCost() {
        return newAverageCost;
    }

    public void setNewAverageCost(Long newAverageCost) {
        this.newAverageCost = newAverageCost;
    }

    @Basic
    @Column(name = "VALUE_CHANGE", nullable = true, precision = 0)
    public Long getValueChange() {
        return valueChange;
    }

    public void setValueChange(Long valueChange) {
        this.valueChange = valueChange;
    }

    @Basic
    @Column(name = "PERCENTAGE_CHANGE", nullable = true, precision = 0)
    public Long getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(Long percentageChange) {
        this.percentageChange = percentageChange;
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
    @Column(name = "DEMAND_SOURCE_LINE", nullable = true, length = 30)
    public String getDemandSourceLine() {
        return demandSourceLine;
    }

    public void setDemandSourceLine(String demandSourceLine) {
        this.demandSourceLine = demandSourceLine;
    }

    @Basic
    @Column(name = "DEMAND_SOURCE_DELIVERY", nullable = true, length = 30)
    public String getDemandSourceDelivery() {
        return demandSourceDelivery;
    }

    public void setDemandSourceDelivery(String demandSourceDelivery) {
        this.demandSourceDelivery = demandSourceDelivery;
    }

    @Basic
    @Column(name = "NEGATIVE_REQ_FLAG", nullable = true, precision = 0)
    public Long getNegativeReqFlag() {
        return negativeReqFlag;
    }

    public void setNegativeReqFlag(Long negativeReqFlag) {
        this.negativeReqFlag = negativeReqFlag;
    }

    @Basic
    @Column(name = "ERROR_EXPLANATION", nullable = true, length = 240)
    public String getErrorExplanation() {
        return errorExplanation;
    }

    public void setErrorExplanation(String errorExplanation) {
        this.errorExplanation = errorExplanation;
    }

    @Basic
    @Column(name = "SHIPPABLE_FLAG", nullable = true, length = 1)
    public String getShippableFlag() {
        return shippableFlag;
    }

    public void setShippableFlag(String shippableFlag) {
        this.shippableFlag = shippableFlag;
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
    @Column(name = "REQUIRED_FLAG", nullable = true, length = 1)
    public String getRequiredFlag() {
        return requiredFlag;
    }

    public void setRequiredFlag(String requiredFlag) {
        this.requiredFlag = requiredFlag;
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

    @Basic
    @Column(name = "REQUISITION_DISTRIBUTION_ID", nullable = true, precision = 0)
    public Long getRequisitionDistributionId() {
        return requisitionDistributionId;
    }

    public void setRequisitionDistributionId(Long requisitionDistributionId) {
        this.requisitionDistributionId = requisitionDistributionId;
    }

    @Basic
    @Column(name = "MOVEMENT_ID", nullable = true, precision = 0)
    public Long getMovementId() {
        return movementId;
    }

    public void setMovementId(Long movementId) {
        this.movementId = movementId;
    }

    @Basic
    @Column(name = "RESERVATION_QUANTITY", nullable = true, precision = 0)
    public Long getReservationQuantity() {
        return reservationQuantity;
    }

    public void setReservationQuantity(Long reservationQuantity) {
        this.reservationQuantity = reservationQuantity;
    }

    @Basic
    @Column(name = "SHIPPED_QUANTITY", nullable = true, precision = 0)
    public Long getShippedQuantity() {
        return shippedQuantity;
    }

    public void setShippedQuantity(Long shippedQuantity) {
        this.shippedQuantity = shippedQuantity;
    }

    @Basic
    @Column(name = "INVENTORY_ITEM", nullable = true, length = 2000)
    public String getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(String inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Basic
    @Column(name = "LOCATOR_NAME", nullable = true, length = 2000)
    public String getLocatorName() {
        return locatorName;
    }

    public void setLocatorName(String locatorName) {
        this.locatorName = locatorName;
    }

    @Basic
    @Column(name = "TASK_ID", nullable = true, precision = 0)
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "TO_TASK_ID", nullable = true, precision = 0)
    public Long getToTaskId() {
        return toTaskId;
    }

    public void setToTaskId(Long toTaskId) {
        this.toTaskId = toTaskId;
    }

    @Basic
    @Column(name = "SOURCE_TASK_ID", nullable = true, precision = 0)
    public Long getSourceTaskId() {
        return sourceTaskId;
    }

    public void setSourceTaskId(Long sourceTaskId) {
        this.sourceTaskId = sourceTaskId;
    }

    @Basic
    @Column(name = "PROJECT_ID", nullable = true, precision = 0)
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "TO_PROJECT_ID", nullable = true, precision = 0)
    public Long getToProjectId() {
        return toProjectId;
    }

    public void setToProjectId(Long toProjectId) {
        this.toProjectId = toProjectId;
    }

    @Basic
    @Column(name = "SOURCE_PROJECT_ID", nullable = true, precision = 0)
    public Long getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(Long sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    @Basic
    @Column(name = "PA_EXPENDITURE_ORG_ID", nullable = true, precision = 0)
    public Long getPaExpenditureOrgId() {
        return paExpenditureOrgId;
    }

    public void setPaExpenditureOrgId(Long paExpenditureOrgId) {
        this.paExpenditureOrgId = paExpenditureOrgId;
    }

    @Basic
    @Column(name = "EXPENDITURE_TYPE", nullable = true, length = 30)
    public String getExpenditureType() {
        return expenditureType;
    }

    public void setExpenditureType(String expenditureType) {
        this.expenditureType = expenditureType;
    }

    @Basic
    @Column(name = "FINAL_COMPLETION_FLAG", nullable = true, length = 1)
    public String getFinalCompletionFlag() {
        return finalCompletionFlag;
    }

    public void setFinalCompletionFlag(String finalCompletionFlag) {
        this.finalCompletionFlag = finalCompletionFlag;
    }

    @Basic
    @Column(name = "TRANSFER_PERCENTAGE", nullable = true, precision = 0)
    public Long getTransferPercentage() {
        return transferPercentage;
    }

    public void setTransferPercentage(Long transferPercentage) {
        this.transferPercentage = transferPercentage;
    }

    @Basic
    @Column(name = "TRANSACTION_SEQUENCE_ID", nullable = true, precision = 0)
    public Long getTransactionSequenceId() {
        return transactionSequenceId;
    }

    public void setTransactionSequenceId(Long transactionSequenceId) {
        this.transactionSequenceId = transactionSequenceId;
    }

    @Basic
    @Column(name = "MATERIAL_ACCOUNT", nullable = true, precision = 0)
    public Long getMaterialAccount() {
        return materialAccount;
    }

    public void setMaterialAccount(Long materialAccount) {
        this.materialAccount = materialAccount;
    }

    @Basic
    @Column(name = "MATERIAL_OVERHEAD_ACCOUNT", nullable = true, precision = 0)
    public Long getMaterialOverheadAccount() {
        return materialOverheadAccount;
    }

    public void setMaterialOverheadAccount(Long materialOverheadAccount) {
        this.materialOverheadAccount = materialOverheadAccount;
    }

    @Basic
    @Column(name = "RESOURCE_ACCOUNT", nullable = true, precision = 0)
    public Long getResourceAccount() {
        return resourceAccount;
    }

    public void setResourceAccount(Long resourceAccount) {
        this.resourceAccount = resourceAccount;
    }

    @Basic
    @Column(name = "OUTSIDE_PROCESSING_ACCOUNT", nullable = true, precision = 0)
    public Long getOutsideProcessingAccount() {
        return outsideProcessingAccount;
    }

    public void setOutsideProcessingAccount(Long outsideProcessingAccount) {
        this.outsideProcessingAccount = outsideProcessingAccount;
    }

    @Basic
    @Column(name = "OVERHEAD_ACCOUNT", nullable = true, precision = 0)
    public Long getOverheadAccount() {
        return overheadAccount;
    }

    public void setOverheadAccount(Long overheadAccount) {
        this.overheadAccount = overheadAccount;
    }

    @Basic
    @Column(name = "BOM_REVISION", nullable = true, length = 3)
    public String getBomRevision() {
        return bomRevision;
    }

    public void setBomRevision(String bomRevision) {
        this.bomRevision = bomRevision;
    }

    @Basic
    @Column(name = "ROUTING_REVISION", nullable = true, length = 3)
    public String getRoutingRevision() {
        return routingRevision;
    }

    public void setRoutingRevision(String routingRevision) {
        this.routingRevision = routingRevision;
    }

    @Basic
    @Column(name = "BOM_REVISION_DATE", nullable = true)
    public Time getBomRevisionDate() {
        return bomRevisionDate;
    }

    public void setBomRevisionDate(Time bomRevisionDate) {
        this.bomRevisionDate = bomRevisionDate;
    }

    @Basic
    @Column(name = "ROUTING_REVISION_DATE", nullable = true)
    public Time getRoutingRevisionDate() {
        return routingRevisionDate;
    }

    public void setRoutingRevisionDate(Time routingRevisionDate) {
        this.routingRevisionDate = routingRevisionDate;
    }

    @Basic
    @Column(name = "ALTERNATE_BOM_DESIGNATOR", nullable = true, length = 10)
    public String getAlternateBomDesignator() {
        return alternateBomDesignator;
    }

    public void setAlternateBomDesignator(String alternateBomDesignator) {
        this.alternateBomDesignator = alternateBomDesignator;
    }

    @Basic
    @Column(name = "ALTERNATE_ROUTING_DESIGNATOR", nullable = true, length = 10)
    public String getAlternateRoutingDesignator() {
        return alternateRoutingDesignator;
    }

    public void setAlternateRoutingDesignator(String alternateRoutingDesignator) {
        this.alternateRoutingDesignator = alternateRoutingDesignator;
    }

    @Basic
    @Column(name = "ACCOUNTING_CLASS", nullable = true, length = 10)
    public String getAccountingClass() {
        return accountingClass;
    }

    public void setAccountingClass(String accountingClass) {
        this.accountingClass = accountingClass;
    }

    @Basic
    @Column(name = "DEMAND_CLASS", nullable = true, length = 30)
    public String getDemandClass() {
        return demandClass;
    }

    public void setDemandClass(String demandClass) {
        this.demandClass = demandClass;
    }

    @Basic
    @Column(name = "PARENT_ID", nullable = true, precision = 0)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "SUBSTITUTION_TYPE_ID", nullable = true, precision = 0)
    public Long getSubstitutionTypeId() {
        return substitutionTypeId;
    }

    public void setSubstitutionTypeId(Long substitutionTypeId) {
        this.substitutionTypeId = substitutionTypeId;
    }

    @Basic
    @Column(name = "SUBSTITUTION_ITEM_ID", nullable = true, precision = 0)
    public Long getSubstitutionItemId() {
        return substitutionItemId;
    }

    public void setSubstitutionItemId(Long substitutionItemId) {
        this.substitutionItemId = substitutionItemId;
    }

    @Basic
    @Column(name = "SCHEDULE_GROUP", nullable = true, precision = 0)
    public Long getScheduleGroup() {
        return scheduleGroup;
    }

    public void setScheduleGroup(Long scheduleGroup) {
        this.scheduleGroup = scheduleGroup;
    }

    @Basic
    @Column(name = "BUILD_SEQUENCE", nullable = true, precision = 0)
    public Long getBuildSequence() {
        return buildSequence;
    }

    public void setBuildSequence(Long buildSequence) {
        this.buildSequence = buildSequence;
    }

    @Basic
    @Column(name = "SCHEDULE_NUMBER", nullable = true, length = 30)
    public String getScheduleNumber() {
        return scheduleNumber;
    }

    public void setScheduleNumber(String scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    @Basic
    @Column(name = "SCHEDULED_FLAG", nullable = true, precision = 0)
    public Long getScheduledFlag() {
        return scheduledFlag;
    }

    public void setScheduledFlag(Long scheduledFlag) {
        this.scheduledFlag = scheduledFlag;
    }

    @Basic
    @Column(name = "FLOW_SCHEDULE", nullable = true, length = 1)
    public String getFlowSchedule() {
        return flowSchedule;
    }

    public void setFlowSchedule(String flowSchedule) {
        this.flowSchedule = flowSchedule;
    }

    @Basic
    @Column(name = "COST_GROUP_ID", nullable = true, precision = 0)
    public Long getCostGroupId() {
        return costGroupId;
    }

    public void setCostGroupId(Long costGroupId) {
        this.costGroupId = costGroupId;
    }

    @Basic
    @Column(name = "KANBAN_CARD_ID", nullable = true, precision = 0)
    public Long getKanbanCardId() {
        return kanbanCardId;
    }

    public void setKanbanCardId(Long kanbanCardId) {
        this.kanbanCardId = kanbanCardId;
    }

    @Basic
    @Column(name = "QA_COLLECTION_ID", nullable = true, precision = 0)
    public Long getQaCollectionId() {
        return qaCollectionId;
    }

    public void setQaCollectionId(Long qaCollectionId) {
        this.qaCollectionId = qaCollectionId;
    }

    @Basic
    @Column(name = "OVERCOMPLETION_TRANSACTION_QTY", nullable = true, precision = 0)
    public Long getOvercompletionTransactionQty() {
        return overcompletionTransactionQty;
    }

    public void setOvercompletionTransactionQty(Long overcompletionTransactionQty) {
        this.overcompletionTransactionQty = overcompletionTransactionQty;
    }

    @Basic
    @Column(name = "OVERCOMPLETION_PRIMARY_QTY", nullable = true, precision = 0)
    public Long getOvercompletionPrimaryQty() {
        return overcompletionPrimaryQty;
    }

    public void setOvercompletionPrimaryQty(Long overcompletionPrimaryQty) {
        this.overcompletionPrimaryQty = overcompletionPrimaryQty;
    }

    @Basic
    @Column(name = "OVERCOMPLETION_TRANSACTION_ID", nullable = true, precision = 0)
    public Long getOvercompletionTransactionId() {
        return overcompletionTransactionId;
    }

    public void setOvercompletionTransactionId(Long overcompletionTransactionId) {
        this.overcompletionTransactionId = overcompletionTransactionId;
    }

    @Basic
    @Column(name = "END_ITEM_UNIT_NUMBER", nullable = true, length = 60)
    public String getEndItemUnitNumber() {
        return endItemUnitNumber;
    }

    public void setEndItemUnitNumber(String endItemUnitNumber) {
        this.endItemUnitNumber = endItemUnitNumber;
    }

    @Basic
    @Column(name = "SCHEDULED_PAYBACK_DATE", nullable = true)
    public Time getScheduledPaybackDate() {
        return scheduledPaybackDate;
    }

    public void setScheduledPaybackDate(Time scheduledPaybackDate) {
        this.scheduledPaybackDate = scheduledPaybackDate;
    }

    @Basic
    @Column(name = "ORG_COST_GROUP_ID", nullable = true, precision = 0)
    public Long getOrgCostGroupId() {
        return orgCostGroupId;
    }

    public void setOrgCostGroupId(Long orgCostGroupId) {
        this.orgCostGroupId = orgCostGroupId;
    }

    @Basic
    @Column(name = "COST_TYPE_ID", nullable = true, precision = 0)
    public Long getCostTypeId() {
        return costTypeId;
    }

    public void setCostTypeId(Long costTypeId) {
        this.costTypeId = costTypeId;
    }

    @Basic
    @Column(name = "SOURCE_LOT_NUMBER", nullable = true, length = 30)
    public String getSourceLotNumber() {
        return sourceLotNumber;
    }

    public void setSourceLotNumber(String sourceLotNumber) {
        this.sourceLotNumber = sourceLotNumber;
    }

    @Basic
    @Column(name = "TRANSFER_COST_GROUP_ID", nullable = true, precision = 0)
    public Long getTransferCostGroupId() {
        return transferCostGroupId;
    }

    public void setTransferCostGroupId(Long transferCostGroupId) {
        this.transferCostGroupId = transferCostGroupId;
    }

    @Basic
    @Column(name = "LPN_ID", nullable = true, precision = 0)
    public Long getLpnId() {
        return lpnId;
    }

    public void setLpnId(Long lpnId) {
        this.lpnId = lpnId;
    }

    @Basic
    @Column(name = "TRANSFER_LPN_ID", nullable = true, precision = 0)
    public Long getTransferLpnId() {
        return transferLpnId;
    }

    public void setTransferLpnId(Long transferLpnId) {
        this.transferLpnId = transferLpnId;
    }

    @Basic
    @Column(name = "CONTENT_LPN_ID", nullable = true, precision = 0)
    public Long getContentLpnId() {
        return contentLpnId;
    }

    public void setContentLpnId(Long contentLpnId) {
        this.contentLpnId = contentLpnId;
    }

    @Basic
    @Column(name = "XML_DOCUMENT_ID", nullable = true, length = 240)
    public String getXmlDocumentId() {
        return xmlDocumentId;
    }

    public void setXmlDocumentId(String xmlDocumentId) {
        this.xmlDocumentId = xmlDocumentId;
    }

    @Basic
    @Column(name = "ORGANIZATION_TYPE", nullable = true, precision = 0)
    public Long getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Long organizationType) {
        this.organizationType = organizationType;
    }

    @Basic
    @Column(name = "TRANSFER_ORGANIZATION_TYPE", nullable = true, precision = 0)
    public Long getTransferOrganizationType() {
        return transferOrganizationType;
    }

    public void setTransferOrganizationType(Long transferOrganizationType) {
        this.transferOrganizationType = transferOrganizationType;
    }

    @Basic
    @Column(name = "OWNING_ORGANIZATION_ID", nullable = true, precision = 0)
    public Long getOwningOrganizationId() {
        return owningOrganizationId;
    }

    public void setOwningOrganizationId(Long owningOrganizationId) {
        this.owningOrganizationId = owningOrganizationId;
    }

    @Basic
    @Column(name = "OWNING_TP_TYPE", nullable = true, precision = 0)
    public Long getOwningTpType() {
        return owningTpType;
    }

    public void setOwningTpType(Long owningTpType) {
        this.owningTpType = owningTpType;
    }

    @Basic
    @Column(name = "XFR_OWNING_ORGANIZATION_ID", nullable = true, precision = 0)
    public Long getXfrOwningOrganizationId() {
        return xfrOwningOrganizationId;
    }

    public void setXfrOwningOrganizationId(Long xfrOwningOrganizationId) {
        this.xfrOwningOrganizationId = xfrOwningOrganizationId;
    }

    @Basic
    @Column(name = "TRANSFER_OWNING_TP_TYPE", nullable = true, precision = 0)
    public Long getTransferOwningTpType() {
        return transferOwningTpType;
    }

    public void setTransferOwningTpType(Long transferOwningTpType) {
        this.transferOwningTpType = transferOwningTpType;
    }

    @Basic
    @Column(name = "PLANNING_ORGANIZATION_ID", nullable = true, precision = 0)
    public Long getPlanningOrganizationId() {
        return planningOrganizationId;
    }

    public void setPlanningOrganizationId(Long planningOrganizationId) {
        this.planningOrganizationId = planningOrganizationId;
    }

    @Basic
    @Column(name = "PLANNING_TP_TYPE", nullable = true, precision = 0)
    public Long getPlanningTpType() {
        return planningTpType;
    }

    public void setPlanningTpType(Long planningTpType) {
        this.planningTpType = planningTpType;
    }

    @Basic
    @Column(name = "XFR_PLANNING_ORGANIZATION_ID", nullable = true, precision = 0)
    public Long getXfrPlanningOrganizationId() {
        return xfrPlanningOrganizationId;
    }

    public void setXfrPlanningOrganizationId(Long xfrPlanningOrganizationId) {
        this.xfrPlanningOrganizationId = xfrPlanningOrganizationId;
    }

    @Basic
    @Column(name = "TRANSFER_PLANNING_TP_TYPE", nullable = true, precision = 0)
    public Long getTransferPlanningTpType() {
        return transferPlanningTpType;
    }

    public void setTransferPlanningTpType(Long transferPlanningTpType) {
        this.transferPlanningTpType = transferPlanningTpType;
    }

    @Basic
    @Column(name = "SECONDARY_UOM_CODE", nullable = true, length = 240)
    public String getSecondaryUomCode() {
        return secondaryUomCode;
    }

    public void setSecondaryUomCode(String secondaryUomCode) {
        this.secondaryUomCode = secondaryUomCode;
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
    @Column(name = "TRANSACTION_GROUP_ID", nullable = true, precision = 0)
    public Long getTransactionGroupId() {
        return transactionGroupId;
    }

    public void setTransactionGroupId(Long transactionGroupId) {
        this.transactionGroupId = transactionGroupId;
    }

    @Basic
    @Column(name = "TRANSACTION_GROUP_SEQ", nullable = true, precision = 0)
    public Long getTransactionGroupSeq() {
        return transactionGroupSeq;
    }

    public void setTransactionGroupSeq(Long transactionGroupSeq) {
        this.transactionGroupSeq = transactionGroupSeq;
    }

    @Basic
    @Column(name = "REPRESENTATIVE_LOT_NUMBER", nullable = true, length = 30)
    public String getRepresentativeLotNumber() {
        return representativeLotNumber;
    }

    public void setRepresentativeLotNumber(String representativeLotNumber) {
        this.representativeLotNumber = representativeLotNumber;
    }

    @Basic
    @Column(name = "TRANSACTION_BATCH_ID", nullable = true, precision = 0)
    public Long getTransactionBatchId() {
        return transactionBatchId;
    }

    public void setTransactionBatchId(Long transactionBatchId) {
        this.transactionBatchId = transactionBatchId;
    }

    @Basic
    @Column(name = "TRANSACTION_BATCH_SEQ", nullable = true, precision = 0)
    public Long getTransactionBatchSeq() {
        return transactionBatchSeq;
    }

    public void setTransactionBatchSeq(Long transactionBatchSeq) {
        this.transactionBatchSeq = transactionBatchSeq;
    }

    @Basic
    @Column(name = "REBUILD_ITEM_ID", nullable = true, precision = 0)
    public Long getRebuildItemId() {
        return rebuildItemId;
    }

    public void setRebuildItemId(Long rebuildItemId) {
        this.rebuildItemId = rebuildItemId;
    }

    @Basic
    @Column(name = "REBUILD_SERIAL_NUMBER", nullable = true, length = 30)
    public String getRebuildSerialNumber() {
        return rebuildSerialNumber;
    }

    public void setRebuildSerialNumber(String rebuildSerialNumber) {
        this.rebuildSerialNumber = rebuildSerialNumber;
    }

    @Basic
    @Column(name = "REBUILD_ACTIVITY_ID", nullable = true, precision = 0)
    public Long getRebuildActivityId() {
        return rebuildActivityId;
    }

    public void setRebuildActivityId(Long rebuildActivityId) {
        this.rebuildActivityId = rebuildActivityId;
    }

    @Basic
    @Column(name = "REBUILD_JOB_NAME", nullable = true, length = 240)
    public String getRebuildJobName() {
        return rebuildJobName;
    }

    public void setRebuildJobName(String rebuildJobName) {
        this.rebuildJobName = rebuildJobName;
    }

    @Basic
    @Column(name = "MOVE_TRANSACTION_ID", nullable = true, precision = 0)
    public Long getMoveTransactionId() {
        return moveTransactionId;
    }

    public void setMoveTransactionId(Long moveTransactionId) {
        this.moveTransactionId = moveTransactionId;
    }

    @Basic
    @Column(name = "COMPLETION_TRANSACTION_ID", nullable = true, precision = 0)
    public Long getCompletionTransactionId() {
        return completionTransactionId;
    }

    public void setCompletionTransactionId(Long completionTransactionId) {
        this.completionTransactionId = completionTransactionId;
    }

    @Basic
    @Column(name = "WIP_SUPPLY_TYPE", nullable = true, precision = 0)
    public Long getWipSupplyType() {
        return wipSupplyType;
    }

    public void setWipSupplyType(Long wipSupplyType) {
        this.wipSupplyType = wipSupplyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MtlTransactionsInterface that = (MtlTransactionsInterface) o;

        if (sourceLineId != that.sourceLineId) return false;
        if (sourceHeaderId != that.sourceHeaderId) return false;
        if (processFlag != that.processFlag) return false;
        if (transactionMode != that.transactionMode) return false;
        if (lastUpdatedBy != that.lastUpdatedBy) return false;
        if (createdBy != that.createdBy) return false;
        if (organizationId != that.organizationId) return false;
        if (transactionQuantity != that.transactionQuantity) return false;
        if (transactionTypeId != that.transactionTypeId) return false;
        if (transactionInterfaceId != null ? !transactionInterfaceId.equals(that.transactionInterfaceId) : that.transactionInterfaceId != null)
            return false;
        if (transactionHeaderId != null ? !transactionHeaderId.equals(that.transactionHeaderId) : that.transactionHeaderId != null)
            return false;
        if (sourceCode != null ? !sourceCode.equals(that.sourceCode) : that.sourceCode != null) return false;
        if (validationRequired != null ? !validationRequired.equals(that.validationRequired) : that.validationRequired != null)
            return false;
        if (lockFlag != null ? !lockFlag.equals(that.lockFlag) : that.lockFlag != null) return false;
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
        if (inventoryItemId != null ? !inventoryItemId.equals(that.inventoryItemId) : that.inventoryItemId != null)
            return false;
        if (itemSegment1 != null ? !itemSegment1.equals(that.itemSegment1) : that.itemSegment1 != null) return false;
        if (itemSegment2 != null ? !itemSegment2.equals(that.itemSegment2) : that.itemSegment2 != null) return false;
        if (itemSegment3 != null ? !itemSegment3.equals(that.itemSegment3) : that.itemSegment3 != null) return false;
        if (itemSegment4 != null ? !itemSegment4.equals(that.itemSegment4) : that.itemSegment4 != null) return false;
        if (itemSegment5 != null ? !itemSegment5.equals(that.itemSegment5) : that.itemSegment5 != null) return false;
        if (itemSegment6 != null ? !itemSegment6.equals(that.itemSegment6) : that.itemSegment6 != null) return false;
        if (itemSegment7 != null ? !itemSegment7.equals(that.itemSegment7) : that.itemSegment7 != null) return false;
        if (itemSegment8 != null ? !itemSegment8.equals(that.itemSegment8) : that.itemSegment8 != null) return false;
        if (itemSegment9 != null ? !itemSegment9.equals(that.itemSegment9) : that.itemSegment9 != null) return false;
        if (itemSegment10 != null ? !itemSegment10.equals(that.itemSegment10) : that.itemSegment10 != null)
            return false;
        if (itemSegment11 != null ? !itemSegment11.equals(that.itemSegment11) : that.itemSegment11 != null)
            return false;
        if (itemSegment12 != null ? !itemSegment12.equals(that.itemSegment12) : that.itemSegment12 != null)
            return false;
        if (itemSegment13 != null ? !itemSegment13.equals(that.itemSegment13) : that.itemSegment13 != null)
            return false;
        if (itemSegment14 != null ? !itemSegment14.equals(that.itemSegment14) : that.itemSegment14 != null)
            return false;
        if (itemSegment15 != null ? !itemSegment15.equals(that.itemSegment15) : that.itemSegment15 != null)
            return false;
        if (itemSegment16 != null ? !itemSegment16.equals(that.itemSegment16) : that.itemSegment16 != null)
            return false;
        if (itemSegment17 != null ? !itemSegment17.equals(that.itemSegment17) : that.itemSegment17 != null)
            return false;
        if (itemSegment18 != null ? !itemSegment18.equals(that.itemSegment18) : that.itemSegment18 != null)
            return false;
        if (itemSegment19 != null ? !itemSegment19.equals(that.itemSegment19) : that.itemSegment19 != null)
            return false;
        if (itemSegment20 != null ? !itemSegment20.equals(that.itemSegment20) : that.itemSegment20 != null)
            return false;
        if (revision != null ? !revision.equals(that.revision) : that.revision != null) return false;
        if (primaryQuantity != null ? !primaryQuantity.equals(that.primaryQuantity) : that.primaryQuantity != null)
            return false;
        if (transactionUom != null ? !transactionUom.equals(that.transactionUom) : that.transactionUom != null)
            return false;
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate) : that.transactionDate != null)
            return false;
        if (acctPeriodId != null ? !acctPeriodId.equals(that.acctPeriodId) : that.acctPeriodId != null) return false;
        if (subinventoryCode != null ? !subinventoryCode.equals(that.subinventoryCode) : that.subinventoryCode != null)
            return false;
        if (locatorId != null ? !locatorId.equals(that.locatorId) : that.locatorId != null) return false;
        if (locSegment1 != null ? !locSegment1.equals(that.locSegment1) : that.locSegment1 != null) return false;
        if (locSegment2 != null ? !locSegment2.equals(that.locSegment2) : that.locSegment2 != null) return false;
        if (locSegment3 != null ? !locSegment3.equals(that.locSegment3) : that.locSegment3 != null) return false;
        if (locSegment4 != null ? !locSegment4.equals(that.locSegment4) : that.locSegment4 != null) return false;
        if (locSegment5 != null ? !locSegment5.equals(that.locSegment5) : that.locSegment5 != null) return false;
        if (locSegment6 != null ? !locSegment6.equals(that.locSegment6) : that.locSegment6 != null) return false;
        if (locSegment7 != null ? !locSegment7.equals(that.locSegment7) : that.locSegment7 != null) return false;
        if (locSegment8 != null ? !locSegment8.equals(that.locSegment8) : that.locSegment8 != null) return false;
        if (locSegment9 != null ? !locSegment9.equals(that.locSegment9) : that.locSegment9 != null) return false;
        if (locSegment10 != null ? !locSegment10.equals(that.locSegment10) : that.locSegment10 != null) return false;
        if (locSegment11 != null ? !locSegment11.equals(that.locSegment11) : that.locSegment11 != null) return false;
        if (locSegment12 != null ? !locSegment12.equals(that.locSegment12) : that.locSegment12 != null) return false;
        if (locSegment13 != null ? !locSegment13.equals(that.locSegment13) : that.locSegment13 != null) return false;
        if (locSegment14 != null ? !locSegment14.equals(that.locSegment14) : that.locSegment14 != null) return false;
        if (locSegment15 != null ? !locSegment15.equals(that.locSegment15) : that.locSegment15 != null) return false;
        if (locSegment16 != null ? !locSegment16.equals(that.locSegment16) : that.locSegment16 != null) return false;
        if (locSegment17 != null ? !locSegment17.equals(that.locSegment17) : that.locSegment17 != null) return false;
        if (locSegment18 != null ? !locSegment18.equals(that.locSegment18) : that.locSegment18 != null) return false;
        if (locSegment19 != null ? !locSegment19.equals(that.locSegment19) : that.locSegment19 != null) return false;
        if (locSegment20 != null ? !locSegment20.equals(that.locSegment20) : that.locSegment20 != null) return false;
        if (transactionSourceId != null ? !transactionSourceId.equals(that.transactionSourceId) : that.transactionSourceId != null)
            return false;
        if (dspSegment1 != null ? !dspSegment1.equals(that.dspSegment1) : that.dspSegment1 != null) return false;
        if (dspSegment2 != null ? !dspSegment2.equals(that.dspSegment2) : that.dspSegment2 != null) return false;
        if (dspSegment3 != null ? !dspSegment3.equals(that.dspSegment3) : that.dspSegment3 != null) return false;
        if (dspSegment4 != null ? !dspSegment4.equals(that.dspSegment4) : that.dspSegment4 != null) return false;
        if (dspSegment5 != null ? !dspSegment5.equals(that.dspSegment5) : that.dspSegment5 != null) return false;
        if (dspSegment6 != null ? !dspSegment6.equals(that.dspSegment6) : that.dspSegment6 != null) return false;
        if (dspSegment7 != null ? !dspSegment7.equals(that.dspSegment7) : that.dspSegment7 != null) return false;
        if (dspSegment8 != null ? !dspSegment8.equals(that.dspSegment8) : that.dspSegment8 != null) return false;
        if (dspSegment9 != null ? !dspSegment9.equals(that.dspSegment9) : that.dspSegment9 != null) return false;
        if (dspSegment10 != null ? !dspSegment10.equals(that.dspSegment10) : that.dspSegment10 != null) return false;
        if (dspSegment11 != null ? !dspSegment11.equals(that.dspSegment11) : that.dspSegment11 != null) return false;
        if (dspSegment12 != null ? !dspSegment12.equals(that.dspSegment12) : that.dspSegment12 != null) return false;
        if (dspSegment13 != null ? !dspSegment13.equals(that.dspSegment13) : that.dspSegment13 != null) return false;
        if (dspSegment14 != null ? !dspSegment14.equals(that.dspSegment14) : that.dspSegment14 != null) return false;
        if (dspSegment15 != null ? !dspSegment15.equals(that.dspSegment15) : that.dspSegment15 != null) return false;
        if (dspSegment16 != null ? !dspSegment16.equals(that.dspSegment16) : that.dspSegment16 != null) return false;
        if (dspSegment17 != null ? !dspSegment17.equals(that.dspSegment17) : that.dspSegment17 != null) return false;
        if (dspSegment18 != null ? !dspSegment18.equals(that.dspSegment18) : that.dspSegment18 != null) return false;
        if (dspSegment19 != null ? !dspSegment19.equals(that.dspSegment19) : that.dspSegment19 != null) return false;
        if (dspSegment20 != null ? !dspSegment20.equals(that.dspSegment20) : that.dspSegment20 != null) return false;
        if (dspSegment21 != null ? !dspSegment21.equals(that.dspSegment21) : that.dspSegment21 != null) return false;
        if (dspSegment22 != null ? !dspSegment22.equals(that.dspSegment22) : that.dspSegment22 != null) return false;
        if (dspSegment23 != null ? !dspSegment23.equals(that.dspSegment23) : that.dspSegment23 != null) return false;
        if (dspSegment24 != null ? !dspSegment24.equals(that.dspSegment24) : that.dspSegment24 != null) return false;
        if (dspSegment25 != null ? !dspSegment25.equals(that.dspSegment25) : that.dspSegment25 != null) return false;
        if (dspSegment26 != null ? !dspSegment26.equals(that.dspSegment26) : that.dspSegment26 != null) return false;
        if (dspSegment27 != null ? !dspSegment27.equals(that.dspSegment27) : that.dspSegment27 != null) return false;
        if (dspSegment28 != null ? !dspSegment28.equals(that.dspSegment28) : that.dspSegment28 != null) return false;
        if (dspSegment29 != null ? !dspSegment29.equals(that.dspSegment29) : that.dspSegment29 != null) return false;
        if (dspSegment30 != null ? !dspSegment30.equals(that.dspSegment30) : that.dspSegment30 != null) return false;
        if (transactionSourceName != null ? !transactionSourceName.equals(that.transactionSourceName) : that.transactionSourceName != null)
            return false;
        if (transactionSourceTypeId != null ? !transactionSourceTypeId.equals(that.transactionSourceTypeId) : that.transactionSourceTypeId != null)
            return false;
        if (transactionActionId != null ? !transactionActionId.equals(that.transactionActionId) : that.transactionActionId != null)
            return false;
        if (reasonId != null ? !reasonId.equals(that.reasonId) : that.reasonId != null) return false;
        if (transactionReference != null ? !transactionReference.equals(that.transactionReference) : that.transactionReference != null)
            return false;
        if (transactionCost != null ? !transactionCost.equals(that.transactionCost) : that.transactionCost != null)
            return false;
        if (distributionAccountId != null ? !distributionAccountId.equals(that.distributionAccountId) : that.distributionAccountId != null)
            return false;
        if (dstSegment1 != null ? !dstSegment1.equals(that.dstSegment1) : that.dstSegment1 != null) return false;
        if (dstSegment2 != null ? !dstSegment2.equals(that.dstSegment2) : that.dstSegment2 != null) return false;
        if (dstSegment3 != null ? !dstSegment3.equals(that.dstSegment3) : that.dstSegment3 != null) return false;
        if (dstSegment4 != null ? !dstSegment4.equals(that.dstSegment4) : that.dstSegment4 != null) return false;
        if (dstSegment5 != null ? !dstSegment5.equals(that.dstSegment5) : that.dstSegment5 != null) return false;
        if (dstSegment6 != null ? !dstSegment6.equals(that.dstSegment6) : that.dstSegment6 != null) return false;
        if (dstSegment7 != null ? !dstSegment7.equals(that.dstSegment7) : that.dstSegment7 != null) return false;
        if (dstSegment8 != null ? !dstSegment8.equals(that.dstSegment8) : that.dstSegment8 != null) return false;
        if (dstSegment9 != null ? !dstSegment9.equals(that.dstSegment9) : that.dstSegment9 != null) return false;
        if (dstSegment10 != null ? !dstSegment10.equals(that.dstSegment10) : that.dstSegment10 != null) return false;
        if (dstSegment11 != null ? !dstSegment11.equals(that.dstSegment11) : that.dstSegment11 != null) return false;
        if (dstSegment12 != null ? !dstSegment12.equals(that.dstSegment12) : that.dstSegment12 != null) return false;
        if (dstSegment13 != null ? !dstSegment13.equals(that.dstSegment13) : that.dstSegment13 != null) return false;
        if (dstSegment14 != null ? !dstSegment14.equals(that.dstSegment14) : that.dstSegment14 != null) return false;
        if (dstSegment15 != null ? !dstSegment15.equals(that.dstSegment15) : that.dstSegment15 != null) return false;
        if (dstSegment16 != null ? !dstSegment16.equals(that.dstSegment16) : that.dstSegment16 != null) return false;
        if (dstSegment17 != null ? !dstSegment17.equals(that.dstSegment17) : that.dstSegment17 != null) return false;
        if (dstSegment18 != null ? !dstSegment18.equals(that.dstSegment18) : that.dstSegment18 != null) return false;
        if (dstSegment19 != null ? !dstSegment19.equals(that.dstSegment19) : that.dstSegment19 != null) return false;
        if (dstSegment20 != null ? !dstSegment20.equals(that.dstSegment20) : that.dstSegment20 != null) return false;
        if (dstSegment21 != null ? !dstSegment21.equals(that.dstSegment21) : that.dstSegment21 != null) return false;
        if (dstSegment22 != null ? !dstSegment22.equals(that.dstSegment22) : that.dstSegment22 != null) return false;
        if (dstSegment23 != null ? !dstSegment23.equals(that.dstSegment23) : that.dstSegment23 != null) return false;
        if (dstSegment24 != null ? !dstSegment24.equals(that.dstSegment24) : that.dstSegment24 != null) return false;
        if (dstSegment25 != null ? !dstSegment25.equals(that.dstSegment25) : that.dstSegment25 != null) return false;
        if (dstSegment26 != null ? !dstSegment26.equals(that.dstSegment26) : that.dstSegment26 != null) return false;
        if (dstSegment27 != null ? !dstSegment27.equals(that.dstSegment27) : that.dstSegment27 != null) return false;
        if (dstSegment28 != null ? !dstSegment28.equals(that.dstSegment28) : that.dstSegment28 != null) return false;
        if (dstSegment29 != null ? !dstSegment29.equals(that.dstSegment29) : that.dstSegment29 != null) return false;
        if (dstSegment30 != null ? !dstSegment30.equals(that.dstSegment30) : that.dstSegment30 != null) return false;
        if (requisitionLineId != null ? !requisitionLineId.equals(that.requisitionLineId) : that.requisitionLineId != null)
            return false;
        if (currencyCode != null ? !currencyCode.equals(that.currencyCode) : that.currencyCode != null) return false;
        if (currencyConversionDate != null ? !currencyConversionDate.equals(that.currencyConversionDate) : that.currencyConversionDate != null)
            return false;
        if (currencyConversionType != null ? !currencyConversionType.equals(that.currencyConversionType) : that.currencyConversionType != null)
            return false;
        if (currencyConversionRate != null ? !currencyConversionRate.equals(that.currencyConversionRate) : that.currencyConversionRate != null)
            return false;
        if (ussglTransactionCode != null ? !ussglTransactionCode.equals(that.ussglTransactionCode) : that.ussglTransactionCode != null)
            return false;
        if (wipEntityType != null ? !wipEntityType.equals(that.wipEntityType) : that.wipEntityType != null)
            return false;
        if (scheduleId != null ? !scheduleId.equals(that.scheduleId) : that.scheduleId != null) return false;
        if (employeeCode != null ? !employeeCode.equals(that.employeeCode) : that.employeeCode != null) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;
        if (scheduleUpdateCode != null ? !scheduleUpdateCode.equals(that.scheduleUpdateCode) : that.scheduleUpdateCode != null)
            return false;
        if (setupTeardownCode != null ? !setupTeardownCode.equals(that.setupTeardownCode) : that.setupTeardownCode != null)
            return false;
        if (primarySwitch != null ? !primarySwitch.equals(that.primarySwitch) : that.primarySwitch != null)
            return false;
        if (mrpCode != null ? !mrpCode.equals(that.mrpCode) : that.mrpCode != null) return false;
        if (operationSeqNum != null ? !operationSeqNum.equals(that.operationSeqNum) : that.operationSeqNum != null)
            return false;
        if (repetitiveLineId != null ? !repetitiveLineId.equals(that.repetitiveLineId) : that.repetitiveLineId != null)
            return false;
        if (pickingLineId != null ? !pickingLineId.equals(that.pickingLineId) : that.pickingLineId != null)
            return false;
        if (trxSourceLineId != null ? !trxSourceLineId.equals(that.trxSourceLineId) : that.trxSourceLineId != null)
            return false;
        if (trxSourceDeliveryId != null ? !trxSourceDeliveryId.equals(that.trxSourceDeliveryId) : that.trxSourceDeliveryId != null)
            return false;
        if (demandId != null ? !demandId.equals(that.demandId) : that.demandId != null) return false;
        if (customerShipId != null ? !customerShipId.equals(that.customerShipId) : that.customerShipId != null)
            return false;
        if (lineItemNum != null ? !lineItemNum.equals(that.lineItemNum) : that.lineItemNum != null) return false;
        if (receivingDocument != null ? !receivingDocument.equals(that.receivingDocument) : that.receivingDocument != null)
            return false;
        if (rcvTransactionId != null ? !rcvTransactionId.equals(that.rcvTransactionId) : that.rcvTransactionId != null)
            return false;
        if (shipToLocationId != null ? !shipToLocationId.equals(that.shipToLocationId) : that.shipToLocationId != null)
            return false;
        if (encumbranceAccount != null ? !encumbranceAccount.equals(that.encumbranceAccount) : that.encumbranceAccount != null)
            return false;
        if (encumbranceAmount != null ? !encumbranceAmount.equals(that.encumbranceAmount) : that.encumbranceAmount != null)
            return false;
        if (vendorLotNumber != null ? !vendorLotNumber.equals(that.vendorLotNumber) : that.vendorLotNumber != null)
            return false;
        if (transferSubinventory != null ? !transferSubinventory.equals(that.transferSubinventory) : that.transferSubinventory != null)
            return false;
        if (transferOrganization != null ? !transferOrganization.equals(that.transferOrganization) : that.transferOrganization != null)
            return false;
        if (transferLocator != null ? !transferLocator.equals(that.transferLocator) : that.transferLocator != null)
            return false;
        if (xferLocSegment1 != null ? !xferLocSegment1.equals(that.xferLocSegment1) : that.xferLocSegment1 != null)
            return false;
        if (xferLocSegment2 != null ? !xferLocSegment2.equals(that.xferLocSegment2) : that.xferLocSegment2 != null)
            return false;
        if (xferLocSegment3 != null ? !xferLocSegment3.equals(that.xferLocSegment3) : that.xferLocSegment3 != null)
            return false;
        if (xferLocSegment4 != null ? !xferLocSegment4.equals(that.xferLocSegment4) : that.xferLocSegment4 != null)
            return false;
        if (xferLocSegment5 != null ? !xferLocSegment5.equals(that.xferLocSegment5) : that.xferLocSegment5 != null)
            return false;
        if (xferLocSegment6 != null ? !xferLocSegment6.equals(that.xferLocSegment6) : that.xferLocSegment6 != null)
            return false;
        if (xferLocSegment7 != null ? !xferLocSegment7.equals(that.xferLocSegment7) : that.xferLocSegment7 != null)
            return false;
        if (xferLocSegment8 != null ? !xferLocSegment8.equals(that.xferLocSegment8) : that.xferLocSegment8 != null)
            return false;
        if (xferLocSegment9 != null ? !xferLocSegment9.equals(that.xferLocSegment9) : that.xferLocSegment9 != null)
            return false;
        if (xferLocSegment10 != null ? !xferLocSegment10.equals(that.xferLocSegment10) : that.xferLocSegment10 != null)
            return false;
        if (xferLocSegment11 != null ? !xferLocSegment11.equals(that.xferLocSegment11) : that.xferLocSegment11 != null)
            return false;
        if (xferLocSegment12 != null ? !xferLocSegment12.equals(that.xferLocSegment12) : that.xferLocSegment12 != null)
            return false;
        if (xferLocSegment13 != null ? !xferLocSegment13.equals(that.xferLocSegment13) : that.xferLocSegment13 != null)
            return false;
        if (xferLocSegment14 != null ? !xferLocSegment14.equals(that.xferLocSegment14) : that.xferLocSegment14 != null)
            return false;
        if (xferLocSegment15 != null ? !xferLocSegment15.equals(that.xferLocSegment15) : that.xferLocSegment15 != null)
            return false;
        if (xferLocSegment16 != null ? !xferLocSegment16.equals(that.xferLocSegment16) : that.xferLocSegment16 != null)
            return false;
        if (xferLocSegment17 != null ? !xferLocSegment17.equals(that.xferLocSegment17) : that.xferLocSegment17 != null)
            return false;
        if (xferLocSegment18 != null ? !xferLocSegment18.equals(that.xferLocSegment18) : that.xferLocSegment18 != null)
            return false;
        if (xferLocSegment19 != null ? !xferLocSegment19.equals(that.xferLocSegment19) : that.xferLocSegment19 != null)
            return false;
        if (xferLocSegment20 != null ? !xferLocSegment20.equals(that.xferLocSegment20) : that.xferLocSegment20 != null)
            return false;
        if (shipmentNumber != null ? !shipmentNumber.equals(that.shipmentNumber) : that.shipmentNumber != null)
            return false;
        if (transportationCost != null ? !transportationCost.equals(that.transportationCost) : that.transportationCost != null)
            return false;
        if (transportationAccount != null ? !transportationAccount.equals(that.transportationAccount) : that.transportationAccount != null)
            return false;
        if (transferCost != null ? !transferCost.equals(that.transferCost) : that.transferCost != null) return false;
        if (freightCode != null ? !freightCode.equals(that.freightCode) : that.freightCode != null) return false;
        if (containers != null ? !containers.equals(that.containers) : that.containers != null) return false;
        if (waybillAirbill != null ? !waybillAirbill.equals(that.waybillAirbill) : that.waybillAirbill != null)
            return false;
        if (expectedArrivalDate != null ? !expectedArrivalDate.equals(that.expectedArrivalDate) : that.expectedArrivalDate != null)
            return false;
        if (newAverageCost != null ? !newAverageCost.equals(that.newAverageCost) : that.newAverageCost != null)
            return false;
        if (valueChange != null ? !valueChange.equals(that.valueChange) : that.valueChange != null) return false;
        if (percentageChange != null ? !percentageChange.equals(that.percentageChange) : that.percentageChange != null)
            return false;
        if (demandSourceHeaderId != null ? !demandSourceHeaderId.equals(that.demandSourceHeaderId) : that.demandSourceHeaderId != null)
            return false;
        if (demandSourceLine != null ? !demandSourceLine.equals(that.demandSourceLine) : that.demandSourceLine != null)
            return false;
        if (demandSourceDelivery != null ? !demandSourceDelivery.equals(that.demandSourceDelivery) : that.demandSourceDelivery != null)
            return false;
        if (negativeReqFlag != null ? !negativeReqFlag.equals(that.negativeReqFlag) : that.negativeReqFlag != null)
            return false;
        if (errorExplanation != null ? !errorExplanation.equals(that.errorExplanation) : that.errorExplanation != null)
            return false;
        if (shippableFlag != null ? !shippableFlag.equals(that.shippableFlag) : that.shippableFlag != null)
            return false;
        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        if (requiredFlag != null ? !requiredFlag.equals(that.requiredFlag) : that.requiredFlag != null) return false;
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
        if (requisitionDistributionId != null ? !requisitionDistributionId.equals(that.requisitionDistributionId) : that.requisitionDistributionId != null)
            return false;
        if (movementId != null ? !movementId.equals(that.movementId) : that.movementId != null) return false;
        if (reservationQuantity != null ? !reservationQuantity.equals(that.reservationQuantity) : that.reservationQuantity != null)
            return false;
        if (shippedQuantity != null ? !shippedQuantity.equals(that.shippedQuantity) : that.shippedQuantity != null)
            return false;
        if (inventoryItem != null ? !inventoryItem.equals(that.inventoryItem) : that.inventoryItem != null)
            return false;
        if (locatorName != null ? !locatorName.equals(that.locatorName) : that.locatorName != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (toTaskId != null ? !toTaskId.equals(that.toTaskId) : that.toTaskId != null) return false;
        if (sourceTaskId != null ? !sourceTaskId.equals(that.sourceTaskId) : that.sourceTaskId != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (toProjectId != null ? !toProjectId.equals(that.toProjectId) : that.toProjectId != null) return false;
        if (sourceProjectId != null ? !sourceProjectId.equals(that.sourceProjectId) : that.sourceProjectId != null)
            return false;
        if (paExpenditureOrgId != null ? !paExpenditureOrgId.equals(that.paExpenditureOrgId) : that.paExpenditureOrgId != null)
            return false;
        if (expenditureType != null ? !expenditureType.equals(that.expenditureType) : that.expenditureType != null)
            return false;
        if (finalCompletionFlag != null ? !finalCompletionFlag.equals(that.finalCompletionFlag) : that.finalCompletionFlag != null)
            return false;
        if (transferPercentage != null ? !transferPercentage.equals(that.transferPercentage) : that.transferPercentage != null)
            return false;
        if (transactionSequenceId != null ? !transactionSequenceId.equals(that.transactionSequenceId) : that.transactionSequenceId != null)
            return false;
        if (materialAccount != null ? !materialAccount.equals(that.materialAccount) : that.materialAccount != null)
            return false;
        if (materialOverheadAccount != null ? !materialOverheadAccount.equals(that.materialOverheadAccount) : that.materialOverheadAccount != null)
            return false;
        if (resourceAccount != null ? !resourceAccount.equals(that.resourceAccount) : that.resourceAccount != null)
            return false;
        if (outsideProcessingAccount != null ? !outsideProcessingAccount.equals(that.outsideProcessingAccount) : that.outsideProcessingAccount != null)
            return false;
        if (overheadAccount != null ? !overheadAccount.equals(that.overheadAccount) : that.overheadAccount != null)
            return false;
        if (bomRevision != null ? !bomRevision.equals(that.bomRevision) : that.bomRevision != null) return false;
        if (routingRevision != null ? !routingRevision.equals(that.routingRevision) : that.routingRevision != null)
            return false;
        if (bomRevisionDate != null ? !bomRevisionDate.equals(that.bomRevisionDate) : that.bomRevisionDate != null)
            return false;
        if (routingRevisionDate != null ? !routingRevisionDate.equals(that.routingRevisionDate) : that.routingRevisionDate != null)
            return false;
        if (alternateBomDesignator != null ? !alternateBomDesignator.equals(that.alternateBomDesignator) : that.alternateBomDesignator != null)
            return false;
        if (alternateRoutingDesignator != null ? !alternateRoutingDesignator.equals(that.alternateRoutingDesignator) : that.alternateRoutingDesignator != null)
            return false;
        if (accountingClass != null ? !accountingClass.equals(that.accountingClass) : that.accountingClass != null)
            return false;
        if (demandClass != null ? !demandClass.equals(that.demandClass) : that.demandClass != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (substitutionTypeId != null ? !substitutionTypeId.equals(that.substitutionTypeId) : that.substitutionTypeId != null)
            return false;
        if (substitutionItemId != null ? !substitutionItemId.equals(that.substitutionItemId) : that.substitutionItemId != null)
            return false;
        if (scheduleGroup != null ? !scheduleGroup.equals(that.scheduleGroup) : that.scheduleGroup != null)
            return false;
        if (buildSequence != null ? !buildSequence.equals(that.buildSequence) : that.buildSequence != null)
            return false;
        if (scheduleNumber != null ? !scheduleNumber.equals(that.scheduleNumber) : that.scheduleNumber != null)
            return false;
        if (scheduledFlag != null ? !scheduledFlag.equals(that.scheduledFlag) : that.scheduledFlag != null)
            return false;
        if (flowSchedule != null ? !flowSchedule.equals(that.flowSchedule) : that.flowSchedule != null) return false;
        if (costGroupId != null ? !costGroupId.equals(that.costGroupId) : that.costGroupId != null) return false;
        if (kanbanCardId != null ? !kanbanCardId.equals(that.kanbanCardId) : that.kanbanCardId != null) return false;
        if (qaCollectionId != null ? !qaCollectionId.equals(that.qaCollectionId) : that.qaCollectionId != null)
            return false;
        if (overcompletionTransactionQty != null ? !overcompletionTransactionQty.equals(that.overcompletionTransactionQty) : that.overcompletionTransactionQty != null)
            return false;
        if (overcompletionPrimaryQty != null ? !overcompletionPrimaryQty.equals(that.overcompletionPrimaryQty) : that.overcompletionPrimaryQty != null)
            return false;
        if (overcompletionTransactionId != null ? !overcompletionTransactionId.equals(that.overcompletionTransactionId) : that.overcompletionTransactionId != null)
            return false;
        if (endItemUnitNumber != null ? !endItemUnitNumber.equals(that.endItemUnitNumber) : that.endItemUnitNumber != null)
            return false;
        if (scheduledPaybackDate != null ? !scheduledPaybackDate.equals(that.scheduledPaybackDate) : that.scheduledPaybackDate != null)
            return false;
        if (orgCostGroupId != null ? !orgCostGroupId.equals(that.orgCostGroupId) : that.orgCostGroupId != null)
            return false;
        if (costTypeId != null ? !costTypeId.equals(that.costTypeId) : that.costTypeId != null) return false;
        if (sourceLotNumber != null ? !sourceLotNumber.equals(that.sourceLotNumber) : that.sourceLotNumber != null)
            return false;
        if (transferCostGroupId != null ? !transferCostGroupId.equals(that.transferCostGroupId) : that.transferCostGroupId != null)
            return false;
        if (lpnId != null ? !lpnId.equals(that.lpnId) : that.lpnId != null) return false;
        if (transferLpnId != null ? !transferLpnId.equals(that.transferLpnId) : that.transferLpnId != null)
            return false;
        if (contentLpnId != null ? !contentLpnId.equals(that.contentLpnId) : that.contentLpnId != null) return false;
        if (xmlDocumentId != null ? !xmlDocumentId.equals(that.xmlDocumentId) : that.xmlDocumentId != null)
            return false;
        if (organizationType != null ? !organizationType.equals(that.organizationType) : that.organizationType != null)
            return false;
        if (transferOrganizationType != null ? !transferOrganizationType.equals(that.transferOrganizationType) : that.transferOrganizationType != null)
            return false;
        if (owningOrganizationId != null ? !owningOrganizationId.equals(that.owningOrganizationId) : that.owningOrganizationId != null)
            return false;
        if (owningTpType != null ? !owningTpType.equals(that.owningTpType) : that.owningTpType != null) return false;
        if (xfrOwningOrganizationId != null ? !xfrOwningOrganizationId.equals(that.xfrOwningOrganizationId) : that.xfrOwningOrganizationId != null)
            return false;
        if (transferOwningTpType != null ? !transferOwningTpType.equals(that.transferOwningTpType) : that.transferOwningTpType != null)
            return false;
        if (planningOrganizationId != null ? !planningOrganizationId.equals(that.planningOrganizationId) : that.planningOrganizationId != null)
            return false;
        if (planningTpType != null ? !planningTpType.equals(that.planningTpType) : that.planningTpType != null)
            return false;
        if (xfrPlanningOrganizationId != null ? !xfrPlanningOrganizationId.equals(that.xfrPlanningOrganizationId) : that.xfrPlanningOrganizationId != null)
            return false;
        if (transferPlanningTpType != null ? !transferPlanningTpType.equals(that.transferPlanningTpType) : that.transferPlanningTpType != null)
            return false;
        if (secondaryUomCode != null ? !secondaryUomCode.equals(that.secondaryUomCode) : that.secondaryUomCode != null)
            return false;
        if (secondaryTransactionQuantity != null ? !secondaryTransactionQuantity.equals(that.secondaryTransactionQuantity) : that.secondaryTransactionQuantity != null)
            return false;
        if (transactionGroupId != null ? !transactionGroupId.equals(that.transactionGroupId) : that.transactionGroupId != null)
            return false;
        if (transactionGroupSeq != null ? !transactionGroupSeq.equals(that.transactionGroupSeq) : that.transactionGroupSeq != null)
            return false;
        if (representativeLotNumber != null ? !representativeLotNumber.equals(that.representativeLotNumber) : that.representativeLotNumber != null)
            return false;
        if (transactionBatchId != null ? !transactionBatchId.equals(that.transactionBatchId) : that.transactionBatchId != null)
            return false;
        if (transactionBatchSeq != null ? !transactionBatchSeq.equals(that.transactionBatchSeq) : that.transactionBatchSeq != null)
            return false;
        if (rebuildItemId != null ? !rebuildItemId.equals(that.rebuildItemId) : that.rebuildItemId != null)
            return false;
        if (rebuildSerialNumber != null ? !rebuildSerialNumber.equals(that.rebuildSerialNumber) : that.rebuildSerialNumber != null)
            return false;
        if (rebuildActivityId != null ? !rebuildActivityId.equals(that.rebuildActivityId) : that.rebuildActivityId != null)
            return false;
        if (rebuildJobName != null ? !rebuildJobName.equals(that.rebuildJobName) : that.rebuildJobName != null)
            return false;
        if (moveTransactionId != null ? !moveTransactionId.equals(that.moveTransactionId) : that.moveTransactionId != null)
            return false;
        if (completionTransactionId != null ? !completionTransactionId.equals(that.completionTransactionId) : that.completionTransactionId != null)
            return false;
        if (wipSupplyType != null ? !wipSupplyType.equals(that.wipSupplyType) : that.wipSupplyType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transactionInterfaceId != null ? transactionInterfaceId.hashCode() : 0;
        result = 31 * result + (transactionHeaderId != null ? transactionHeaderId.hashCode() : 0);
        result = 31 * result + (sourceCode != null ? sourceCode.hashCode() : 0);
        result = 31 * result + (int) (sourceLineId ^ (sourceLineId >>> 32));
        result = 31 * result + (int) (sourceHeaderId ^ (sourceHeaderId >>> 32));
        result = 31 * result + (processFlag ? 1 : 0);
        result = 31 * result + (validationRequired != null ? validationRequired.hashCode() : 0);
        result = 31 * result + (int) (transactionMode ^ (transactionMode >>> 32));
        result = 31 * result + (lockFlag != null ? lockFlag.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (int) (lastUpdatedBy ^ (lastUpdatedBy >>> 32));
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (int) (createdBy ^ (createdBy >>> 32));
        result = 31 * result + (lastUpdateLogin != null ? lastUpdateLogin.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (programApplicationId != null ? programApplicationId.hashCode() : 0);
        result = 31 * result + (programId != null ? programId.hashCode() : 0);
        result = 31 * result + (programUpdateDate != null ? programUpdateDate.hashCode() : 0);
        result = 31 * result + (inventoryItemId != null ? inventoryItemId.hashCode() : 0);
        result = 31 * result + (itemSegment1 != null ? itemSegment1.hashCode() : 0);
        result = 31 * result + (itemSegment2 != null ? itemSegment2.hashCode() : 0);
        result = 31 * result + (itemSegment3 != null ? itemSegment3.hashCode() : 0);
        result = 31 * result + (itemSegment4 != null ? itemSegment4.hashCode() : 0);
        result = 31 * result + (itemSegment5 != null ? itemSegment5.hashCode() : 0);
        result = 31 * result + (itemSegment6 != null ? itemSegment6.hashCode() : 0);
        result = 31 * result + (itemSegment7 != null ? itemSegment7.hashCode() : 0);
        result = 31 * result + (itemSegment8 != null ? itemSegment8.hashCode() : 0);
        result = 31 * result + (itemSegment9 != null ? itemSegment9.hashCode() : 0);
        result = 31 * result + (itemSegment10 != null ? itemSegment10.hashCode() : 0);
        result = 31 * result + (itemSegment11 != null ? itemSegment11.hashCode() : 0);
        result = 31 * result + (itemSegment12 != null ? itemSegment12.hashCode() : 0);
        result = 31 * result + (itemSegment13 != null ? itemSegment13.hashCode() : 0);
        result = 31 * result + (itemSegment14 != null ? itemSegment14.hashCode() : 0);
        result = 31 * result + (itemSegment15 != null ? itemSegment15.hashCode() : 0);
        result = 31 * result + (itemSegment16 != null ? itemSegment16.hashCode() : 0);
        result = 31 * result + (itemSegment17 != null ? itemSegment17.hashCode() : 0);
        result = 31 * result + (itemSegment18 != null ? itemSegment18.hashCode() : 0);
        result = 31 * result + (itemSegment19 != null ? itemSegment19.hashCode() : 0);
        result = 31 * result + (itemSegment20 != null ? itemSegment20.hashCode() : 0);
        result = 31 * result + (revision != null ? revision.hashCode() : 0);
        result = 31 * result + (int) (organizationId ^ (organizationId >>> 32));
        result = 31 * result + (int) (transactionQuantity ^ (transactionQuantity >>> 32));
        result = 31 * result + (primaryQuantity != null ? primaryQuantity.hashCode() : 0);
        result = 31 * result + (transactionUom != null ? transactionUom.hashCode() : 0);
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (acctPeriodId != null ? acctPeriodId.hashCode() : 0);
        result = 31 * result + (subinventoryCode != null ? subinventoryCode.hashCode() : 0);
        result = 31 * result + (locatorId != null ? locatorId.hashCode() : 0);
        result = 31 * result + (locSegment1 != null ? locSegment1.hashCode() : 0);
        result = 31 * result + (locSegment2 != null ? locSegment2.hashCode() : 0);
        result = 31 * result + (locSegment3 != null ? locSegment3.hashCode() : 0);
        result = 31 * result + (locSegment4 != null ? locSegment4.hashCode() : 0);
        result = 31 * result + (locSegment5 != null ? locSegment5.hashCode() : 0);
        result = 31 * result + (locSegment6 != null ? locSegment6.hashCode() : 0);
        result = 31 * result + (locSegment7 != null ? locSegment7.hashCode() : 0);
        result = 31 * result + (locSegment8 != null ? locSegment8.hashCode() : 0);
        result = 31 * result + (locSegment9 != null ? locSegment9.hashCode() : 0);
        result = 31 * result + (locSegment10 != null ? locSegment10.hashCode() : 0);
        result = 31 * result + (locSegment11 != null ? locSegment11.hashCode() : 0);
        result = 31 * result + (locSegment12 != null ? locSegment12.hashCode() : 0);
        result = 31 * result + (locSegment13 != null ? locSegment13.hashCode() : 0);
        result = 31 * result + (locSegment14 != null ? locSegment14.hashCode() : 0);
        result = 31 * result + (locSegment15 != null ? locSegment15.hashCode() : 0);
        result = 31 * result + (locSegment16 != null ? locSegment16.hashCode() : 0);
        result = 31 * result + (locSegment17 != null ? locSegment17.hashCode() : 0);
        result = 31 * result + (locSegment18 != null ? locSegment18.hashCode() : 0);
        result = 31 * result + (locSegment19 != null ? locSegment19.hashCode() : 0);
        result = 31 * result + (locSegment20 != null ? locSegment20.hashCode() : 0);
        result = 31 * result + (transactionSourceId != null ? transactionSourceId.hashCode() : 0);
        result = 31 * result + (dspSegment1 != null ? dspSegment1.hashCode() : 0);
        result = 31 * result + (dspSegment2 != null ? dspSegment2.hashCode() : 0);
        result = 31 * result + (dspSegment3 != null ? dspSegment3.hashCode() : 0);
        result = 31 * result + (dspSegment4 != null ? dspSegment4.hashCode() : 0);
        result = 31 * result + (dspSegment5 != null ? dspSegment5.hashCode() : 0);
        result = 31 * result + (dspSegment6 != null ? dspSegment6.hashCode() : 0);
        result = 31 * result + (dspSegment7 != null ? dspSegment7.hashCode() : 0);
        result = 31 * result + (dspSegment8 != null ? dspSegment8.hashCode() : 0);
        result = 31 * result + (dspSegment9 != null ? dspSegment9.hashCode() : 0);
        result = 31 * result + (dspSegment10 != null ? dspSegment10.hashCode() : 0);
        result = 31 * result + (dspSegment11 != null ? dspSegment11.hashCode() : 0);
        result = 31 * result + (dspSegment12 != null ? dspSegment12.hashCode() : 0);
        result = 31 * result + (dspSegment13 != null ? dspSegment13.hashCode() : 0);
        result = 31 * result + (dspSegment14 != null ? dspSegment14.hashCode() : 0);
        result = 31 * result + (dspSegment15 != null ? dspSegment15.hashCode() : 0);
        result = 31 * result + (dspSegment16 != null ? dspSegment16.hashCode() : 0);
        result = 31 * result + (dspSegment17 != null ? dspSegment17.hashCode() : 0);
        result = 31 * result + (dspSegment18 != null ? dspSegment18.hashCode() : 0);
        result = 31 * result + (dspSegment19 != null ? dspSegment19.hashCode() : 0);
        result = 31 * result + (dspSegment20 != null ? dspSegment20.hashCode() : 0);
        result = 31 * result + (dspSegment21 != null ? dspSegment21.hashCode() : 0);
        result = 31 * result + (dspSegment22 != null ? dspSegment22.hashCode() : 0);
        result = 31 * result + (dspSegment23 != null ? dspSegment23.hashCode() : 0);
        result = 31 * result + (dspSegment24 != null ? dspSegment24.hashCode() : 0);
        result = 31 * result + (dspSegment25 != null ? dspSegment25.hashCode() : 0);
        result = 31 * result + (dspSegment26 != null ? dspSegment26.hashCode() : 0);
        result = 31 * result + (dspSegment27 != null ? dspSegment27.hashCode() : 0);
        result = 31 * result + (dspSegment28 != null ? dspSegment28.hashCode() : 0);
        result = 31 * result + (dspSegment29 != null ? dspSegment29.hashCode() : 0);
        result = 31 * result + (dspSegment30 != null ? dspSegment30.hashCode() : 0);
        result = 31 * result + (transactionSourceName != null ? transactionSourceName.hashCode() : 0);
        result = 31 * result + (transactionSourceTypeId != null ? transactionSourceTypeId.hashCode() : 0);
        result = 31 * result + (transactionActionId != null ? transactionActionId.hashCode() : 0);
        result = 31 * result + (int) (transactionTypeId ^ (transactionTypeId >>> 32));
        result = 31 * result + (reasonId != null ? reasonId.hashCode() : 0);
        result = 31 * result + (transactionReference != null ? transactionReference.hashCode() : 0);
        result = 31 * result + (transactionCost != null ? transactionCost.hashCode() : 0);
        result = 31 * result + (distributionAccountId != null ? distributionAccountId.hashCode() : 0);
        result = 31 * result + (dstSegment1 != null ? dstSegment1.hashCode() : 0);
        result = 31 * result + (dstSegment2 != null ? dstSegment2.hashCode() : 0);
        result = 31 * result + (dstSegment3 != null ? dstSegment3.hashCode() : 0);
        result = 31 * result + (dstSegment4 != null ? dstSegment4.hashCode() : 0);
        result = 31 * result + (dstSegment5 != null ? dstSegment5.hashCode() : 0);
        result = 31 * result + (dstSegment6 != null ? dstSegment6.hashCode() : 0);
        result = 31 * result + (dstSegment7 != null ? dstSegment7.hashCode() : 0);
        result = 31 * result + (dstSegment8 != null ? dstSegment8.hashCode() : 0);
        result = 31 * result + (dstSegment9 != null ? dstSegment9.hashCode() : 0);
        result = 31 * result + (dstSegment10 != null ? dstSegment10.hashCode() : 0);
        result = 31 * result + (dstSegment11 != null ? dstSegment11.hashCode() : 0);
        result = 31 * result + (dstSegment12 != null ? dstSegment12.hashCode() : 0);
        result = 31 * result + (dstSegment13 != null ? dstSegment13.hashCode() : 0);
        result = 31 * result + (dstSegment14 != null ? dstSegment14.hashCode() : 0);
        result = 31 * result + (dstSegment15 != null ? dstSegment15.hashCode() : 0);
        result = 31 * result + (dstSegment16 != null ? dstSegment16.hashCode() : 0);
        result = 31 * result + (dstSegment17 != null ? dstSegment17.hashCode() : 0);
        result = 31 * result + (dstSegment18 != null ? dstSegment18.hashCode() : 0);
        result = 31 * result + (dstSegment19 != null ? dstSegment19.hashCode() : 0);
        result = 31 * result + (dstSegment20 != null ? dstSegment20.hashCode() : 0);
        result = 31 * result + (dstSegment21 != null ? dstSegment21.hashCode() : 0);
        result = 31 * result + (dstSegment22 != null ? dstSegment22.hashCode() : 0);
        result = 31 * result + (dstSegment23 != null ? dstSegment23.hashCode() : 0);
        result = 31 * result + (dstSegment24 != null ? dstSegment24.hashCode() : 0);
        result = 31 * result + (dstSegment25 != null ? dstSegment25.hashCode() : 0);
        result = 31 * result + (dstSegment26 != null ? dstSegment26.hashCode() : 0);
        result = 31 * result + (dstSegment27 != null ? dstSegment27.hashCode() : 0);
        result = 31 * result + (dstSegment28 != null ? dstSegment28.hashCode() : 0);
        result = 31 * result + (dstSegment29 != null ? dstSegment29.hashCode() : 0);
        result = 31 * result + (dstSegment30 != null ? dstSegment30.hashCode() : 0);
        result = 31 * result + (requisitionLineId != null ? requisitionLineId.hashCode() : 0);
        result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
        result = 31 * result + (currencyConversionDate != null ? currencyConversionDate.hashCode() : 0);
        result = 31 * result + (currencyConversionType != null ? currencyConversionType.hashCode() : 0);
        result = 31 * result + (currencyConversionRate != null ? currencyConversionRate.hashCode() : 0);
        result = 31 * result + (ussglTransactionCode != null ? ussglTransactionCode.hashCode() : 0);
        result = 31 * result + (wipEntityType != null ? wipEntityType.hashCode() : 0);
        result = 31 * result + (scheduleId != null ? scheduleId.hashCode() : 0);
        result = 31 * result + (employeeCode != null ? employeeCode.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        result = 31 * result + (scheduleUpdateCode != null ? scheduleUpdateCode.hashCode() : 0);
        result = 31 * result + (setupTeardownCode != null ? setupTeardownCode.hashCode() : 0);
        result = 31 * result + (primarySwitch != null ? primarySwitch.hashCode() : 0);
        result = 31 * result + (mrpCode != null ? mrpCode.hashCode() : 0);
        result = 31 * result + (operationSeqNum != null ? operationSeqNum.hashCode() : 0);
        result = 31 * result + (repetitiveLineId != null ? repetitiveLineId.hashCode() : 0);
        result = 31 * result + (pickingLineId != null ? pickingLineId.hashCode() : 0);
        result = 31 * result + (trxSourceLineId != null ? trxSourceLineId.hashCode() : 0);
        result = 31 * result + (trxSourceDeliveryId != null ? trxSourceDeliveryId.hashCode() : 0);
        result = 31 * result + (demandId != null ? demandId.hashCode() : 0);
        result = 31 * result + (customerShipId != null ? customerShipId.hashCode() : 0);
        result = 31 * result + (lineItemNum != null ? lineItemNum.hashCode() : 0);
        result = 31 * result + (receivingDocument != null ? receivingDocument.hashCode() : 0);
        result = 31 * result + (rcvTransactionId != null ? rcvTransactionId.hashCode() : 0);
        result = 31 * result + (shipToLocationId != null ? shipToLocationId.hashCode() : 0);
        result = 31 * result + (encumbranceAccount != null ? encumbranceAccount.hashCode() : 0);
        result = 31 * result + (encumbranceAmount != null ? encumbranceAmount.hashCode() : 0);
        result = 31 * result + (vendorLotNumber != null ? vendorLotNumber.hashCode() : 0);
        result = 31 * result + (transferSubinventory != null ? transferSubinventory.hashCode() : 0);
        result = 31 * result + (transferOrganization != null ? transferOrganization.hashCode() : 0);
        result = 31 * result + (transferLocator != null ? transferLocator.hashCode() : 0);
        result = 31 * result + (xferLocSegment1 != null ? xferLocSegment1.hashCode() : 0);
        result = 31 * result + (xferLocSegment2 != null ? xferLocSegment2.hashCode() : 0);
        result = 31 * result + (xferLocSegment3 != null ? xferLocSegment3.hashCode() : 0);
        result = 31 * result + (xferLocSegment4 != null ? xferLocSegment4.hashCode() : 0);
        result = 31 * result + (xferLocSegment5 != null ? xferLocSegment5.hashCode() : 0);
        result = 31 * result + (xferLocSegment6 != null ? xferLocSegment6.hashCode() : 0);
        result = 31 * result + (xferLocSegment7 != null ? xferLocSegment7.hashCode() : 0);
        result = 31 * result + (xferLocSegment8 != null ? xferLocSegment8.hashCode() : 0);
        result = 31 * result + (xferLocSegment9 != null ? xferLocSegment9.hashCode() : 0);
        result = 31 * result + (xferLocSegment10 != null ? xferLocSegment10.hashCode() : 0);
        result = 31 * result + (xferLocSegment11 != null ? xferLocSegment11.hashCode() : 0);
        result = 31 * result + (xferLocSegment12 != null ? xferLocSegment12.hashCode() : 0);
        result = 31 * result + (xferLocSegment13 != null ? xferLocSegment13.hashCode() : 0);
        result = 31 * result + (xferLocSegment14 != null ? xferLocSegment14.hashCode() : 0);
        result = 31 * result + (xferLocSegment15 != null ? xferLocSegment15.hashCode() : 0);
        result = 31 * result + (xferLocSegment16 != null ? xferLocSegment16.hashCode() : 0);
        result = 31 * result + (xferLocSegment17 != null ? xferLocSegment17.hashCode() : 0);
        result = 31 * result + (xferLocSegment18 != null ? xferLocSegment18.hashCode() : 0);
        result = 31 * result + (xferLocSegment19 != null ? xferLocSegment19.hashCode() : 0);
        result = 31 * result + (xferLocSegment20 != null ? xferLocSegment20.hashCode() : 0);
        result = 31 * result + (shipmentNumber != null ? shipmentNumber.hashCode() : 0);
        result = 31 * result + (transportationCost != null ? transportationCost.hashCode() : 0);
        result = 31 * result + (transportationAccount != null ? transportationAccount.hashCode() : 0);
        result = 31 * result + (transferCost != null ? transferCost.hashCode() : 0);
        result = 31 * result + (freightCode != null ? freightCode.hashCode() : 0);
        result = 31 * result + (containers != null ? containers.hashCode() : 0);
        result = 31 * result + (waybillAirbill != null ? waybillAirbill.hashCode() : 0);
        result = 31 * result + (expectedArrivalDate != null ? expectedArrivalDate.hashCode() : 0);
        result = 31 * result + (newAverageCost != null ? newAverageCost.hashCode() : 0);
        result = 31 * result + (valueChange != null ? valueChange.hashCode() : 0);
        result = 31 * result + (percentageChange != null ? percentageChange.hashCode() : 0);
        result = 31 * result + (demandSourceHeaderId != null ? demandSourceHeaderId.hashCode() : 0);
        result = 31 * result + (demandSourceLine != null ? demandSourceLine.hashCode() : 0);
        result = 31 * result + (demandSourceDelivery != null ? demandSourceDelivery.hashCode() : 0);
        result = 31 * result + (negativeReqFlag != null ? negativeReqFlag.hashCode() : 0);
        result = 31 * result + (errorExplanation != null ? errorExplanation.hashCode() : 0);
        result = 31 * result + (shippableFlag != null ? shippableFlag.hashCode() : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (requiredFlag != null ? requiredFlag.hashCode() : 0);
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
        result = 31 * result + (requisitionDistributionId != null ? requisitionDistributionId.hashCode() : 0);
        result = 31 * result + (movementId != null ? movementId.hashCode() : 0);
        result = 31 * result + (reservationQuantity != null ? reservationQuantity.hashCode() : 0);
        result = 31 * result + (shippedQuantity != null ? shippedQuantity.hashCode() : 0);
        result = 31 * result + (inventoryItem != null ? inventoryItem.hashCode() : 0);
        result = 31 * result + (locatorName != null ? locatorName.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (toTaskId != null ? toTaskId.hashCode() : 0);
        result = 31 * result + (sourceTaskId != null ? sourceTaskId.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (toProjectId != null ? toProjectId.hashCode() : 0);
        result = 31 * result + (sourceProjectId != null ? sourceProjectId.hashCode() : 0);
        result = 31 * result + (paExpenditureOrgId != null ? paExpenditureOrgId.hashCode() : 0);
        result = 31 * result + (expenditureType != null ? expenditureType.hashCode() : 0);
        result = 31 * result + (finalCompletionFlag != null ? finalCompletionFlag.hashCode() : 0);
        result = 31 * result + (transferPercentage != null ? transferPercentage.hashCode() : 0);
        result = 31 * result + (transactionSequenceId != null ? transactionSequenceId.hashCode() : 0);
        result = 31 * result + (materialAccount != null ? materialAccount.hashCode() : 0);
        result = 31 * result + (materialOverheadAccount != null ? materialOverheadAccount.hashCode() : 0);
        result = 31 * result + (resourceAccount != null ? resourceAccount.hashCode() : 0);
        result = 31 * result + (outsideProcessingAccount != null ? outsideProcessingAccount.hashCode() : 0);
        result = 31 * result + (overheadAccount != null ? overheadAccount.hashCode() : 0);
        result = 31 * result + (bomRevision != null ? bomRevision.hashCode() : 0);
        result = 31 * result + (routingRevision != null ? routingRevision.hashCode() : 0);
        result = 31 * result + (bomRevisionDate != null ? bomRevisionDate.hashCode() : 0);
        result = 31 * result + (routingRevisionDate != null ? routingRevisionDate.hashCode() : 0);
        result = 31 * result + (alternateBomDesignator != null ? alternateBomDesignator.hashCode() : 0);
        result = 31 * result + (alternateRoutingDesignator != null ? alternateRoutingDesignator.hashCode() : 0);
        result = 31 * result + (accountingClass != null ? accountingClass.hashCode() : 0);
        result = 31 * result + (demandClass != null ? demandClass.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (substitutionTypeId != null ? substitutionTypeId.hashCode() : 0);
        result = 31 * result + (substitutionItemId != null ? substitutionItemId.hashCode() : 0);
        result = 31 * result + (scheduleGroup != null ? scheduleGroup.hashCode() : 0);
        result = 31 * result + (buildSequence != null ? buildSequence.hashCode() : 0);
        result = 31 * result + (scheduleNumber != null ? scheduleNumber.hashCode() : 0);
        result = 31 * result + (scheduledFlag != null ? scheduledFlag.hashCode() : 0);
        result = 31 * result + (flowSchedule != null ? flowSchedule.hashCode() : 0);
        result = 31 * result + (costGroupId != null ? costGroupId.hashCode() : 0);
        result = 31 * result + (kanbanCardId != null ? kanbanCardId.hashCode() : 0);
        result = 31 * result + (qaCollectionId != null ? qaCollectionId.hashCode() : 0);
        result = 31 * result + (overcompletionTransactionQty != null ? overcompletionTransactionQty.hashCode() : 0);
        result = 31 * result + (overcompletionPrimaryQty != null ? overcompletionPrimaryQty.hashCode() : 0);
        result = 31 * result + (overcompletionTransactionId != null ? overcompletionTransactionId.hashCode() : 0);
        result = 31 * result + (endItemUnitNumber != null ? endItemUnitNumber.hashCode() : 0);
        result = 31 * result + (scheduledPaybackDate != null ? scheduledPaybackDate.hashCode() : 0);
        result = 31 * result + (orgCostGroupId != null ? orgCostGroupId.hashCode() : 0);
        result = 31 * result + (costTypeId != null ? costTypeId.hashCode() : 0);
        result = 31 * result + (sourceLotNumber != null ? sourceLotNumber.hashCode() : 0);
        result = 31 * result + (transferCostGroupId != null ? transferCostGroupId.hashCode() : 0);
        result = 31 * result + (lpnId != null ? lpnId.hashCode() : 0);
        result = 31 * result + (transferLpnId != null ? transferLpnId.hashCode() : 0);
        result = 31 * result + (contentLpnId != null ? contentLpnId.hashCode() : 0);
        result = 31 * result + (xmlDocumentId != null ? xmlDocumentId.hashCode() : 0);
        result = 31 * result + (organizationType != null ? organizationType.hashCode() : 0);
        result = 31 * result + (transferOrganizationType != null ? transferOrganizationType.hashCode() : 0);
        result = 31 * result + (owningOrganizationId != null ? owningOrganizationId.hashCode() : 0);
        result = 31 * result + (owningTpType != null ? owningTpType.hashCode() : 0);
        result = 31 * result + (xfrOwningOrganizationId != null ? xfrOwningOrganizationId.hashCode() : 0);
        result = 31 * result + (transferOwningTpType != null ? transferOwningTpType.hashCode() : 0);
        result = 31 * result + (planningOrganizationId != null ? planningOrganizationId.hashCode() : 0);
        result = 31 * result + (planningTpType != null ? planningTpType.hashCode() : 0);
        result = 31 * result + (xfrPlanningOrganizationId != null ? xfrPlanningOrganizationId.hashCode() : 0);
        result = 31 * result + (transferPlanningTpType != null ? transferPlanningTpType.hashCode() : 0);
        result = 31 * result + (secondaryUomCode != null ? secondaryUomCode.hashCode() : 0);
        result = 31 * result + (secondaryTransactionQuantity != null ? secondaryTransactionQuantity.hashCode() : 0);
        result = 31 * result + (transactionGroupId != null ? transactionGroupId.hashCode() : 0);
        result = 31 * result + (transactionGroupSeq != null ? transactionGroupSeq.hashCode() : 0);
        result = 31 * result + (representativeLotNumber != null ? representativeLotNumber.hashCode() : 0);
        result = 31 * result + (transactionBatchId != null ? transactionBatchId.hashCode() : 0);
        result = 31 * result + (transactionBatchSeq != null ? transactionBatchSeq.hashCode() : 0);
        result = 31 * result + (rebuildItemId != null ? rebuildItemId.hashCode() : 0);
        result = 31 * result + (rebuildSerialNumber != null ? rebuildSerialNumber.hashCode() : 0);
        result = 31 * result + (rebuildActivityId != null ? rebuildActivityId.hashCode() : 0);
        result = 31 * result + (rebuildJobName != null ? rebuildJobName.hashCode() : 0);
        result = 31 * result + (moveTransactionId != null ? moveTransactionId.hashCode() : 0);
        result = 31 * result + (completionTransactionId != null ? completionTransactionId.hashCode() : 0);
        result = 31 * result + (wipSupplyType != null ? wipSupplyType.hashCode() : 0);
        return result;
    }
}
