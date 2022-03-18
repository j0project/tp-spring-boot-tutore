package com.doranco.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.doranco.tp.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
