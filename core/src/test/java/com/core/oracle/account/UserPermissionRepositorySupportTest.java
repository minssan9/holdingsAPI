package com.core.oracle.account;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.core.oracle.menu.repository.UserPermissionRepository;
import com.core.oracle.menu.repository.UserPermissionRepositorySupport;
import com.service.controller.account.domain.QAccount;
import com.service.controller.menu.domain.QUserPermission;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class UserPermissionRepositorySupportTest {
    @Autowired
    private JPAQueryFactory queryFactory;

    @Autowired
    UserPermissionRepositorySupport userPermissionRepositorySupport;
    @Autowired
    UserPermissionRepository userPermissionRepository;
    QAccount account = QAccount.account;
    QUserPermission userPermission = QUserPermission.userPermission;

    @Test
    public void findByName() {
        List<?> userPermissions = null;

        String test = queryFactory
                .from(userPermission)
                .leftJoin(account).on(userPermission.user_id.eq(account.userId))
                .where(account.description.eq("민상훈"))
                .fetch().toString();


        userPermissions = queryFactory
                .select(
                        userPermission
                )
                .from(userPermission)
                .where(userPermission.user_id.eq("12585"))
                .fetch();


        userPermissions = userPermissionRepositorySupport.findByName("민상훈");
        userPermissions = userPermissionRepository.findByDescriptionContaining("재고");
//        userPermissions = userPermissionRepository.findByDescription("재고 일반사용자 권한");
        log.trace(userPermissions.toString());
         assertNotNull(test);
    }

}
