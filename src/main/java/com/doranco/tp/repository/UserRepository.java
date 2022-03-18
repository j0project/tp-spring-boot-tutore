package com.doranco.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.doranco.tp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
