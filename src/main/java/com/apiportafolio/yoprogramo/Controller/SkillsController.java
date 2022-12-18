/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.Controller;

import com.apiportafolio.yoprogramo.model.Skills;
import com.apiportafolio.yoprogramo.service.SkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Casa
 */
@RestController
@RequestMapping("/skills")
public class SkillsController {
    
      private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    
    
     @GetMapping("/all")
   
 
   
   public ResponseEntity<List<Skills>> obtenerSkills(){
       
        List<Skills> skills = skillsService.buscarSkills();
        
   return new ResponseEntity<>(skills, HttpStatus.OK);
   
   
   }
      
   
   @PutMapping("/update")
   
   public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
   
   Skills updateSkills = skillsService.editarSkills(skills);
   
      return new ResponseEntity<>( updateSkills, HttpStatus.OK);     
   }
   
   
   @PostMapping("/id")
   public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
   
   Skills nuevaSkills = skillsService.addSkills(skills);
   
  return new ResponseEntity<>( nuevaSkills, HttpStatus.CREATED);
   
}
   
   @DeleteMapping("delete/{id}")
   
   public ResponseEntity<?> borrarSkills(@PathVariable("id")Long id){
   
   skillsService.borrarSkills(id);
   
  return new ResponseEntity<>( HttpStatus.OK);
   
}
  
    
    
    
    
}
