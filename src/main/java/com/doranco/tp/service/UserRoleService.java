package com.doranco.tp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.tp.model.UserRole;
import com.doranco.tp.repository.UserRoleRepository;

@Service
public class UserRoleService {
	@Autowired
	UserRoleRepository userRoleRepository;
	
	public UserRole createUserRole(UserRole ur)
	{
		return 	userRoleRepository.save(ur);
	}
	
	public List<UserRole> read()
	{
		return userRoleRepository.findAll();	
	}
	
	public Optional<UserRole> searchById(Long id)
	{
		return userRoleRepository.findById(id);
	}
	
	public void delete(Long id)
	{
		userRoleRepository.deleteById(id);	
	}

}
