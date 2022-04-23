package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author saul2
 */
public class PacienteDAO {
    
    Connection conexion;
    
    //Constructor de la clase PacienteDAO
    public PacienteDAO() {
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    public void registrarPaciente(int idPaciente, String clavePaciente, String claveConfirmar, String nombrePaciente, String apellidoPaciente){
        /*
        Procedimiento para registrar un nuevo paciente por medio de un insert a
        la base de datos.
        Entradas: Un id de paciente, un string con la clave y otro string con la misma
        clave para confirmar que no hayan errores, el nombre y apellido del paciente.
        Salidas: ninguna, solo inserta en la base de datos los
        
        --Este procedimiento consiste en recibir los datos y validar que el id no exista,
        además de validar que las claves sean iguales, el nombre y apellido solo se guardan.
        */
    }
    
    public boolean iniciarSesion(int idLogin, String claveLogin) {

        boolean  sesion = false;
        try {
            List<Paciente> list = new LinkedList<>();

            PreparedStatement ps;
            ResultSet rs;
            ps = conexion.prepareStatement("Select * from paciente");
            rs = ps.executeQuery();
            while (rs.next()){
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("id_paciente"));
                paciente.setClavePaciente(rs.getString("clave_paciente"));
                list.add(paciente);

            }
            for(Paciente paci: list){
                if(paci.getIdPaciente() == idLogin && paci.getClavePaciente().equals(claveLogin)){
                    sesion = true;
                }
            }
        } catch(SQLException e) {
            System.out.println("No se encontró ningúna  admin en la dataBase u otro problema: " + e.toString());
            return sesion;
        }
        /*
        Procedimiento que valida el inicio de sesion de un paciente
        Entradas: Un id de login y una clave de acceso
        Salidas: True en caso de que el usuario exista, False en caso de que no
        
        -- Este procedimiento funciona con el true y el false, hace un select en
        la tabla y si encuentra el paciente, es true, manda
        a la página principal de un paciente, si es false, lo envía a la página 
        de registro.
        */
        return true;
    }
    
    public List<Medico> buscarMedicos(String especialidad, String ubicacion) {
        /*
        Procedimiento que sirve para buscar a los medicos según la especialidad
        y la ubicación.
        Entradas: un string especialidad y un string con la ubicación
        Salidas: Una lista de médicos que cumplpen con los criterios
        
        -- Esta función busca con un select en la base y guarda en la lista los
        que cumplan con lo que se busca.
        */
        return null;
    }
    
    public List<Cita> consultaHorario(int idMedico) {
        /*
        Procedimiento que sirve para consultar las citas disponibles de un medico
        seleccionado.
        Entradas: Un entero de identificacion de un médico
        Salidas: Una lista con las fechas de las citas disponibles
        
        --Este procedimiento busca dentro de las citas disponibles el identificador del médico
        seleccionado y las guarda en una lista.
        */
        return null;
    }
    
    public void agendarCita(int idCita) {
        /*
        Procedimiento que sirve para que un paciente agende una cita disponible.
        Entradas: un identificador de la cita a elegir
        Salidas: Ninguna
        
        --Si la cita está disponible, la agenda y lo lleva a la pagina de iniciar
        sesión o a la de lista de citas.
        Si la cita no está disponible, debe mostrar un mensaje de error y mandarlo
        al inicio.
        */
    }
    
}
