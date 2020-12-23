package halla.holdings.oracle.menu.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import halla.holdings.oracle.menu.domain.UserPermission;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

import static halla.holdings.oracle.menu.domain.QUserPermission.userPermission;

@Repository
public class UserPermissionRepositorySupport extends QuerydslRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public UserPermissionRepositorySupport(JPAQueryFactory jpaQueryFactory) {
        super(UserPermission.class);
        this.queryFactory = jpaQueryFactory;
    }

    public List<UserPermission> findByName(String description) {
        return queryFactory
                .selectFrom(userPermission)
                .where(userPermission.description.eq(description))
                .fetch();
    }

}
