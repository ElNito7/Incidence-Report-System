/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
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
@Table(name="tipo_incidencia")
public class TipoIncidencia extends TableSetters{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="incidencia")
    private String incidencia;

    public TipoIncidencia(){}
    public TipoIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }
    
    public Object[] toRow(){
        Object[] row = {id, incidencia};
        return row;
    }
    
    public DefaultTableModel getModel(){
        String[] tblh = {"Número", "Incidencia"};
        return new DefaultTableModel(tblh,0);
    }
    
}
