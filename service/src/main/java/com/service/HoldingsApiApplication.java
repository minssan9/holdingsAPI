package com.service;

import static com.core.config.StaticConfig.DATE_STRING_FORMAT;
import static com.core.config.StaticConfig.TIME_STRING_FORMAT;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;

@SpringBootApplication
@CrossOrigin(origins = {"http://localhost:8091", "http://localhost:8090", "http://localhost"})
public class HoldingsApiApplication extends SpringBootServletInitializer {

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
                String oldDate = oldDateTime.format(DATE_STRING_FORMAT);

                String savingDate = LocalDateTime.now().format(DATE_STRING_FORMAT);
                String savingTime = LocalDateTime.now().format(TIME_STRING_FORMAT);

            }
        };
    }
}

