package DAO;

import Clases.ConexionBD;
import Clases.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
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

    /**
     * MODIFICADO: Este método ahora inserta también usuario y contrasena.
     */
    public boolean insertarEmpleado(Empleado empleado) throws Exception {
        // 1. Agregamos las nuevas columnas 'usuario' y 'contrasena' al SQL
        //    (Asumo que los campos en tu BD se llaman así)
        String sql = "INSERT INTO empleado(id_empleado, nombre, primer_apellido, segundo_apellido, telefono, " +
                     "fecha_nacimiento, domicilio, numero_casa, localidad, horario, fecha_ingreso, " +
                     "nombre_contacto, id_parentesco, telefonoc, usuario, contrasena) " + // <-- Campos agregados
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // <-- Dos '?' agregados

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
            pst.setString(15, empleado.getUsuario());
            pst.setString(16, empleado.getContrasena());

            return pst.executeUpdate() > 0;
        }
    }
    
    /**
     * Busca un empleado por usuario y contraseña.
     * Devuelve el objeto Empleado si lo encuentra, o null si no.
     */
    public Empleado validarLogin(String usuario, String contrasena) throws Exception {
        // Consultamos por usuario y contraseña
        String sql = "SELECT * FROM empleado WHERE usuario = ? AND contrasena = ?";
        Empleado emp = null; // Iniciamos el empleado como nulo

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            
            try (ResultSet rs = pst.executeQuery()) {
                // Si rs.next() es verdadero, significa que encontró una coincidencia
                if (rs.next()) {
                emp = new Empleado(); // Creamos un nuevo objeto empleado
                    
                    // Llenamos el objeto con TODOS los datos del empleado
                    emp.setIdEmpleado(rs.getInt("id_empleado"));
                    emp.setNombre(rs.getString("nombre"));
                    emp.setPrimerApellido(rs.getString("primer_apellido"));
                    emp.setSegundoApellido(rs.getString("segundo_apellido"));
                    emp.setTelefono(rs.getString("telefono"));
                    emp.setFechaNacimiento(rs.getString("fecha_nacimiento"));
                    emp.setDomicilio(rs.getString("domicilio"));
                    emp.setNumeroCasa(rs.getString("numero_casa"));
                    emp.setLocalidad(rs.getString("localidad"));
                    emp.setHorario(rs.getString("horario"));
                    emp.setFechaIngreso(rs.getString("fecha_ingreso"));
                    emp.setNombreContacto(rs.getString("nombre_contacto"));
                    emp.setParentesco(rs.getString("id_parentesco")); // Asegúrate que el set sea setParentesco
                    emp.setTelefonoContacto(rs.getString("telefonoc"));
                    emp.setUsuario(rs.getString("usuario"));
                    emp.setContrasena(rs.getString("contrasena"));
                    // ... puedes seguir agregando cualquier otro campo que falte ...
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al validar login: " + e.getMessage());
            throw e; // Lanza la excepción
        }
        
        return emp; // Devuelve el empleado (o null si no se encontró)
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
    
    // --- MÉTODOS PARA ACTUALIZACIÓN ---

    public Clases.Empleado obtenerEmpleadoPorId(int id) throws Exception {
        String sql = "SELECT * FROM empleado WHERE id_empleado = ?";
        try (java.sql.Connection con = Clases.ConexionBD.getConexion();
             java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setInt(1, id);
            java.sql.ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                // Usamos el constructor completo para llenar todo
                return new Clases.Empleado(
                    rs.getInt("id_empleado"),
                    rs.getString("nombre"),
                    rs.getString("primer_apellido"),
                    rs.getString("segundo_apellido"),
                    rs.getString("telefono"),
                    rs.getString("fecha_nacimiento"),
                    rs.getString("domicilio"),
                    rs.getString("numero_casa"),
                    rs.getString("localidad"),
                    rs.getString("horario"),
                    rs.getString("fecha_ingreso"),
                    rs.getString("nombre_contacto"),
                    rs.getString("id_parentesco"), // Ojo con el nombre de columna en tu BD
                    rs.getString("telefonoc"),
                    rs.getString("usuario"),
                    rs.getString("contrasena")
                );
            }
        }
        return null;
    }

    public boolean actualizarEmpleado(Clases.Empleado e) throws Exception {
        // Validamos si se actualiza la contraseña
        boolean cambiarPass = e.getContrasena() != null && !e.getContrasena().isEmpty();
        
        String sql = "UPDATE empleado SET nombre=?, primer_apellido=?, segundo_apellido=?, telefono=?, " +
                     "fecha_nacimiento=?, domicilio=?, numero_casa=?, localidad=?, horario=?, " +
                     "fecha_ingreso=?, nombre_contacto=?, id_parentesco=?, telefonoc=?, usuario=? " +
                     (cambiarPass ? ", contrasena=? " : "") + 
                     "WHERE id_empleado=?";

        try (java.sql.Connection con = Clases.ConexionBD.getConexion();
             java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
            
            int i = 1;
            pst.setString(i++, e.getNombre());
            pst.setString(i++, e.getPrimerApellido());
            pst.setString(i++, e.getSegundoApellido());
            pst.setString(i++, e.getTelefono());
            pst.setString(i++, e.getFechaNacimiento());
            pst.setString(i++, e.getDomicilio());
            pst.setString(i++, e.getNumeroCasa());
            pst.setString(i++, e.getLocalidad());
            pst.setString(i++, e.getHorario());
            pst.setString(i++, e.getFechaIngreso());
            pst.setString(i++, e.getNombreContacto());
            pst.setString(i++, e.getParentesco());
            pst.setString(i++, e.getTelefonoContacto());
            pst.setString(i++, e.getUsuario());
            
            if (cambiarPass) {
                pst.setString(i++, e.getContrasena());
            }
            
            pst.setInt(i, e.getIdEmpleado()); // El ID va al final (WHERE)

            return pst.executeUpdate() > 0;
        }
    }
}