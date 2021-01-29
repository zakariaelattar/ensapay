package com.cmi.check_balance_microservice.services;

public interface BalanceService {
    public abstract double getBlance(long account_number);
}
