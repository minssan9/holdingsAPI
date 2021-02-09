package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QInvSample is a Querydsl query type for InvSample
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInvSample extends EntityPathBase<InvSample> {

    private static final long serialVersionUID = -825135354L;

    public static final QInvSample invSample = new QInvSample("invSample");

    public final StringPath badItemFlag = createString("badItemFlag");

    public final DateTimePath<java.time.LocalDateTime> disabledStartMm = createDateTime("disabledStartMm", java.time.LocalDateTime.class);

    public final StringPath id = createString("id");

    public final StringPath inventoryItemStatusCode = createString("inventoryItemStatusCode");

    public final StringPath itemNumber = createString("itemNumber");

    public final StringPath msg = createString("msg");

    public final StringPath purchasingEnabledFlag = createString("purchasingEnabledFlag");

    public final StringPath purchasingEnabledStatus = createString("purchasingEnabledStatus");

    public final StringPath status = createString("status");

    public QInvSample(String variable) {
        super(InvSample.class, forVariable(variable));
    }

    public QInvSample(Path<? extends InvSample> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInvSample(PathMetadata metadata) {
        super(InvSample.class, metadata);
    }

}

