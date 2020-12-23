package halla.holdings.dbconfig;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;

@Configuration
public class QuerydslOracleConfiguration {

    @PersistenceContext(unitName = "oracle")
    private EntityManager oracleEntityManager;

    @PersistenceContext(unitName = "mysql")
    private EntityManager mysqlEntityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager){
        return new JPAQueryFactory(entityManager);
    }
}
