package com.cmi.creditors_microservice.services;

import com.cmi.creditors_microservice.entities.Creditor;

import java.util.List;

public interface CreditorsService {

    public abstract List<Creditor> getCreditors();

}
