package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxeInvItemStockPrices is a Querydsl query type for XxeInvItemStockPrices
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxeInvItemStockPrices extends EntityPathBase<XxeInvItemStockPrices> {

    private static final long serialVersionUID = -1144784500L;

    public static final QXxeInvItemStockPrices xxeInvItemStockPrices = new QXxeInvItemStockPrices("xxeInvItemStockPrices");

    public final StringPath baseYyyymm = createString("baseYyyymm");

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final TimePath<java.sql.Time> creationDate = createTime("creationDate", java.sql.Time.class);

    public final NumberPath<Long> inventoryItemId = createNumber("inventoryItemId", Long.class);

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final NumberPath<Long> stockPrice = createNumber("stockPrice", Long.class);

    public final StringPath tailYyyymm = createString("tailYyyymm");

    public QXxeInvItemStockPrices(String variable) {
        super(XxeInvItemStockPrices.class, forVariable(variable));
    }

    public QXxeInvItemStockPrices(Path<? extends XxeInvItemStockPrices> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxeInvItemStockPrices(PathMetadata metadata) {
        super(XxeInvItemStockPrices.class, metadata);
    }

}

