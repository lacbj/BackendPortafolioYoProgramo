/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Casa
 */

@Entity

public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
     private Long idSkill;
    private String nombreSkill;
    private int fotoSkill;
    private String porcentaje;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, int fotoSkill, String porcentaje) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.fotoSkill = fotoSkill;
        this.porcentaje = porcentaje;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getFotoSkill() {
        return fotoSkill;
    }

    public void setFotoSkill(int fotoSkill) {
        this.fotoSkill = fotoSkill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
}
