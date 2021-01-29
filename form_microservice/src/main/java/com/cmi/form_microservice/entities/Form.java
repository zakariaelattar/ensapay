package com.cmi.form_microservice.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class Form {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Creditor creditor;
    @OneToMany
    private List<Field> fields;
    @ManyToOne
    private Categorie categorie;


}
