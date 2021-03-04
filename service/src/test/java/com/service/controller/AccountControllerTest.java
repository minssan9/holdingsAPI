package com.service.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.core.oracle.account.domain.Account;
import com.core.oracle.account.repository.AccountRepository;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AccountControllerTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void getOne() throws GeneralSecurityException, UnsupportedEncodingException {
        Account account = accountRepository.getOne("P14394");

//        log.trace(aes256Util.encrypt("dydzhf1004!"));
        log.trace(account.getEncrypted_user_password());
//        account.getEncrypted_user_password().equals(aes256Util.encrypt("dydzhf1004!"));
//        account.getEncrypted_user_password().equals(md5("dydzhf1004!"));

        assertNotNull(account.getEncrypted_user_password());
    }
}

