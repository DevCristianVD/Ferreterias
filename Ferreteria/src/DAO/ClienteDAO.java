package DAO;

import Clases.ConexionBD;
import Clases.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {

    /**
     * MODIFICADO: Ahora usa el constructor vacío y los setters.
     * Es más robusto y no depende del orden de los parámetros.
     */
    public Cliente login(String usuario, String contrasena) {
        String sql = "SELECT * FROM cliente WHERE usuario = ? AND contrasena = ?";
        Cliente cliente = null; // Inicia como nulo

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    // --- ESTA ES LA FORMA CORRECTA ---
                    cliente = new Cliente(); // Usa el constructor vacío
                    cliente.setIdCliente(rs.getInt("id_cliente"));
                    cliente.setUsuario(rs.getString("usuario"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setPrimerApellido(rs.getString("primer_apellido"));
                    cliente.setSegundoApellido(rs.getString("segundo_apellido"));
                    cliente.setDomicilio(rs.getString("domicilio"));
                    cliente.setNumero(rs.getString("numero"));
                    cliente.setCp(rs.getString("cp"));
                    cliente.setTelefono(rs.getString("telefono"));
                    cliente.setCorreo(rs.getString("correo"));
                    cliente.setContrasena(rs.getString("contrasena"));
                    // No hay 'rfc' en tu clase Cliente, así que no lo leemos.
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en el login: " + e.getMessage());
        }
        return cliente; // Devuelve el cliente (o null)
    }
    
    public int obtenerUltimoIdCliente() throws Exception {
        String sql = "SELECT id_cliente FROM cliente ORDER BY id_cliente DESC LIMIT 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            
            if (rs.next()) {
                return rs.getInt("id_cliente");
            }
        }
        return 0;
    }

    /**
     * MODIFICADO: Ahora inserta también el 'usuario'.
     */
    public boolean insertarCliente(Cliente cliente) throws Exception {
        // 1. Agregamos 'usuario' al SQL
        String sql = "INSERT INTO cliente(id_cliente, nombre, primer_apellido, segundoApellido, " + 
                     "domicilio, numero, cp, telefono, correo, contrasena, usuario) " + 
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // <-- 11 campos

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setInt(1, cliente.getIdCliente());
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getPrimerApellido());
            pst.setString(4, cliente.getSegundoApellido());
            pst.setString(5, cliente.getDomicilio());
            pst.setString(6, cliente.getNumero());
            pst.setString(7, cliente.getCp());
            pst.setString(8, cliente.getTelefono());
            pst.setString(9, cliente.getCorreo());
            pst.setString(10, cliente.getContrasena());
            
            // 2. Agregamos el 'usuario' que faltaba
            pst.setString(11, cliente.getUsuario());

            return pst.executeUpdate() > 0;
        }
    }
    
    /**
     * MODIFICADO: También usa el constructor vacío y setters.
     */
    public Cliente obtenerClientePorId(int idCliente) throws Exception {
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, idCliente);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Usamos el mismo método que en login()
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setUsuario(rs.getString("usuario")); // Asumiendo que quieres cargarlo
                cliente.setNombre(rs.getString("nombre"));
                cliente.setPrimerApellido(rs.getString("primer_apellido"));
                cliente.setSegundoApellido(rs.getString("segundo_apellido"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setCp(rs.getString("cp"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setContrasena(rs.getString("contrasena"));
                return cliente;
            }
        }
        return null; // Retorna null si no se encuentra el cliente
    }
    
    public boolean actualizarCliente(Clases.Cliente c) throws Exception {
        // Construimos el SQL dinámicamente o validamos la contraseña
        String sql;
        boolean actualizarPass = c.getContrasena() != null && !c.getContrasena().isEmpty();

        if (actualizarPass) {
            sql = "UPDATE cliente SET nombre=?, primer_apellido=?, segundo_apellido=?, " +
                  "domicilio=?, numero=?, cp=?, telefono=?, correo=?, contrasena=? " +
                  "WHERE id_cliente=?";
        } else {
            // Si no escribió contraseña nueva, no actualizamos ese campo
            sql = "UPDATE cliente SET nombre=?, primer_apellido=?, segundo_apellido=?, " +
                  "domicilio=?, numero=?, cp=?, telefono=?, correo=? " +
                  "WHERE id_cliente=?";
        }

        try (java.sql.Connection con = Clases.ConexionBD.getConexion();
             java.sql.PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, c.getNombre());
            pst.setString(2, c.getPrimerApellido());
            pst.setString(3, c.getSegundoApellido());
            pst.setString(4, c.getDomicilio());
            pst.setString(5, c.getNumero());
            pst.setString(6, c.getCp());
            pst.setString(7, c.getTelefono());
            pst.setString(8, c.getCorreo());

            if (actualizarPass) {
                pst.setString(9, c.getContrasena());
                pst.setInt(10, c.getIdCliente());
            } else {
                pst.setInt(9, c.getIdCliente());
            }

            return pst.executeUpdate() > 0;
        }
    }
}