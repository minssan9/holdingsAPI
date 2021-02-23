package com.core.config.database;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@Configuration
//@MapperScan(value = "halla.holdings.", sqlSessionFactoryRef = "oracleSqlSessionFactory")
//@ConfigurationProperties(value = "spring.oracle")
@EnableJpaRepositories(
        entityManagerFactoryRef = "oracleEntityManagerFactory",
        transactionManagerRef = "oracleTransactionManager",
        basePackages = {"com.core.oracle.*.repository"}
)
public class OracleDatabaseConfig {

    private static final String DEFAULT_NAMING_STRATEGY
            = "org.springframework.boot.orm.jpa.hibernate.SpringNamingStrategy";

    @Bean
    @Primary
    @ConfigurationProperties(value = "spring.datasource")
    public DataSource oraDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean oracleEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        Map<String, String> propertiesHashMap = new HashMap<>();
        propertiesHashMap.put("hibernate.ejb.naming_strategy", DEFAULT_NAMING_STRATEGY);
        propertiesHashMap.put("hibernate.dialect", "halla.holdings.config.database.CustomOracleDialect");

        return builder.dataSource(oraDataSource())
                .properties(propertiesHashMap)
                .packages("halla.holdings.oracle.*.domain")
                .persistenceUnit("oracle")
                .build();
    }

    @Bean
    @Primary
    public PlatformTransactionManager oracleTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(Objects.requireNonNull(oracleEntityManagerFactory(builder).getObject()));
    }


}
