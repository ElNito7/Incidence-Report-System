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
    
    @ManyToOne
    @JoinColumn(name="tipo_incidencia", nullable=true)
    private TipoIncidencia incidencia;
    
    @ManyToOne
    @JoinColumn(name = "expediente", nullable = true)
    private Expediente exp;
    
    @ManyToOne
    @JoinColumn(name = "documento", nullable = true)
    private Documento doc;
    
    @Column(name="f_elab")
    private LocalDate elab;
    
    @Column(name="observaciones")
    private String observaciones;
    
    @ManyToOne
    @JoinColumn(name = "suplencia", nullable = true)
    private Trabajador suplencia;
    
    @Column(name="correccion")
    private String correccion;
    
    @ManyToOne
    @JoinColumn(name = "semana", nullable = true)
    private Semana sem;
    
    @ManyToOne
    @JoinColumn(name = "adscripcion", nullable = true)
    private Adscripcion adsc;
    
    @Column(name="fecha")
    private LocalDate recep;
    
    @Column(name="muestraInci")
    private boolean muestraInci;
    
    public Incidencia(){}
    public Incidencia(TipoIncidencia inc, Expediente exp, Documento doc, LocalDate elab, LocalDate recep, String observ, Trabajador suplencia, String correccion, Semana sem, Adscripcion adsc, boolean muestraInci){
        this.incidencia = inc;
        this.exp = exp;
        this.doc = doc;
        this.elab = elab;
        this.observaciones = observ;
        this.suplencia = suplencia;
        this.correccion = correccion;
        this.sem = sem;
        this.adsc = adsc;
        this.recep = recep;
        this.muestraInci = muestraInci;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoIncidencia getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(TipoIncidencia incidencia) {
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

    public Trabajador getSuplencia() {
        return suplencia;
    }

    public void setSuplencia(Trabajador suplencia) {
        this.suplencia = suplencia;
    }

    public String getCorreccion() {
        return correccion;
    }

    public void setCorreccion(String correccion) {
        this.correccion = correccion;
    }

    public LocalDate getElab() {
        return elab;
    }

    public void setElab(LocalDate elab) {
        this.elab = elab;
    }

    public Semana getSem() {
        return sem;
    }

    public void setSem(Semana sem) {
        this.sem = sem;
    }

    public Adscripcion getAdsc() {
        return adsc;
    }

    public void setAdsc(Adscripcion adsc) {
        this.adsc = adsc;
    }

    public LocalDate getFecha() {
        return recep;
    }

    public void setFecha(LocalDate fecha) {
        this.recep = fecha;
    }

    public LocalDate getRecep() {
        return recep;
    }

    public void setRecep(LocalDate recep) {
        this.recep = recep;
    }

    public boolean isMuestraInci() {
        return muestraInci;
    }

    public void setMuestraInci(boolean muestraInci) {
        this.muestraInci = muestraInci;
    }
    
    public Object[] toRow(){
        String suplente = "";
        String felab = "NO ELABORO";
        String frecep = "NO REMITIO";
        String nc = "";
        String expjud = "";
        String def = "";
        String d = "";
        String inc = "";
        if (suplencia != null){
            suplente = suplencia.getNom();
        }
        if (elab != null){
            felab = elab.toString();
        }
        if(recep != null){
            frecep = recep.toString();
        }
        if(exp != null){
            nc = exp.getnControl();
            expjud =  exp.getExpJud();
            def = exp.getDefendido();
        }
        if(doc != null){
            d = doc.getClave();
        }
        if(incidencia != null){
            inc = incidencia.getIncidencia();
        }
        Object[] row = {nc, expjud, def, d, inc, frecep, felab, observaciones, suplente, correccion};
        return row;
    }
    
    public DefaultTableModel getModel(){
        String[] tblh = {"Expediente", "AP Proc.", "Defendido", "Documento", "Incidencia", "F. Recep.", "F. Elab.", "Observaciones", "Suplencia", "Corrección"};
        return new DefaultTableModel(tblh,0);
    }
    
}
