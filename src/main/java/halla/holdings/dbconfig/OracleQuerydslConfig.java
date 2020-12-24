package halla.holdings.dbconfig;

import com.querydsl.jpa.impl.JPAQueryFactory;
import oracle.jdbc.replay.OracleDataSourceFactory;
import org.hibernate.engine.loading.internal.EntityLoadContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class OracleQuerydslConfig {
    @PersistenceContext(unitName = "oracle")
    private EntityManager oracleEntityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory(){
        return new JPAQueryFactory(oracleEntityManager);
    }
}
