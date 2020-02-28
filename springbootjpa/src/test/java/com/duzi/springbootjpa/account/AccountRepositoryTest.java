package com.duzi.springbootjpa.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getURL());
            System.out.println(metaData.getDriverName());
            System.out.println(metaData.getUserName());
        }

        Account account = new Account();
        account.setUsername("KIM");
        account.setPassword("1234");

        Account newAccount = accountRepository.save(account);

        assertThat(newAccount).isNotNull();
        Account existingAccount = accountRepository.findByUsername(newAccount.getUsername());
        assertThat(existingAccount).isNotNull();

        Account nonExistingAccount = accountRepository.findByUsername("testUserName");
        assertThat(nonExistingAccount).isNotNull();

    }
}