/* Añadir usuarios */
package Models;

public class Usuarios {

    private int ID;
    private String Nombre;
    private String Usuario;
    private String Clave;
    private String Rol;
    private String Status;

    public Usuarios() {

    }

    public Usuarios(int ID, String Nombre, String Usuario, String Clave, String Rol, String Status) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.Rol = Rol;
        this.Status = Status;
    }

    public int getID(){
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }    
}
