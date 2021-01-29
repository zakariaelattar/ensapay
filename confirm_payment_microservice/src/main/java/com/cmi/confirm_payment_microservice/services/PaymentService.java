package com.cmi.confirm_payment_microservice.services;

public interface PaymentService {

    public abstract double checkBalance(long account_number);
    public abstract double pay(double amount, long account_number);
}
