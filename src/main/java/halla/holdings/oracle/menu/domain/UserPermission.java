package halla.holdings.oracle.menu.domain;

import halla.holdings.oracle.account.domain.Account;
import oracle.sql.DATE;

import javax.persistence.*;

@Entity
@Table(name = "FND_USER_RESP_GROUPS_DIRECT", schema = "APPS")
public class UserPermission {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "responsibility_id")
    private FndResponsibility fndResponsibility;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "user_id")
    private Account account	;
    private int responsibility_application_id;
    private int security_group_id;
    private DATE start_date;
    private DATE end_date;
    private int created_by	;
    private DATE creation_date;
    private int last_updated_by	;
    private DATE last_update_date;
    private int last_update_login	;
    private String description	;
}
