package halla.holdings.oracle.inv.repository;

import halla.holdings.oracle.inv.domain.MtlUnitTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlUnitTransactionsRepository extends JpaRepository<MtlUnitTransactions, Long> {

}
