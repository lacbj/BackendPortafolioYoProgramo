/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.service;

import com.apiportafolio.yoprogramo.model.Skills;
import com.apiportafolio.yoprogramo.repository.SkillsRepo;
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
public class SkillsService {
    
      private final SkillsRepo skillsRepo; 
      
      
      @Autowired

    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    
     public Skills addSkills(Skills skills){
    return skillsRepo.save(skills);
    
    
    }
  
    
    public List<Skills> buscarSkills(){
    
    return skillsRepo.findAll();
    }
    
    
     public Skills editarSkills(Skills skills){
    return skillsRepo.save(skills);
    
    
    }
     
     public void borrarSkills(Long id){
     skillsRepo.deleteById(id);
     }
     
      public Skills buscarSkillsPorId(Long id){
     
         return skillsRepo.findById(id).orElse(null);
         
     }
    
    
   
    
    
    
}
