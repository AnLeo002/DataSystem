package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;

public class Administrador extends javax.swing.JFrame {
    String user, nombre_Usuario;
    public static int sesionAdmi;
    public Administrador() {
        
        initComponents();
        sesionAdmi = 1;
        user = Login.user;
        setSize(650,450);
        setResizable(false);
        this.setTitle("Administrador - Sesión de " + user);
        setLocationRelativeTo(null);
        
        ImageIcon fondo = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon iconoFond = new ImageIcon(fondo.getImage().getScaledInstance(jLabelBackground.getWidth(), jLabelBackground.getHeight(), Image.SCALE_DEFAULT));
        jLabelBackground.setIcon(iconoFond);
        repaint();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("Select nombre_usuario from usuarios where username = '"+user+"'");
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                nombre_Usuario = rs.getString("nombre_usuario");
                jLabel1.setText("Bienvenido "+ nombre_Usuario);
            }
        } catch (SQLException e) {
            System.out.println("Problemas en la conexion con la base de datos "+ e);
        }
        
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

        jLabel1 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        manage = new javax.swing.JButton();
        creativity = new javax.swing.JButton();
        capturista = new javax.swing.JButton();
        acercaDe = new javax.swing.JButton();
        tecnico = new javax.swing.JButton();
        regi = new javax.swing.JLabel();
        gestion = new javax.swing.JLabel();
        crear = new javax.swing.JLabel();
        panelCap = new javax.swing.JLabel();
        panelTec = new javax.swing.JLabel();
        acerca = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        register.setBackground(new java.awt.Color(204, 204, 204));
        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addUser.png"))); // NOI18N
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 120, 100));

        manage.setBackground(new java.awt.Color(204, 204, 204));
        manage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informationuser.png"))); // NOI18N
        manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageActionPerformed(evt);
            }
        });
        getContentPane().add(manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 120, 100));

        creativity.setBackground(new java.awt.Color(204, 204, 204));
        creativity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        creativity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creativityActionPerformed(evt);
            }
        });
        getContentPane().add(creativity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 120, 100));

        capturista.setBackground(new java.awt.Color(204, 204, 204));
        capturista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/capturista.png"))); // NOI18N
        capturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturistaActionPerformed(evt);
            }
        });
        getContentPane().add(capturista, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, 100));

        acercaDe.setBackground(new java.awt.Color(204, 204, 204));
        acercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        acercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeActionPerformed(evt);
            }
        });
        getContentPane().add(acercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 120, 100));

        tecnico.setBackground(new java.awt.Color(204, 204, 204));
        tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tecnico.png"))); // NOI18N
        tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 100));

        regi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regi.setForeground(new java.awt.Color(255, 255, 255));
        regi.setText("Registrar Usuarios");
        getContentPane().add(regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        gestion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gestion.setForeground(new java.awt.Color(255, 255, 255));
        gestion.setText("Gestionar Usuarios");
        getContentPane().add(gestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 180, -1, -1));

        crear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        crear.setForeground(new java.awt.Color(255, 255, 255));
        crear.setText("Invetario");
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        panelCap.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        panelCap.setForeground(new java.awt.Color(255, 255, 255));
        panelCap.setText("Panel vista Capturista");
        getContentPane().add(panelCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        panelTec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        panelTec.setForeground(new java.awt.Color(255, 255, 255));
        panelTec.setText("Panel vista Tecnico");
        getContentPane().add(panelTec, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 350, -1, -1));

        acerca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        acerca.setForeground(new java.awt.Color(255, 255, 255));
        acerca.setText("Acerca De");
        getContentPane().add(acerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema creado por Andre S. © ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeActionPerformed
        new AcercaDe().setVisible(true);
    }//GEN-LAST:event_acercaDeActionPerformed

    private void tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecnicoActionPerformed
        new Tecnico().setVisible(true);
    }//GEN-LAST:event_tecnicoActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        new RegistroUsuarios().setVisible(true);
    }//GEN-LAST:event_registerActionPerformed

    private void manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActionPerformed
        new GestionarUsuarios().setVisible(true);
    }//GEN-LAST:event_manageActionPerformed

    private void capturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capturistaActionPerformed
        new Capturista().setVisible(true);
    }//GEN-LAST:event_capturistaActionPerformed

    private void creativityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creativityActionPerformed
        new Inventario().setVisible(true);
    }//GEN-LAST:event_creativityActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acerca;
    private javax.swing.JButton acercaDe;
    private javax.swing.JButton capturista;
    private javax.swing.JLabel crear;
    private javax.swing.JButton creativity;
    private javax.swing.JLabel gestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JButton manage;
    private javax.swing.JLabel panelCap;
    private javax.swing.JLabel panelTec;
    private javax.swing.JLabel regi;
    private javax.swing.JButton register;
    private javax.swing.JButton tecnico;
    // End of variables declaration//GEN-END:variables
}
