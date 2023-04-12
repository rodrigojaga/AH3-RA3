/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODELO.evalti;
import MODELO.evaltiDAORelacional;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri 
 */
public class usuarios extends javax.swing.JFrame {
    
    DefaultTableModel t1;
    login lp = new login();
    String la ;
    public usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(getIconImage());
        //login lp = new login();
        //String a = lp.ae;
        
        datos();
        
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/jframeIcon.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nomusu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTELES GT - USUARIOS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 232, 147));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(240, 218, 146));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomusu.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        nomusu.setText("Usuario: Nombre de usuario");
        jPanel2.add(nomusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 75, 938, 343));

        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        jButton1.setText("Agregar usuario");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 220, 52));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 960, 420));

        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, 70, 50));

        jButton3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_modify_icon_196940.png"))); // NOI18N
        jButton3.setText("Modificar Usuario");
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_modify_icon_196940.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_modify_icon_196940.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_modify_icon_196940.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 240, 50));

        jButton4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biggarbagebin_121980.png"))); // NOI18N
        jButton4.setText("Eliminar Usuario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ttotousuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jInternalFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addUser au = new addUser();
        au.setVisible(true);
        //mantener();
        dispose();
        au.labelAdd(nomusu.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login lp = new login();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        enviar_datos();
        //mantener();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        enviareliminar_datos();
        
        
        //mantener();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    
    public void datos(){
        String columnas[] = {"ID Usuario", "Nombre", "Apellido", "Rol","Correo Electronico", "Telefono"};
        t1 = new DefaultTableModel(null, columnas);
        evaltiDAORelacional sd = new evaltiDAORelacional();
        for (evalti dat : sd.listar()) {
            Object ayuda[] = new Object[6];
            ayuda[0] = dat.getId_usuario();
            ayuda[1] = dat.getNombre();
            ayuda[2] = dat.getApellido();
            ayuda[3] = dat.getNombre_rol();
            ayuda[4] = dat.getCorreo_electronico();
            ayuda[5] = dat.getTelefono();
            t1.addRow(ayuda);
        }
        tablaUsuarios.setModel(t1);
    }
    
    private void enviar_datos() {
        int id = (int) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0);
        update up = new update();
        up.mostrar(id);
        up.setVisible(true);
        up.labelUpdate(nomusu.getText());
        dispose();
    }
    
    private void enviareliminar_datos() {
        int id = (int) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0);
        delete dl = new delete();
        dl.mostrar(id);
        //dl.eliminar(id);
        dl.setVisible(true);
        
        dl.labeldelete(nomusu.getText());
        dispose();
    }
    
    private void eliminar_datos() {
        int id = (int) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0);
        evaltiDAORelacional sd = new evaltiDAORelacional();
        sd.eliminar(id);
        dispose();
        delete dl = new delete();
        //dl.labelDelete(nomusu.getText());
        dl.setVisible(true);
        dispose();
    }
    
    public void label(String nombre){
        nomusu.setText(nombre);
    }
    
//    public void mantener(String txt){
//        nomusu.setText(txt);
//    }
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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomusu;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
