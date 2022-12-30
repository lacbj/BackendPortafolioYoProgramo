/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apiportafolio.yoprogramo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idProyect;
    private String tituloProyect;
    private int fechaProyect;
    private String descProyect;
    private String imagenProyect;
    private String urlProyect;

    public Proyecto() {
        
    }

    public Proyecto(Long idProyect, String tituloProyect, int fechaProyect, String descProyect, String imagenProyect, String urlProyect) {
        this.idProyect = idProyect;
        this.tituloProyect = tituloProyect;
        this.fechaProyect = fechaProyect;
        this.descProyect = descProyect;
        this.imagenProyect = imagenProyect;
        this.urlProyect = urlProyect;
    }

    public Long getIdProyect() {
        return idProyect;
    }

    public void setIdProyect(Long idProyect) {
        this.idProyect = idProyect;
    }

    public String getTituloProyect() {
        return tituloProyect;
    }

    public void setTituloProyect(String tituloProyect) {
        this.tituloProyect = tituloProyect;
    }

    public int getFechaProyect() {
        return fechaProyect;
    }

    public void setFechaProyect(int fechaProyect) {
        this.fechaProyect = fechaProyect;
    }

    public String getDescProyect() {
        return descProyect;
    }

    public void setDescProyect(String descProyect) {
        this.descProyect = descProyect;
    }

    public String getImagenProyect() {
        return imagenProyect;
    }

    public void setImagenProyect(String imagenProyect) {
        this.imagenProyect = imagenProyect;
    }

    public String getUrlProyect() {
        return urlProyect;
    }

    public void setUrlProyect(String urlProyect) {
        this.urlProyect = urlProyect;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idProyect=" + idProyect + ", tituloProyect=" + tituloProyect + ", fechaProyect=" + fechaProyect + ", descProyect=" + descProyect + ", imagenProyect=" + imagenProyect + ", urlProyect=" + urlProyect + '}';
    }
    
    
}
