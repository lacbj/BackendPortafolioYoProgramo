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
public class Progreso {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idPro;
    private String tituloPro;
    private int porcentajePro;
   

    public Progreso() {
    }

    public Progreso(Long idPro, String tituloPro, int porcentajePro) {
        this.idPro = idPro;
        this.tituloPro = tituloPro;
        this.porcentajePro = porcentajePro;
    }

    public Long getIdPro() {
        return idPro;
    }

    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }

    public String getTituloPro() {
        return tituloPro;
    }

    public void setTituloPro(String tituloPro) {
        this.tituloPro = tituloPro;
    }

    public int getPorcentajePro() {
        return porcentajePro;
    }

    public void setPorcentajePro(int porcentajePro) {
        this.porcentajePro = porcentajePro;
    }

    @Override
    public String toString() {
        return "Progreso{" + "idPro=" + idPro + ", tituloPro=" + tituloPro + ", porcentajePro=" + porcentajePro + '}';
    }

   

    
    
    
}
