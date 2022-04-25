package config;

import modelo.AdministradorDAO;
import modelo.Especialidad;
import modelo.MedicoDAO;
import modelo.Ubicacion;

import java.util.List;

public class Main {
    public static void main(String[] args)   {

        MedicoDAO medicoDAO = new MedicoDAO();
        //medicoDAO.registrarMedico(22222, "medi1clave", "Juan", "Jimenez");

        AdministradorDAO administradorDAO = new AdministradorDAO();
        //administradorDAO.registrarEspecialidad(101010, "ONCOLOGIA");
        //administradorDAO.registrarUbicacion(121212, "Escazu");

        List<Especialidad> especialidadList = administradorDAO.listaEspecialidades();

        for(Especialidad especialidad: especialidadList){

            System.out.println(especialidad.toString());
        }


        List<Ubicacion> ubicacions = administradorDAO.listaUbicaciones();

        for(Ubicacion ubi: ubicacions){

            System.out.println(ubi.toString());
        }

        if (administradorDAO.iniciarSesion(11110000, "alfre") == true){
            System.out.println("se encontro usuario :");
        } else
        {
            System.out.println(" NO se encontro usuario :");
        }
    }
}
