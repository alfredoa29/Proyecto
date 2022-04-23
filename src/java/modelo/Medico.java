package modelo;

import java.sql.Date;


public class Medico {
    
    private int idMedico;
    private String claveMedico, nombreMedico, apellidoMedico, frecuenciaMedico, presentacionMedico, rutaImagen;
    private Date horarioMedico;
    private Double cobroMedico;
    
    //Constructor de la clase Médico
    public Medico(int idMedico, String claveMedico, String nombreMedico, String apellidoMedico, Date horarioMedico, String frecuenciaMedico, String presentacionMedico, Double cobroMedico, String rutaImagen) {
        this.idMedico = idMedico;
        this.claveMedico = claveMedico;
        this.nombreMedico = nombreMedico;
        this.apellidoMedico = apellidoMedico;
        this.horarioMedico = horarioMedico;
        this.frecuenciaMedico = frecuenciaMedico;
        this.presentacionMedico = presentacionMedico;
        this.cobroMedico = cobroMedico;
        this.rutaImagen = rutaImagen;
    }

    public Medico() {

    }

    //Getters y Setters

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getClaveMedico() {
        return claveMedico;
    }

    public void setClaveMedico(String claveMedico) {
        this.claveMedico = claveMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }
    
    public Date getHorarioMedico() {
        return horarioMedico;
    }

    public void setHorarioMedico(Date horarioMedico) {
        this.horarioMedico = horarioMedico;
    }

    public String getFrecuenciaMedico() {
        return frecuenciaMedico;
    }

    public void setFrecuenciaMedico(String frecuenciaMedico) {
        this.frecuenciaMedico = frecuenciaMedico;
    }

    public String getPresentacionMedico() {
        return presentacionMedico;
    }

    public void setPresentacionMedico(String presentacionMedico) {
        this.presentacionMedico = presentacionMedico;
    }

    public Double getCobroMedico() {
        return cobroMedico;
    }

    public void setCobroMedico(Double cobroMedico) {
        this.cobroMedico = cobroMedico;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
