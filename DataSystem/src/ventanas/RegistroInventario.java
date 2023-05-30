/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Date;
import javax.swing.WindowConstants;

public class RegistroInventario extends javax.swing.JFrame {

    String user;
    public RegistroInventario() {
        initComponents();
        
        user = Login.user;
        
        setSize(410,440);
        setResizable(false);
        this.setTitle("Agregar inventario - Sesión de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon fondo = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon iconoFond = new ImageIcon(fondo.getImage().getScaledInstance(jLabelBack.getWidth(), jLabelBack.getHeight(), Image.SCALE_DEFAULT));
        jLabelBack.setIcon(iconoFond);
        repaint();
    }
    
    @Override
    public Image getIconImage() {
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

        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        referTxt = new javax.swing.JTextField();
        marcaTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cantidadTxt = new javax.swing.JTextField();
        agregarBtn = new javax.swing.JButton();
        jLabelBack = new javax.swing.JLabel();

        registerButton.setBackground(new java.awt.Color(204, 204, 204));
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Inventario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        NombreTxt.setBackground(new java.awt.Color(0, 102, 153));
        NombreTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        NombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreTxt.setBorder(null);
        NombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTxtActionPerformed(evt);
            }
        });
        getContentPane().add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 200, 25));

        referTxt.setBackground(new java.awt.Color(0, 102, 153));
        referTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        referTxt.setForeground(new java.awt.Color(255, 255, 255));
        referTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        referTxt.setBorder(null);
        getContentPane().add(referTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 25));

        marcaTxt.setBackground(new java.awt.Color(0, 102, 153));
        marcaTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        marcaTxt.setForeground(new java.awt.Color(255, 255, 255));
        marcaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        marcaTxt.setBorder(null);
        getContentPane().add(marcaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Referencia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre producto:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sistema creado por Andre S. © ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        cantidadTxt.setBackground(new java.awt.Color(0, 102, 153));
        cantidadTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cantidadTxt.setForeground(new java.awt.Color(255, 255, 255));
        cantidadTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadTxt.setBorder(null);
        getContentPane().add(cantidadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, 25));

        agregarBtn.setBackground(new java.awt.Color(0, 102, 153));
        agregarBtn.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        agregarBtn.setForeground(new java.awt.Color(255, 255, 255));
        agregarBtn.setText("Agregar al inventario");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 200, 30));
        getContentPane().add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTxtActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        String nombre = NombreTxt.getText().trim();
        String refer = referTxt.getText().trim();
        String marca = marcaTxt.getText().trim();
        String cantidad = cantidadTxt.getText().trim();
        long mili = System.currentTimeMillis();
        Date fecha = new Date(mili);

        if (nombre.equals("") || cantidad.equals("") || marca.equals("") || cantidad.equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst1 = cn.prepareStatement("select referencia from inventario where referencia = '"+refer+"'");
                ResultSet rs = pst1.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Referencia ya registrada, por favor dirigirse a la seccion correspondiente");
                    cn.close();
                } else {
                    try {
                        cn.close();

                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst = cn2.prepareStatement("insert into inventario values(?,?,?,?,?,?,?,?,?)");

                        pst.setString(1, "0");
                        pst.setString(2, nombre);
                        pst.setString(3, refer);
                        pst.setInt(4, Integer.parseInt(cantidad));
                        pst.setString(5, marca);
                        pst.setString(6, user);
                        pst.setDate(7, fecha);
                        pst.setDate(8, fecha);
                        pst.setString(9, "");
                        pst.executeUpdate();
                        cn2.close();

                        JOptionPane.showMessageDialog(null, "Registro exitoso");

                        this.dispose();
                    } catch (SQLException e) {
                        System.err.println("Existe un problema de conexion con la base de datos: " + e);
                    }
                }
            } catch (SQLException e) {
                System.err.println("Problema de conexion con la base de datos "+ e);
            }

        }
    }//GEN-LAST:event_agregarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTextField cantidadTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JTextField referTxt;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
