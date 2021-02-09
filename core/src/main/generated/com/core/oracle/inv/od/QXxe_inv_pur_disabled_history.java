package com.core.oracle.inv.od;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxe_inv_pur_disabled_history is a Querydsl query type for Xxe_inv_pur_disabled_history
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxe_inv_pur_disabled_history extends EntityPathBase<Xxe_inv_pur_disabled_history> {

    private static final long serialVersionUID = 469755919L;

    public static final QXxe_inv_pur_disabled_history xxe_inv_pur_disabled_history = new QXxe_inv_pur_disabled_history("xxe_inv_pur_disabled_history");

    public final StringPath badItemFlag = createString("badItemFlag");

    public final StringPath disabledStartMm = createString("disabledStartMm");

    public final StringPath inventoryItemStatusCode = createString("inventoryItemStatusCode");

    public final StringPath itemNumber = createString("itemNumber");

    public final StringPath msg = createString("msg");

    public final StringPath purchasingEnabledFlag = createString("purchasingEnabledFlag");

    public final StringPath purchasingEnabledStatus = createString("purchasingEnabledStatus");

    public final StringPath status = createString("status");

    public QXxe_inv_pur_disabled_history(String variable) {
        super(Xxe_inv_pur_disabled_history.class, forVariable(variable));
    }

    public QXxe_inv_pur_disabled_history(Path<? extends Xxe_inv_pur_disabled_history> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxe_inv_pur_disabled_history(PathMetadata metadata) {
        super(Xxe_inv_pur_disabled_history.class, metadata);
    }

}

