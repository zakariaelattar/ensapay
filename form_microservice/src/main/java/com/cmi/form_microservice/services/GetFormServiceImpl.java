package com.cmi.form_microservice.services;


import ch.qos.logback.classic.turbo.MDCFilter;
import com.cmi.form_microservice.entities.Categorie;
import com.cmi.form_microservice.entities.Creditor;
import com.cmi.form_microservice.entities.Field;
import com.cmi.form_microservice.entities.Form;
import com.cmi.form_microservice.repositories.CategorieRepository;
import com.cmi.form_microservice.repositories.CreditorRepository;
import com.cmi.form_microservice.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetFormServiceImpl implements GetFormService {

    @Autowired
    FormRepository formRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    CreditorRepository creditorRepository;


    @Override
    public List<Field> getFields(long creditor_id, long categorie_id) {
        System.out.println("fields for creditor id" + creditor_id + " and categorie:"+ categorie_id);
        Creditor creditor = creditorRepository.findFirstById(creditor_id);
        Categorie categorie = categorieRepository.findFirstById(categorie_id);
        System.out.println("fields for creditor :"+creditor.getName());

        System.out.println("fields for categorie:"+ categorie.getName());
        Form form ;


        try {
        //form = formRepository.findFirstByCreditor(creditor);
            Field field1 = new Field();
            Field field2= new Field();
            Field field3= new Field();
            field1.setValue("field 1");
            field2.setValue("field 2");
            field3.setValue("field 3");

            List<Field> fields = new ArrayList<>();
            fields.add(field1);
            fields.add(field2);
            fields.add(field3);

            return fields;

        }
        catch (Exception e) {


            return  new ArrayList<>();
        }

    }
}
