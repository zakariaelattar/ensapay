package com.cmi.check_balance_microservice.services;

import com.cmi.check_balance_microservice.entities.Account;
import com.cmi.check_balance_microservice.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    AccountRepository accountRepository;
    @Override
    public double getBlance(String account_number) {

        try{
        Account account = accountRepository.findAccountByAccountnumber(account_number);
        return account.getAmount();

        }
        catch (Exception e) {
            return -9999999;
        }

    }



}
