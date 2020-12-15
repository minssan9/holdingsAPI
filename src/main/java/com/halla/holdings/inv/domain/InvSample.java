package com.halla.holdings.inv.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class InvSample {
    @Id
    private String rowid;


}
