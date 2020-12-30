package halla.holdings.oracle.menu.domain;

import halla.holdings.oracle.account.domain.Account;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "FND_USER_RESP_GROUPS_DIRECT")
@IdClass(UserPermission.class)
public class UserPermission implements Serializable {

    @Id
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name= "user_id")
//    private Account account	;
    @Column(name= "user_id")
    private String user_id;

    @Id
//    @ManyToOne( fetch = FetchType.EAGER)
//    @JoinColumn(name= "responsibility_id")
//    private FndResponsibility fndResponsibilities;
    @Column(name= "responsibility_id")
    private String responsibility_id;

    @Column(name= "responsibility_application_id")
    private int responsibility_application_id;
    @Column(name= "security_group_id")
    private int security_group_id;
    @Column(name= "start_date")
    private LocalDate start_date;
    @Column(name= "end_date")
    private LocalDate end_date;
    @Column(name= "created_by")
    private int created_by	;
    @Column(name= "creation_date")
    private LocalDate creation_date;
    @Column(name= "last_updated_by")
    private int last_updated_by	;
    @Column(name= "last_update_date")
    private LocalDate last_update_date;
    @Column(name= "last_update_login")
    private int last_update_login	;
    @Column(name= "description")
    private String description	;
}
