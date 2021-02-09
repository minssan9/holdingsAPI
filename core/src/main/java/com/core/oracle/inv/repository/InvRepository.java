package com.core.oracle.inv.repository;

import com.core.oracle.inv.domain.InvSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvRepository extends JpaRepository<InvSample, Long> {

}
