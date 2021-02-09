package halla.holdings.oracle.inv.repository;

import halla.holdings.oracle.inv.domain.XxeErpOtherTrxs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XxeErpOtherTrxsRepository extends JpaRepository<XxeErpOtherTrxs, Long> {

}
