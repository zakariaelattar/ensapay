package com.cmi.form_microservice.api;

import com.cmi.form_microservice.entities.Field;
import com.cmi.form_microservice.entities.Form;
import com.cmi.form_microservice.services.GetFormService;
import com.cmi.xml.forms.GetFormRequest;
import com.cmi.xml.forms.GetFormResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class GetFormEnpoint {
    private static final String NAMESPACE_URI = "http://www.cmi.com/xml/forms";

    @Autowired
    private GetFormService getFormService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFormRequest")
    @ResponsePayload
    public GetFormResponse getBalance(@RequestPayload GetFormRequest getFormRequest) {
        GetFormResponse getFormResponse= new GetFormResponse();
        ;

        System.out.println("web service intercepted request");

        long creditor_id = getFormRequest.getCreditorId();
        long categorie_id = getFormRequest.getCategorieId();
        try {

        List<Field> fields = getFormService.getFields(creditor_id,categorie_id);
        System.out.println("list is:"+fields);

        List<String> list = new ArrayList<>();
        for (Field f: fields
             ) {
            list.add(f.getValue()) ;

        }
            getFormResponse.setFields(list);

       /* List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("c");
        list.add("c");*/


        return getFormResponse;

        }
        catch (Exception e) {
            getFormResponse= new GetFormResponse();
            return getFormResponse;
        }

    }
}
