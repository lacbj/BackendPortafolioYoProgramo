/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.service;

import com.apiportafolio.yoprogramo.model.User;
import com.apiportafolio.yoprogramo.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin


public class UserService {
	
    @Autowired
	
	UserRepository userRepository;
	
	
	@GetMapping( path = "/buscar")
	public List<User> getAllRol(){
		return userRepository.findAll();
	}	
	
	@PostMapping(path = "/guardar")
	public User saveUser(@RequestBody User user) {
		
		return userRepository.save(user);
	}
	
	@DeleteMapping(path = "/eliminar/{correo}")
	public void deletUser(@PathVariable ("correo") String correo){

		
		Optional<User> user;
		
		user = userRepository.findById(correo);
		
		if(user.isPresent()) {
			userRepository.delete(user.get());
		}
		
	}
	
	
		
		
		@PostMapping(path = "/login")	
		public User login(@RequestBody User user){
			
			
			
			List<User> users = userRepository.findByCorreoAndPassword(user.getCorreo(), user.getPassword());
			if(!users.isEmpty()) {
				return users.get(0);
			}
			
			return null;
		} 
		
		
		
		
		
		
		
		
	}
