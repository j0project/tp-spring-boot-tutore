package com.doranco.tp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.tp.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;

}
