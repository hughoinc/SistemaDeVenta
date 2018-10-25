/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import com.ventas.sistemadeventa.model.Usuario;
import java.util.List;

/**
 *
 * @author hugho
 */
public interface UsuarioDao {
    
    public void save(Usuario usuario);
    public List<Usuario> listarUsuarios();
    public Usuario buscarUsuarioPorId(int id);
    
}
