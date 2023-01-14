/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.repository;

import com.apiportafolio.yoprogramo.model.User;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("userRepository")
public interface UserRepository  extends JpaRepository<User, Serializable> {

	List<User> findByCorreoAndPassword(String correo, String password);
	
	

}
