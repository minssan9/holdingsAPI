package com.core.oracle.menu.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "FND_RESPONSIBILITY_VL", schema = "apps")
public class FndResponsibility {

    @Id
    @Column(name = "row_id")
    private String rowId;
    private String responsibility_name;
    private String description;
    private String web_host_name;
    private String web_agent_name;
    private int application_id;

    @ManyToOne
    private UserPermission userPermission;
    private String responsibility_key;
    private LocalDateTime last_update_date;
    private int last_updated_by;
    private LocalDateTime creation_date;
    private int created_by;
    private int last_update_login;
    private int data_group_application_id;
    private int data_group_id;
    private int menu_id;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private int group_application_id;
    private int request_group_id;
    private String version;


}
