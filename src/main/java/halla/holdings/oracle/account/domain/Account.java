package halla.holdings.oracle.account.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name = "fnd_user" )
public class Account {
    @Id
    private String user_id;
    private String user_name;
    private String last_update_date;
    private String last_updated_by;
    private String creation_date;
    private String created_by;
    private String last_update_login;
    private String encrypted_foundation_password;
    private String encrypted_user_password;
    private String session_number;
    private String start_date;
    private String end_date;
    private String description;
    private String last_logon_date;
    private String password_date;
    private String password_accesses_left;
    private String password_lifespan_accesses;
    private String password_lifespan_days;
    private String employee_id;
    private String email_address;
    private String fax;
    private String customer_id;
    private String supplier_id;
    private String web_password;
    private String user_guid;
    private String gcn_code_combination_id;
    private String person_party_id;
}
