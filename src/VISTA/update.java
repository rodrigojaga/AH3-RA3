/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODELO.evalti;
import MODELO.evaltiDAORelacional;
import imagenes.TextPrompt;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class update extends javax.swing.JFrame {

    /**
     * Creates new form update
     */
    String a;
    public update() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt tfUsuario = new TextPrompt("Nombre usuario",nom);
        TextPrompt tfcontra = new TextPrompt("Apellido usuario",ape);
        TextPrompt tffecha = new TextPrompt("Fecha de Nacimiento: ejem.:(2000-02-15)",fecha);
        TextPrompt tfdirec = new TextPrompt("Dirección",dir);
        TextPrompt tftele = new TextPrompt("Telefono",tel);
        TextPrompt tfcore = new TextPrompt("Correo Electronico",cor);
        TextPrompt tfcon = new TextPrompt("Contraseña",con);
        setIconImage(getIconImage());
        actividadUp.add(activo);
        actividadUp.add(inactivo);
        jButton3.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/jframeIcon.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actividadUp = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        cod = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        nom = new javax.swing.JTextField();
        ape = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        dir = new javax.swing.JTextField();
        cor = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        rol = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        activo = new javax.swing.JRadioButton();
        inactivo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        con = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Usuario");

        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(169, 168, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cod.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cod.setEnabled(false);
        jPanel1.add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 340, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojoraya.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 30, -1));

        nom.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomMouseClicked(evt);
            }
        });
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 340, 40));

        ape.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apeMouseClicked(evt);
            }
        });
        jPanel1.add(ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 340, 40));

        tel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telMouseClicked(evt);
            }
        });
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 340, 40));

        dir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dirMouseClicked(evt);
            }
        });
        jPanel1.add(dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 340, 40));

        cor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corMouseClicked(evt);
            }
        });
        jPanel1.add(cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 340, 40));

        fecha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaMouseClicked(evt);
            }
        });
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 340, 40));

        rol.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rol.setEnabled(false);
        jPanel1.add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 340, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, -1, -1));

        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_modify_icon_196940.png"))); // NOI18N
        jButton2.setText("Modificar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_modify_icon_196940.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_modify_icon_196940.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_modify_icon_196940.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 170, 70));

        activo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        activo.setText("Activo");
        jPanel1.add(activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, -1, -1));

        inactivo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        inactivo.setText("Inactivo");
        jPanel1.add(inactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mod.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mod1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/phon1.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/office_business_work_workplace_home_company_icon_175608.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        con.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        con.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conMouseClicked(evt);
            }
        });
        jPanel1.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 340, 50));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(nom.getText().isEmpty()||ape.getText().isEmpty()||fecha.getText().isEmpty()
                || dir.getText().isEmpty() ||(activo.isSelected()==false &&inactivo.isSelected()==false)   ||tel.getText().isEmpty()  ||cor.getText().isEmpty()
                ||con.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "DEBE LLENAR Y/O SELECCIONAR TODOS LOS CAMPOS");
                Color ca = new Color(255,160,160);
            if(nom.getText().equals("")){
                nom.setBackground(ca);
            }
            if(ape.getText().equals("")){
                ape.setBackground(ca);

            }
            if(fecha.getText().equals("")){
                fecha.setBackground(ca);
                
            }
            if(dir.getText().equals("")){
                dir.setBackground(ca);
                
            }
            if(tel.getText().equals("")){
                tel.setBackground(ca);
                
            }
            if(cor.getText().equals("")){
                cor.setBackground(ca);
                
            }
            if(activo.isSelected() == false &&inactivo.isSelected() == false){
                activo.setForeground(Color.red);
                inactivo.setForeground(Color.red);
            }
            if(con.getText().equals("")){
                con.setBackground(ca);
                
            }
        }else{
                JOptionPane.showMessageDialog(null, "Usuario Modificado");
                enviar();
        }     
        usuarios us = new usuarios();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomMouseClicked
        Color c = new Color(255,255,255);
        nom.setBackground(c);
    }//GEN-LAST:event_nomMouseClicked

    private void apeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apeMouseClicked
        Color c = new Color(255,255,255);
        ape.setBackground(c);
    }//GEN-LAST:event_apeMouseClicked

    private void telMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telMouseClicked
        Color c = new Color(255,255,255);
        tel.setBackground(c);
    }//GEN-LAST:event_telMouseClicked

    private void dirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dirMouseClicked
        Color c = new Color(255,255,255);
        dir.setBackground(c);
    }//GEN-LAST:event_dirMouseClicked

    private void corMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corMouseClicked
        Color c = new Color(255,255,255);
        cor.setBackground(c);
    }//GEN-LAST:event_corMouseClicked

    private void fechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaMouseClicked
        Color c = new Color(255,255,255);
        fecha.setBackground(c);
    }//GEN-LAST:event_fechaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuarios us = new usuarios();
        us.setVisible(true);
        us.label(a);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        con.setEchoChar((char)0);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        con.setEchoChar('*');
    }//GEN-LAST:event_jButton3MouseReleased

    private void conMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conMouseClicked
        jButton3.setVisible(true);
    }//GEN-LAST:event_conMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public void labelUpdate(String nombre){
        a = nombre;
    }
    
    public void mostrar(int id) {
        evaltiDAORelacional ev = new evaltiDAORelacional();
        evalti eve = ev.obtener(id);
        if(eve.isActivo() == true){
            cod.setText(eve.getId_usuario() + "");
            nom.setText(eve.getNombre() + "");
            ape.setText(eve.getApellido() + "");
            tel.setText(eve.getTelefono() + "");
            dir.setText(eve.getDireccion() + "");
            cor.setText(eve.getCorreo_electronico() + "");
            fecha.setText(eve.getFecha_nacimiento() + "");
            rol.setText(eve.getRol_id() + "");
            activo.setSelected(true);
            inactivo.setSelected(false);
            con.setText(eve.getContrasena() + "");
            
        }else if(eve.isActivo() == false){
            cod.setText(eve.getId_usuario() + "");
            nom.setText(eve.getNombre() + "");
            ape.setText(eve.getApellido() + "");
            tel.setText(eve.getTelefono() + "");
            dir.setText(eve.getDireccion() + "");
            cor.setText(eve.getCorreo_electronico() + "");
            fecha.setText(eve.getFecha_nacimiento() + "");
            rol.setText(eve.getRol_id() + "");
            activo.setSelected(false);
            inactivo.setSelected(true);
            con.setText(eve.getContrasena() + "");
            
        }
        
        
    }
    
    private void enviar() {
        
        
        if(activo.isSelected() == true){
            evalti eve = new evalti(Integer.parseInt(cod.getText()) ,nom.getText(), ape.getText(), 
                Integer.parseInt(tel.getText()),dir.getText(), cor.getText(),fecha.getText(),
                Integer.parseInt(rol.getText()),true,con.getText());
            evaltiDAORelacional ev = new evaltiDAORelacional();
            ev.modificar(eve);
            usuarios us = new usuarios();
            us.label(a);
            us.setVisible(true);
            dispose();    
        }else if(inactivo.isSelected() == true){
            evalti eve = new evalti(Integer.parseInt(cod.getText()) ,nom.getText(), ape.getText(), 
                Integer.parseInt(tel.getText()),dir.getText(), cor.getText(),fecha.getText(),
                Integer.parseInt(rol.getText()),false,con.getText());
            evaltiDAORelacional ev = new evaltiDAORelacional();
            ev.modificar(eve);
            usuarios us = new usuarios();
            us.setVisible(true);
            us.label(a);
            dispose();  
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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup actividadUp;
    private javax.swing.JRadioButton activo;
    private javax.swing.JTextField ape;
    private javax.swing.JTextField cod;
    private javax.swing.JPasswordField con;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField dir;
    private javax.swing.JTextField fecha;
    private javax.swing.JRadioButton inactivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField rol;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
