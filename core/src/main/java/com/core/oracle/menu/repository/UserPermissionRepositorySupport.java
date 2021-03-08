package com.core.oracle.menu.repository;

import com.core.oracle.account.domain.QAccount;
import com.core.oracle.menu.domain.QUserPermission;
import com.core.oracle.menu.domain.UserPermission;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserPermissionRepositorySupport extends QuerydslRepositorySupport {

    QAccount account = QAccount.account;
    QUserPermission userPermission = QUserPermission.userPermission;

    public UserPermissionRepositorySupport() {
        super(UserPermission.class);
    }

    public List<UserPermission> findByName(String description) {
        List<UserPermission> userPermissions = from(userPermission)
            .leftJoin(account).on(userPermission.user_id.eq(account.userId))
            .where(account.description.eq(description))
            .fetch();

        return userPermissions;
    }

    public List<UserPermission> findByPermissionName(String description) {
        return from(userPermission)
            .where(userPermission.description.like(description))
            .fetch();
    }
}
