package DAO;

import Clases.ConexionBD;
import Clases.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EmpleadoDAO {

    public int obtenerUltimoIdEmpleado() throws Exception {
        String sql = "SELECT id_empleado FROM empleado ORDER BY id_empleado DESC LIMIT 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_empleado");
            }
        }
        return 0; 
    }
    public boolean insertarEmpleado(Empleado empleado) throws Exception {
        String sql = "INSERT INTO empleado(id_empleado, nombre, primer_apellido, segundo_apellido, telefono, " +
                     "fecha_nacimiento, domicilio, numero_casa, localidad, horario, fecha_ingreso, " +
                     "nombre_contacto, id_parentesco, telefonoc) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, empleado.getIdEmpleado());
            pst.setString(2, empleado.getNombre());
            pst.setString(3, empleado.getPrimerApellido());
            pst.setString(4, empleado.getSegundoApellido());
            pst.setString(5, empleado.getTelefono());
            pst.setString(6, empleado.getFechaNacimiento());
            pst.setString(7, empleado.getDomicilio());
            pst.setString(8, empleado.getNumeroCasa());
            pst.setString(9, empleado.getLocalidad());
            pst.setString(10, empleado.getHorario());
            pst.setString(11, empleado.getFechaIngreso());
            pst.setString(12, empleado.getNombreContacto());
            pst.setString(13, empleado.getParentesco());
            pst.setString(14, empleado.getTelefonoContacto());

            return pst.executeUpdate() > 0;
        }
    }
    
    public List<Empleado> obtenerEmpleados() throws Exception {
        // Consulta SQL para concatenar nombre, primer_apellido y segundo_apellido
        String sql = "SELECT id_empleado, " +
                     "CONCAT(nombre, ' ', primer_apellido, ' ', segundo_apellido) AS nombre_completo, " +
                     "telefono, horario " +
                     "FROM empleado";

        List<Empleado> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Empleado empleado = new Empleado(
                    rs.getInt("id_empleado"), 
                    rs.getString("nombre_completo"), 
                    rs.getString("telefono"), 
                    rs.getString("horario"));
                lista.add(empleado); // Agregar el empleado a la lista
            }
        }
        return lista; // Retornar la lista de empleados
    }
}

