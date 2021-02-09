package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxeErpOtherTrxs is a Querydsl query type for XxeErpOtherTrxs
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxeErpOtherTrxs extends EntityPathBase<XxeErpOtherTrxs> {

    private static final long serialVersionUID = -956299562L;

    public static final QXxeErpOtherTrxs xxeErpOtherTrxs = new QXxeErpOtherTrxs("xxeErpOtherTrxs");

    public final NumberPath<Long> codeCombinationId = createNumber("codeCombinationId", Long.class);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final DateTimePath<java.time.LocalDateTime> creationDate = createDateTime("creationDate", java.time.LocalDateTime.class);

    public final StringPath deptCode = createString("deptCode");

    public final StringPath erpProcessSts = createString("erpProcessSts");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Long> interfaceId = createNumber("interfaceId", Long.class);

    public final StringPath itemCode = createString("itemCode");

    public final NumberPath<Long> lineNum = createNumber("lineNum", Long.class);

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath subinventoryCode = createString("subinventoryCode");

    public final NumberPath<Long> toOrgid = createNumber("toOrgid", Long.class);

    public final StringPath toSubinventoryCode = createString("toSubinventoryCode");

    public final NumberPath<Long> transactionActionId = createNumber("transactionActionId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> transactionDate = createDateTime("transactionDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> transactionQuantity = createNumber("transactionQuantity", Long.class);

    public final NumberPath<Long> transactionTypeId = createNumber("transactionTypeId", Long.class);

    public final NumberPath<Long> vendor_siteId = createNumber("vendor_siteId", Long.class);

    public QXxeErpOtherTrxs(String variable) {
        super(XxeErpOtherTrxs.class, forVariable(variable));
    }

    public QXxeErpOtherTrxs(Path<? extends XxeErpOtherTrxs> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxeErpOtherTrxs(PathMetadata metadata) {
        super(XxeErpOtherTrxs.class, metadata);
    }

}

