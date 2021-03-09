package com.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("oracle.datasource")
@Data
@Component
public class OracleProperties {

    String url;
    String username;
    String password;
    String driverClassName;
}
