package com.doranco.tp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class UserRole implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToMany()
	private Set<User> user;
	
	@ManyToMany()
	private Set<Role> role;

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRole [user=" + user + ", role=" + role + "]";
	}

	public UserRole(Set<User> user, Set<Role> role) {
		super();
		this.user = user;
		this.role = role;
	}

	
}