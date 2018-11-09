/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.dao;

import com.ventas.sistemadeventa.model.Tarifa;
import com.ventas.sistemadeventa.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 *
 * @author hugho
 */
public class TarifaDaoImpl implements ITarifaDao{

    @Override
    public void save(Tarifa tarifa) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(tarifa);
        tx.commit();
        session.close();
    }

    @Override
    public List<Tarifa> listarTarifas() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Tarifa> list = (List<Tarifa>) session.createQuery("from Tarifa").list();
        tx.commit();
        session.close();

        return list;
    }

    @Override
    public Tarifa buscarTarifaPorId(int id) {
        Tarifa tarifa = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        tarifa = session.get(Tarifa.class, id);
        tx.commit();
        session.close();
        return tarifa;
    }

    @Override
    public void borrarTarifa(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Tarifa tarifa = session.get(Tarifa.class, id);
        session.delete(tarifa);
        tx.commit();
        session.close();
    }
    
}
