package com.inv.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "XXE_ITEM_CATALOGS_TEMP")
@Data
public class XxeItemCatalogsTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
        generator = "XXE_ITEM_CATALOGS_TEMP_SEQ")
    @Column(name = "SEQUENCE_ID", nullable = false)
    private String sequenceId;

    @Column(name = "ORGANIZATION_ID", nullable = false)
    private String organizationId;

    @Column(name = "ITEM_NUMBER", nullable = false)
    private String itemNumber;

    @Column(name = "ELEMENT_NAME", nullable = false)
    private String elementName;

    @Column(name = "ELEMENT_VALUE")
    private String elementValue;

    @Column(name = "ITEM_DESC_UPDATE_FLAG", nullable = false)
    private String itemDescUpdateFlag;

    @Column(name = "CATALOG_GROUP_NAME", nullable = false)
    private String catalogGroupName;

    @Column(name = "CATALOG_KFF_NAME")
    private String catalogKffName;

    @Column(name = "TRANSACTION_TYPE", nullable = false)
    private String transactionType;

    @Column(name = "PROCESS_FLAG", nullable = false)
    private String processFlag;

    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

}
