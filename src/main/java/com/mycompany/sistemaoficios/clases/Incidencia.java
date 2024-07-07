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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keloc
 */
@Entity
@Table(name="incidencia")
public class Incidencia extends TableSetters{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="incidencia")
    private String incidencia;
    
    @ManyToOne
    @JoinColumn(name = "expediente", nullable = true)
    private Expediente exp;
    
    @ManyToOne
    @JoinColumn(name = "documento", nullable = true)
    private Documento doc;
    
    @Column(name="")
    private LocalDate elab;
    private String observaciones;
    private String suplencia;
    private String correccion;
    
    public Incidencia(){}
    public Incidencia(String inc, Expediente exp, Documento doc){
        this.incidencia = inc;
        this.exp = exp;
        this.doc = doc;
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

    public Expediente getExp() {
        return exp;
    }

    public void setExp(Expediente exp) {
        this.exp = exp;
    }

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getSuplencia() {
        return suplencia;
    }

    public void setSuplencia(String suplencia) {
        this.suplencia = suplencia;
    }

    public String getCorreccion() {
        return correccion;
    }

    public void setCorreccion(String correccion) {
        this.correccion = correccion;
    }
    
    public Object[] toRow(){
        Object[] row = {exp.getnControl(), exp.getExpJud(), exp.getDefendido(), doc.getClave(), incidencia, exp.getRecepcion(), elab, observaciones, suplencia, correccion};
        return row;
    }
    
    public DefaultTableModel getModel(){
        String[] tblh = {"Expediente", "AP Proc.", "Defendido", "Decumento", "Incidencia", "F. Recep.", "F. Elab.", "Observaciones", "Suplencia", "Corrección"};
        return new DefaultTableModel(tblh,0);
    }
    
}
