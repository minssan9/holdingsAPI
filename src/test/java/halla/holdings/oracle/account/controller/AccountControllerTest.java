package halla.holdings.oracle.account.controller;

import halla.holdings.oracle.account.domain.Account;
import halla.holdings.oracle.account.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class AccountControllerTest {

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

