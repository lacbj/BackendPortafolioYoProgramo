/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.service;

import com.apiportafolio.yoprogramo.model.Encabezado;
import com.apiportafolio.yoprogramo.repository.EncabezadoRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class EncabezadoService {
    
        
     private final EncabezadoRepo encabezadoRepo; 
    
     @Autowired
    public EncabezadoService(com.apiportafolio.yoprogramo.repository.EncabezadoRepo encabezadoRepo) {
        this.encabezadoRepo = encabezadoRepo;
    }
  
     
     
     

    
    
     public Encabezado addEncabezado(Encabezado encabezado){
    return encabezadoRepo.save(encabezado);
    
    
    }
  
    
    public List<Encabezado> buscarEncabezado(){
    
    return encabezadoRepo.findAll();
    }
    
    
     public Encabezado editarEncabezado(Encabezado encabezado){
    return encabezadoRepo.save(encabezado);
    
    
    }
     
     public void borrarEncabezado(Long id){
     encabezadoRepo.deleteById(id);
     }
     
     
     
     public Encabezado buscarEncabezadoPorId(Long id){
     
         return encabezadoRepo.findById(id).orElse(null);
         
     }
    
    
  
    
    
    
}
