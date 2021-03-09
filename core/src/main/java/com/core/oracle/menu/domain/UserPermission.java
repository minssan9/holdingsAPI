package com.core.oracle.menu.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "FND_USER_RESP_GROUPS_DIRECT")
@IdClass(UserPermission.class)
public class UserPermission implements Serializable {

    @Id
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name= "user_id")
//    private Account account	;
    @Column(name = "user_id")
    private String user_id;

    @Id
//    @ManyToOne( fetch = FetchType.EAGER)
//    @JoinColumn(name= "responsibility_id")
//    private FndResponsibility fndResponsibilities;
    @Column(name = "responsibility_id")
    private String responsibility_id;

    @Column(name = "responsibility_application_id")
    private int responsibility_application_id;
    @Column(name = "security_group_id")
    private int security_group_id;
    @Column(name = "start_date")
    private String start_date;
    @Column(name = "end_date")
    private String end_date;
    @Column(name = "created_by")
    private int created_by;
    @Column(name = "creation_date")
    private String creation_date;
    @Column(name = "last_updated_by")
    private int last_updated_by;
    @Column(name = "last_update_date")
    private String last_update_date;
    @Column(name = "last_update_login")
    private int last_update_login;
    @Column(name = "description")
    private String description;
}
