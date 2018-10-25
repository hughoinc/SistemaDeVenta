/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import com.ventas.sistemadeventa.model.Usuario;
import com.ventas.sistemadeventa.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hugho
 */
public class UsuarioDaoImp implements UsuarioDao {

    @Override
    public void save(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(usuario);
        tx.commit();
        session.close();
    }

    @Override
    public List<Usuario> listarUsuarios() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Usuario> list = (List<Usuario>) session.createQuery("from Usuario").list();
        tx.commit();
        session.close();

        return list;
    }

    @Override
    public Usuario buscarUsuarioPorId(int id) {
        Usuario u = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        u = session.get(Usuario.class, id);
        tx.commit();
        session.close();
        return u;
    }

    @Override
    public void borrarUsuario(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Usuario u = session.get(Usuario.class, id);
        session.delete(u);
        tx.commit();
        session.close();
    }

}
