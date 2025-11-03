package DAO;

import Clases.ConexionBD;
import Clases.Merma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MermasDAO {

    // Obtener todas las mermas
    public List<Merma> obtenerMermas() throws Exception {
        String sql = "SELECT id_merma, id_producto,nombre, precio_merma, cantidad FROM merma";
        List<Merma> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Merma merma = new Merma(
                    rs.getInt("id_merma"),
                    rs.getInt("id_producto"),
                    rs.getString("nombre"),
                    rs.getDouble("precio_merma"),
                    rs.getDouble("cantidad")
                );
                lista.add(merma);
            }
        }
        return lista;
    }

        
    public boolean insertarMerma(Merma merma) throws Exception {
        String sql = "INSERT INTO merma (id_producto, nombre, precio_merma, cantidad) VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, merma.getIdProducto());
            pst.setString(2, merma.getNombre());
            pst.setDouble(3, merma.getPrecioMerma());
            pst.setDouble(4, merma.getCantidad());

            return pst.executeUpdate() > 0;
        }
    }

    public boolean actualizarMerma(Merma merma) throws Exception {
        String sql = "UPDATE merma SET id_producto = ?, nombre = ?, precio_merma = ?, cantidad = ? WHERE id_merma = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, merma.getIdProducto());
            pst.setString(2, merma.getNombre());
            pst.setDouble(3, merma.getPrecioMerma());
            pst.setDouble(4, merma.getCantidad());
            pst.setInt(5, merma.getIdMerma());

            return pst.executeUpdate() > 0;
        }
    }

}

