
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductosDao {
    Conexion cn = new Conexion ();
    Connection con; 
    PreparedStatement ps; 
    ResultSet rs; 
    
    public boolean registrar(Productos prod){
        String sql = "INSERT INTO productos (Nombre, Parte, Marca, Descripcion, Cantidad) VALUES (?,?,?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setString(2, prod.getParte());
            ps.setString(3, prod.getMarca());
            ps.setString(4, prod.getDescripcion());
            ps.setInt(5, prod.getCantidad());
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaProductos(String valor) {
        List<Productos> listaProd = new ArrayList();
        String sql = "SELECT * FROM productos ORDER BY Status ASC"; 
        String buscar = "SELECT * FROM productos WHERE Nombre LIKE '%"+valor+"%' OR Parte LIKE '%"+valor+"%' ";
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
                Productos prod = new Productos();
                prod.setID(rs.getInt("ID"));
                prod.setNombre(rs.getString("Nombre"));
                prod.setParte(rs.getString("Parte"));
                prod.setMarca(rs.getString("Marca"));
                prod.setDescripcion(rs.getString("Descripcion"));
                prod.setCantidad(rs.getInt("Cantidad"));
                prod.setStatus(rs.getString("Status"));
                listaProd.add(prod);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaProd;
    }
    
    public boolean modificar(Productos prod){
        String sql = "UPDATE productos SET Nombre = ?, Parte = ?, Marca = ?, Descripcion = ?, Cantidad = ? WHERE ID = ?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setString(2, prod.getParte());
            ps.setString(3, prod.getMarca());
            ps.setString(4, prod.getDescripcion());
            ps.setInt(5, prod.getCantidad());
            ps.setInt(6, prod.getID());
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
   public boolean accion(String Status, int ID) {
        String sql = "UPDATE productos SET Status = ? WHERE ID = ?";
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
