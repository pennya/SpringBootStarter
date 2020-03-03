package com.example.mongo.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void findByEmail() {
        Account account = new Account();
        account.setEmail("aaa@bbb.com");
        account.setUsername("aaa");
        accountRepository.save(account);
        Optional<Account> byId = accountRepository.findById(account.getId());
        Optional<Account> byEmail = accountRepository.findByEmail(account.getEmail());

        assertThat(byId).isNotEmpty();
        assertThat(byEmail).isNotEmpty();
        assertThat(byEmail.get().getUsername()).isEqualTo("aaa");
    }
}