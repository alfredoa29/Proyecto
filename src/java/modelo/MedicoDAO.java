package modelo;

import config.Conexion;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author saul2
 */
public class MedicoDAO {
    
    Connection conexion;
    
    //Constructor de la clase MedicoDAO
    public MedicoDAO() {
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    public void registrarMedico(int idMedico, String claveMedico, String nombreMedico, String apellidoMedico) {

        final String INSERT = "insert into medico(id_medico, clave_medico, nombre_medico, apellido_medico) values(?,?,?,?)";
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = conexion.prepareStatement("insert into medico(id_medico, clave_medico, nombre_medico, apellido_medico) values(?,?,?,?)");
            //rs = ps.executeQuery();

                 ps.setString(1, String.valueOf(idMedico));
                 ps.setString(2, claveMedico);
                 ps.setString(3, nombreMedico);
                 ps.setString(4, apellidoMedico);
                    ps.executeUpdate();
                   // conexion.close();

        }catch(SQLException e) {
            System.out.println("No se guardo el medico: " + e.toString());

        }

        /*
        Procedimiento para registrar a un medico con su clave e identificación
        Entradas: un entero id, un string con la clave, un nombre y un apellido
        Salidas: Ninguna
        
        --Este procedimiento guarda los datos y crea al médico, los demás valores
        quedan en null y se actualizan cuando el medico edite su perfil.
        */



    }
    //revisar con cuidado
    public boolean iniciarSesion(int idLogin, String claveLogin) {

        boolean  sesion = false;
        try {
            List<Medico> list = new LinkedList<>();

            PreparedStatement ps;
            ResultSet rs;
            ps = conexion.prepareStatement("Select * from medico");
            rs = ps.executeQuery();
            while (rs.next()){
                Medico medico = new Medico();
                medico.setIdMedico(rs.getInt("id_medico"));
                medico.setClaveMedico(rs.getString("clave_medico"));
                list.add(medico);

            }
            for(Medico medic: list){
                if(medic.getIdMedico() == idLogin && medic.getClaveMedico().equals(claveLogin)){
                    sesion = true;
                }
            }
        } catch(SQLException e) {
            System.out.println("No se encontró ningúna  admin en la dataBase u otro problema: " + e.toString());
            return sesion;
        }
        /*
        Procedimiento para que un medico inicie su sesion
        Entradas: un entero de identificacion y un string con la clave
        Salidas: True si se encuentra el medico, False si no se encuentra
        
        -- Este procedimiento valida que exista la clave y el id en la tabla de
        medicos y si es True, lo envia al perfil, si es False, lo manda a la pantalla
        de registrar.
        */
        
        return sesion;
    }
    
    public Medico mostrarPerfil(int idMedico) {


        /*
        Procedimiento que muestra el perfil del medico que inicio sesion
        Entradas: Id del medico que inicio sesion
        Salidas: Un objeto Medico
        
        -- Este procedimiento hace un select en la tabla medico donde el id sea
        el proporcionado. En el JSP se lee y se mete en columnas los datos del
        médico.
        */
        return null;
    }
    
    public void editarPerfil(String especialidad, String localidad, Date horario, String frecuencia, Double cobro, String presentacion, String rutaImagen) {
        /*
        Procedimiento que se encarga de editar los espacios en el perfil del medico
        Entradas: la especialidad, localidad, horario, frecuencia de citas,
        cobro, presentacion y la ruta de la imagen del médico.
        Salidas: ninguna
        
        -- Este procedimiento obtiene los datos como texto y los convierte a su
        tipo para guardarlo y hacer un update a los campos en la tabla que se
        llenen en la vista.
        */
    }
    
    public List<Cita> listarCitas(int idMedico,boolean estadoCita, String nombrePaciente, String fecha) {
        /*
        Procedimiento que se encarga de listar las citas según los parametros que se le den
        Entradas: Un entero id del medico, un booleano con el estado de la cita,
        un string con el nombre del paciente, un string con el orden de las
        fechas (antiguos-nuevos/nuevos-antiguos).
        Salidas: Una lista de citas con sus datos. En el JSP se pasan a columna
        los datos y se muestran en la vista.
        
        -- En este procedimiento, si un dato es vacío, simplemente no se filtra
        ese parámetro, si ninguno tiene datos, se seleccionan todas las citas del
        medico en cuestión, se tienen que validar los distintos casos.
        */
        return null;
    }
    
    public void confirmarCitas(int idMedico, int idCita, boolean estado) {
        /*
        Procedimiento que se encarga de confirmar o rechazar citas que aún no se
        hayan aceptado.
        Entradas: Un entero indicando el id del medico, 
        otro entero id dela cita a aceptar o rechazar y un
        booleano que indica si se rechaza o se acepta.
        Salidas: Ninguna
        
        -- En este procedimiento se envía el id y se usa true para aceptar la cita
        y realizarle un update al estado de la cita a True. En caso de usar
        false, la cita con ese identificador se tiene que eliminar, usando remove
        en la basee de datos.
        */
    }
    
    public void terminarCita(int idMedico, int idCita){
        /*
        Procedimiento que se encarga de completar una cita cuando ya la realizó.
        Entradas: Un entero indicando el id del medico y otro indicando el id de
        la cita a completar.
        Salidas: Ninguna.
        
        -- Este procedimiento recibe esos datos y realiza un remove en la cita
        con el idCita si el id_medico_FK de esa cita es igual a idMedico.
        */
    }
}
