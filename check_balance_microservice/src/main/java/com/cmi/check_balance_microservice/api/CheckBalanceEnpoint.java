package com.cmi.check_balance_microservice.api;


import com.cmi.check_balance_microservice.services.BalanceService;
import com.cmi.xml.balance.CheckBalanceRequest;
import com.cmi.xml.balance.CheckBalanceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.websocket.MessageHandler;


/***
 *  This endpoint return boolean and create new account in cmi database
 *
 */
@Endpoint
public class CheckBalanceEnpoint implements MessageHandler {
    private static final String NAMESPACE_URI = "http://www.cmi.com/xml/balance";

    @Autowired
    private BalanceService balanceService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "checkBalanceRequest")
    @ResponsePayload
    public CheckBalanceResponse getBalance(@RequestPayload CheckBalanceRequest checkBalanceRequest) {
        CheckBalanceResponse checkBalanceResponse = new CheckBalanceResponse();

        System.out.println("web service intercepted request");

        checkBalanceResponse.setAmount(balanceService.getBlance(checkBalanceRequest.getAccountNumber()));

        return checkBalanceResponse;
    }




}
