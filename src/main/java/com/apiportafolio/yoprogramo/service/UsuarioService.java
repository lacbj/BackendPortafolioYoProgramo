/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.service;


import com.apiportafolio.yoprogramo.model.Usuario;
import com.apiportafolio.yoprogramo.repository.UsuarioRepo;
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
public class UsuarioService {
    
      
     private final UsuarioRepo usuarioRepo; 
    
     @Autowired
    public UsuarioService(com.apiportafolio.yoprogramo.repository.UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
  
     
     
     

    
    
     public Usuario addUser(Usuario usuario){
    return usuarioRepo.save(usuario);
    
    
    }
  
    
    public List<Usuario> buscarUsuario(){
    
    return usuarioRepo.findAll();
    }
    
    
     public Usuario editarUsuario(Usuario usuario){
    return usuarioRepo.save(usuario);
    
    
    }
     
     public void borrarUsuario(Long id){
     usuarioRepo.deleteById(id);
     }
     
     
     
     public Usuario buscarUsuarioPorId(Long id){
     
         return usuarioRepo.findById(id).orElse(null);
         
     }
}




