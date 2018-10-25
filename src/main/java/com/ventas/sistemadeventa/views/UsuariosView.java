/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.sistemadeventa.views;

import com.ventas.sistemadeventa.dao.UsuarioDao;
import com.ventas.sistemadeventa.dao.UsuarioDaoImp;
import com.ventas.sistemadeventa.grid.UsuariosGrid;
import com.ventas.sistemadeventa.model.Usuario;
import java.awt.Point;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author hugho
 */
public class UsuariosView extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosView
     */
    public UsuariosView() {
        initComponents();
        actulizarData();

    }
    
    private void actulizarData(){
        UsuarioDao u = new UsuarioDaoImp();
        List<Usuario> usuarios = u.listarUsuarios();
        Object data[][] = new Object[usuarios.size()][6];
        int index = 0;
        for (Usuario item : usuarios) {
            data[index][0] = item.getId();
            data[index][1] = item.getNombre();
            data[index][2] = item.getApellidoPaterno();
            data[index][3] = item.getApellidoMaterno();
            data[index][4] = item.getUsuario();
            data[index][5] = item.getFecha();
            index++;

        }

        dataUsuarios.setModel(new UsuariosGrid(data, 1, 6));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataUsuarios = new javax.swing.JTable();
        btnActulizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemAltaUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Usuarios"));

        dataUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataUsuarios);

        btnActulizar.setText("Actualizar Grid");
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(btnActulizar)
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnActulizar)
                .addContainerGap())
        );

        jMenu1.setText("File");

        menuItemAltaUsuario.setText("Alta de Usuario");
        menuItemAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAltaUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemAltaUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAltaUsuarioActionPerformed
        // TODO add your handling code here:
        new NuevoUsuarioView().setVisible(true);

        System.out.println("com.ventas.sistemadeventa.views.UsuariosView.menuItemAltaUsuarioActionPerformed()");
    }//GEN-LAST:event_menuItemAltaUsuarioActionPerformed

    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
        actulizarData();
    }//GEN-LAST:event_btnActulizarActionPerformed

    private void dataUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataUsuariosMouseClicked
        JTable table =(JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = table.rowAtPoint(point);
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            int id = Integer.parseInt(table.getModel().getValueAt(row, 0).toString());
            UsuarioDao usuarioDao = new UsuarioDaoImp();
            Usuario us = usuarioDao.buscarUsuarioPorId(id);
            new NuevoUsuarioView(us).setVisible(true);
        }
    }//GEN-LAST:event_dataUsuariosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActulizar;
    private javax.swing.JTable dataUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuItemAltaUsuario;
    // End of variables declaration//GEN-END:variables
}
