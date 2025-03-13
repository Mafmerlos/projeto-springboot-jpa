package com.aprendendoSpring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}