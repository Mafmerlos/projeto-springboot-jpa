package com.aprendendoSpring.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.project.entities.Product;
import com.aprendendoSpring.project.repositories.ProductRepository;
@Component

@Service
public class ProductService {
	
		@Autowired
		private ProductRepository repository;
		
		public List<Product> findAll(){
			return repository.findAll();
		}
		
		public Product findById(Long id) {
			Optional<Product> obj = repository.findById(id);
			return obj.get();		}
}