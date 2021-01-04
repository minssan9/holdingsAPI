package halla.holdings.oracle.menu.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import halla.holdings.oracle.account.domain.QAccount;
import halla.holdings.oracle.menu.domain.QUserPermission;
import halla.holdings.oracle.menu.domain.UserPermission;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static halla.holdings.oracle.menu.domain.QUserPermission.userPermission;

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
