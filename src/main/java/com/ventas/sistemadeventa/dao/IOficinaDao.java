/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import java.util.List;
import com.ventas.sistemadeventa.model.Oficina;

/**
 *
 * @author hugho
 */
public interface IOficinaDao {

    public void save(Oficina oficina);

    public List<Oficina> listarOficinas();

    public Oficina buscarOficinaPorId(int id);

    public void borrarOficina(int id);
    
}
