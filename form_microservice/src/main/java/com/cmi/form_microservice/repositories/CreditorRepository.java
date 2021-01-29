package com.cmi.form_microservice.repositories;


import com.cmi.form_microservice.entities.Creditor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditorRepository extends JpaRepository<Creditor,Long> {


    public abstract Creditor findFirstById(long id);
}

