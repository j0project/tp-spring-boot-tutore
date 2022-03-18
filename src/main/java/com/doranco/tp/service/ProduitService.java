package com.doranco.tp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.tp.model.Produit;
import com.doranco.tp.repository.ProduitRepository;

@Service
public class ProduitService {
	@Autowired
	ProduitRepository produitRepository;

	public Produit createProduit(Produit p)
	{
		return 	produitRepository.save(p);
	}
	
	public List<Produit> read()
	{
		return produitRepository.findAll();	
	}
	
	public Optional<Produit> searchById(Long id)
	{
		return produitRepository.findById(id);
	}
	
	public void delete(Long id)
	{
		produitRepository.deleteById(id);	
	}
}
