
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ArticulosDao {
    Conexion cn = new Conexion ();
    Connection con; 
    PreparedStatement ps; 
    ResultSet rs; 
    
    public boolean registrar(Articulos art){
        String sql = "INSERT INTO articulo (Equipo, Nombre, Marca, Modelo, Serie, Cantidad) VALUES (?,?,?,?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, art.getEquipo());
            ps.setString(2, art.getNombre());
            ps.setString(3, art.getMarca());
            ps.setString(4, art.getModelo());
            ps.setString(5, art.getSerie());
            ps.setInt(6, art.getCantidad());
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaArticulos(String valor) {
        List<Articulos> listaArt = new ArrayList();
        String sql = "SELECT * FROM articulo ORDER BY Status ASC"; 
        String buscar = "SELECT * FROM articulo WHERE Equipo LIKE '%"+valor+"%' OR Nombre LIKE '%"+valor+"%' ";
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
                Articulos art = new Articulos();
                art.setID(rs.getInt("ID"));
                art.setEquipo(rs.getString("Equipo"));
                art.setNombre(rs.getString("Nombre"));
                art.setMarca(rs.getString("Marca"));
                art.setModelo(rs.getString("Modelo"));
                art.setSerie(rs.getString("Serie"));
                art.setCantidad(rs.getInt("Cantidad"));
                art.setStatus(rs.getString("Status"));
                listaArt.add(art);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaArt;
    }
    
    public boolean modificar(Articulos art){
        String sql = "UPDATE articulo SET Equipo = ?, Nombre = ?, Marca = ?, Modelo = ?, Serie = ?, Cantidad = ? WHERE ID = ?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, art.getEquipo());
            ps.setString(2, art.getNombre());
            ps.setString(3, art.getMarca());
            ps.setString(4, art.getModelo());
            ps.setString(5, art.getSerie());
            ps.setInt(6, art.getCantidad());
            ps.setInt(7, art.getID());
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
   public boolean accion(String Status, int ID) {
        String sql = "UPDATE articulo SET Status = ? WHERE ID = ?";
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
