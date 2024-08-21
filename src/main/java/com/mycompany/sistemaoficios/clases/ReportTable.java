/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaoficios.clases;

/**
 *
 * @author Keloc
 */
public class ReportTable {
    private String exp;
    private String defendido;
    private String doc;
    private String fechaT;
    private String inc;

    public ReportTable(String exp, String defendido, String doc, String fechaT, String inc) {
        this.exp = exp;
        this.defendido = defendido;
        this.doc = doc;
        this.fechaT = fechaT;
        this.inc = inc;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getDefendido() {
        return defendido;
    }

    public void setDefendido(String defendido) {
        this.defendido = defendido;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getFechaT() {
        return fechaT;
    }

    public void setFechaT(String fechaT) {
        this.fechaT = fechaT;
    }

    public String getInc() {
        return inc;
    }

    public void setInc(String inc) {
        this.inc = inc;
    }
    
    public String mostrar(){
        return exp + "\n"+defendido+ "\n"+doc+ "\n"+fechaT+ "\n"+inc;
    }
    
}
