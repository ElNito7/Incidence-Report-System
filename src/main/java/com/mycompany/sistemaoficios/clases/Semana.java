/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

import java.time.LocalDate;
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
@Table(name="semana")
public class Semana extends TableSetters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="semana")
    private String semana;

    public Semana(){}
    public Semana(String semana) {
        this.semana = semana;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }
    
    public Object[] toRow(){
        Object[] row = {id, semana};
        return row;
    }
    public DefaultTableModel getModel(){
        String[] tblh = {"Número", "Semana"};
        return new DefaultTableModel(tblh,0);
    }
    
}
