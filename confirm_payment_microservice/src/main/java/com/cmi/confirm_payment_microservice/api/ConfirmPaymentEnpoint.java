package com.cmi.confirm_payment_microservice.api;


import com.cmi.confirm_payment_microservice.services.PaymentService;
import com.cmi.xml.payment.PaymentRequest;
import com.cmi.xml.payment.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class ConfirmPaymentEnpoint {
    private static final String NAMESPACE_URI = "http://www.cmi.com/xml/payment";

    @Autowired
    private PaymentService paymentService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "paymentRequest")
    @ResponsePayload
    public PaymentResponse  pay(@RequestPayload PaymentRequest paymentRequest) {
        PaymentResponse paymentResponse = new PaymentResponse();

        try {
        double response = paymentService.checkBalance(paymentRequest.getAccountNumber());
        System.out.println("web service intercepted request");
        paymentResponse.setResponse(response);
        return paymentResponse;

        }

        catch (Exception e) {

            return paymentResponse;
        }

    }
}
