package DAO;

import Clases.ConexionBD;
import Clases.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FacturaDAO {

    public boolean insertarFactura(Factura factura) throws Exception {
        String sql = "INSERT INTO facturas (id_factura, nombre_cliente, fecha_emision, rfc, correo, fecha_compra, id_venta, total) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, factura.getIdFactura());
            pst.setString(2, factura.getNombreCliente());
            pst.setString(3, factura.getFechaEmision());
            pst.setString(4, factura.getRfc());
            pst.setString(5, factura.getCorreo());
            pst.setString(6, factura.getFechaCompra());
            pst.setInt(7, factura.getIdVenta());
            pst.setDouble(8, factura.getTotal());

            return pst.executeUpdate() > 0;
        }
    }
    
    public int obtenerUltimoIdFactura() throws Exception {
        String sql = "SELECT id_factura FROM facturas ORDER BY id_factura DESC LIMIT 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_factura");
            }
        }
        return 0; 
    }


    public List<Factura> obtenerFacturas() throws Exception {
        String sql = "SELECT id_factura, nombre_cliente, fecha_emision, rfc, correo, fecha_compra, id_venta, total FROM facturas";
        List<Factura> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Factura factura = new Factura(
                    rs.getInt("id_factura"),
                    rs.getString("nombre_cliente"),
                    rs.getString("fecha_emision"),
                    rs.getString("rfc"),
                    rs.getString("correo"),
                    rs.getString("fecha_compra"),
                    rs.getInt("id_venta"),
                    rs.getDouble("total")
                );
                lista.add(factura);
            }
        }
        return lista;
    }
}

