/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import com.ventas.sistemadeventa.model.Descripcion;
import com.ventas.sistemadeventa.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hugho
 */
public class DescripcionDaoImpl implements IDescripcionDao{

    @Override
    public void save(Descripcion descripcion) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(descripcion);
        tx.commit();
        session.close();
    }

    @Override
    public List<Descripcion> listarDescripciones() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Descripcion> list = (List<Descripcion>) session.createQuery("from Descripcion").list();
        tx.commit();
        session.close();

        return list;
    }

    @Override
    public Descripcion buscarDescripcionPorId(int id) {
        Descripcion desc = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        desc = session.get(Descripcion.class, id);
        tx.commit();
        session.close();
        return desc;
    }

    @Override
    public void borrarDescripcion(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Descripcion desc = session.get(Descripcion.class, id);
        session.delete(desc);
        tx.commit();
        session.close();
    }
    
}
