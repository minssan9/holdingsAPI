package com.inv.repository;

import com.inv.domain.XxeItemCatalogsTemp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface XxeItemCatalogsTempRepository extends JpaRepository<XxeItemCatalogsTemp, Void>,
    JpaSpecificationExecutor<XxeItemCatalogsTemp> {

}
