package com.aprendendoSpring.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.project.entities.User;
import com.aprendendoSpring.project.repositories.UserRepository;
@Component

@Service
public class UserService {
	
		@Autowired
		private UserRepository repository;
		
		public List<User> findAll(){
			return repository.findAll();
		}
		
		public User findById(Long id) {
			Optional<User> obj = repository.findById(id);
			return obj.get();		}
}