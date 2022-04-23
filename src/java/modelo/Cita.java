package modelo;

import java.sql.Date;

/**
 *
 * @author saul2
 */
public class Cita {
    
    private int idCita, idMedicoFK, idPacienteFK;
    private String horaCita;
    private boolean estadoCita;
    private Date fechaCita;
    
    //Constructor de la clase Cita
    public Cita(int idCita, int idMedicoFK, int idPacienteFK, Date fechaCita, String horaCita, boolean estadoCita) {
        this.idCita = idCita;
        this.idMedicoFK = idMedicoFK;
        this.idPacienteFK = idPacienteFK;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.estadoCita = estadoCita;
    }


    //Getters y Setters
    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdMedicoFK() {
        return idMedicoFK;
    }

    public void setIdMedicoFK(int idMedicoFK) {
        this.idMedicoFK = idMedicoFK;
    }

    public int getIdPacienteFK() {
        return idPacienteFK;
    }

    public void setIdPacienteFK(int idPacienteFK) {
        this.idPacienteFK = idPacienteFK;
    }


    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public boolean getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(boolean estadoCita) {
        this.estadoCita = estadoCita;
    }
    
}
