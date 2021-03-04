package com.core.oracle.menu.repository;

import com.core.oracle.menu.domain.FndResponsibility;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FndResponsibilityRepository extends JpaRepository<FndResponsibility, String> {

    List<FndResponsibility> findByRowId(String rowId);
}
