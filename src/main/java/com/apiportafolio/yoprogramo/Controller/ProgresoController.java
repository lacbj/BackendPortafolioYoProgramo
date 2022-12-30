/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.Controller;

import com.apiportafolio.yoprogramo.model.Progreso;
import com.apiportafolio.yoprogramo.service.ProgresoService;
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


@RestController
@RequestMapping("/progreso")
public class ProgresoController {
     private final ProgresoService progresoService;
    

    public ProgresoController(ProgresoService progresoService) {
        this.progresoService = progresoService;
    }

    
   @GetMapping("/all")
   
   public ResponseEntity<List<Progreso>> obtenerProgreso(){
    
        List<Progreso> progresos = progresoService.buscarProgresos();
        
   return new ResponseEntity<>(progresos, HttpStatus.OK);
   
   
   }
      
   
   @PutMapping("/update")
   
   public ResponseEntity<Progreso> editarProgreso(@RequestBody Progreso progreso){
   
   Progreso updateProgreso = progresoService.editarProgreso(progreso);
   
      return new ResponseEntity<>( updateProgreso, HttpStatus.OK);     
   }
   
   
   @PostMapping("/id")
   public ResponseEntity<Progreso> crearProgreso(@RequestBody Progreso progreso){
   
   Progreso nuevoProgreso = progresoService.addProgreso(progreso);
   
  return new ResponseEntity<>( nuevoProgreso, HttpStatus.CREATED);
   
}
   
   @DeleteMapping("delete/{id}")
   
   public ResponseEntity<?> borrarProgreso(@PathVariable("id")Long id){
   
   progresoService.borrarProgreso(id);
   
  return new ResponseEntity<>( HttpStatus.OK);
   
}
   
    
}
