/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hugho
 */
@Entity
@Table(name="descripciones")
public class Descripcion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="descripcion_corta")
    private String descripcionCorta;
    
    @Column(name="descripcion_larga")
    private String descripcionLarga;
    
    @Column(name="fecha_ingreso")
    private Date fechaIngreso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.id);
        hash = 61 * hash + Objects.hashCode(this.descripcionCorta);
        hash = 61 * hash + Objects.hashCode(this.descripcionLarga);
        hash = 61 * hash + Objects.hashCode(this.fechaIngreso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Descripcion other = (Descripcion) obj;
        if (!Objects.equals(this.descripcionCorta, other.descripcionCorta)) {
            return false;
        }
        if (!Objects.equals(this.descripcionLarga, other.descripcionLarga)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaIngreso, other.fechaIngreso)) {
            return false;
        }
        return true;
    }
}
