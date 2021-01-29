package com.cmi.confirm_payment_microservice.repositories;


import com.cmi.confirm_payment_microservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    public abstract Account findAccountByAccountnumber(long accountnumber);
}
