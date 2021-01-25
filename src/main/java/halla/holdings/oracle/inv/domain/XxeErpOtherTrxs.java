package halla.holdings.oracle.inv.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import oracle.sql.DATE;
import oracle.sql.NUMBER;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "XXE_ERP_OTHER_TRXS", schema = "XXE", catalog = "")
@Getter
@Setter
@IdClass(XxeErpOtherTrxs.class)
public class XxeErpOtherTrxs implements Serializable {
    @Id
    @Column(name = "ORGANIZATION_ID") private long  organizationId;
    @Id
    @Column(name = "GROUP_ID") private String  groupId;
    @Id
    @Column(name = "LINE_NUM") private long  lineNum;
    @Id
    @Column(name = "SEQ") private long  seq;
    @Column(name = "SUBINVENTORY_CODE") private String  subinventoryCode;
    @Column(name = "TRANSACTION_TYPE_ID") private long  transactionTypeId;
    @Column(name = "TRANSACTION_ACTION_ID") private long  transactionActionId;
    @Column(name = "TRANSACTION_DATE") private DATE  transactionDate;
    @Column(name = "CODE_COMBINATION_ID") private long  codeCombinationId;
    @Column(name = "DEPT_CODE") private String  deptCode;
    @Column(name = "ITEM_CODE") private String  itemCode;
    @Column(name = "TRANSACTION_QUANTITY") private long  transactionQuantity;
    @Column(name = "CREATION_DATE") private DATE  creationDate;
    @Column(name = "CREATED_BY") private long  createdBy;
    @Column(name = "INTERFACE_ID") private long  interfaceId;
    @Column(name = "ERP_PROCESS_STS") private String  erpProcessSts;
    @Column(name = "TO_SUBINVENTORY_CODE") private String  toSubinventoryCode;
    @Column(name = "VENDOR_SITE_ID") private long  vendor_siteId;
    @Column(name = "TO_ORGID") private long  toOrgid;
}
