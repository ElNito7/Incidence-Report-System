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
@Table(name="expediente")
public class Expediente extends TableSetters{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @ManyToOne
    @JoinColumn(name = "adscripcion", nullable = true)
    private Adscripcion adscripcion;
    
    @Column(name="expediente")
    private String nControl;
    
    @Column(name="anio")
    private int anio;
    
    @Column(name="ap_proceso")
    private String expJud;
    
    @Column(name="fecha_recepcion")
    private LocalDate recepcion;
    
    @Column(name="defendido")
    private String defendido;
    
    public Expediente(){}

    public Expediente(Adscripcion adscripcion, String nControl, int anio, String expJud, LocalDate recepcion, String defendido) {
        this.adscripcion = adscripcion;
        this.nControl = nControl;
        this.anio = anio;
        this.expJud = expJud;
        this.recepcion = recepcion;
        this.defendido = defendido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Adscripcion getAdscripcion() {
        return adscripcion;
    }

    public void setAdscripcion(Adscripcion adscripcion) {
        this.adscripcion = adscripcion;
    }

    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getExpJud() {
        return expJud;
    }

    public void setExpJud(String expJud) {
        this.expJud = expJud;
    }

    public LocalDate getRecepcion() {
        return recepcion;
    }

    public void setRecepcion(LocalDate recepcion) {
        this.recepcion = recepcion;
    }

    public String getDefendido() {
        return defendido;
    }

    public void setDefendido(String defendido) {
        this.defendido = defendido;
    }
    
    public Object[] toRow(){
        Object[] row = {nControl, expJud, anio, defendido, recepcion};
        return row;
    }
    public DefaultTableModel getModel(){
        String[] tblh = {"Expediente", "Exp. Jud.", "Año", "Defendido", "F. Recep."};
        return new DefaultTableModel(tblh,0);
    }
}
