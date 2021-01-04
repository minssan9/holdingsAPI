package halla.holdings.oracle.inv.repository;

import halla.holdings.oracle.inv.domain.InvSample;
import halla.holdings.oracle.inv.domain.ItemSpec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSpecRepository extends JpaRepository<ItemSpec, Long> {

}
