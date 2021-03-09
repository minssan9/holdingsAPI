package com.inv.repository;

import com.inv.domain.MtlItemTemplates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MtlItemTemplatesRepository extends JpaRepository<MtlItemTemplates, Void>,
    JpaSpecificationExecutor<MtlItemTemplates> {

}
