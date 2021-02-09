package com.core;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableScheduling
@Configuration
@PropertySource(value = {"classpath:account.properties"})
@CrossOrigin(origins = {"http://localhost:8091", "http://localhost:8090", "http://localhost"})
public class HoldingsApiApplication extends SpringBootServletInitializer {
    public static final DateTimeFormatter dateFormatString = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static final DateTimeFormatter timeFormatString = DateTimeFormatter.ofPattern("HHmm");
    public static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");


//    @Bean
//    PasswordEncoder passwordEncoder() {
////		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//        return new PasswordEncoderCustom();
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HoldingsApiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HoldingsApiApplication.class, args);
    }


    @Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner() {

            @Override
            public void run(ApplicationArguments args) throws Exception {
                LocalDateTime oldDateTime = LocalDateTime.now().minusDays(150);
                String oldDate = oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

                String savingDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                String savingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("0800"));

            }
        };
    }
}

