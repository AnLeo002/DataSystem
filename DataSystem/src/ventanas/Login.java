/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public static String user ="";
    String pass = "";
    

    public Login() {
        initComponents();
        setSize(400,550);
        setResizable(false);
        setTitle("Acceso al sistema");
        this.setLocationRelativeTo(null);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(JlabelBack.getWidth(), JlabelBack.getHeight(),Image.SCALE_DEFAULT));
        JlabelBack.setIcon(icono);
        this.repaint();
        
        ImageIcon logo = new ImageIcon("src/imagenes/DS.png");
        Icon icon_logo = new ImageIcon(logo.getImage().getScaledInstance(jLabelLogo.getWidth(), jLabelLogo.getHeight(), Image.SCALE_DEFAULT));
        jLabelLogo.setIcon(icon_logo);
        this.repaint();
    }
    
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon.png"));
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

        jLabelLogo = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        access = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JlabelBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, 270));

        userTxt.setBackground(new java.awt.Color(0, 102, 204));
        userTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userTxt.setBorder(null);
        getContentPane().add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 330, 210, 28));

        passwordTxt.setBackground(new java.awt.Color(0, 102, 204));
        passwordTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxt.setBorder(null);
        getContentPane().add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 380, 210, 28));

        access.setBackground(new java.awt.Color(0, 102, 204));
        access.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        access.setForeground(new java.awt.Color(255, 255, 255));
        access.setText("Acceder");
        access.setBorder(null);
        access.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessActionPerformed(evt);
            }
        });
        getContentPane().add(access, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 430, 210, 35));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema creado por Andre S. © ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));
        getContentPane().add(JlabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 400, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessActionPerformed
        user = userTxt.getText().trim();
        pass = passwordTxt.getText().trim();
        
        if(!user.equals("") || !pass.equals("")){
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select tipo_nivel, estatus from usuarios where username = '"+user+ "' and password = '"+pass+"'");
                
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    
                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");
                    
                    if(tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Administrador().setVisible(true);
                    }else if(tipo_nivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Capturista().setVisible(true);
                    }else if(tipo_nivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Tecnico().setVisible(true);
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrector."); 
                    passwordTxt.setText("");
                    userTxt.setText("");
                }
            } catch (SQLException e) {
                System.err.println("Error en el boton Acceder: " +e);
                JOptionPane.showMessageDialog(null, "Eror al iniciar sesion!!, contacte al administrador.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
    }//GEN-LAST:event_accessActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelBack;
    private javax.swing.JButton access;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
