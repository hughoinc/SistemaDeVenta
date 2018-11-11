/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.grid;

import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hugho
 */
public class DescripcionGrid extends AbstractTableModel {
    Object dato[][];
    String cabezera[];

    public DescripcionGrid(Object data[][], int filas, int columnas) {
        this.dato = data;
        this.cabezera = new String[columnas];
    }

    protected String[] columnNames = new String[]{
        "Id", "Desc Larga", "Desc Corta", "Vigencia"
    };

    protected Class[] columnClasses = new Class[]{
        Integer.class, 
        String.class, 
        String.class, 
        Date.class
    };

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       return columnClasses[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
       return dato.length;
    }

    @Override
    public int getColumnCount() {
        return cabezera.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dato[rowIndex][columnIndex];
    }
}
