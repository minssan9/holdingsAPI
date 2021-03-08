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
@Table(name = "XXE_ITEM_CATEGORIES_TEMP")
@Data
public class XxeItemCategoriesTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
        generator = "XXE_ITEM_CATEGORIES_TEMP_SEQ")
    @Column(name = "SEQUENCE_ID", nullable = false)
    private String sequenceId;

    @Column(name = "ORGANIZATION_ID", nullable = false)
    private String organizationId;

    @Column(name = "ITEM_NUMBER", nullable = false)
    private String itemNumber;

    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;

    @Column(name = "CATEGORY_SET_NAME", nullable = false)
    private String categorySetName;

    @Column(name = "CATEGORY_SET_ID")
    private String categorySetId;

    @Column(name = "CATEGORY_ID")
    private String categoryId;

    @Column(name = "SEGMENT1")
    private String SEGMENT1;

    @Column(name = "SEGMENT2")
    private String SEGMENT2;

    @Column(name = "SEGMENT3")
    private String SEGMENT3;

    @Column(name = "SEGMENT4")
    private String SEGMENT4;

    @Column(name = "SEGMENT5")
    private String SEGMENT5;

    @Column(name = "SEGMENT6")
    private String SEGMENT6;

    @Column(name = "SEGMENT7")
    private String SEGMENT7;

    @Column(name = "SEGMENT8")
    private String SEGMENT8;

    @Column(name = "SEGMENT9")
    private String SEGMENT9;

    @Column(name = "SEGMENT10")
    private String SEGMENT10;

    @Column(name = "SEGMENT11")
    private String SEGMENT11;

    @Column(name = "SEGMENT12")
    private String SEGMENT12;

    @Column(name = "SEGMENT13")
    private String SEGMENT13;

    @Column(name = "SEGMENT14")
    private String SEGMENT14;

    @Column(name = "SEGMENT15")
    private String SEGMENT15;

    @Column(name = "SEGMENT16")
    private String SEGMENT16;

    @Column(name = "SEGMENT17")
    private String SEGMENT17;

    @Column(name = "SEGMENT18")
    private String SEGMENT18;

    @Column(name = "SEGMENT19")
    private String SEGMENT19;

    @Column(name = "SEGMENT20")
    private String SEGMENT20;

    @Column(name = "TRANSACTION_TYPE", nullable = false)
    private String transactionType;

    @Column(name = "PROCESS_FLAG", nullable = false)
    private String processFlag;

    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

}
