package modelo;


public class UbicacionXMedico {
    
    private int idUbicacionUXM, idMedicoUXM;
    
    public UbicacionXMedico(int idUbicacionUXM, int idMedicoUXM) {
        
        this.idUbicacionUXM = idUbicacionUXM;
        this.idMedicoUXM = idMedicoUXM;
    }

    public int getIdUbicacionUXM() {
        return idUbicacionUXM;
    }

    public void setIdUbicacionUXM(int idUbicacionUXM) {
        this.idUbicacionUXM = idUbicacionUXM;
    }

    public int getIdMedicoUXM() {
        return idMedicoUXM;
    }

    public void setIdMedicoUXM(int idMedicoUXM) {
        this.idMedicoUXM = idMedicoUXM;
    }   
}
