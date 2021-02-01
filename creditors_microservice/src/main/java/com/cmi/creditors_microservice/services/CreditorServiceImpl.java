package com.cmi.creditors_microservice.services;

import com.cmi.creditors_microservice.entities.Creditor;
import com.cmi.creditors_microservice.repositories.CreditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CreditorServiceImpl implements CreditorsService {

    @Autowired
    CreditorRepository creditorRepository;


    @Override
    public List<Creditor> getCreditors() {

        return creditorRepository.findAll();



    }
}
