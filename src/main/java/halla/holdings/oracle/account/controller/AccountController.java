package halla.holdings.oracle.account.controller;

import halla.holdings.oracle.account.domain.Account;
import halla.holdings.oracle.account.repository.AccountRepository;
import halla.holdings.oracle.menu.repository.UserPermissionRepositorySupport;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository ;



    @GetMapping("/{userId}")
    public ResponseEntity getAllList(@PathVariable String userId) {
        List<Account> accounts =new ArrayList<>();
//                accountRepository.findByUserId(userId);
        return new ResponseEntity(accounts, HttpStatus.OK);
//        return new ResponseEntity(userPermissionRepository.findByFndResponsibility_Responsibility_name(respName), HttpStatus.OK);
    }
}
