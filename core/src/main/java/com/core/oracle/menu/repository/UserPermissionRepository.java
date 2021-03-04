package com.core.oracle.menu.repository;

import com.core.oracle.menu.domain.UserPermission;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPermissionRepository extends JpaRepository<UserPermission, Long> {
    List<UserPermission> findByDescriptionContaining(String respName);

    List<UserPermission> findByDescription(String 재고_일반사용자_권한);

//    List<UserPermission> findByFndResponsibility_Responsibility_name(String respName);

//    @Query("from UserPermission where responsibility_name like %:name%")
//    List<UserPermission> findByQuery(@Param("name") String name);
}
