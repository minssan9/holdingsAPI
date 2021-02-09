package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxeInvMonthlyReceipts is a Querydsl query type for XxeInvMonthlyReceipts
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxeInvMonthlyReceipts extends EntityPathBase<XxeInvMonthlyReceipts> {

    private static final long serialVersionUID = -1378705401L;

    public static final QXxeInvMonthlyReceipts xxeInvMonthlyReceipts = new QXxeInvMonthlyReceipts("xxeInvMonthlyReceipts");

    public final NumberPath<Long> acctPeriodId = createNumber("acctPeriodId", Long.class);

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

    public final StringPath balanceType = createString("balanceType");

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final TimePath<java.sql.Time> creationDate = createTime("creationDate", java.sql.Time.class);

    public final StringPath creationSourceCode = createString("creationSourceCode");

    public final NumberPath<Long> inventoryItemId = createNumber("inventoryItemId", Long.class);

    public final TimePath<java.sql.Time> invoiceDate = createTime("invoiceDate", java.sql.Time.class);

    public final StringPath itemRevision = createString("itemRevision");

    public final StringPath itemSegment = createString("itemSegment");

    public final TimePath<java.sql.Time> lastUpdateDate = createTime("lastUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> lastUpdatedBy = createNumber("lastUpdatedBy", Long.class);

    public final NumberPath<Long> lastUpdateLogin = createNumber("lastUpdateLogin", Long.class);

    public final NumberPath<Long> mmtTransactionId = createNumber("mmtTransactionId", Long.class);

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final NumberPath<Long> primaryQuantity = createNumber("primaryQuantity", Long.class);

    public final StringPath primaryUom = createString("primaryUom");

    public final StringPath receiptsNumber = createString("receiptsNumber");

    public final NumberPath<Long> receiptTransactionId = createNumber("receiptTransactionId", Long.class);

    public final NumberPath<Long> shipmentLineId = createNumber("shipmentLineId", Long.class);

    public final StringPath sourceDocumentCode = createString("sourceDocumentCode");

    public final StringPath sourceDocumentNumber = createString("sourceDocumentNumber");

    public final NumberPath<Long> transactionAmount = createNumber("transactionAmount", Long.class);

    public final TimePath<java.sql.Time> transactionDate = createTime("transactionDate", java.sql.Time.class);

    public final NumberPath<Long> transactionQuantity = createNumber("transactionQuantity", Long.class);

    public final StringPath transactionUom = createString("transactionUom");

    public final NumberPath<Long> unitPrice = createNumber("unitPrice", Long.class);

    public final NumberPath<Long> vendorSiteId = createNumber("vendorSiteId", Long.class);

    public QXxeInvMonthlyReceipts(String variable) {
        super(XxeInvMonthlyReceipts.class, forVariable(variable));
    }

    public QXxeInvMonthlyReceipts(Path<? extends XxeInvMonthlyReceipts> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxeInvMonthlyReceipts(PathMetadata metadata) {
        super(XxeInvMonthlyReceipts.class, metadata);
    }

}

