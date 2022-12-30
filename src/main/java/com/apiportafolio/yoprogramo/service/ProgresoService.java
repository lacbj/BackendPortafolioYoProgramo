/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.service;

import com.apiportafolio.yoprogramo.model.Progreso;
import com.apiportafolio.yoprogramo.repository.ProgresoRepo;
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
public class ProgresoService {
    
      private final ProgresoRepo progresoRepo; 

   
    @Autowired
    public ProgresoService(ProgresoRepo progresoRepo) {
        this.progresoRepo = progresoRepo;
    }
    
    
    
    public Progreso addProgreso(Progreso progreso){
    return progresoRepo.save(progreso);
    
    
    }
  
    
    public List<Progreso> buscarProgresos(){
    
    return progresoRepo.findAll();
    }
    
    
     public Progreso editarProgreso(Progreso progreso){
    return progresoRepo.save(progreso);
    
    
    }
     
     public void borrarProgreso(Long id){
     progresoRepo.deleteById(id);
     }
     
      public Progreso buscarProgresoPorId(Long id){
     
         return progresoRepo.findById(id).orElse(null);
         
     }
    
   
    
    
  
    
    
}

