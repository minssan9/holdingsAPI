package com.inv.repository;

import com.inv.domain.XxeItemsImportTemp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XxeItemsImportTempRepo extends JpaRepository<XxeItemsImportTemp, Long> {

}