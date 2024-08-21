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

/**
 *
 * @author Keloc
 */
@Entity
@Table(name="config")
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="delegado")
    private String delegado;
    
    @Column(name="jefeDpto")
    private String jefeDpto;
    
    @Column(name="leyenda")
    private String leyenda;
    
    @Column(name="fundamento")
    private String fundamento;
    
    @Column(name="delegacion")
    private String delegacion;
    
    @Column(name="asJud")
    private String asJud;
    
    @Column(name="reporte")
    private String reporte;
    
    @Column(name="ubicacion")
    private String ubi;

    public Config(){}
    public Config(String delegado, String jefeDpto, String leyenda, String justificacion, String delegacion) {
        this.delegado = delegado;
        this.jefeDpto = jefeDpto;
        this.leyenda = leyenda;
        this.fundamento = justificacion;
        this.delegacion = delegacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDelegado() {
        return delegado;
    }

    public void setDelegado(String delegado) {
        this.delegado = delegado;
    }

    public String getJefeDpto() {
        return jefeDpto;
    }

    public void setJefeDpto(String jefeDpto) {
        this.jefeDpto = jefeDpto;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public String getFundamento() {
        return fundamento;
    }

    public void setFundamento(String fundamento) {
        this.fundamento = fundamento;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getAsJud() {
        return asJud;
    }

    public void setAsJud(String asJud) {
        this.asJud = asJud;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }
    
    
}
