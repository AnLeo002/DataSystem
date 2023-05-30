/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import clases.Conexion;
import javax.swing.WindowConstants;


/**
 *
 * @author leosa
 */
public class RestaurarPassword extends javax.swing.JFrame {

    String user_update = infoUsuario.user_update;
    public RestaurarPassword() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                
        ImageIcon fondoUrl = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon fondo = new ImageIcon(fondoUrl.getImage().getScaledInstance(jLabelBack.getWidth(), jLabelBack.getHeight(), Image.SCALE_DEFAULT));
        jLabelBack.setIcon(fondo);
        repaint();
        setTitle("Password-"+user_update);
        
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

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        passwordConfir = new javax.swing.JPasswordField();
        restaurar = new javax.swing.JButton();
        jLabelBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirmar password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        titulo.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Restaurar password ");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        passwordTxt.setBackground(new java.awt.Color(0, 102, 153));
        passwordTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxt.setBorder(null);
        getContentPane().add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 200, 25));

        passwordConfir.setBackground(new java.awt.Color(0, 102, 153));
        passwordConfir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordConfir.setForeground(new java.awt.Color(255, 255, 255));
        passwordConfir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordConfir.setBorder(null);
        getContentPane().add(passwordConfir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, 25));

        restaurar.setBackground(new java.awt.Color(0, 102, 153));
        restaurar.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        restaurar.setForeground(new java.awt.Color(255, 255, 255));
        restaurar.setText("Restaurar");
        restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurarActionPerformed(evt);
            }
        });
        getContentPane().add(restaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 200, 30));
        getContentPane().add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurarActionPerformed
        String password = passwordTxt.getText().trim();
        String confir = passwordConfir.getText().trim();
        
        if (password.equals("")||confir.equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los espacios");
        }else if(!password.equals(confir)){
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }else{
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("update usuarios set password=? where username = '"+user_update+"'");
                
                pst.setString(1, confir);
                pst.executeUpdate();
                cn.close();
                
                JOptionPane.showMessageDialog(null, "Password restaurada correctamente");
                dispose();
            } catch (SQLException e) {
                System.err.println("Existe un error en la base de datos "+e);
            }
        }
    }//GEN-LAST:event_restaurarActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JPasswordField passwordConfir;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton restaurar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}