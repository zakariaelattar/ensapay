package com.cmi.create_payment_account_micoservice.entities;


import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Entity

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private List<Account> accounts;
}
