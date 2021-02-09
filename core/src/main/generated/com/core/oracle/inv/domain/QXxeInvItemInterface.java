package com.core.oracle.inv.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QXxeInvItemInterface is a Querydsl query type for XxeInvItemInterface
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QXxeInvItemInterface extends EntityPathBase<XxeInvItemInterface> {

    private static final long serialVersionUID = 1968662213L;

    public static final QXxeInvItemInterface xxeInvItemInterface = new QXxeInvItemInterface("xxeInvItemInterface");

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

    public final StringPath batchSource = createString("batchSource");

    public final StringPath catalogAttribute1 = createString("catalogAttribute1");

    public final StringPath catalogAttribute2 = createString("catalogAttribute2");

    public final StringPath catalogAttribute3 = createString("catalogAttribute3");

    public final StringPath catalogAttribute4 = createString("catalogAttribute4");

    public final StringPath categoryAttribute1 = createString("categoryAttribute1");

    public final StringPath categoryAttribute10 = createString("categoryAttribute10");

    public final StringPath categoryAttribute2 = createString("categoryAttribute2");

    public final StringPath categoryAttribute3 = createString("categoryAttribute3");

    public final StringPath categoryAttribute4 = createString("categoryAttribute4");

    public final StringPath categoryAttribute5 = createString("categoryAttribute5");

    public final StringPath categoryAttribute6 = createString("categoryAttribute6");

    public final StringPath categoryAttribute7 = createString("categoryAttribute7");

    public final StringPath categoryAttribute8 = createString("categoryAttribute8");

    public final StringPath categoryAttribute9 = createString("categoryAttribute9");

    public final StringPath createdBy = createString("createdBy");

    public final TimePath<java.sql.Time> creationDate = createTime("creationDate", java.sql.Time.class);

    public final StringPath description = createString("description");

    public final NumberPath<Integer> fixedLeadtime = createNumber("fixedLeadtime", Integer.class);

    public final StringPath globalAttribute1 = createString("globalAttribute1");

    public final StringPath globalAttribute2 = createString("globalAttribute2");

    public final StringPath globalAttribute3 = createString("globalAttribute3");

    public final StringPath globalAttribute4 = createString("globalAttribute4");

    public final StringPath globalAttribute5 = createString("globalAttribute5");

    public final StringPath ifErrorMessage = createString("ifErrorMessage");

    public final StringPath interfaceFlag = createString("interfaceFlag");

    public final StringPath interfaceType = createString("interfaceType");

    public final StringPath itemCatalogGroups = createString("itemCatalogGroups");

    public final StringPath lastUpdateBy = createString("lastUpdateBy");

    public final TimePath<java.sql.Time> lastUpdateDate = createTime("lastUpdateDate", java.sql.Time.class);

    public final NumberPath<Long> listPricePerUnit = createNumber("listPricePerUnit", Long.class);

    public final StringPath oldCateAttribute1 = createString("oldCateAttribute1");

    public final StringPath oldCateAttribute10 = createString("oldCateAttribute10");

    public final StringPath oldCateAttribute2 = createString("oldCateAttribute2");

    public final StringPath oldCateAttribute3 = createString("oldCateAttribute3");

    public final StringPath oldCateAttribute4 = createString("oldCateAttribute4");

    public final StringPath oldCateAttribute5 = createString("oldCateAttribute5");

    public final StringPath oldCateAttribute6 = createString("oldCateAttribute6");

    public final StringPath oldCateAttribute7 = createString("oldCateAttribute7");

    public final StringPath oldCateAttribute8 = createString("oldCateAttribute8");

    public final StringPath oldCateAttribute9 = createString("oldCateAttribute9");

    public final NumberPath<Long> organizationId = createNumber("organizationId", Long.class);

    public final StringPath primaryUom = createString("primaryUom");

    public final StringPath segment1 = createString("segment1");

    public final StringPath templateName = createString("templateName");

    public final NumberPath<Long> weight = createNumber("weight", Long.class);

    public final StringPath weightUom = createString("weightUom");

    public final StringPath wipFlag = createString("wipFlag");

    public final StringPath wipType = createString("wipType");

    public QXxeInvItemInterface(String variable) {
        super(XxeInvItemInterface.class, forVariable(variable));
    }

    public QXxeInvItemInterface(Path<? extends XxeInvItemInterface> path) {
        super(path.getType(), path.getMetadata());
    }

    public QXxeInvItemInterface(PathMetadata metadata) {
        super(XxeInvItemInterface.class, metadata);
    }

}

