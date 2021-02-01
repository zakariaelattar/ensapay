package com.cmi.create_payment_account_micoservice.services.Account;


import com.cmi.create_payment_account_micoservice.entities.Account;
import com.cmi.create_payment_account_micoservice.entities.Information;
import com.cmi.create_payment_account_micoservice.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;



    @Override
    public String validateAccountCreation(Information information) {
        /**
         *  check the informations
         */

        if(true) {
            System.out.println("account checked and validated");
            return generateAccountNumber(information.getCin().substring(3,5));

        }
        return "9999999";
    }

    @Override
    public Account createAccount(Information information) {
       Account account = new Account();

       account.setAccount_number(generateAccountNumber(information.getCin().substring(3,5)));
        account.setAmount(0);

        accountRepository.save(account);

        System.out.println("account created from service accountServiceImpl");
        return account;
    }

    @Override
    public String generateAccountNumber(String s) {
        return "92783654139872657129"+s;
    }


}
