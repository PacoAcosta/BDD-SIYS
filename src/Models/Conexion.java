/* Conexión de Java a SQL */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con; 
    public Connection getConexion(){
        try {
            String db = "jdbc:mysql://localhost:3308/Inventario?serverTimezone=UTC"; 
            con = DriverManager.getConnection(db, "root", "");
            return con; 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
}
