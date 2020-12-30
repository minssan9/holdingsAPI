package halla.holdings.oracle.account;

import halla.holdings.oracle.account.domain.Account;
import halla.holdings.oracle.account.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class AccountTest {
    @Autowired private AccountRepository accountRepository;

    @Test
    void getAccountTest(){
        log.trace(accountRepository.findByUserName("P14394").toString());
        List<Account> accounts = accountRepository.findByUserName("P14394");
        accounts = accountRepository.findByDescriptionLike("%민상%");

        Assert.assertNotNull(accountRepository.findByUserId("P14394"));
    }
}


