package config;

import modelo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Conexion {
    
    //Procedimiento para conectar con la base de datos mysql
    public Connection getConexion() {
        
        try {
            
            //Formato: (URL solo cambiarle el nombre a la base de datos, usuario, contraseña)
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdproyecto", "root", "123456");
            return conexion;
        } catch (SQLException e) {
            System.out.println("No se encontró la base de datos: " + e.toString());
            return null;
        }
    }

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

        if (administradorDAO.iniciarSesion(11722056, "alfredoa29") == true){
            System.out.println("se encontro usuario :");
        } else
        {
            System.out.println(" NO se encontro usuario :");
        }
    }


}
    

