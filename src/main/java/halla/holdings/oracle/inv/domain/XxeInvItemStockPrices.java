package halla.holdings.oracle.inv.domain;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "XXE_INV_ITEM_STOCK_PRICES", schema = "XXE", catalog = "")
public class XxeInvItemStockPrices {
    @Id
    private String baseYyyymm;
    private long organizationId;
    private long inventoryItemId;
    private Long stockPrice;
    private long createdBy;
    private Time creationDate;
    private String tailYyyymm;

    @Basic
    @Column(name = "BASE_YYYYMM", nullable = false, length = 6)
    public String getBaseYyyymm() {
        return baseYyyymm;
    }

    public void setBaseYyyymm(String baseYyyymm) {
        this.baseYyyymm = baseYyyymm;
    }

    @Basic
    @Column(name = "ORGANIZATION_ID", nullable = false, precision = 0)
    public long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "INVENTORY_ITEM_ID", nullable = false, precision = 0)
    public long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Basic
    @Column(name = "STOCK_PRICE", nullable = true, precision = 0)
    public Long getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Long stockPrice) {
        this.stockPrice = stockPrice;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = false, precision = 0)
    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = false)
    public Time getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Time creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "TAIL_YYYYMM", nullable = true, length = 6)
    public String getTailYyyymm() {
        return tailYyyymm;
    }

    public void setTailYyyymm(String tailYyyymm) {
        this.tailYyyymm = tailYyyymm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XxeInvItemStockPrices that = (XxeInvItemStockPrices) o;

        if (organizationId != that.organizationId) return false;
        if (inventoryItemId != that.inventoryItemId) return false;
        if (createdBy != that.createdBy) return false;
        if (baseYyyymm != null ? !baseYyyymm.equals(that.baseYyyymm) : that.baseYyyymm != null) return false;
        if (stockPrice != null ? !stockPrice.equals(that.stockPrice) : that.stockPrice != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (tailYyyymm != null ? !tailYyyymm.equals(that.tailYyyymm) : that.tailYyyymm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = baseYyyymm != null ? baseYyyymm.hashCode() : 0;
        result = 31 * result + (int) (organizationId ^ (organizationId >>> 32));
        result = 31 * result + (int) (inventoryItemId ^ (inventoryItemId >>> 32));
        result = 31 * result + (stockPrice != null ? stockPrice.hashCode() : 0);
        result = 31 * result + (int) (createdBy ^ (createdBy >>> 32));
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (tailYyyymm != null ? tailYyyymm.hashCode() : 0);
        return result;
    }
}
