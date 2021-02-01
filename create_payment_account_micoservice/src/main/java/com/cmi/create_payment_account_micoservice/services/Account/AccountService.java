package com.cmi.create_payment_account_micoservice.services.Account;

import com.cmi.create_payment_account_micoservice.entities.Account;
import com.cmi.create_payment_account_micoservice.entities.Information;

public interface AccountService {

    public abstract String validateAccountCreation(Information information) ;
    public abstract Account createAccount(Information information) ;
    public abstract String generateAccountNumber(String s);


}
