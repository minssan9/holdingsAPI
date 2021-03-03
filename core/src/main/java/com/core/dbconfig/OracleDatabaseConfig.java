package com.core.dbconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "oracleEntityManagerFactory",
        transactionManagerRef = "oracleTransactionManager",
        basePackages = "com.core.oracle.*.repository"
)
public class OracleDatabaseConfig {

//    private final JpaProperties jpaProperties;
//    private final HibernateProperties hibernateProperties;

//    public OracleDatabaseConfig(JpaProperties jpaProperties,
//        HibernateProperties hibernateProperties) {
//        this.jpaProperties = jpaProperties;
//        this.hibernateProperties = hibernateProperties;
//    }

    @Bean
    @ConfigurationProperties(prefix = "oracle.datasource")
    public DataSource oracleDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean oracleEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        Map<String,Object> properties = new HashMap<>();
        CustomOracleDialect customOracleDialect = new CustomOracleDialect();
        properties.put("hibernate.dialect", customOracleDialect);

        return builder.dataSource(oracleDataSource())
                .properties(properties)
                .packages("com.core.oracle.*.domain")
                .persistenceUnit("oracle")
                .build();
    }

//    @Bean
//    @Primary
//    public PlatformTransactionManager oracleTransactionManager(EntityManagerFactoryBuilder builder) {
//        return new JpaTransactionManager(Objects.requireNonNull(oracleEntityManagerFactory(builder).getObject()));
//    }


}
