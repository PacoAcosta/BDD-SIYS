package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDao {
    
    Conexion cn = new Conexion ();
    Connection con; 
    PreparedStatement ps; 
    ResultSet rs; 
    
    public Usuarios login(String usuario, String clave){
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";
        Usuarios us = new Usuarios();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            ps.executeQuery();
            rs = ps.executeQuery();
            if (rs.next()) {
                us.setID(rs.getInt("ID"));
                us.setNombre(rs.getString("Nombre"));
                us.setUsuario(rs.getString("Usuario"));
                us.setClave(rs.getString("Clave"));
                us.setRol(rs.getString("Rol"));
                us.setStatus(rs.getString("Status"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
    
    /**
     *
     * @param us
     * @return
     */
    public boolean registrar(Usuarios us){
        String sql = "INSERT INTO usuarios (Nombre, Usuario, Clave, Rol) VALUES (?,?,?,?)";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getUsuario());
            ps.setString(3, us.getClave());
            ps.setString(4, us.getRol());
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaUsuarios(String valor) {
        List<Usuarios> listaUsers = new ArrayList();
        String sql = "SELECT * FROM usuarios ORDER BY Status ASC"; 
        String buscar = "SELECT * FROM usuarios WHERE Usuario LIKE '%"+valor+"%' OR Nombre LIKE '%"+valor+"%' ";
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
                Usuarios us = new Usuarios();
                us.setID(rs.getInt("ID"));
                us.setNombre(rs.getString("Nombre"));
                us.setUsuario(rs.getString("Usuario"));
                us.setRol(rs.getString("Rol"));
                us.setStatus(rs.getString("Status"));
                listaUsers.add(us);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaUsers;
    }
    
    public boolean modificar(Usuarios us){
        String sql = "UPDATE usuarios SET nombre = ?, usuario = ?, rol = ? WHERE ID = ?";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getUsuario());
            ps.setString(3, us.getRol());
            ps.setInt(4, us.getID());
            ps.execute();
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
   public boolean accion(String Status, int ID) {
        String sql = "UPDATE usuarios SET Status = ? WHERE ID = ?";
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
