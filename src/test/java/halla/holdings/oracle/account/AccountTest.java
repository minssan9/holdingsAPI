package halla.holdings.oracle.account;

import halla.holdings.oracle.account.repository.AccountRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountTest {
    @Autowired private AccountRepository accountRepository;

    @Test
    void getAccountTest(){
        Assert.assertNotNull(accountRepository.findByUser_id("P14394"));
    }
}

