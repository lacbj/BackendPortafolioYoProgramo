/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apiportafolio.yoprogramo.repository;

import com.apiportafolio.yoprogramo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Casa
 */
@Repository
public interface PersonaRepository extends JpaRepository < Persona, Long > {

 
    
}
