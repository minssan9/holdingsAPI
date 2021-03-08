package com.inv.repository;

import com.inv.domain.MtlSystemItemsInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MtlSystemItemsInterfaceRepository extends
    JpaRepository<MtlSystemItemsInterface, Long>,
    JpaSpecificationExecutor<MtlSystemItemsInterface> {

}
