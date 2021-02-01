package com.cmi.creditors_microservice.api;


import com.cmi.creditors_microservice.entities.Categorie;
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

        List<Creditor> creditors = new ArrayList<>();
        for (com.cmi.creditors_microservice.entities.Creditor c: creditorsService.getCreditors()
             ) {
            Creditor creditor = new Creditor();
            creditor.setName(c.getName());
            Categorie categorie = c.getCategorie();
            com.cmi.xml.creditors.Categorie xmlCategorie = new com.cmi.xml.creditors.Categorie();
            xmlCategorie.setName(categorie.getName());
            creditor.setCategorie(xmlCategorie);
            creditor.setCode(c.getCode());

            creditors.add(creditor);

        }

      getCreditorsResponse.setCreditors(creditors);

        return getCreditorsResponse;
    }
}
