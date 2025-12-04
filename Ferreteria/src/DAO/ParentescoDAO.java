package DAO;

import Clases.ConexionBD;
import Clases.Parentesco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ParentescoDAO {

    public boolean insertarParentesco(Parentesco parentesco) throws Exception {
        String sql = "INSERT INTO parentesco(id_parentesco, nombre) VALUES(?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, parentesco.getIdParentesco());
            pst.setString(2, parentesco.getNombre()); 

            return pst.executeUpdate() > 0;
        }
    }
    
    public List<Parentesco> obtenerParentescos() throws Exception {
        String sql = "SELECT id_parentesco, nombre FROM parentesco";
        List<Parentesco> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Parentesco parentesco = new Parentesco(
                    rs.getInt("id_parentesco"),
                    rs.getString("nombre")
                );
                lista.add(parentesco);
            }
        }
        return lista;
    }

    public boolean actualizarParentesco(Parentesco parentesco) throws Exception {
        String sql = "UPDATE parentesco SET nombre = ? WHERE id_parentesco = ?";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, parentesco.getNombre()); 
            pst.setInt(2, parentesco.getIdParentesco());

            return pst.executeUpdate() > 0;
        }
    }

    public int obtenerUltimoIdParentesco() throws Exception {
        String sql = "SELECT id_parentesco FROM parentesco ORDER BY id_parentesco DESC LIMIT 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_parentesco");
            }
        }
        return 0; 
    }
    
    public Clases.Parentesco obtenerParentescoPorId(int id) throws Exception {
        String sql = "SELECT * FROM parentesco WHERE id_parentesco = ?";
        try (java.sql.Connection con = Clases.ConexionBD.getConexion();
             java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setInt(1, id);
            java.sql.ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                return new Clases.Parentesco(
                    rs.getInt("id_parentesco"),
                    rs.getString("nombre")
                );
            }
        }
        return null;
    }
}
