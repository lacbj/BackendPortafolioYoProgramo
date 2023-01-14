/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.Controller;

import com.apiportafolio.yoprogramo.model.Usuario;
import com.apiportafolio.yoprogramo.service.UsuarioService;
import java.util.List;
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
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
    
     private final UsuarioService usuarioService;
    

    public UsuarioController(com.apiportafolio.yoprogramo.service.UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    
   @GetMapping("/id/{id}")
   
   public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id")Long id){
           Usuario usuario = usuarioService.buscarUsuarioPorId(id);
   return new ResponseEntity<>(usuario, HttpStatus.OK);
   
   
   }
      
   
   @PutMapping("/update")
   
   public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
   
   Usuario updateUsuario=usuarioService.editarUsuario(usuario);
   
      return new ResponseEntity<>( updateUsuario, HttpStatus.OK);     
   }
   
   
   
    @PostMapping("/id")
   public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
   
   Usuario nuevoUsuario = usuarioService.addUser(usuario);
   
  return new ResponseEntity<>( nuevoUsuario, HttpStatus.CREATED);
   
}
   
   @DeleteMapping("delete/{id}")
   
   public ResponseEntity<?> borrarUsuario(@PathVariable("id")Long id){
   
   usuarioService.borrarUsuario(id);
   
  return new ResponseEntity<>( HttpStatus.OK);
   
}
   
}
