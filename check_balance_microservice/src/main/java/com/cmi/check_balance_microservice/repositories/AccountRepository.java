package com.cmi.check_balance_microservice.repositories;

import com.cmi.check_balance_microservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
   Account findAccountByAccountnumber(long account_number);
}
