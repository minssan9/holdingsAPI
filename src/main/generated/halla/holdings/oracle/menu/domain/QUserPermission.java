package halla.holdings.oracle.menu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserPermission is a Querydsl query type for UserPermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserPermission extends EntityPathBase<UserPermission> {

    private static final long serialVersionUID = -404505683L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserPermission userPermission = new QUserPermission("userPermission");

    public final halla.holdings.oracle.account.domain.QAccount account;

    public final NumberPath<Integer> created_by = createNumber("created_by", Integer.class);

    public final SimplePath<oracle.sql.DATE> creation_date = createSimple("creation_date", oracle.sql.DATE.class);

    public final StringPath description = createString("description");

    public final SimplePath<oracle.sql.DATE> end_date = createSimple("end_date", oracle.sql.DATE.class);

    public final QFndResponsibility fndResponsibility;

    public final SimplePath<oracle.sql.DATE> last_update_date = createSimple("last_update_date", oracle.sql.DATE.class);

    public final NumberPath<Integer> last_update_login = createNumber("last_update_login", Integer.class);

    public final NumberPath<Integer> last_updated_by = createNumber("last_updated_by", Integer.class);

    public final NumberPath<Integer> responsibility_application_id = createNumber("responsibility_application_id", Integer.class);

    public final NumberPath<Integer> security_group_id = createNumber("security_group_id", Integer.class);

    public final SimplePath<oracle.sql.DATE> start_date = createSimple("start_date", oracle.sql.DATE.class);

    public QUserPermission(String variable) {
        this(UserPermission.class, forVariable(variable), INITS);
    }

    public QUserPermission(Path<? extends UserPermission> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserPermission(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserPermission(PathMetadata metadata, PathInits inits) {
        this(UserPermission.class, metadata, inits);
    }

    public QUserPermission(Class<? extends UserPermission> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.account = inits.isInitialized("account") ? new halla.holdings.oracle.account.domain.QAccount(forProperty("account")) : null;
        this.fndResponsibility = inits.isInitialized("fndResponsibility") ? new QFndResponsibility(forProperty("fndResponsibility")) : null;
    }

}

