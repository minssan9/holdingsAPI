package halla.holdings.oracle.menu.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import halla.holdings.oracle.menu.domain.FndResponsibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FndResponsibilityRepository extends JpaRepository<FndResponsibility, String> {

    List<FndResponsibility> findByRowId(String rowId);
}
