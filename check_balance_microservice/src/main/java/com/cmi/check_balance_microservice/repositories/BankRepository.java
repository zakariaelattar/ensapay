package com.cmi.check_balance_microservice.repositories;


import com.cmi.check_balance_microservice.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
}
