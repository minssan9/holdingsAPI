package halla.holdings.oracle.item.repository;

import halla.holdings.oracle.item.domain.ItemSpec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSpecRepository extends JpaRepository<ItemSpec, Long> {

}
