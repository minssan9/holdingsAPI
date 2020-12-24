package halla.holdings.oracle.account.repository;

import halla.holdings.oracle.account.domain.Account;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

    List<Account> findByUserId(String userId);

//    @Query("from UserPermission where responsibility_name like %:name%")
//    List<Account> findByQuery( @Param(value = "name") String name);
}
