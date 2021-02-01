package com.cmi.creditors_microservice;

import com.cmi.creditors_microservice.entities.Categorie;
import com.cmi.creditors_microservice.entities.Creditor;
import com.cmi.creditors_microservice.repositories.CategorieRepository;
import com.cmi.creditors_microservice.repositories.CreditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.persistence.Entity;


@EnableEurekaClient
@SpringBootApplication
public class CreditorsMicroserviceApplication implements CommandLineRunner {


	@Autowired
	CreditorRepository creditorRepository;

	@Autowired
	CategorieRepository categorieRepository;


	public static void main(String[] args) {
		SpringApplication.run(CreditorsMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Categorie categorie1 = new Categorie();
		Categorie categorie2 = new Categorie();
		Categorie categorie3 = new Categorie();
		Categorie categorie4 = new Categorie();

		Creditor creditor1 = new Creditor();
		Creditor creditor2 = new Creditor();
		Creditor creditor3 = new Creditor();
		Creditor creditor4 = new Creditor();

		categorie1.setName("categorie 1");
		categorie2.setName("categorie 2");
		categorie3.setName("categorie 3");
		categorie4.setName("categorie 4");

		creditor1.setCode("mt");
		creditor1.setName("maroc telecom");
		creditor1.setCategorie(categorie1);

		creditor2.setCode("og");
		creditor2.setName("orange");
		creditor2.setCategorie(categorie2);

		creditor3.setCode("rdm");
		creditor3.setName("radeema");
		creditor3.setCategorie(categorie3);

		creditor4.setCode("nw");
		creditor4.setName("inwi");
		creditor4.setCategorie(categorie4);

		categorieRepository.save(categorie1);
		categorieRepository.save(categorie2);
		categorieRepository.save(categorie3);
		categorieRepository.save(categorie4);

		creditorRepository.save(creditor1);
		creditorRepository.save(creditor2);
		creditorRepository.save(creditor3);
		creditorRepository.save(creditor4);


	}
}
