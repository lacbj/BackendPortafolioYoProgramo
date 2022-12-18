/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


/**
 *
 * @author Casa
 */
@Data
@Entity
@Table(name="personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    public  Long     id;
    public  String  nombre;
    public  String  apellido;
    
    public Persona(){
    
    }
    
    public Persona(Long id, String nombre, String apellido){
    this.id = id ;
    this.nombre = nombre;
    this.apellido = apellido;
    
    }
         
    
}
