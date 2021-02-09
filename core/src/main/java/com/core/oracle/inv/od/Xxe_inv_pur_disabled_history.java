package com.core.oracle.inv.od;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Xxe_inv_pur_disabled_history {
    @Id
    private String itemNumber;
    private String inventoryItemStatusCode;
    private String purchasingEnabledFlag;
    private String disabledStartMm;
    private String purchasingEnabledStatus;
    private String badItemFlag;
    private String status;
    private String msg;
}
