
package Models;

public class Refacciones {
    private int ID;
    private String Nombre;
    private String Parte;
    private String Marca;
    private String Descripcion;
    private int Cantidad;
    private String Status;
    
    public Refacciones() {
        
    }

    public Refacciones(int ID, String Nombre, String Parte, String Marca, String Descripcion, int Cantidad, String Status) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Parte = Parte;
        this.Marca = Marca;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Status = Status;
    }

    public int getID() {
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

    public String getParte() {
        return Parte;
    }

    public void setParte(String Parte) {
        this.Parte = Parte;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
