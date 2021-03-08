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

    @Query(value = " fnd_request.submit_request( "
        + " 'INV'              "
        + " ,'INCOIN'          "
        + " ,NULL              "
        + " ,NULL              "
        + " ,FALSE             "
        + " ,1                 "
        + " ,1                 "
        + " ,1                  "
        + " ,1                   "
        + " ,V_SET_PROCESS_ID_C     "
        + " ,1          "
        + " ,fnd_global.local_chr(0)"
        + " ,NULL"
        + " ,NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL"
        + " ,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL )", nativeQuery = true)
    void executeConcurrent();

}
