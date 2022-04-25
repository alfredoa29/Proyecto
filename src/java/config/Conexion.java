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




}
    

