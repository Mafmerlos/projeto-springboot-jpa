package com.aprendendoSpring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}