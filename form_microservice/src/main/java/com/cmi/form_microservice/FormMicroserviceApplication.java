package com.cmi.form_microservice;

import com.cmi.form_microservice.entities.Categorie;
import com.cmi.form_microservice.entities.Creditor;
import com.cmi.form_microservice.entities.Field;
import com.cmi.form_microservice.entities.Form;
import com.cmi.form_microservice.repositories.CategorieRepository;
import com.cmi.form_microservice.repositories.CreditorRepository;
import com.cmi.form_microservice.repositories.FieldRepository;
import com.cmi.form_microservice.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FormMicroserviceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FormMicroserviceApplication.class, args);
	}

	@Autowired
	FormRepository formRepository;
	@Autowired
	CategorieRepository categorieRepository;

	@Autowired
	FieldRepository fieldRepository;
	@Autowired
	CreditorRepository creditorRepository;


	@Override
	public void run(String... args) throws Exception {

		Creditor creditor1 = new Creditor();
		Creditor creditor2 = new Creditor();
		Creditor creditor3 = new Creditor();
		Creditor creditor4 = new Creditor();

		creditor1.setId(1);
		creditor2.setId(2);
		creditor3.setId(3);
		creditor4.setId(4);

		creditor1.setName("maroc telecom");
		creditor2.setName("orange");
		creditor3.setName("radeema");
		creditor4.setName("inwi");




		Categorie categorie1 = new Categorie();
		Categorie categorie2 = new Categorie();
		Categorie categorie3 = new Categorie();
		Categorie categorie4 = new Categorie();


		categorie1.setName("category 1");
		categorie2.setName("category 2");
		categorie3.setName("category 3");
		categorie4.setName("category 4");

		Form form1 = new Form();
		Form form2 = new Form();
		Form form3 = new Form();
		Form form4 = new Form();

		Field field1 = new Field();
		Field field2 = new Field();
		Field field3 = new Field();
		Field field4 = new Field();
		Field field5 = new Field();
		Field field6 = new Field();

		List<Field> fields2 = new ArrayList<>();
		List<Field> fields3 = new ArrayList<>();
		List<Field> fields4 = new ArrayList<>();

		List<Field> fields1 = new ArrayList<>();
		fields1.add(field1);
		fields1.add(field4);
		fields1.add(field3);

		fields2.add(field5);
		fields2.add(field2);
		fields2.add(field6);

		fields3.add(field3);
		fields3.add(field6);



		field1.setValue("field 1");
		field2.setValue("field 2");
		field3.setValue("field 3");
		field4.setValue("field 4");
		field5.setValue("field 5");
		field6.setValue("field 6");


		form1.setFields(fields1);
		form1.setCategorie(categorie1);
		form1.setCreditor(creditor1);


		creditorRepository.save(creditor1);
		creditorRepository.save(creditor2);
		creditorRepository.save(creditor3);
		creditorRepository.save(creditor4);

		fieldRepository.save(field1);
		fieldRepository.save(field2);
		fieldRepository.save(field3);
		fieldRepository.save(field4);
		fieldRepository.save(field5);
		fieldRepository.save(field6);

		categorieRepository.save(categorie1);
		categorieRepository.save(categorie2);
		categorieRepository.save(categorie3);
		categorieRepository.save(categorie4);

		formRepository.save(form1);


	}
}
