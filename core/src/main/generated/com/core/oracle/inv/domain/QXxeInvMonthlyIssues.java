package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxeInvMonthlyIssues is a Querydsl query type for XxeInvMonthlyIssues
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxeInvMonthlyIssues extends EntityPathBase<XxeInvMonthlyIssues> {

    private static final long serialVersionUID = -263552890L;

    public static final QXxeInvMonthlyIssues xxeInvMonthlyIssues = new QXxeInvMonthlyIssues("xxeInvMonthlyIssues");

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

    public final NumberPath<Long> closeAmount = createNumber("closeAmount", Long.class);

    public final StringPath codeSegment1 = createString("codeSegment1");

    public final StringPath codeSegment2 = createString("codeSegment2");

    public final StringPath codeSegment3 = createString("codeSegment3");

    public final StringPath codeSegment4 = createString("codeSegment4");

    public final StringPath codeSegment5 = createString("codeSegment5");

    public final StringPath codeSource3 = createString("codeSource3");

    public final StringPath codeSource4 = createString("codeSource4");

    public final StringPath codeSource5 = createString("codeSource5");

    public final StringPath codeSourceType3 = createString("codeSourceType3");

    public final StringPath codeSourceType4 = createString("codeSourceType4");

    public final StringPath codeSourceType5 = createString("codeSourceType5");

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final TimePath<java.sql.Time> creationDate = createTime("creationDate", java.sql.Time.class);

    public final StringPath creationSourceCode = createString("creationSourceCode");

    public final NumberPath<Long> inventoryItemId = createNumber("inventoryItemId", Long.class);

    public final TimePath<java.sql.Time> invoiceDate = createTime("invoiceDate", java.sql.Time.class);

    public final StringPath issueCode = createString("issueCode");

    public final NumberPath<Long> issueTransactionId = createNumber("issueTransactionId", Long.class);

    public final StringPath itemRevision = createString("itemRevision");

    public final StringPath itemSegment = createString("itemSegment");

    public final TimePath<java.sql.Time> lastUpdateDate = createTime("lastUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> lastUpdatedBy = createNumber("lastUpdatedBy", Long.class);

    public final NumberPath<Long> lastUpdateLogin = createNumber("lastUpdateLogin", Long.class);

    public final NumberPath<Long> mmtTransactionId = createNumber("mmtTransactionId", Long.class);

    public final StringPath noIssueTag = createString("noIssueTag");

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final NumberPath<Long> primaryQuantity = createNumber("primaryQuantity", Long.class);

    public final StringPath primaryUom = createString("primaryUom");

    public final NumberPath<Long> transactionAmount = createNumber("transactionAmount", Long.class);

    public final TimePath<java.sql.Time> transactionDate = createTime("transactionDate", java.sql.Time.class);

    public final NumberPath<Long> transactionQuantity = createNumber("transactionQuantity", Long.class);

    public final StringPath transactionUom = createString("transactionUom");

    public QXxeInvMonthlyIssues(String variable) {
        super(XxeInvMonthlyIssues.class, forVariable(variable));
    }

    public QXxeInvMonthlyIssues(Path<? extends XxeInvMonthlyIssues> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxeInvMonthlyIssues(PathMetadata metadata) {
        super(XxeInvMonthlyIssues.class, metadata);
    }

}

