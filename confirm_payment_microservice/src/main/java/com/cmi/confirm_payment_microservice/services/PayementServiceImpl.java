package com.cmi.confirm_payment_microservice.services;


import com.cmi.confirm_payment_microservice.entities.Account;
import com.cmi.confirm_payment_microservice.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayementServiceImpl implements PaymentService {

    @Autowired
    AccountRepository accountRepository;
    @Override
    public double checkBalance(long account_number) {

        try {
       Account account =  accountRepository.findAccountByAccountnumber(account_number);
        if(account.getAmount() != 0){
        return account.getAmount();
        }
        return -9999999;

        }
        catch (Exception e) {return -99999999; }

        /**
         * Handle exception for amount
         */
    }

    @Override
    public double pay(double amount, long account_number) {
        try {
            Account account =  accountRepository.findAccountByAccountnumber(account_number);

            /**
             * Save in batch the operation
             */
            account.setAmount(account.getAmount()-amount);
            accountRepository.save(account);
            return account.getAmount();
        }
        catch (Exception e) {
        return -999999999;

        }
    }
}
