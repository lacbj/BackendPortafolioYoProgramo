/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.service;

import com.apiportafolio.yoprogramo.model.Proyecto;
import com.apiportafolio.yoprogramo.repository.ProyectoRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProyectoService {
    private final ProyectoRepo proyectoRepo; 

   
    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }
    
    
    
    public Proyecto addProyecto(Proyecto proyecto){
    return proyectoRepo.save(proyecto);
    
    
    }
  
    
    public List<Proyecto> buscarProyectos(){
    
    return proyectoRepo.findAll();
    }
    
    
     public Proyecto editarProyecto(Proyecto proyecto){
    return proyectoRepo.save(proyecto);
    
    
    }
     
     public void borrarProyecto(Long id){
     proyectoRepo.deleteById(id);
     }
     
      public Proyecto buscarProyectoPorId(Long id){
     
         return proyectoRepo.findById(id).orElse(null);
         
     }
    
   
    
}
