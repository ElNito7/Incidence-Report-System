/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keloc
 */
@Entity
@Table(name="adscripcion")
public class Adscripcion extends TableSetters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="clave")
    private String clave;
    
    @Column(name="adscripcion")
    private String adscripcion;
    
    @ManyToOne
    @JoinColumn(name = "defensor", nullable = true)
    private Trabajador defensor;
    
    @ManyToOne
    @JoinColumn(name = "oficial", nullable = true)
    private Trabajador oficial;
    
    @ManyToOne
    @JoinColumn(name = "revisor", nullable = true)
    private Trabajador revisor;
    
    @ManyToOne
    @JoinColumn(name = "revSup", nullable = true)
    private Trabajador revSup;
    
    public Adscripcion(){}
    public Adscripcion(String clave, String adscripcion, Trabajador defensor, Trabajador oficial, Trabajador revisor){
        this.clave = clave;
        this.adscripcion = adscripcion;
        this.defensor = defensor;
        this.oficial = oficial;
        this.revisor = revisor;
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

    public Trabajador getDefensor() {
        return defensor;
    }

    public void setDefensor(Trabajador defensor) {
        this.defensor = defensor;
    }

    public Trabajador getOficial() {
        return oficial;
    }

    public void setOficial(Trabajador oficial) {
        this.oficial = oficial;
    }

    public Trabajador getRevisor() {
        return revisor;
    }

    public void setRevisor(Trabajador revisor) {
        this.revisor = revisor;
    }

    public Trabajador getRevSup() {
        return revSup;
    }

    public void setRevSup(Trabajador revSup) {
        this.revSup = revSup;
    }
    
    public Object[] toRow(){
        String revNom = revisor.getNom();
        if (revSup != null){
            revNom = revSup.getNom();
        }
        Object[] row = {clave, adscripcion, defensor.getNom(), oficial.getNom(), revNom};
        return row;
    }
    
    public DefaultTableModel getModel(){
        String[] tblh = {"Clave", "Adscripción", "Defensor", "Oficial", "Oficial Revisor"};
        return new DefaultTableModel(tblh,0);
    }
   
}
