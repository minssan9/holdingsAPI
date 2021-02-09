package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxeItemSpecInfoTmp is a Querydsl query type for XxeItemSpecInfoTmp
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxeItemSpecInfoTmp extends EntityPathBase<XxeItemSpecInfoTmp> {

    private static final long serialVersionUID = -1151494549L;

    public static final QXxeItemSpecInfoTmp xxeItemSpecInfoTmp = new QXxeItemSpecInfoTmp("xxeItemSpecInfoTmp");

    public final StringPath afterCompatible = createString("afterCompatible");

    public final DateTimePath<java.time.LocalDateTime> afterEffectiveDate = createDateTime("afterEffectiveDate", java.time.LocalDateTime.class);

    public final StringPath afterNumber = createString("afterNumber");

    public final StringPath attribute1 = createString("attribute1");

    public final StringPath attribute10 = createString("attribute10");

    public final StringPath attribute2 = createString("attribute2");

    public final StringPath attribute3 = createString("attribute3");

    public final StringPath attribute4 = createString("attribute4");

    public final StringPath attribute5 = createString("attribute5");

    public final StringPath attribute6 = createString("attribute6");

    public final StringPath attribute7 = createString("attribute7");

    public final StringPath attribute8 = createString("attribute8");

    public final StringPath attribute9 = createString("attribute9");

    public final StringPath beforeCompatible = createString("beforeCompatible");

    public final DateTimePath<java.time.LocalDateTime> beforeEffectiveDate = createDateTime("beforeEffectiveDate", java.time.LocalDateTime.class);

    public final StringPath beforeNumber = createString("beforeNumber");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.time.LocalDateTime> creationDate = createDateTime("creationDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> groupId = createNumber("groupId", Long.class);

    public final StringPath ifflag = createString("ifflag");

    public final StringPath itemNumber = createString("itemNumber");

    public final DateTimePath<java.time.LocalDateTime> lastUpdateDate = createDateTime("lastUpdateDate", java.time.LocalDateTime.class);

    public final StringPath lastUpdatedBy = createString("lastUpdatedBy");

    public QXxeItemSpecInfoTmp(String variable) {
        super(XxeItemSpecInfoTmp.class, forVariable(variable));
    }

    public QXxeItemSpecInfoTmp(Path<? extends XxeItemSpecInfoTmp> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxeItemSpecInfoTmp(PathMetadata metadata) {
        super(XxeItemSpecInfoTmp.class, metadata);
    }

}

