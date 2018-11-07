/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import java.util.List;
import com.ventas.sistemadeventa.model.Ruta;

/**
 *
 * @author hugho
 */
public interface IRutaDao {

    public void save(Ruta ruta);

    public List<Ruta> listarRutas();

    public Ruta buscarRutaPorId(int id);

    public void borrarRuta(int id);
    
}
