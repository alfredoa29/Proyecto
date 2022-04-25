package modelo;


public class Ubicacion {
    
    private int idUbicacion;
    private String ciudad;
    
    //Constructor de la clase Ubicacion.
    public Ubicacion(int idUbicacion, String ciudad) {
        this.idUbicacion = idUbicacion;
        this.ciudad = ciudad;
    }

    public Ubicacion() {

    }

    //Getters y Setters
    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "idUbicacion=" + idUbicacion +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
