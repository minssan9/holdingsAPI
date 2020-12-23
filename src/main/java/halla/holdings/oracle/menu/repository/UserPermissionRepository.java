package halla.holdings.oracle.menu.repository;

import halla.holdings.oracle.menu.domain.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPermissionRepository extends JpaRepository<UserPermission, Long> {
    List<UserPermission> findByFndResponsibility_Responsibility_name(String respName);
}
