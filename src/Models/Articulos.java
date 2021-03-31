
package Models;

public class Articulos {
    private int ID;
    private String Equipo; 
    private String Nombre; 
    private String Marca; 
    private String Modelo; 
    private String Serie; 
    private int Cantidad;
    private String Status;
    
    public Articulos(){
        
    }

    public Articulos(int ID, String Equipo, String Nombre, String Marca, String Modelo, String Serie, int Cantidad, String Status) {
        this.ID = ID;
        this.Equipo = Equipo;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Serie = Serie;
        this.Cantidad = Cantidad;
        this.Status = Status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
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
