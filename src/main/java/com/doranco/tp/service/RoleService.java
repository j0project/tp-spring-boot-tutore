package com.doranco.tp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.tp.model.Role;
import com.doranco.tp.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;
	
	public Role createRole(Role r)
	{
		return 	roleRepository.save(r);
	}
	
	public List<Role> read()
	{
		return roleRepository.findAll();	
	}
	/*
	public Optional<Role> searchById(int id)
	{
		return roleRepository.findById(id);
	}
	
	public void delete(int id)
	{
		roleRepository.deleteById(id);	
	}
	*/
}
