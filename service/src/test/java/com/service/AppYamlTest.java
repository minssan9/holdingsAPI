package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:server-config-test.properties")
@ExtendWith(SpringExtension.class)
class AppYamlTest {

    @Autowired
    AppYaml appYaml;

    @Test
    void appYamlTest(){
        System.out.println(appYaml.getUrl());
        assertNotNull(appYaml.getUrl());
    }
}
