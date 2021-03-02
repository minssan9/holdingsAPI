package com.core.oracle.inv.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class InvSample {
    @Id
    @Column(name = "inv_sample_id")
    private String id;

    private String itemNumber;
    private String inventoryItemStatusCode;
    private String purchasingEnabledFlag;
    private LocalDateTime disabledStartMm;
    private String purchasingEnabledStatus;
    private String badItemFlag;
    private String status;
    private String msg;

}
