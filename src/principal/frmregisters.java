
package principal;

import java.sql.*;
import javax.swing.JOptionPane;

public class frmregisters extends javax.swing.JFrame {
    // conexion a bd
    Conexion enlace = new Conexion();
    Connection cnn = enlace.conectar();
    
    public frmregisters() {
     
        initComponents();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        txtconfipassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        BtonRegistrar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(15, 15, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 15, 92));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 141, 219));
        jLabel1.setText("Sign up now!!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 220, -1));

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(225, 158, 10))); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 290, -1));

        txtlastname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtlastname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(225, 158, 10))); // NOI18N
        jPanel2.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 290, -1));

        txtuser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtuser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(225, 158, 10))); // NOI18N
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 290, -1));

        txtemail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(225, 158, 10))); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 290, -1));

        txtphone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtphone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(225, 158, 10))); // NOI18N
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        jPanel2.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 290, -1));

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(225, 158, 10))); // NOI18N
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 290, -1));

        txtconfipassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtconfipassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(225, 158, 10))); // NOI18N
        txtconfipassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfipasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtconfipassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 290, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/concepto.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 480, -1));

        BtonRegistrar.setBackground(new java.awt.Color(92, 141, 219));
        BtonRegistrar.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        BtonRegistrar.setForeground(new java.awt.Color(15, 15, 92));
        BtonRegistrar.setSelected(true);
        BtonRegistrar.setText("Create Account");
        BtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(BtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 720, 240, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 900, 840));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vector_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-95, 27, 1350, 1050));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vector 2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtconfipasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfipasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfipasswordActionPerformed

    // boton de crear cruenta/registrarse
    private void BtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonRegistrarActionPerformed
        
        try {
            // comprobar que no haya campos vacios
            if (txtname.getText().isEmpty() || 
            txtlastname.getText().isEmpty() || 
            txtuser.getText().isEmpty() || 
            txtpassword.getText().isEmpty() || 
            txtconfipassword.getText().isEmpty() || 
            txtphone.getText().isEmpty() || 
            txtemail.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
            return; // sale del mtodo si hay campos vacíos
        }
            // verificar las contraseñas
        if (!txtpassword.getText().equals(txtconfipassword.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            return; // sale del metodo si las contraseñas son diferentes
        }
        // insertar los datos a la bd
            PreparedStatement guardar = cnn.prepareStatement("INSERT INTO usuarios (nombre,apellido,usuario,password,cfmr_password,telefono,correo) VALUES (?,?,?,?,?,?,?)");
            guardar.setString(1, txtname.getText());
            guardar.setString(2, txtlastname.getText());
            guardar.setString(3, txtuser.getText());
            guardar.setString(4, txtpassword.getText());
            guardar.setString(5, txtconfipassword.getText());
            guardar.setString(6, txtphone.getText());
            guardar.setString(7, txtemail.getText());
            guardar.executeUpdate();
            limpiar (); // metodo para limpiar los campos
            JOptionPane.showMessageDialog(null, "Datos guardados de manera exitosa!");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e + " ERROR! No se guardaron los datos");
        }
        
    }//GEN-LAST:event_BtonRegistrarActionPerformed

    // metodo para borrar los datos del campo cuando hayan sido ingresados 
    void limpiar (){
        txtname.setText("");
        txtlastname.setText("");
        txtuser.setText("");
        txtpassword.setText("");
        txtconfipassword.setText("");
        txtphone.setText("");
        txtemail.setText(""); 
    }
    
    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed


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
            java.util.logging.Logger.getLogger(frmregisters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmregisters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmregisters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmregisters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmregisters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtconfipassword;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
