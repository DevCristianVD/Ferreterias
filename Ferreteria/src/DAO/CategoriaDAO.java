package DAO;

import Clases.ConexionBD;
import Clases.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class CategoriaDAO {

    public int obtenerUltimoIdCategoria() throws Exception {
        String sql = "SELECT id_categoria FROM categoria ORDER BY id_categoria DESC LIMIT 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_categoria");
            }
        }
        return 0;
    }

    public boolean insertarCategoria(Categoria categoria) throws Exception {
        String sql = "INSERT INTO categoria(id_categoria, nombre) VALUES(?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, categoria.getIdCategoria());
            pst.setString(2, categoria.getNombre());

            return pst.executeUpdate() > 0;
        }
    }

    public List<Categoria> obtenerCategorias() throws Exception {
        String sql = "SELECT * FROM categoria";
        List<Categoria> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Categoria categoria = new Categoria(
                    rs.getInt("id_categoria"),
                    rs.getString("nombre")
                );
                lista.add(categoria);
            }
        }
        return lista;
    }

    public boolean actualizarCategoria(Categoria categoria) throws Exception {
    String sql = "UPDATE categoria SET nombre = ? WHERE id_categoria = ?";
    try (Connection con = ConexionBD.getConexion();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, categoria.getNombre());
        pst.setInt(2, categoria.getIdCategoria());

        // Ejecutar la consulta
        return pst.executeUpdate() > 0;
    } catch (SQLException e) {
        throw new Exception("Error al actualizar categoría: " + e.getMessage());
    }
}  

    public List<Categoria> ObtenerCategorias() throws Exception {
        String sql = "SELECT id_categoria, nombre FROM categoria";
        List<Categoria> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Categoria categoria = new Categoria(
                    rs.getInt("id_categoria"),
                    rs.getString("nombre")
                );
                lista.add(categoria);
            }
        }
        return lista; 
    }
}
    
