/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiportafolio.yoprogramo.repository;

import com.apiportafolio.yoprogramo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Casa
 */
public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
      

    
}
