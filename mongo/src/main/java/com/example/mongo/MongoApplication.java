package com.example.mongo;

import com.example.mongo.account.Account;
import com.example.mongo.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class MongoApplication {

	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> {
			Account account = new Account();
			account.setEmail("11test.test.rlawlgns077@naver.com");
			account.setUsername("11KIM22");
			accountRepository.insert(account);

			System.out.println("finished");
		};
	}
}
