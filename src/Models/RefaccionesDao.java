
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RefaccionesDao {
    Conexion cn = new Conexion ();
    Connection con; 
    PreparedStatement ps; 
    ResultSet rs; 
    
    public boolean registrar(Refacciones ref){
        String sql = "INSERT INTO refacciones (Nombre, Parte, Marca, Descripcion, Cantidad) VALUES (?,?,?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ref.getNombre());
            ps.setString(2, ref.getParte());
            ps.setString(3, ref.getMarca());
            ps.setString(4, ref.getDescripcion());
            ps.setInt(5, ref.getCantidad());
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaRefacciones(String valor) {
        List<Refacciones> listaRef = new ArrayList();
        String sql = "SELECT * FROM refacciones ORDER BY Status ASC"; 
        String buscar = "SELECT * FROM refacciones WHERE Nombre LIKE '%"+valor+"%' OR Parte LIKE '%"+valor+"%' ";
        try{
            con = cn.getConexion();
            if (valor.equalsIgnoreCase("")) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            }else {
                ps = con.prepareStatement(buscar);
                rs = ps.executeQuery();
            }
            
            while(rs.next()) {
                Refacciones ref = new Refacciones();
                ref.setID(rs.getInt("ID"));
                ref.setNombre(rs.getString("Nombre"));
                ref.setParte(rs.getString("Parte"));
                ref.setMarca(rs.getString("Marca"));
                ref.setDescripcion(rs.getString("Descripcion"));
                ref.setCantidad(rs.getInt("Cantidad"));
                ref.setStatus(rs.getString("Status"));
                listaRef.add(ref);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaRef;
    }
    
    public boolean modificar(Refacciones ref){
        String sql = "UPDATE refacciones SET Nombre = ?, Parte = ?, Marca = ?, Descripcion = ?, Cantidad = ? WHERE ID = ?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ref.getNombre());
            ps.setString(2, ref.getParte());
            ps.setString(3, ref.getMarca());
            ps.setString(4, ref.getDescripcion());
            ps.setInt(5, ref.getCantidad());
            ps.setInt(6, ref.getID());
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
   public boolean accion(String Status, int ID) {
        String sql = "UPDATE refacciones SET Status = ? WHERE ID = ?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, Status);
            ps.setInt(2, ID);
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    } 
    
}
