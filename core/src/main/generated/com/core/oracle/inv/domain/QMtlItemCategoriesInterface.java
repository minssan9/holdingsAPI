package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMtlItemCategoriesInterface is a Querydsl query type for MtlItemCategoriesInterface
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMtlItemCategoriesInterface extends EntityPathBase<MtlItemCategoriesInterface> {

    private static final long serialVersionUID = -1161253798L;

    public static final QMtlItemCategoriesInterface mtlItemCategoriesInterface = new QMtlItemCategoriesInterface("mtlItemCategoriesInterface");

    public final NumberPath<Long> categoryId = createNumber("categoryId", Long.class);

    public final StringPath categoryName = createString("categoryName");

    public final NumberPath<Long> categorySetId = createNumber("categorySetId", Long.class);

    public final StringPath categorySetName = createString("categorySetName");

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final TimePath<java.sql.Time> creationDate = createTime("creationDate", java.sql.Time.class);

    public final NumberPath<Long> inventoryItemId = createNumber("inventoryItemId", Long.class);

    public final StringPath itemNumber = createString("itemNumber");

    public final TimePath<java.sql.Time> lastUpdateDate = createTime("lastUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> lastUpdatedBy = createNumber("lastUpdatedBy", Long.class);

    public final NumberPath<Long> lastUpdateLogin = createNumber("lastUpdateLogin", Long.class);

    public final NumberPath<Long> oldCategoryId = createNumber("oldCategoryId", Long.class);

    public final StringPath oldCategoryName = createString("oldCategoryName");

    public final StringPath organizationCode = createString("organizationCode");

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final NumberPath<Long> processFlag = createNumber("processFlag", Long.class);

    public final NumberPath<Long> programApplicationId = createNumber("programApplicationId", Long.class);

    public final NumberPath<Long> programId = createNumber("programId", Long.class);

    public final TimePath<java.sql.Time> programUpdateDate = createTime("programUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> requestId = createNumber("requestId", Long.class);

    public final NumberPath<Long> setProcessId = createNumber("setProcessId", Long.class);

    public final NumberPath<Long> transactionId = createNumber("transactionId", Long.class);

    public final StringPath transactionType = createString("transactionType");

    public QMtlItemCategoriesInterface(String variable) {
        super(MtlItemCategoriesInterface.class, forVariable(variable));
    }

    public QMtlItemCategoriesInterface(Path<? extends MtlItemCategoriesInterface> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMtlItemCategoriesInterface(PathMetadata metadata) {
        super(MtlItemCategoriesInterface.class, metadata);
    }

}

