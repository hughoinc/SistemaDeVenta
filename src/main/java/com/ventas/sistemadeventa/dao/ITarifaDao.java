/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import java.util.List;
import com.ventas.sistemadeventa.model.Tarifa;

/**
 *
 * @author hugho
 */
public interface ITarifaDao {
    public void save(Tarifa tarifa);

    public List<Tarifa> listarTarifas();

    public Tarifa buscarTarifaPorId(int id);

    public void borrarTarifa(int id);
    
}
