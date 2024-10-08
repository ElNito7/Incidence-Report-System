/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keloc
 */
@Entity
@Table(name="documento")
public class Documento extends TableSetters{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="clave")
    private String clave;
    
    @Column(name="tipo")
    private String doc;
    
    public Documento(){}
    public Documento(String clave, String doc){
        this.clave = clave;
        this.doc = doc;
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

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
    
    public Object[] toRow(){
        Object[] row = {clave, doc};
        return row;
    }
    public DefaultTableModel getModel(){
        String[] tblh = {"Clave", "Documento"};
        return new DefaultTableModel(tblh,0);
    }
    
}
