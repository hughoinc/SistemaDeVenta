/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import com.ventas.sistemadeventa.model.Ruta;
import com.ventas.sistemadeventa.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hugho
 */
public class RutaDaoImpl implements IRutaDao{

    @Override
    public void save(Ruta ruta) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(ruta);
        tx.commit();
        session.close();
    }

    @Override
    public List<Ruta> listarRutas() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Ruta> list = (List<Ruta>) session.createQuery("from Ruta").list();
        tx.commit();
        session.close();

        return list;
    }

    @Override
    public Ruta buscarRutaPorId(int id) {
        Ruta ruta = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        ruta = session.get(Ruta.class, id);
        tx.commit();
        session.close();
        return ruta;
    }

    @Override
    public void borrarRuta(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Ruta ruta = session.get(Ruta.class, id);
        session.delete(ruta);
        tx.commit();
        session.close();
    }
    
}
