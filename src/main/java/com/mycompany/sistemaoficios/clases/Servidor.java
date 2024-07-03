/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

/**
 *
 * @author Keloc
 */
public class Servidor {
    private long id;
    private String nom;
    private String correo;
    private String cargo; //Delegado, jefe dpto., defensor, oficial
    
    public Servidor(){}
    public Servidor(String nom, String correo, String cargo){
        this.nom = nom;
        this.correo = correo;
        this.cargo  = cargo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
