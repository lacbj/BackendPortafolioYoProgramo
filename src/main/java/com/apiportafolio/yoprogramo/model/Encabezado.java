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
public class Encabezado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idEnc;
    private String fotoPerfilEnc;
    private String img1Enc;
    private String img2Enc;
    private String img3Enc;

    public Encabezado() {
    }

    public Encabezado(Long idEnc, String fotoPerfilEnc, String img1Enc, String img2Enc, String img3Enc) {
        this.idEnc = idEnc;
        this.fotoPerfilEnc = fotoPerfilEnc;
        this.img1Enc = img1Enc;
        this.img2Enc = img2Enc;
        this.img3Enc = img3Enc;
    }

    public Long getIdEnc() {
        return idEnc;
    }

    public void setIdEnc(Long idEnc) {
        this.idEnc = idEnc;
    }

    public String getFotoPerfilEnc() {
        return fotoPerfilEnc;
    }

    public void setFotoPerfilEnc(String fotoPerfilEnc) {
        this.fotoPerfilEnc = fotoPerfilEnc;
    }

    public String getImg1Enc() {
        return img1Enc;
    }

    public void setImg1Enc(String img1Enc) {
        this.img1Enc = img1Enc;
    }

    public String getImg2Enc() {
        return img2Enc;
    }

    public void setImg2Enc(String img2Enc) {
        this.img2Enc = img2Enc;
    }

    public String getImg3Enc() {
        return img3Enc;
    }

    public void setImg3Enc(String img3Enc) {
        this.img3Enc = img3Enc;
    }

    @Override
    public String toString() {
        return "Encabezado{" + "idEnc=" + idEnc + ", fotoPerfilEnc=" + fotoPerfilEnc + ", img1Enc=" + img1Enc + ", img2Enc=" + img2Enc + ", img3Enc=" + img3Enc + '}';
    }
    
    
}
