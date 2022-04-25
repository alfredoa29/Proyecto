package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdministradorDAO {
    
    Connection conexion;
    
    //Constructor de la clase AdministradorDAO
    public AdministradorDAO() {
        Conexion con = new Conexion();
        conexion   = con.getConexion();
    }
    
    public List<Medico> listaMedicos() {
        /*Procedimiento que guarda en una lista los médicos que se
          encuentren guardados en la base de datos.
          Entradas: Ninguna
          Salidas: una lista con los médicos
        */
        
        PreparedStatement ps;
        ResultSet rs;
        List<Medico> listaMedicos = new ArrayList<>();
        
        //Los procedimientos que utilicen querys de bases de datos necesitan try catch
        try {
            ps = conexion.prepareStatement("Select * from medico");
            rs = ps.executeQuery();
            while(rs.next()) {
                int idMedico = rs.getInt("id_medico");
                String claveMedico = rs.getString("clave_medico");
                String nombreMedico = rs.getString("nombre_medico");
                String apellidoMedico = rs.getString("apellido_medico");
                Date horarioMedico = rs.getDate("horario_medico");
                String frecuenciaMedico = rs.getString("frecuencia_medico");
                String presentacionMedico = rs.getString("presentacion_medico");
                Double cobroMedico = rs.getDouble("cobro_medico");
                String rutaImagen = rs.getString("ruta_imagen");
                
                Medico medico = new Medico(idMedico, claveMedico, nombreMedico, apellidoMedico, horarioMedico, frecuenciaMedico, presentacionMedico, cobroMedico, rutaImagen);
                listaMedicos.add(medico);
            }
            return listaMedicos;
            
        } catch(SQLException e) {
            System.out.println("No se encontró ningún medico: " + e.toString());
            return null;
        }
    }
    
    public List<Especialidad> listaEspecialidades() {
        List<Especialidad> list = new LinkedList<>();
        try {

        PreparedStatement ps;
        ResultSet rs;
        ps = conexion.prepareStatement("Select * from especialidad");
          rs = ps.executeQuery();
            while (rs.next()){
                Especialidad especialidad = new Especialidad();
                especialidad.setIdEspecialidad(rs.getInt("id_especialidad"));
                especialidad.setNombreEspecialidad(rs.getString("nombre_especialidad"));
                list.add(especialidad);

            }
    } catch(SQLException e) {
        System.out.println("No se encontró ningúna  especialidad: " + e.toString());
        return null;
    }
        /*
        Procedimiento que guarda las especialidades de los medicos en una lista
        para mostrarla en la pantalla en una tabla.
        Entradas: Ninguna
        Salidas: Una lista de las especialidades de los médicos
        */
        return list;
    }
    
    public void registrarEspecialidad(int idEspecialidad, String nombreEspecialidad) throws SQLException {
        try{

        PreparedStatement ps = conexion.prepareStatement("INSERT INTO especialidad(id_especialidad, nombre_especialidad) VALUES(?,?)");
        ps.setString(1, String.valueOf(idEspecialidad));
        ps.setString(2,nombreEspecialidad);
        ps.executeUpdate();
    }catch(SQLException e) {
        System.out.println("No se guardo  la espcialidad: " + e.toString());

    }
        /*
        Procedimiento que registra nuevas especialidades con las que los médicos
        puedan trabajar
        Entradas: un entero con el id de la especialidad y un string con el nombre
        de la especialidad.
        Salidas: Ninguna
        
        -- Este procedimiento inserta los datos de la especialidad si no la encuentra
        en la tabla de especialidad.
        */
    }

    //no estoy seguro de esta
    public List<Ubicacion> listaUbicaciones() {
        List<Ubicacion> list = new LinkedList<>();
        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = conexion.prepareStatement("Select * from ubicacion");
            rs = ps.executeQuery();
            while (rs.next()){
                Ubicacion ubicacion = new Ubicacion();
                ubicacion.setIdUbicacion(rs.getInt("id_ubicacion"));
                ubicacion.setCiudad(rs.getString("ciudad"));
                list.add(ubicacion);

            }
        } catch(SQLException e) {
            System.out.println("No se encontró ningúna  ciudad: " + e.toString());
            return null;
        }

        /*
        Procedimiento que guarda las ubicaciones de atención de los médicos en
        una lista para luego mostrarla en una tabla.
        Entradas: Ninguna
        Salidas: Una lista con las ubicaciones de atención de los médicos.
        */
        
        return list;
    }
    
    public void registrarUbicacion(int idUbicacion, String nombreUbicacion) {


        try{

            PreparedStatement ps = conexion.prepareStatement("INSERT INTO ubicacion(id_ubicacion, ciudad) VALUES(?,?)");
            ps.setString(1, String.valueOf(idUbicacion));
            ps.setString(2,nombreUbicacion);
            ps.executeUpdate();
        }catch(SQLException e) {
            System.out.println("No se guardo  la ubicacion: " + e.toString());

        }
        /*
        Procedimiento que registra una nueva ubicacion en la que los médicos
        puedan trabajar
        Entradas: un entero con el id de la ubicacion y un string con el nombre
        de la ubicacion.
        Salidas: Ninguna
        
        -- Este procedimiento inserta los datos de la ubicacion si no la encuentra
        en la tabla de Ubicacion.
        */
    }
    
    
    public boolean iniciarSesion(int idAdministrador, String claveAdministrador) {
        boolean  sesion = false;
        try {
            List<Administrador> list = new LinkedList<>();

            PreparedStatement ps;
            ResultSet rs;
            ps = conexion.prepareStatement("Select * from administrador");
            rs = ps.executeQuery();
            while (rs.next()){
                Administrador administrador = new Administrador();
                administrador.setIdAdministrador(rs.getInt("id_administador"));
                administrador.setClaveAdministrador(rs.getString("clave_administrador"));
                list.add(administrador);

            }
            for(Administrador admin: list){
                    if(admin.getIdAdministrador() == idAdministrador && admin.getClaveAdministrador().equals(claveAdministrador)){
                        sesion = true;
                    }
            }
        } catch(SQLException e) {
            System.out.println("No se encontró ningúna  admin en la dataBase u otro problema: " + e.toString());
            return sesion;
        }


        /*
        Procedimiento para validar el inicio de sesión de un administrador por
        medio de la identificación y clave dadas
        Entradas: un entero id de admin y un string de clave de admin
        Salidas: true si el administrador existe, false en otro caso.
        */
        return sesion;
    }
    
    
}
