/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODELO.conexion;
import MODELO.evalti;
import MODELO.evaltiDAORelacional;
import imagenes.TextPrompt;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class addUser extends javax.swing.JFrame {

    /**
     * Creates new form addUser
     */
    String a;
    public addUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt tfUsuario = new TextPrompt("Nombre usuario",tfNom);
        TextPrompt tfcontra = new TextPrompt("Apellido usuario",tfApe);
        TextPrompt tffecha = new TextPrompt("Fecha de Nacimiento: ejem.:(2000-02-15)",tfnaci);
        TextPrompt tfdirec = new TextPrompt("Dirección",tfdir);
        TextPrompt tftele = new TextPrompt("Telefono",tftel);
        TextPrompt tfcore = new TextPrompt("Correo Electronico",tfcor);
        //TextPrompt tfroll = new TextPrompt("Rol: 1 - Administrador, 2 - Gerente ",tfrol);
        //TextPrompt tfdact = new TextPrompt("Actividad: True - Activo, False - Inactivo",tfact);
        TextPrompt tfcon = new TextPrompt("Contraseña",tfContra);
        setIconImage(getIconImage());
        ojoboton.setVisible(false);
        actividad.add(rbactivo);
        actividad.add(rbinactivo);
        
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/jframeIcon.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actividad = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfApe = new javax.swing.JTextField();
        tfnaci = new javax.swing.JTextField();
        tfdir = new javax.swing.JTextField();
        tfcor = new javax.swing.JTextField();
        tftel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ojoboton = new javax.swing.JButton();
        tfContra = new javax.swing.JPasswordField();
        rbactivo = new javax.swing.JRadioButton();
        rbinactivo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Nuevo Usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(174, 214, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userAdd.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        tfNom.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNomMouseClicked(evt);
            }
        });
        jPanel1.add(tfNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 357, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newuser2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        tfApe.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfApe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfApeMouseClicked(evt);
            }
        });
        jPanel1.add(tfApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 357, 30));

        tfnaci.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfnaci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfnaciMouseClicked(evt);
            }
        });
        jPanel1.add(tfnaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 357, 30));

        tfdir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfdir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfdirMouseClicked(evt);
            }
        });
        jPanel1.add(tfdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 357, 30));

        tfcor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfcor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfcorMouseClicked(evt);
            }
        });
        jPanel1.add(tfcor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 357, 30));

        tftel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tftel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tftelMouseClicked(evt);
            }
        });
        jPanel1.add(tftel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 357, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton1.setText("Agregar             ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 174, 77));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/name-48_44872.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/phon1.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/office_business_work_workplace_home_company_icon_175608.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        ojoboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        ojoboton.setBorder(null);
        ojoboton.setBorderPainted(false);
        ojoboton.setContentAreaFilled(false);
        ojoboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojoboton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojoraya.png"))); // NOI18N
        ojoboton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        ojoboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ojobotonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ojobotonMouseReleased(evt);
            }
        });
        ojoboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojobotonActionPerformed(evt);
            }
        });
        jPanel1.add(ojoboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        tfContra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfContraMouseClicked(evt);
            }
        });
        tfContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContraActionPerformed(evt);
            }
        });
        tfContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfContraKeyTyped(evt);
            }
        });
        jPanel1.add(tfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 360, 40));

        rbactivo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rbactivo.setText("Activo");
        rbactivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbactivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbactivoMouseClicked(evt);
            }
        });
        jPanel1.add(rbactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        rbinactivo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rbinactivo.setText("Inactivo");
        rbinactivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbinactivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbinactivoMouseClicked(evt);
            }
        });
        jPanel1.add(rbinactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        if(tfNom.getText().isEmpty()||tfApe.getText().isEmpty()||tfnaci.getText().isEmpty()
                || tfdir.getText().isEmpty() ||(rbactivo.isSelected()==false &&rbinactivo.isSelected()==false)   ||tftel.getText().isEmpty()  ||tfcor.getText().isEmpty()
                ||tfContra.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "DEBE LLENAR Y/O SELECCIONAR TODOS LOS CAMPOS");
                Color ca = new Color(255,160,160);
            if(tfNom.getText().equals("")){
                tfNom.setBackground(ca);
            }
            if(tfApe.getText().equals("")){
                tfApe.setBackground(ca);

            }
            if(tfnaci.getText().equals("")){
                tfnaci.setBackground(ca);
                
            }
            if(tfdir.getText().equals("")){
                tfdir.setBackground(ca);
                
            }
            if(tftel.getText().equals("")){
                tftel.setBackground(ca);
                
            }
            if(tfcor.getText().equals("")){
                tfcor.setBackground(ca);
                
            }
            if(rbactivo.isSelected() == false &&rbinactivo.isSelected() == false){
                rbactivo.setForeground(Color.red);
                rbinactivo.setForeground(Color.red);
            }
            if(tfContra.getText().equals("")){
                tfContra.setBackground(ca);
                
            }
        }else{
                JOptionPane.showMessageDialog(null, "Usuario Ingresado");
                enviarDatos();
                
                
                
        }   
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraActionPerformed

    private void tfContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContraKeyTyped
        ojoboton.setVisible(true);
    }//GEN-LAST:event_tfContraKeyTyped

    private void tfContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfContraMouseClicked
        ojoboton.setVisible(false);
        Color c = new Color(255,255,255);
        tfContra.setBackground(c);
    }//GEN-LAST:event_tfContraMouseClicked

    private void ojobotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojobotonMousePressed
        tfContra.setEchoChar((char)0);
    }//GEN-LAST:event_ojobotonMousePressed

    private void ojobotonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojobotonMouseReleased
        tfContra.setEchoChar('*');
    }//GEN-LAST:event_ojobotonMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        usuarios us = new usuarios();
        us.setVisible(true);
        us.label(a);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNomMouseClicked
    Color c = new Color(255,255,255);
    tfNom.setBackground(c);
    }//GEN-LAST:event_tfNomMouseClicked

    private void tfApeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfApeMouseClicked
        Color c = new Color(255,255,255);
        tfApe.setBackground(c);
    }//GEN-LAST:event_tfApeMouseClicked

    private void tfnaciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfnaciMouseClicked
        Color c = new Color(255,255,255);
        tfnaci.setBackground(c);
    }//GEN-LAST:event_tfnaciMouseClicked

    private void tfdirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfdirMouseClicked
        Color c = new Color(255,255,255);
        tfdir.setBackground(c);
    }//GEN-LAST:event_tfdirMouseClicked

    private void tftelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tftelMouseClicked
        Color c = new Color(255,255,255);
        tftel.setBackground(c);
    }//GEN-LAST:event_tftelMouseClicked

    private void tfcorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfcorMouseClicked
        Color c = new Color(255,255,255);
        tfcor.setBackground(c);
    }//GEN-LAST:event_tfcorMouseClicked

    private void rbactivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbactivoMouseClicked
        Color c = new Color(0,0,0);
        rbactivo.setForeground(c);
        rbinactivo.setForeground(c);
    }//GEN-LAST:event_rbactivoMouseClicked

    private void rbinactivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbinactivoMouseClicked
        Color c = new Color(0,0,0);
        rbactivo.setForeground(c);
        rbinactivo.setForeground(c);
    }//GEN-LAST:event_rbinactivoMouseClicked

    private void ojobotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojobotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ojobotonActionPerformed

    public void labelAdd(String nombre){
        a = nombre;
    }
    public void enviarDatos(){
        if(rbactivo.isSelected() == true){
            evalti ev = new evalti(tfNom.getText(),tfApe.getText(),Integer.parseInt(tftel.getText()),
            tfdir.getText(),tfcor.getText(),tfnaci.getText(),2,
            true,tfContra.getText());
            evaltiDAORelacional ed = new evaltiDAORelacional();
            ed.crear(ev);
            usuarios us = new usuarios();
            
                us.label(a);
            us.setVisible(true);
            dispose();    
        }else if(rbinactivo.isSelected() == true){
            evalti ev = new evalti(tfNom.getText(),tfApe.getText(),Integer.parseInt(tftel.getText()),
            tfdir.getText(),tfcor.getText(),tfnaci.getText(),2,
            false,tfContra.getText());
            evaltiDAORelacional ed = new evaltiDAORelacional();
            ed.crear(ev);
            usuarios us = new usuarios();
            us.setVisible(true);
            us.label(a);
            dispose();
        }
        
       
        
       
    }
    
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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup actividad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ojoboton;
    private javax.swing.JRadioButton rbactivo;
    private javax.swing.JRadioButton rbinactivo;
    private javax.swing.JTextField tfApe;
    private javax.swing.JPasswordField tfContra;
    private javax.swing.JTextField tfNom;
    private javax.swing.JTextField tfcor;
    private javax.swing.JTextField tfdir;
    private javax.swing.JTextField tfnaci;
    private javax.swing.JTextField tftel;
    // End of variables declaration//GEN-END:variables
}
