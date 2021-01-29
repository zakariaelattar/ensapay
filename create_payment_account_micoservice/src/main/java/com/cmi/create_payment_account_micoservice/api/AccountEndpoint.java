package com.cmi.create_payment_account_micoservice.api;


import com.cmi.create_payment_account_micoservice.entities.Account;
import com.cmi.create_payment_account_micoservice.entities.Information;
import com.cmi.create_payment_account_micoservice.repositories.AccountRepository;
import com.cmi.create_payment_account_micoservice.services.Account.AccountService;
import com.cmi.xml.account.Client;
import com.cmi.xml.account.CreateAccountValidationRequest;
import com.cmi.xml.account.CreateAccountValidationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.PayloadEndpoint;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.websocket.MessageHandler;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;


/***
 *  This endpoint return boolean and create new account in cmi database
 *
 */
@Endpoint
public class AccountEndpoint implements MessageHandler {
    private static final String NAMESPACE_URI = "http://www.cmi.com/xml/account";

    @Autowired
    private AccountService accountService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createAccountValidationRequest")
    @ResponsePayload
    public CreateAccountValidationResponse validatePaymentAccount(@RequestPayload CreateAccountValidationRequest createAccountValidationRequest) {
       CreateAccountValidationResponse createAccountValidationResponse = new CreateAccountValidationResponse();

       System.out.println("web service intercepted request");
       Information information = new Information();
        information.setCin(createAccountValidationRequest.getClient().getCin());
        information.setBank_id(createAccountValidationRequest.getBankId());

       boolean validation = accountService.validateAccountCreation(information);
        System.out.println("web service validation:"+validation);

       if(validation){
           accountService.createAccount(information);

           createAccountValidationResponse.setResponse(validation);

       }


        return createAccountValidationResponse;
    }




}
