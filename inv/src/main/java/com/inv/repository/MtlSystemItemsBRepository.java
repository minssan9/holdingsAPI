package com.inv.repository;

import com.google.common.base.Optional;
import com.inv.domain.MtlSystemItemsB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlSystemItemsBRepository extends JpaRepository<MtlSystemItemsB, Long>
    {
        MtlSystemItemsB findByOrganizationIdAndSegment1(long organizationId, String segment1);

}
