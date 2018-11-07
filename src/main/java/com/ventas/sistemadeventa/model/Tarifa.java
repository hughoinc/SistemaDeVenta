/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.model;

import java.io.Serializable;
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
@Table(name="tarifas")
public class Tarifa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="tipo_tarifa")
    private String tipoTarifa;
    
    @Column(name="rango_inicial")
    private Integer rangoInicial;
    
    @Column(name="rango_final")
    private Integer rangoFinal;
    
    private Integer giro;
    
    @Column(name="importe_tarifa")
    private Double importeTarifa;
    
    @Column(name="partida_contable")
    private String partidaContable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public Integer getRangoInicial() {
        return rangoInicial;
    }

    public void setRangoInicial(Integer rangoInicial) {
        this.rangoInicial = rangoInicial;
    }

    public Integer getRangoFinal() {
        return rangoFinal;
    }

    public void setRangoFinal(Integer rangoFinal) {
        this.rangoFinal = rangoFinal;
    }

    public Integer getGiro() {
        return giro;
    }

    public void setGiro(Integer giro) {
        this.giro = giro;
    }

    public Double getImporteTarifa() {
        return importeTarifa;
    }

    public void setImporteTarifa(Double importeTarifa) {
        this.importeTarifa = importeTarifa;
    }

    public String getPartidaContable() {
        return partidaContable;
    }

    public void setPartidaContable(String partidaContable) {
        this.partidaContable = partidaContable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.tipoTarifa);
        hash = 37 * hash + Objects.hashCode(this.rangoInicial);
        hash = 37 * hash + Objects.hashCode(this.rangoFinal);
        hash = 37 * hash + Objects.hashCode(this.giro);
        hash = 37 * hash + Objects.hashCode(this.importeTarifa);
        hash = 37 * hash + Objects.hashCode(this.partidaContable);
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
        final Tarifa other = (Tarifa) obj;
        if (!Objects.equals(this.tipoTarifa, other.tipoTarifa)) {
            return false;
        }
        if (!Objects.equals(this.partidaContable, other.partidaContable)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.rangoInicial, other.rangoInicial)) {
            return false;
        }
        if (!Objects.equals(this.rangoFinal, other.rangoFinal)) {
            return false;
        }
        if (!Objects.equals(this.giro, other.giro)) {
            return false;
        }
        if (!Objects.equals(this.importeTarifa, other.importeTarifa)) {
            return false;
        }
        return true;
    }
    
}
