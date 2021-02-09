package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxeInvDailyBalances is a Querydsl query type for XxeInvDailyBalances
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxeInvDailyBalances extends EntityPathBase<XxeInvDailyBalances> {

    private static final long serialVersionUID = -1443686993L;

    public static final QXxeInvDailyBalances xxeInvDailyBalances = new QXxeInvDailyBalances("xxeInvDailyBalances");

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

    public final NumberPath<Long> beginingAmount = createNumber("beginingAmount", Long.class);

    public final NumberPath<Long> beginingQuantity = createNumber("beginingQuantity", Long.class);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final TimePath<java.sql.Time> creationDate = createTime("creationDate", java.sql.Time.class);

    public final NumberPath<Long> endingAmount = createNumber("endingAmount", Long.class);

    public final NumberPath<Long> endingQuantity = createNumber("endingQuantity", Long.class);

    public final NumberPath<Long> inventoryItemId = createNumber("inventoryItemId", Long.class);

    public final NumberPath<Long> issueAmount = createNumber("issueAmount", Long.class);

    public final NumberPath<Long> issueQuantity = createNumber("issueQuantity", Long.class);

    public final StringPath itemRevision = createString("itemRevision");

    public final StringPath itemSegment = createString("itemSegment");

    public final TimePath<java.sql.Time> lastUpdateDate = createTime("lastUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> lastUpdatedBy = createNumber("lastUpdatedBy", Long.class);

    public final NumberPath<Long> lastUpdateLogin = createNumber("lastUpdateLogin", Long.class);

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final StringPath primaryUom = createString("primaryUom");

    public final NumberPath<Long> receiptsAmount = createNumber("receiptsAmount", Long.class);

    public final NumberPath<Long> receiptsQuantity = createNumber("receiptsQuantity", Long.class);

    public final StringPath secondaryInventoryName = createString("secondaryInventoryName");

    public final TimePath<java.sql.Time> transactionDate = createTime("transactionDate", java.sql.Time.class);

    public QXxeInvDailyBalances(String variable) {
        super(XxeInvDailyBalances.class, forVariable(variable));
    }

    public QXxeInvDailyBalances(Path<? extends XxeInvDailyBalances> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxeInvDailyBalances(PathMetadata metadata) {
        super(XxeInvDailyBalances.class, metadata);
    }

}

