package com.aprendendoSpring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.project.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}