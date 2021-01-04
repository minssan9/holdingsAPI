package halla.holdings.oracle.menu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFndResponsibility is a Querydsl query type for FndResponsibility
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFndResponsibility extends EntityPathBase<FndResponsibility> {

    private static final long serialVersionUID = 175977783L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFndResponsibility fndResponsibility = new QFndResponsibility("fndResponsibility");

    public final NumberPath<Integer> application_id = createNumber("application_id", Integer.class);

    public final NumberPath<Integer> created_by = createNumber("created_by", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> creation_date = createDateTime("creation_date", java.time.LocalDateTime.class);

    public final NumberPath<Integer> data_group_application_id = createNumber("data_group_application_id", Integer.class);

    public final NumberPath<Integer> data_group_id = createNumber("data_group_id", Integer.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.time.LocalDateTime> end_date = createDateTime("end_date", java.time.LocalDateTime.class);

    public final NumberPath<Integer> group_application_id = createNumber("group_application_id", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> last_update_date = createDateTime("last_update_date", java.time.LocalDateTime.class);

    public final NumberPath<Integer> last_update_login = createNumber("last_update_login", Integer.class);

    public final NumberPath<Integer> last_updated_by = createNumber("last_updated_by", Integer.class);

    public final NumberPath<Integer> menu_id = createNumber("menu_id", Integer.class);

    public final NumberPath<Integer> request_group_id = createNumber("request_group_id", Integer.class);

    public final StringPath responsibility_key = createString("responsibility_key");

    public final StringPath responsibility_name = createString("responsibility_name");

    public final StringPath rowId = createString("rowId");

    public final DateTimePath<java.time.LocalDateTime> start_date = createDateTime("start_date", java.time.LocalDateTime.class);

    public final QUserPermission userPermission;

    public final StringPath version = createString("version");

    public final StringPath web_agent_name = createString("web_agent_name");

    public final StringPath web_host_name = createString("web_host_name");

    public QFndResponsibility(String variable) {
        this(FndResponsibility.class, forVariable(variable), INITS);
    }

    public QFndResponsibility(Path<? extends FndResponsibility> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFndResponsibility(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFndResponsibility(PathMetadata metadata, PathInits inits) {
        this(FndResponsibility.class, metadata, inits);
    }

    public QFndResponsibility(Class<? extends FndResponsibility> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userPermission = inits.isInitialized("userPermission") ? new QUserPermission(forProperty("userPermission")) : null;
    }

}

