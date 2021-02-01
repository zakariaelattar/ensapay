package com.cmi.check_balance_microservice.services;

public interface BalanceService {
    public abstract double getBlance(String account_number);
}
