package com.aprendendoSpring.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.project.entities.Order;
import com.aprendendoSpring.project.entities.User;
import com.aprendendoSpring.project.repositories.OrderRepository;
import com.aprendendoSpring.project.repositories.UserRepository;

@Component

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}