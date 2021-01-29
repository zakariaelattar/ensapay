package com.cmi.form_microservice.repositories;


import com.cmi.form_microservice.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
  public abstract Categorie findFirstById(long id);
}
