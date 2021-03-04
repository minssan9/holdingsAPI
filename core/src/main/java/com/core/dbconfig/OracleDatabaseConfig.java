package com.core.dbconfig;

import com.core.properties.OracleProperties;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.util.Objects;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import org.springframework.transaction.PlatformTransactionManager;
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

    @Autowired
    OracleProperties oracleProperties;

    @Bean
    @Primary
    public Properties mysqlDBProperties() {
        Properties mysqlProperties = new Properties();
        mysqlProperties.put("jdbcUrl", this.oracleProperties.getUrl());
        mysqlProperties.put("username", this.oracleProperties.getUsername());
        mysqlProperties.put("password", this.oracleProperties.getPassword());
        mysqlProperties.put("driverClassName" , this.oracleProperties.getDriverClassName());
        return mysqlProperties;
    }

    @Bean
    @ConfigurationProperties(prefix = "oracle.datasource")
    public DataSource oracleDataSource() {
        HikariConfig config = new HikariConfig(mysqlDBProperties());
        return new LazyConnectionDataSourceProxy(new HikariDataSource(config));
//        DataSource dataSource = DataSourceBuilder.create().build();
//        return DataSourceBuilder.create().build();
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

    @Bean
    @Primary
    public PlatformTransactionManager oracleTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(Objects.requireNonNull(oracleEntityManagerFactory(builder).getObject()));
    }


}
