package com.core.config;

import java.time.format.DateTimeFormatter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StaticConfig {

    public static DateTimeFormatter DATE_STRING_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static DateTimeFormatter TIME_STRING_FORMAT = DateTimeFormatter.ofPattern("HHmm");

    public static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");


}
