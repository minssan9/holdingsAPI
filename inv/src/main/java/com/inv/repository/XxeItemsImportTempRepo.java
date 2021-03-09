package com.inv.repository;

import com.inv.domain.XxeItemsImportTemp;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface XxeItemsImportTempRepo extends JpaRepository<XxeItemsImportTemp, Long> {
    @Query(value = " fnd_request.submit_request(:application,:program, NULL, NULL, FALSE, 1 ,1 ,1 ,1 ,:processId, 1 "
        + " ,fnd_global.local_chr(0)"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL "
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL ) ",
        nativeQuery = true)
    long executeConcurrent(String application, String program, long orgId, long processId);



}
