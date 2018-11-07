/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import java.util.List;
import com.ventas.sistemadeventa.model.Descripcion;

/**
 *
 * @author hugho
 */
public interface IDescripcionDao {
    
    public void save(Descripcion Descripcion);

    public List<Descripcion> listarDescripciones();

    public Descripcion buscarDescripcionPorId(int id);

    public void borrarDescripcion(int id);
    
}
