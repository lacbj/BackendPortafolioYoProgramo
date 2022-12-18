/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.service;


import com.apiportafolio.yoprogramo.model.Educacion;
import com.apiportafolio.yoprogramo.repository.EducacionRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Casa
 */

@Service
@Transactional
public class EducacionService   {

    
     private final EducacionRepo educacionRepo; 
    
    
    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion addEducacion(Educacion educacion){
    return educacionRepo.save(educacion);
    
    
    }
  
    
    public List<Educacion> buscarEducaciones(){
    
    return educacionRepo.findAll();
    }
    
    
     public Educacion editarEducacion(Educacion educacion){
    return educacionRepo.save(educacion);
    
    
    }
     
     public void borrarEducacion(Long id){
     educacionRepo.deleteById(id);
     }
     
      public Educacion buscarEducacionPorId(Long id){
     
         return educacionRepo.findById(id).orElse(null);
         
     }
    
}
