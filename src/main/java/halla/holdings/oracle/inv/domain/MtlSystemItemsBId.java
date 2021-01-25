package halla.holdings.oracle.inv.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class MtlSystemItemsBId implements Serializable
{
    @EqualsAndHashCode.Include
    @Id
    @Column(name = "INVENTORY_ITEM_ID")private long inventory_item_id;
    @EqualsAndHashCode.Include
    @Id
    @Column(name = "ORGANIZATION_ID")private long organizationId;
}


