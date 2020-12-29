package halla.holdings.oracle.menu.repository;

import halla.holdings.oracle.menu.domain.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPermissionRepository extends JpaRepository<UserPermission, Long> {
    @Query( value = "select a.* from FND_USER_RESP_GROUPS_DIRECT a" +
            " inner join FND_RESPONSIBILITY_VL r on a.responsibility_id=r.responsibility_id" +
            " where RESPONSIBILITY_NAME like '%' || :respName ||'%' ", nativeQuery = true)
    List<UserPermission> findByPermissionName(String respName);

//    List<UserPermission> findByFndResponsibility_Responsibility_name(String respName);

//    @Query("from UserPermission where responsibility_name like %:name%")
//    List<UserPermission> findByQuery(@Param("name") String name);
}
