/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

/**
 *
 * @author Keloc
 */
public class Adscripcion {
    private long id;
    private String clave;
    private String adscripcion;
    private Servidor defensor;
    private Servidor oficial;
    
    public Adscripcion(){}
    public Adscripcion(String clave, String adscripcion, Servidor defensor, Servidor oficial){
        this.clave = clave;
        this.adscripcion = adscripcion;
        this.defensor = defensor;
        this.oficial = oficial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getAdscripcion() {
        return adscripcion;
    }

    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    public Servidor getDefensor() {
        return defensor;
    }

    public void setDefensor(Servidor defensor) {
        this.defensor = defensor;
    }

    public Servidor getOficial() {
        return oficial;
    }

    public void setOficial(Servidor oficial) {
        this.oficial = oficial;
    }
    
}
