package com.core.oracle.menu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserPermission is a Querydsl query type for UserPermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserPermission extends EntityPathBase<UserPermission> {

    private static final long serialVersionUID = -404505683L;

    public static final QUserPermission userPermission = new QUserPermission("userPermission");

    public final NumberPath<Integer> created_by = createNumber("created_by", Integer.class);

    public final StringPath creation_date = createString("creation_date");

    public final StringPath description = createString("description");

    public final StringPath end_date = createString("end_date");

    public final StringPath last_update_date = createString("last_update_date");

    public final NumberPath<Integer> last_update_login = createNumber("last_update_login", Integer.class);

    public final NumberPath<Integer> last_updated_by = createNumber("last_updated_by", Integer.class);

    public final NumberPath<Integer> responsibility_application_id = createNumber("responsibility_application_id", Integer.class);

    public final StringPath responsibility_id = createString("responsibility_id");

    public final NumberPath<Integer> security_group_id = createNumber("security_group_id", Integer.class);

    public final StringPath start_date = createString("start_date");

    public final StringPath user_id = createString("user_id");

    public QUserPermission(String variable) {
        super(UserPermission.class, forVariable(variable));
    }

    public QUserPermission(Path<? extends UserPermission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserPermission(PathMetadata metadata) {
        super(UserPermission.class, metadata);
    }

}

