package halla.holdings.oracle.inv.repository;

import halla.holdings.oracle.inv.domain.MtlSystemItemsB;
import halla.holdings.oracle.inv.domain.MtlUnitTransactions;
import halla.holdings.oracle.inv.domain.XxeErpOtherTrxs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MtlSystemItemsBRepository extends JpaRepository<MtlSystemItemsB, Long> {
    List<MtlSystemItemsB> findBySegment1(String segment1);

    MtlSystemItemsB findBySegment1AndOrganizationId(String segment1, long org_id);
}
