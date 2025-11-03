package DAO;

import Clases.ConexionBD;
import Clases.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    
    /**
     * Verifica las credenciales del usuario en la base de datos.
     * @param usuario El nombre de usuario.
     * @param contrasena La contraseña del usuario.
     * @return Un objeto Cliente si las credenciales son correctas, de lo contrario null.
     */
    public Cliente login(String usuario, String contrasena) {
        // La consulta SQL para buscar al cliente por su usuario y contraseña
        String sql = "SELECT * FROM cliente WHERE usuario = ? AND contrasena = ?";
        
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            
            try (ResultSet rs = pst.executeQuery()) {
                // Si encuentra un resultado, crea y devuelve el objeto Cliente
                if (rs.next()) {
                    return new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("usuario"),
                        rs.getString("nombre"),
                        rs.getString("primer_apellido"),
                        rs.getString("segundo_apellido"),
                        rs.getString("domicilio"),
                        rs.getString("numero"),
                        rs.getString("cp"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("contrasena"),
                        rs.getString("rfc")
                    );
                }
            }
        } catch (SQLException e) {
            // Es buena práctica imprimir el error para depuración
            System.err.println("Error en el login: " + e.getMessage());
        }
        // Si no se encuentra el usuario o hay un error, devuelve null
        return null;
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

    public boolean insertarCliente(Cliente cliente) throws Exception {
        String sql = "INSERT INTO cliente(id_cliente, nombre, primer_apellido, segundo_apellido, domicilio, numero, cp, telefono, correo, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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

            return pst.executeUpdate() > 0;
        }
    }
    
    public Cliente obtenerClientePorId(int idCliente) throws Exception {
    String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
    try (Connection con = ConexionBD.getConexion();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setInt(1, idCliente);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            return new Cliente(
                rs.getInt("id_cliente"),
                rs.getString("nombre"),
                rs.getString("primer_apellido"), // Asegúrate de que el nombre de la columna sea correcto en la base de datos
                rs.getString("segundo_apellido"), // Asegúrate de que el nombre de la columna sea correcto en la base de datos
                rs.getString("domicilio"),
                rs.getString("numero"), // `numero` equivale a esta columna
                rs.getString("cp"),
                rs.getString("telefono"),
                rs.getString("correo"),
                rs.getString("contrasena") // Asegúrate de que esta columna exista en tu tabla
            );
        }
    }
    return null; // Retorna null si no se encuentra el cliente
}


    
}
