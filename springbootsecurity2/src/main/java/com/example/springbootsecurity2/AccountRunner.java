package com.example.springbootsecurity2;

import com.example.springbootsecurity2.account.Account;
import com.example.springbootsecurity2.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = accountService.createAccount("admin", "admin");
        System.out.println(String.format("username : %s  password : %s",
                account.getUsername(), account.getPassword()));
    }
}
