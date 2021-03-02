package com.core.oracle.menu.repository;

import com.core.oracle.menu.domain.UserPermission;
import com.core.oracle.account.domain.QAccount;
import com.core.oracle.menu.domain.QUserPermission;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class UserPermissionRepositorySupport extends QuerydslRepositorySupport   {
    private final JPAQueryFactory queryFactory;

    QAccount account = QAccount.account;
    QUserPermission userPermission = QUserPermission.userPermission;

    public UserPermissionRepositorySupport(JPAQueryFactory queryFactory) {
        super(UserPermission.class);
        this.queryFactory = queryFactory;
    }

    public List<UserPermission> findByName(String description) {
        List<UserPermission> userPermissions =   queryFactory
                .selectFrom(userPermission)
                .leftJoin(account).on(userPermission.user_id.eq(account.userId))
                .where(account.description.eq(description))
                .fetch();

        return userPermissions;
    }

    public List<UserPermission> findByPermissionName(String description) {
        return queryFactory
                .selectFrom(userPermission)
                .where(userPermission.description.like(description))
                .fetch();
    }
}
