package com.cmi.form_microservice.repositories;


import com.cmi.form_microservice.entities.Categorie;
import com.cmi.form_microservice.entities.Creditor;
import com.cmi.form_microservice.entities.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormRepository extends JpaRepository<Form,Long> {

    public abstract Form findFirstByCreditor(Creditor creditor);

}
