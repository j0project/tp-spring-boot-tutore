package com.doranco.tp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(unique = true, nullable = false)
	private String role_name;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE		
	}
			)
	private Set<UserRole> userRole;

	public Role(String role_name, Set<UserRole> userRole) {
		super();
		this.role_name = role_name;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "Role [role_name=" + role_name + ", userRole=" + userRole + "]";
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}
	
	
}
