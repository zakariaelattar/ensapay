package com.cmi.creditors_microservice.api;


import com.cmi.creditors_microservice.services.CreditorsService;
import com.cmi.xml.creditors.Creditor;
import com.cmi.xml.creditors.GetCreditorsRequest;
import com.cmi.xml.creditors.GetCreditorsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class CreditorListEndpoint {
    private static final String NAMESPACE_URI = "http://www.cmi.com/xml/creditors";

    @Autowired
    private CreditorsService creditorsService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCreditorsRequest")
    @ResponsePayload
    public GetCreditorsResponse getBalance(@RequestPayload GetCreditorsRequest getCreditorsRequest) {
        GetCreditorsResponse getCreditorsResponse = new GetCreditorsResponse();

        System.out.println("web service intercepted request");

      getCreditorsResponse.setCreditors(new ArrayList<Creditor>());

        return getCreditorsResponse;
    }
}
