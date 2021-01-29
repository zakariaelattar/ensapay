package com.cmi.create_payment_account_micoservice.services.Account;


import com.cmi.create_payment_account_micoservice.entities.Account;
import com.cmi.create_payment_account_micoservice.entities.Client;
import com.cmi.create_payment_account_micoservice.entities.Information;
import com.cmi.create_payment_account_micoservice.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;



    @Override
    public boolean validateAccountCreation(Information information) {
        /**
         *  check the informations
         */

        if(true) {
            System.out.println("account checked and validated");

            return true;
        }
        return false;
    }

    @Override
    public Account createAccount(Information information) {
       Account account = new Account();
        Client client = new Client();

       account.setAccount_number(123456789);
        account.setAmount(0);
        account.setClient(client);


        System.out.println("account created from service accountServiceImpl");
        return account;
    }
}
