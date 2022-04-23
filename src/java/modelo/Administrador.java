package modelo;

public class Administrador {
    private int idAdministrador;
    private String claveAdministrador;
    
    //Constructor de la clase Administrador
    public Administrador(int idAdministrador, String claveAdministrador) {
        this.idAdministrador = idAdministrador;
        this.claveAdministrador = claveAdministrador;
    }

    public Administrador() {

    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getClaveAdministrador() {
        return claveAdministrador;
    }

    public void setClaveAdministrador(String claveAdministrador) {
        this.claveAdministrador = claveAdministrador;
    }
    
}
