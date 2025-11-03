package DAO;

import Clases.ConexionBD;
import Clases.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehiculoDAO {

    public List<Vehiculo> obtenerVehiculos() throws Exception {
        String sql = "SELECT id_vehiculo, modelo, peso_soportado, id_empleado, status FROM vehiculo";
        List<Vehiculo> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Vehiculo vehiculo = new Vehiculo(
                    rs.getInt("id_vehiculo"),
                    rs.getString("modelo"),
                    rs.getDouble("peso_soportado"),
                    rs.getInt("id_empleado"),
                    rs.getString("status")
                );
                lista.add(vehiculo);
            }
        }
        return lista;
    }

    public boolean insertarVehiculo(Vehiculo vehiculo) throws Exception {
        String sql = "INSERT INTO vehiculo (id_vehiculo, modelo, peso_soportado, id_empleado, status) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, vehiculo.getIdVehiculo());
            pst.setString(2, vehiculo.getModelo());
            pst.setDouble(3, vehiculo.getPesoSoportado());
            pst.setInt(4, vehiculo.getIdEmpleado());
            pst.setString(5, vehiculo.getEstatus());

            return pst.executeUpdate() > 0;
        }
    }

    public int obtenerUltimoIdVehiculo() throws Exception {
        String sql = "SELECT id_vehiculo FROM vehiculo ORDER BY id_vehiculo DESC LIMIT 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_vehiculo");
            }
        }
        return 0; 
    }
}
