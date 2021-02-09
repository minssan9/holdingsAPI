package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxeInvBalanceInterface is a Querydsl query type for XxeInvBalanceInterface
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxeInvBalanceInterface extends EntityPathBase<XxeInvBalanceInterface> {

    private static final long serialVersionUID = -898542082L;

    public static final QXxeInvBalanceInterface xxeInvBalanceInterface = new QXxeInvBalanceInterface("xxeInvBalanceInterface");

    public final NumberPath<Long> acctPeriodId = createNumber("acctPeriodId", Long.class);

    public final StringPath balanceType = createString("balanceType");

    public final NumberPath<Long> beginingAmount = createNumber("beginingAmount", Long.class);

    public final NumberPath<Long> beginingQuantity = createNumber("beginingQuantity", Long.class);

    public final StringPath closingMonth = createString("closingMonth");

    public final StringPath concatenatedSegments = createString("concatenatedSegments");

    public final NumberPath<Long> endingAmount = createNumber("endingAmount", Long.class);

    public final NumberPath<Long> endingQuantity = createNumber("endingQuantity", Long.class);

    public final StringPath errorCode = createString("errorCode");

    public final NumberPath<Long> interfaceId = createNumber("interfaceId", Long.class);

    public final NumberPath<Long> inventoryItemId = createNumber("inventoryItemId", Long.class);

    public final NumberPath<Long> issueAmount = createNumber("issueAmount", Long.class);

    public final NumberPath<Long> issueQuantity = createNumber("issueQuantity", Long.class);

    public final StringPath itemRevision = createString("itemRevision");

    public final StringPath organizationCode = createString("organizationCode");

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final StringPath primaryUom = createString("primaryUom");

    public final NumberPath<Long> receiptsAmount = createNumber("receiptsAmount", Long.class);

    public final NumberPath<Long> receiptsQuantity = createNumber("receiptsQuantity", Long.class);

    public QXxeInvBalanceInterface(String variable) {
        super(XxeInvBalanceInterface.class, forVariable(variable));
    }

    public QXxeInvBalanceInterface(Path<? extends XxeInvBalanceInterface> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxeInvBalanceInterface(PathMetadata metadata) {
        super(XxeInvBalanceInterface.class, metadata);
    }

}

