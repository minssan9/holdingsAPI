package com.inv.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXE_ITEM_CATALOGS_TEMP", schema = "XXE", catalog = "")
public class XxeItemCatalogsTemp {

    @Id
    @GeneratedValue
    @Column(name = "SEQUENCE_ID")
    private long sequenceId;
    @Column(name = "ORGANIZATION_ID")
    private long organizationId;
    @Column(name = "ITEM_NUMBER")
    private String itemNumber;
    @Column(name = "ELEMENT_NAME")
    private String elementName;
    @Column(name = "ELEMENT_VALUE")
    private String elementValue;
    @Column(name = "ITEM_DESC_UPDATE_FLAG")
    private long itemDescUpdateFlag;
    @Column(name = "CATALOG_GROUP_NAME")
    private String catalogGroupName;
    @Column(name = "CATALOG_KFF_NAME")
    private String catalogKffName;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "PROCESS_FLAG")
    private long processFlag;
    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

}
