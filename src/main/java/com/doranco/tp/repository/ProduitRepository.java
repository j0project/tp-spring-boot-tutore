package com.doranco.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.doranco.tp.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
