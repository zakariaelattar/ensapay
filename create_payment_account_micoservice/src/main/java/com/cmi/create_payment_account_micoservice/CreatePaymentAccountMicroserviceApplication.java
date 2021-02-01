package com.cmi.create_payment_account_micoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class CreatePaymentAccountMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreatePaymentAccountMicroserviceApplication.class, args);
	}

}
