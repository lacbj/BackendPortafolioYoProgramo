
package com.apiportafolio.yoprogramo.Controller;

import com.apiportafolio.yoprogramo.model.Persona;
import com.apiportafolio.yoprogramo.service.IPersonaService;

import com.apiportafolio.yoprogramo.service.PersonaService;
import java.util.ArrayList;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Casa
 */

@RestController
public class Controller {
    
  
    @Autowired
    private IPersonaService persoServ;
    
    
  

   @PostMapping ("/new/Persona")
   public void agregarPersona(@RequestBody Persona pers){
    persoServ.crearPersona(pers);
   }
   
   @GetMapping("/ver/personas")
   
   @ResponseBody
   public List<Persona> verPersonas(){
   return persoServ.verPersonas();
   }
   
   
   
   
   
   @DeleteMapping ("/delete/{id}")
   
   public void borrarPersona(@PathVariable Long id){
       persoServ.borrarPersona(id);
   }
           
    
           
   
    
}
