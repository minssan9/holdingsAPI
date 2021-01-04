package halla.holdings.oracle.account.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccount is a Querydsl query type for Account
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAccount extends EntityPathBase<Account> {

    private static final long serialVersionUID = -274116292L;

    public static final QAccount account = new QAccount("account");

    public final StringPath created_by = createString("created_by");

    public final StringPath creation_date = createString("creation_date");

    public final StringPath customer_id = createString("customer_id");

    public final StringPath description = createString("description");

    public final StringPath email_address = createString("email_address");

    public final StringPath employee_id = createString("employee_id");

    public final StringPath encrypted_foundation_password = createString("encrypted_foundation_password");

    public final StringPath encrypted_user_password = createString("encrypted_user_password");

    public final StringPath end_date = createString("end_date");

    public final StringPath fax = createString("fax");

    public final StringPath gcn_code_combination_id = createString("gcn_code_combination_id");

    public final StringPath last_logon_date = createString("last_logon_date");

    public final StringPath last_update_date = createString("last_update_date");

    public final StringPath last_update_login = createString("last_update_login");

    public final StringPath last_updated_by = createString("last_updated_by");

    public final StringPath password_accesses_left = createString("password_accesses_left");

    public final StringPath password_date = createString("password_date");

    public final StringPath password_lifespan_accesses = createString("password_lifespan_accesses");

    public final StringPath password_lifespan_days = createString("password_lifespan_days");

    public final StringPath person_party_id = createString("person_party_id");

    public final StringPath session_number = createString("session_number");

    public final StringPath start_date = createString("start_date");

    public final StringPath supplier_id = createString("supplier_id");

    public final StringPath user_guid = createString("user_guid");

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public final StringPath web_password = createString("web_password");

    public QAccount(String variable) {
        super(Account.class, forVariable(variable));
    }

    public QAccount(Path<? extends Account> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccount(PathMetadata metadata) {
        super(Account.class, metadata);
    }

}

