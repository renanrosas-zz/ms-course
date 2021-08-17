package com.renanrosas.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renanrosas.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
