package com.core.oracle.item.repository;

import com.core.oracle.item.domain.XxeItemsImportTemp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XxeItemsImportTempRepo extends JpaRepository<XxeItemsImportTemp, Long> {

}
