package modelo;

public class EspecialidadXMedico {
    
    private int idEspecialidadEXM, idMedicoEXM;
    
    public EspecialidadXMedico(int idEspecialidadEXM, int idMedicoEXM) {
        this.idEspecialidadEXM = idEspecialidadEXM;
        this.idMedicoEXM = idMedicoEXM;
    }

    public int getIdEspecialidadEXM() {
        return idEspecialidadEXM;
    }

    public void setIdEspecialidadEXM(int idEspecialidadEXM) {
        this.idEspecialidadEXM = idEspecialidadEXM;
    }

    public int getIdMedicoEXM() {
        return idMedicoEXM;
    }

    public void setIdMedicoEXM(int idMedicoEXM) {
        this.idMedicoEXM = idMedicoEXM;
    }
}
