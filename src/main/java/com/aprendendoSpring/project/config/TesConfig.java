package com.aprendendoSpring.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aprendendoSpring.project.entities.User;
import com.aprendendoSpring.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Matheus Merlos", "matheus@gmail.com", "9999999978", "123456");
		User u2 = new User(null, "Alex Telles", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
}
