package com.core.dbconfig;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class OracleQuerydslConfig {

    @PersistenceContext(unitName = "oracle")
    private EntityManager oracleEntityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(oracleEntityManager);
    }
}
