package halla.holdings.oracle.account.controller;

import halla.holdings.oracle.account.domain.Account;
import halla.holdings.oracle.account.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class AccountControllerTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void getOne() {
        Account account = accountRepository.getOne("P14394");
        B
        account.getEncrypted_user_password().equals();
    }
}
