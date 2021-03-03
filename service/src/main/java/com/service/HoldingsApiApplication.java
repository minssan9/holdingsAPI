package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = {  "com.core", "com.service"})
@Configuration
//@CrossOrigin(origins = {"http://localhost:8091", "http://localhost:8090", "http://localhost"})
//@ComponentScan(basePackages = {"com.core.oracle.*.repository"})
public class HoldingsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoldingsApiApplication.class, args);
    }

//    @Bean
//    public ApplicationRunner applicationRunner() {
//        return new ApplicationRunner() {
//            @Override
//            public void run(ApplicationArguments args) {
//                LocalDateTime oldDateTime = LocalDateTime.now().minusDays(150);
//                String oldDate = oldDateTime.format(DATE_STRING_FORMAT);
//
//                String savingDate = LocalDateTime.now().format(DATE_STRING_FORMAT);
//                String savingTime = LocalDateTime.now().format(TIME_STRING_FORMAT);
//
//            }
//        };
//    }
}

