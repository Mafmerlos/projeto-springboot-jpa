package com.aprendendoSpring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.project.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}