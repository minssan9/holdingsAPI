package com.core.oracle.account.repo;

import com.core.oracle.account.domain.Account;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    Account findByUserId(String userId);
    List<Account> findByUserName(String userName);
    List<Account> findByDescriptionLike(String userName);


//    @Query("from UserPermission where responsibility_name like %:name%")
//    List<Account> findByQuery( @Param(value = "name") String name);
}
