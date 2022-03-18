package com.doranco.tp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.tp.model.Categorie;
import com.doranco.tp.repository.CategorieRepository;

@Service
public class CategorieService {
	@Autowired
	CategorieRepository categorieRepository;

	public Categorie createCategorie(Categorie c)
	{
		return 	categorieRepository.save(c);
	}
	
	public List<Categorie> read()
	{
		return categorieRepository.findAll();	
	}
	
	public Optional<Categorie> searchById(Long id)
	{
		return categorieRepository.findById(id);
	}
	
	public void delete(Long id)
	{
		categorieRepository.deleteById(id);	
	}
}
