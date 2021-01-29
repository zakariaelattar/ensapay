package com.cmi.creditors_microservice.repositories;


import com.cmi.creditors_microservice.entities.Creditor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditorRepository extends JpaRepository<Creditor,Long> {
}
