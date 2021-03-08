package com.core.oracle.inv.domain;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@RequiredArgsConstructor
public class InvSample {

    @Id
    @Column(name = "inv_sample_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NonNull
    private String itemNumber;

    private String inventoryItemStatusCode;
    @NonNull
    private String purchasingEnabledFlag;
    private LocalDateTime disabledStartMm;
    private String purchasingEnabledStatus;
    private String badItemFlag;
    @NonNull
    private String status;
    @NonNull
    private String msg;

    public InvSample() {

    }
}
