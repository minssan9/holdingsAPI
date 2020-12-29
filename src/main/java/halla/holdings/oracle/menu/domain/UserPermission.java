package halla.holdings.oracle.menu.domain;

import halla.holdings.oracle.account.domain.Account;
import oracle.sql.DATE;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "FND_USER_RESP_GROUPS_DIRECT")
@IdClass(UserPermission.class)
public class UserPermission implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition= "user_id")
    private Account account	;
    @Id
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn(name= "responsibility_id")
    private FndResponsibility fndResponsibilities;

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
