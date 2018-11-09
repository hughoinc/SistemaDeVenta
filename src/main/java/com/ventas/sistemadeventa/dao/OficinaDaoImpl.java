/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import com.ventas.sistemadeventa.model.Oficina;
import com.ventas.sistemadeventa.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hugho
 */
public class OficinaDaoImpl implements IOficinaDao{

    @Override
    public void save(Oficina oficina) {
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(oficina);
        tx.commit();
        session.close();
    }

    @Override
    public List<Oficina> listarOficinas() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Oficina> list = (List<Oficina>) session.createQuery("from Oficina").list();
        tx.commit();
        session.close();

        return list;
    }

    @Override
    public Oficina buscarOficinaPorId(int id) {
        Oficina oficina = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        oficina = session.get(Oficina.class, id);
        tx.commit();
        session.close();
        return oficina;
    }

    @Override
    public void borrarOficina(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Oficina oficina = session.get(Oficina.class, id);
        session.delete(oficina);
        tx.commit();
        session.close();
        
    }
    
}
