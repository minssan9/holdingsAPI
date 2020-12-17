package halla.holdings.inv.repository;

import halla.holdings.inv.domain.InvSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvRepository extends JpaRepository<InvSample, Long> {

}
