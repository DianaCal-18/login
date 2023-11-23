
package principal;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 
public class frmtable extends javax.swing.JFrame {
// conexion bd 
    Conexion enlace = new Conexion();
    Connection cnn = enlace.conectar();
    
    public frmtable() {
        initComponents();
        setLocationRelativeTo(null);
        mostrar(); // llamando al metodo mostrar
    }
    // metodo para mosntrar los datos en la tabla
    public void mostrar (){
        DefaultTableModel tdatos = new DefaultTableModel();
        tdatos.addColumn("Name");
        tdatos.addColumn("Lastname");
        tdatos.addColumn("Username");
        tdatos.addColumn("Email");
        tdatos.addColumn("PhoneNumber");
        tregistro.setModel(tdatos);
        
        String []datos = new String [5];
        
        try {
            Statement st = cnn.createStatement();
            ResultSet resultado = st.executeQuery("SELECT `nombre`, `apellido`, `usuario`, `telefono`, `correo` FROM `usuarios` ");
            
            while(resultado.next()){
                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                tdatos.addRow(datos);
            }
            
            tregistro.setModel(tdatos);
        
        
        }catch (SQLException e){JOptionPane.showMessageDialog(null, e + " Error en la consulta");}
        
    
        
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tregistro = new javax.swing.JTable();
        btonCREATE = new javax.swing.JToggleButton();
        BtnUPDATE = new javax.swing.JToggleButton();
        BtnDELETE = new javax.swing.JToggleButton();
        BtnLOgOUT = new javax.swing.JToggleButton();
        jREFRESH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setBackground(new java.awt.Color(233, 210, 158));
        jInternalFrame1.setTitle("Registro de Usuarios");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        tregistro.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        tregistro.setModel(new javax.swing.table.DefaultTableModel(
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
        tregistro.setAlignmentX(0.59F);
        tregistro.setAlignmentY(0.59F);
        jScrollPane1.setViewportView(tregistro);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 930, 130));

        btonCREATE.setText("Create");
        btonCREATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonCREATEActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btonCREATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, -1));

        BtnUPDATE.setText("Update");
        BtnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUPDATEActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(BtnUPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 140, -1));

        BtnDELETE.setText("Delete");
        BtnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDELETEActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(BtnDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 130, -1));

        BtnLOgOUT.setText("Log Out");
        BtnLOgOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLOgOUTActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(BtnLOgOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 130, -1));

        jREFRESH.setText("Refresh");
        jREFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREFRESHActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jREFRESH, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 110, -1));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 965, 614));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUPDATEActionPerformed
    String usuarioEditar = JOptionPane.showInputDialog("Ingrese el usuario que desea editar:");

    try {
        if (usuarioEditar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un usuario para editar.");
            return;
        }

        // Buscar el usuario en la base de datos para obtener sus datos actuales
        String queryBuscarUsuario = "SELECT * FROM usuarios WHERE usuario=?";
        PreparedStatement buscarUsuario = cnn.prepareStatement(queryBuscarUsuario);
        buscarUsuario.setString(1, usuarioEditar);

        ResultSet rs = buscarUsuario.executeQuery();

        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "El usuario no existe.");
            return;
        }

        // Obtener los datos actuales del usuario
        String nombreActual = rs.getString("nombre");
        String apellidoActual = rs.getString("apellido");
        String telefonoActual = rs.getString("telefono");
        String correoActual = rs.getString("correo");
        String passwordActual = rs.getString("password");

        // Mostrar los datos actuales y permitir editarlos
        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:", nombreActual);
        String apellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido:", apellidoActual);
        String telefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono:", telefonoActual);
        String correo = JOptionPane.showInputDialog("Ingrese el nuevo correo:", correoActual);
        String password = JOptionPane.showInputDialog("Ingrese la nueva contraseña:", passwordActual);
        String confirmPassword = JOptionPane.showInputDialog("Confirme la nueva contraseña:", passwordActual);

        // Realizar la actualización en la base de datos
        String queryActualizar = "UPDATE usuarios SET nombre=?, apellido=?, password=?, cfmr_password=?, telefono=?, correo=? WHERE usuario=?";
        PreparedStatement actualizar = cnn.prepareStatement(queryActualizar);
        actualizar.setString(1, nombre);
        actualizar.setString(2, apellido);
        actualizar.setString(3, password);
        actualizar.setString(4, confirmPassword);
        actualizar.setString(5, telefono);
        actualizar.setString(6, correo);
        actualizar.setString(7, usuarioEditar);

        int filasActualizadas = actualizar.executeUpdate();
        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(null, "Datos actualizados de manera exitosa!");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro.");
        }

        // Cerrar recursos
        buscarUsuario.close();
        actualizar.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e + " ERROR! No se pudieron actualizar los datos");
    }
    
    }//GEN-LAST:event_BtnUPDATEActionPerformed

    private void btonCREATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonCREATEActionPerformed
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
    String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
    String usuario = JOptionPane.showInputDialog("Ingrese el usuario:");
    String telefono = JOptionPane.showInputDialog("Ingrese el teléfono:");
    String correo = JOptionPane.showInputDialog("Ingrese el correo:");
    String password = JOptionPane.showInputDialog("Ingrese la contraseña:");
    String confirmPassword = JOptionPane.showInputDialog("Confirme la contraseña:");
    
    // Ejemplo de consulta SQL para insertar datos
    String query = "INSERT INTO usuarios (nombre, apellido, usuario, password, cfmr_password, telefono, correo) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    try {
        // comprobar que no haya campos vacios
        if (nombre.isEmpty() || apellido.isEmpty() || usuario.isEmpty() || telefono.isEmpty() || correo.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
            return; // Sale del método si hay campos vacíos
        }
        
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            return; // Sale del método si las contraseñas son diferentes
        }
        
        PreparedStatement guardar = cnn.prepareStatement(query);
        guardar.setString(1, nombre);
        guardar.setString(2, apellido);
        guardar.setString(3, usuario);
        guardar.setString(4, password);
        guardar.setString(5, confirmPassword);
        guardar.setString(6, telefono);
        guardar.setString(7, correo);
        
        int filasInsertadas = guardar.executeUpdate();
        if (filasInsertadas > 0) {
            JOptionPane.showMessageDialog(null, "Datos guardados de manera exitosa!");
           
        } else {
            JOptionPane.showMessageDialog(null, "No se pudieron guardar los datos.");
        }
        
        guardar.close(); // Cierra el PreparedStatement
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e + " ERROR! No se guardaron los datos");
    }
        
    }//GEN-LAST:event_btonCREATEActionPerformed

    private void BtnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDELETEActionPerformed
       String usuarioAEliminar = JOptionPane.showInputDialog("Ingrese el usuario a eliminar:");

    if (usuarioAEliminar != null && !usuarioAEliminar.isEmpty()) {
        try {
            String query = "DELETE FROM usuarios WHERE usuario = ?";
            PreparedStatement eliminar = cnn.prepareStatement(query);
            eliminar.setString(1, usuarioAEliminar);
            eliminar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            mostrar(); // Refrescar la tabla después de eliminar
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un usuario válido a eliminar");
    }
    }//GEN-LAST:event_BtnDELETEActionPerformed

    private void jREFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREFRESHActionPerformed
       mostrar();
    }//GEN-LAST:event_jREFRESHActionPerformed

    private void BtnLOgOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLOgOUTActionPerformed
   this.dispose();
    }//GEN-LAST:event_BtnLOgOUTActionPerformed

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
            java.util.logging.Logger.getLogger(frmtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmtable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnDELETE;
    private javax.swing.JToggleButton BtnLOgOUT;
    private javax.swing.JToggleButton BtnUPDATE;
    private javax.swing.JToggleButton btonCREATE;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton jREFRESH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tregistro;
    // End of variables declaration//GEN-END:variables
}
