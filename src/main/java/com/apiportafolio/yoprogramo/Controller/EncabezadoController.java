/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.Controller;

import com.apiportafolio.yoprogramo.model.Encabezado;
import com.apiportafolio.yoprogramo.service.EncabezadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/encabezado")
@CrossOrigin(origins = "http://localhost:4200")
public class EncabezadoController {
     private final EncabezadoService encabezadoService;
    

    public EncabezadoController(com.apiportafolio.yoprogramo.service.EncabezadoService encabezadoService) {
        this.encabezadoService = encabezadoService;
    }
    
    
   @GetMapping("/id/{id}")
   
   public ResponseEntity<Encabezado> obtenerEncabezado(@PathVariable("id")Long id){
           Encabezado encabezado = encabezadoService.buscarEncabezadoPorId(id);
   return new ResponseEntity<>(encabezado, HttpStatus.OK);
   
   
   }
      
   
   @PutMapping("/update")
   
   public ResponseEntity<Encabezado> editarEncabezado(@RequestBody Encabezado encabezado){
   
   Encabezado updateEncabezado=encabezadoService.editarEncabezado(encabezado);
   
      return new ResponseEntity<>( updateEncabezado, HttpStatus.OK);     
   }
   
   
   
    @PostMapping("/id")
   public ResponseEntity<Encabezado> crearEncabezado(@RequestBody Encabezado encabezado){
   
   Encabezado nuevoEncabezado = encabezadoService.addEncabezado(encabezado);
   
  return new ResponseEntity<>( nuevoEncabezado, HttpStatus.CREATED);
   
}
   
   @DeleteMapping("delete/{id}")
   
   public ResponseEntity<?> borrarEncabezado(@PathVariable("id")Long id){
   
   encabezadoService.borrarEncabezado(id);
   
  return new ResponseEntity<>( HttpStatus.OK);
   
}
}
