package halla.holdings.inv.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

//@Entity
@Table(name = "Xxe_inv_pur_disabled_history", schema = "APPS", catalog = "")
public class Xxe_inv_pur_disabled_history {

    private String itemNumber;
    private String inventoryItemStatusCode;
    private String purchasingEnabledFlag;
    private Time disabledStartMm;
    private String purchasingEnabledStatus;
    private String badItemFlag;
    private String status;
    private String msg;
}
