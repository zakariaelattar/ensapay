package com.cmi.confirm_payment_microservice;

import com.cmi.confirm_payment_microservice.entities.Account;
import com.cmi.confirm_payment_microservice.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfirmPaymentMicroserviceApplication implements CommandLineRunner {


	@Autowired
	AccountRepository accountRepository;
	public static void main(String[] args) {
		SpringApplication.run(ConfirmPaymentMicroserviceApplication.class, args);
	}

	@Override

	public void run(String... args) throws Exception {


		Account account1 = new Account();
		account1.setAccountnumber(123456789);
		account1.setAmount(2064);

		Account account2 = new Account();
		account2.setAccountnumber(546987123);
		account2.setAmount(9451);
		Account account3 = new Account();
		account3.setAccountnumber(987654321);
		account3.setAmount(6985);


		accountRepository.save(account1);
		accountRepository.save(account2);
		accountRepository.save(account3);



	}
}
