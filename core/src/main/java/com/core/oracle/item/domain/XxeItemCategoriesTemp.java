package com.core.oracle.item.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXE_ITEM_CATEGORIES_TEMP", schema = "XXE", catalog = "")
public class XxeItemCategoriesTemp {

    @Id
    @GeneratedValue
    @Column(name = "SEQUENCE_ID")
    private long sequenceId;
    @Column(name = "ORGANIZATION_ID")
    private long organizationId;
    @Column(name = "ITEM_NUMBER")
    private String itemNumber;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "CATEGORY_SET_NAME")
    private String categorySetName;
    @Column(name = "CATEGORY_SET_ID")
    private Long categorySetId;
    @Column(name = "CATEGORY_ID")
    private Long categoryId;
    @Column(name = "SEGMENT1")
    private String segment1;
    @Column(name = "SEGMENT2")
    private String segment2;
    @Column(name = "SEGMENT3")
    private String segment3;
    @Column(name = "SEGMENT4")
    private String segment4;
    @Column(name = "SEGMENT5")
    private String segment5;
    @Column(name = "SEGMENT6")
    private String segment6;
    @Column(name = "SEGMENT7")
    private String segment7;
    @Column(name = "SEGMENT8")
    private String segment8;
    @Column(name = "SEGMENT9")
    private String segment9;
    @Column(name = "SEGMENT10")
    private String segment10;
    @Column(name = "SEGMENT11")
    private String segment11;
    @Column(name = "SEGMENT12")
    private String segment12;
    @Column(name = "SEGMENT13")
    private String segment13;
    @Column(name = "SEGMENT14")
    private String segment14;
    @Column(name = "SEGMENT15")
    private String segment15;
    @Column(name = "SEGMENT16")
    private String segment16;
    @Column(name = "SEGMENT17")
    private String segment17;
    @Column(name = "SEGMENT18")
    private String segment18;
    @Column(name = "SEGMENT19")
    private String segment19;
    @Column(name = "SEGMENT20")
    private String segment20;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "PROCESS_FLAG")
    private long processFlag;
    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

}
