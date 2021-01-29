package com.cmi.form_microservice.services;

import com.cmi.form_microservice.entities.Field;
import com.cmi.form_microservice.entities.Form;

import java.util.List;

public interface GetFormService {

    public abstract List<Field> getFields(long creditor_id, long categorie_id);
}
