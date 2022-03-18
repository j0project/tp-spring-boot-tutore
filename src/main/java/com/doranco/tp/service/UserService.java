package com.doranco.tp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.tp.model.User;
import com.doranco.tp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User createUser(User u)
	{
		return 	userRepository.save(u);
	}
	
	public List<User> read()
	{
		return userRepository.findAll();	
	}
	
	public Optional<User> searchById(String username)
	{
		return userRepository.(username);
	}
	
	public void delete(String username)
	{
		userRepository.deleteById(username);	
	}
}
