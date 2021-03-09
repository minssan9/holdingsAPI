package com.core.repository;

import com.core.oracle.menu.domain.FndResponsibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleRepository extends JpaRepository<FndResponsibility, String> {

}
