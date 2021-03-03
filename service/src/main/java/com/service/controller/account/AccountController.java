package com.service.controller.account;

import com.core.oracle.account.domain.Account;
import com.core.oracle.account.repository.AccountRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;


    @GetMapping("/{userId}")
    public ResponseEntity getOne(@PathVariable String userId) {
        List<Account> accounts = new ArrayList<>();
        Account account = accountRepository.findByUserId(userId);
        return new ResponseEntity(account, HttpStatus.OK);
//        return new ResponseEntity(userPermissionRepository.findByFndResponsibility_Responsibility_name(respName), HttpStatus.OK);
    }
}
