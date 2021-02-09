package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMtlCategoriesB is a Querydsl query type for MtlCategoriesB
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMtlCategoriesB extends EntityPathBase<MtlCategoriesB> {

    private static final long serialVersionUID = 1770116502L;

    public static final QMtlCategoriesB mtlCategoriesB = new QMtlCategoriesB("mtlCategoriesB");

    public final StringPath attribute1 = createString("attribute1");

    public final StringPath attribute10 = createString("attribute10");

    public final StringPath attribute11 = createString("attribute11");

    public final StringPath attribute12 = createString("attribute12");

    public final StringPath attribute13 = createString("attribute13");

    public final StringPath attribute14 = createString("attribute14");

    public final StringPath attribute15 = createString("attribute15");

    public final StringPath attribute2 = createString("attribute2");

    public final DateTimePath<java.time.LocalDateTime> attribute3 = createDateTime("attribute3", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> attribute4 = createDateTime("attribute4", java.time.LocalDateTime.class);

    public final StringPath attribute5 = createString("attribute5");

    public final StringPath attribute6 = createString("attribute6");

    public final StringPath attribute7 = createString("attribute7");

    public final StringPath attribute8 = createString("attribute8");

    public final StringPath attribute9 = createString("attribute9");

    public final NumberPath<Double> category_id = createNumber("category_id", Double.class);

    public final StringPath description = createString("description");

    public final NumberPath<Double> disable_date = createNumber("disable_date", Double.class);

    public final StringPath enabled_flag = createString("enabled_flag");

    public final StringPath last_update_date = createString("last_update_date");

    public final StringPath segment10 = createString("segment10");

    public final StringPath segment11 = createString("segment11");

    public final StringPath segment12 = createString("segment12");

    public final StringPath segment13 = createString("segment13");

    public final StringPath segment14 = createString("segment14");

    public final StringPath segment15 = createString("segment15");

    public final StringPath segment16 = createString("segment16");

    public final StringPath segment17 = createString("segment17");

    public final StringPath segment18 = createString("segment18");

    public final StringPath segment19 = createString("segment19");

    public final StringPath segment2 = createString("segment2");

    public final StringPath segment20 = createString("segment20");

    public final DateTimePath<java.time.LocalDateTime> segment3 = createDateTime("segment3", java.time.LocalDateTime.class);

    public final StringPath segment4 = createString("segment4");

    public final StringPath segment5 = createString("segment5");

    public final StringPath segment6 = createString("segment6");

    public final StringPath segment7 = createString("segment7");

    public final StringPath segment8 = createString("segment8");

    public final StringPath segment9 = createString("segment9");

    public final StringPath start_date_active = createString("start_date_active");

    public final NumberPath<Long> structure_id = createNumber("structure_id", Long.class);

    public final StringPath summary_flag = createString("summary_flag");

    public final StringPath supplier_enabled_flag = createString("supplier_enabled_flag");

    public QMtlCategoriesB(String variable) {
        super(MtlCategoriesB.class, forVariable(variable));
    }

    public QMtlCategoriesB(Path<? extends MtlCategoriesB> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMtlCategoriesB(PathMetadata metadata) {
        super(MtlCategoriesB.class, metadata);
    }

}

