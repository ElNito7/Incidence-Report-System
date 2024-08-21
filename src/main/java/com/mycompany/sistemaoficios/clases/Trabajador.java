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
import javax.persistence.Table;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keloc
 */
@Entity
@Table(name="trabajador")
public class Trabajador extends TableSetters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="nombre")
    private String nom;
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="puesto")
    private String puesto;
    
    public Trabajador(){}
    public Trabajador(String nom, String correo, String puesto){
        this.nom = nom;
        this.correo = correo;
        this.puesto = puesto;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public Object[] toRow(){
        Object[] row = {nom, correo, puesto};
        return row;
    }
    
    public DefaultTableModel getModel(){
        String[] tblh = {"Trabajador", "Correo", "Puesto"};
        return new DefaultTableModel(tblh,0);
    }
}
