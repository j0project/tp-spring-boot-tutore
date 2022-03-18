package com.doranco.tp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "app_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique = true, nullable = false)
	private String username;
	private int active;
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE		
	}
			)
	private Set<UserRole> userRole;

	public User(String username, int active, String password, Set<UserRole> userRole) {
		super();
		this.username = username;
		this.active = active;
		this.password = password;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", active=" + active + ", password=" + password + ", userRole=" + userRole
				+ "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}
	
	

}
