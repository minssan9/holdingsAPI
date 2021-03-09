package com.inv.repository;

import com.inv.domain.XxeItemCategoriesTemp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface XxeItemCategoriesTempRepository extends JpaRepository<XxeItemCategoriesTemp, Void>,
    JpaSpecificationExecutor<XxeItemCategoriesTemp> {

}
