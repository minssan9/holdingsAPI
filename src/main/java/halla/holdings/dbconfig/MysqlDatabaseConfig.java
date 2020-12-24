package halla.holdings.dbconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@PropertySource(value = {"classpath:account.properties"})
@ConfigurationProperties(value = "spring.mysql")
@EnableJpaRepositories(
        entityManagerFactoryRef = "mysqlEntityManagerFactory",
        transactionManagerRef = "mysqlTransactionManager"
//        asePackages = {"halla.holdings.mysql.*.repository"}
        )
public class MysqlDatabaseConfig {

//    @Bean
//    @ConfigurationProperties(value = "spring.mysql.datasource")
//    public DataSource mysqlDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "mysqlEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(EntityManagerFactoryBuilder builder) {
//        Map<String, String> propertiesHashMap = new HashMap<>();
//        propertiesHashMap.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
//
//        return builder.dataSource(mysqlDataSource())
//                .properties(propertiesHashMap)
//                .packages("halla.holdings.*.domain")
//                .persistenceUnit("mysql")
//                .build();
//    }
//
//    @Bean(name = "mysqlTransactionManager")
//    public PlatformTransactionManager mysqlTransactionManager(EntityManagerFactoryBuilder builder) {
//        return new JpaTransactionManager(Objects.requireNonNull(mysqlEntityManagerFactory(builder).getObject()));
//    }
}
