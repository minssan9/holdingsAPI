package com.service;

import com.querydsl.core.annotations.Config;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@Configuration
@Data
@ConfigurationProperties(prefix = "oracle.datasource")
public class AppYaml {
    private String url;

}
