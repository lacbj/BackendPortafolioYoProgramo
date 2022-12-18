/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.service;


import com.apiportafolio.yoprogramo.model.Experiencia;
import com.apiportafolio.yoprogramo.repository.ExperienciaRepo;
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
public class ExperienciaService {
    
      private final ExperienciaRepo experienciaRepo; 

   
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
    
    
    
    public Experiencia addExperiencia(Experiencia experiencia){
    return experienciaRepo.save(experiencia);
    
    
    }
  
    
    public List<Experiencia> buscarExperiencias(){
    
    return experienciaRepo.findAll();
    }
    
    
     public Experiencia editarExperiencia(Experiencia experiencia){
    return experienciaRepo.save(experiencia);
    
    
    }
     
     public void borrarExperiencia(Long id){
     experienciaRepo.deleteById(id);
     }
     
      public Experiencia buscarExperienciaPorId(Long id){
     
         return experienciaRepo.findById(id).orElse(null);
         
     }
    
   
    
    
  
    
    
}
