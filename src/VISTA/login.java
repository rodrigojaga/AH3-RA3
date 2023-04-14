/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODELO.evalti;
import MODELO.evaltiDAORelacional;
import imagenes.TextPrompt;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author rodri
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
     
    String nombre;
    int contador = 0;
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt tfUsuario = new TextPrompt("Usuario",tfUL);
        TextPrompt tfcontra = new TextPrompt("Contraseña",tfCL);
        setIconImage(getIconImage());
        
        ojoboton1.setVisible(false);
    
        
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/jframeIcon.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ojoboton1 = new javax.swing.JButton();
        tfUL = new javax.swing.JTextField();
        tfCL = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTELES GT - LOGIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jInternalFrame1.setBackground(new java.awt.Color(204, 255, 204));
        jInternalFrame1.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarioLogin.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 98, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 244, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contra.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 305, -1, -1));

        ojoboton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        ojoboton1.setBorder(null);
        ojoboton1.setBorderPainted(false);
        ojoboton1.setContentAreaFilled(false);
        ojoboton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojoboton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojoraya.png"))); // NOI18N
        ojoboton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        ojoboton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        ojoboton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ojoboton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ojoboton1MouseReleased(evt);
            }
        });
        ojoboton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojoboton1ActionPerformed(evt);
            }
        });
        ojoboton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ojoboton1KeyTyped(evt);
            }
        });
        jPanel2.add(ojoboton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        tfUL.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        tfUL.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfULActionPerformed(evt);
            }
        });
        jPanel2.add(tfUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 241, 35));

        tfCL.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tfCL.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfCL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfCLMouseExited(evt);
            }
        });
        tfCL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCLKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCLKeyTyped(evt);
            }
        });
        jPanel2.add(tfCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 241, 35));

        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton2.setText("Entrar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 400, 278, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/titulo1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 355, 58));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfULActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfULActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfCLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCLKeyTyped
        ojoboton1.setVisible(true);
    }//GEN-LAST:event_tfCLKeyTyped

    private void tfCLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCLKeyReleased
        
    }//GEN-LAST:event_tfCLKeyReleased

    private void tfCLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCLMouseClicked
       //ojoboton1.setVisible(false);
    }//GEN-LAST:event_tfCLMouseClicked

    private void tfCLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCLMouseExited
       
    }//GEN-LAST:event_tfCLMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        acceso();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ojoboton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoboton1MousePressed
        tfCL.setEchoChar((char)0);
    }//GEN-LAST:event_ojoboton1MousePressed

    private void ojoboton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoboton1MouseReleased
        tfCL.setEchoChar('*');
    }//GEN-LAST:event_ojoboton1MouseReleased

    private void ojoboton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojoboton1ActionPerformed
        
    }//GEN-LAST:event_ojoboton1ActionPerformed

    private void ojoboton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ojoboton1KeyTyped
        
    }//GEN-LAST:event_ojoboton1KeyTyped
    
    public void acceso(){
        
            
            evaltiDAORelacional sd = new evaltiDAORelacional();
            LinkedList<Object> a = new LinkedList<>();
            LinkedList<Object> b = new LinkedList<>();
            LinkedList<String> c = new LinkedList<>();
            LinkedList<Boolean> d = new LinkedList<>();
            do{
            for (evalti dat : sd.compararLogin()) {
                Object compa[] = new Object[5];
                compa[0] = dat.getCorreo_electronico();
                compa[1] = dat.getContrasena();
                compa[2] = dat.getNombre();
                compa[3] = dat.getApellido();
                compa[4] = dat.isActivo();
                a.add(compa[0]);
                b.add(compa[1]);
                nombre = "Usuario: "+compa[2]+" "+compa[3];
                c.add(nombre);
                d.add((Boolean) compa[4]);
                         
            }
            
            if(a.get(0).equals(tfUL.getText())&&b.get(0).equals(tfCL.getText())&&d.get(0) == true){
                nombre = c.get(0);
                JOptionPane.showMessageDialog(null, "Bienvenida "+nombre);
                    usuarios us = new usuarios();
                    us.setVisible(true);
                    
                    dispose();
                    us.label(nombre);
            }else if(a.get(0).equals(tfUL.getText())&&b.get(0).equals(tfCL.getText())&&d.get(0) == false){
                JOptionPane.showMessageDialog(null, "Su usuario no esta activo");
            }else if(a.get(1).equals(tfUL.getText())&&b.get(1).equals(tfCL.getText())&&d.get(1) == true){
                nombre = c.get(1);
                JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
                    usuarios us = new usuarios();
                    us.setVisible(true);
                    
                    dispose();
                    us.label(nombre);
            }else if (a.get(1).equals(tfUL.getText())&&b.get(1).equals(tfCL.getText())&&d.get(1) == false){
                JOptionPane.showMessageDialog(null, "Su usuario no esta activo, contacte con laura@gmail.com");
            }else if (a.get(2).equals(tfUL.getText())&&b.get(2).equals(tfCL.getText())&&d.get(2) == true){
                nombre = c.get(2);
                JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
                    usuarios us = new usuarios();
                    us.setVisible(true);
                    
                    dispose();
                    us.label(nombre);
            }else if (a.get(2).equals(tfUL.getText())&&b.get(2).equals(tfCL.getText())&&d.get(2) == false){
                JOptionPane.showMessageDialog(null, "Su usuario no esta activo,  contacte con laura@gmail.com");
            }else{
                LinkedList<Boolean> z = new LinkedList<>();
                LinkedList<String> y = new LinkedList<>();
                LinkedList<String> x = new LinkedList<>();
           
                for (evalti dat : sd.gerente()) {
                    Object compa[] = new Object[5];
                    compa[0] = dat.getCorreo_electronico();
                    compa[1] = dat.getContrasena();
                    compa[2] = dat.getNombre();
                    compa[3] = dat.getApellido();
                    compa[4] = dat.isActivo();
                    x.add(compa[0]+" "+compa[1]);
                    y.add(compa[2]+" "+compa[3]);
                    z.add((Boolean) compa[4]);
                    
                }
                String sda = tfUL.getText()+" "+tfCL.getText();
                if(x.contains(sda)){
                    int di = x.indexOf(sda);
                    boolean qw =z.get(di);
                    String hd = y.get(di);
                    if(qw == true){
                        
                        JOptionPane.showMessageDialog(null, "Bienvenido: "+hd);
                        
                        vistaGerente vg = new vistaGerente();
                        vg.nomgerente(hd);
                        vg.setVisible(true);
                        dispose();
                        break;
                    }else if(qw == false){
                        JOptionPane.showMessageDialog(null, "Usuario: "+hd+" INACTIVO");
                    }
                    
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos");
                        contador+=1;
                        break;
                    }
                    
                    
            }
            }while(contador ==3);
            if (contador >=3){
                JOptionPane.showMessageDialog(null, "Todos los intentos gastados");
                System.exit(0);
            }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
            
            
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ojoboton1;
    private javax.swing.JPasswordField tfCL;
    private javax.swing.JTextField tfUL;
    // End of variables declaration//GEN-END:variables
}
