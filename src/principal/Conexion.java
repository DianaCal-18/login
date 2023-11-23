
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection cn = null;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/login_bd","root","");
       
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e + " No se pudo realizar la conexion :(");
        }
        
        return cn;
    
    
    
    }
}
