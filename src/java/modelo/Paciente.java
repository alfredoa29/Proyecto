package modelo;

public class Paciente {
    
    private int idPaciente;
    private String nombrePaciente, apellidoPaciente ,clavePaciente;
    
    //Constructor de la clase Paciente
    public Paciente(int idPaciente, String clavePaciente, String nombrePaciente, String apellidoPaciente) {
        this.idPaciente = idPaciente;
        this.clavePaciente = clavePaciente;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        
    }

    public Paciente() {

    }

    //Getters y Setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getClavePaciente() {
        return clavePaciente;
    }

    public void setClavePaciente(String clavePaciente) {
        this.clavePaciente = clavePaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }
    
}
