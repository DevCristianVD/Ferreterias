package DAO;

import Clases.ConexionBD;
import Clases.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarcaDAO {

    public int obtenerUltimoIdMarca() throws Exception {
        String sql = "SELECT id_marca FROM marca ORDER BY id_marca DESC LIMIT 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_marca");
            }
        }
        return 0; 
    }

    public boolean insertarMarca(Marca marca) throws Exception {
        String sql = "INSERT INTO marca(id_marca, nombre) VALUES(?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, marca.getIdMarca());
            pst.setString(2, marca.getNombre());

            return pst.executeUpdate() > 0;
        }
    }

    public boolean actualizarMarca(Marca marca) throws Exception {
        String sql = "UPDATE marca SET nombre = ? WHERE id_marca = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, marca.getNombre());
            pst.setInt(2, marca.getIdMarca());

            return pst.executeUpdate() > 0;
        }
    }

    public List<Marca> obtenerMarcas() throws Exception {
        String sql = "SELECT * FROM marca";
        List<Marca> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Marca marca = new Marca(
                    rs.getInt("id_marca"),
                    rs.getString("nombre")
                );
                lista.add(marca);
            }
        }
        return lista;
    }
     public List<Marca> ObtenerMarcas() throws Exception {
        String sql = "SELECT id_marca, nombre FROM marca";
        List<Marca> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Marca marca = new Marca(
                    rs.getInt("id_marca"),
                    rs.getString("nombre")
                );
                lista.add(marca);
            }
        }
        return lista; 
    }
}
