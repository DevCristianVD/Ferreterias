package DAO;

import Clases.ConexionBD;
import Clases.Pedido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {

    private String url = "jdbc:mysql://localhost:3306/ferreteria";
    private String usuario = "root";
    private String contraseña = "1234";

    public List<Pedido> obtenerPedidos() {
        List<Pedido> listaPedidos = new ArrayList<>();
        String consultaSQL = "SELECT id_pedido, id_vehiculo, id_cliente, CONCAT(domicilio, ' ', numero_casa) AS domicilio_completo, total FROM pedidoencabezado";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement stmt = conexion.prepareStatement(consultaSQL);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdVehiculo(rs.getString("id_vehiculo"));
                pedido.setIdCliente(rs.getString("id_cliente"));
                pedido.setDomicilio(rs.getString("domicilio_completo"));
                pedido.setTotal(rs.getDouble("total"));
                listaPedidos.add(pedido);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaPedidos;
    }
    
    public boolean insertarPedidoEncabezado(int idPedido, int idCliente, double total) throws Exception {
    String sql = "INSERT INTO PedidoEncabezado (id_pedido, id_cliente, total) VALUES (?, ?, ?)";
    try (Connection con = ConexionBD.getConexion();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setInt(1, idPedido);
        pst.setInt(2, idCliente);
        pst.setDouble(3, total);

        return pst.executeUpdate() > 0;
    }
}
    
    public boolean insertarPedidoDetalle(int idPedido, int idProducto, int cantidad, double precio) throws Exception {
    String sql = "INSERT INTO PedidoDetalle (id_pedido, id_producto, cantidad, precio) VALUES (?, ?, ?, ?)";
    try (Connection con = ConexionBD.getConexion();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setInt(1, idPedido);
        pst.setInt(2, idProducto);
        pst.setInt(3, cantidad);
        pst.setDouble(4, precio);

        return pst.executeUpdate() > 0;
    }
}

    public int obtenerUltimoIdPedido() throws Exception {
    String sql = "SELECT id_pedido FROM PedidoEncabezado ORDER BY id_pedido DESC LIMIT 1";
    try (Connection con = ConexionBD.getConexion();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        if (rs.next()) {
            return rs.getInt("id_pedido");
        }
    }
    return 0; // Si no hay registros, retorna 0
}

    // Método para EMPLEADOS (Ve todos los pedidos)
    public List<Pedido> obtenerTodosLosPedidos() {
        String sql = "SELECT * FROM pedidoencabezado";
        return ejecutarConsulta(sql, -1);
    }

    // Método para CLIENTES (Ve solo sus propios pedidos)
    public List<Pedido> obtenerPedidosPorCliente(int idCliente) {
        String sql = "SELECT * FROM pedidoencabezado WHERE id_cliente = ?";
        return ejecutarConsulta(sql, idCliente);
    }

    // Método auxiliar privado para no repetir código
    private List<Pedido> ejecutarConsulta(String sql, int idCliente) {
        List<Pedido> lista = new ArrayList<>();
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            if (idCliente != -1) {
                pst.setInt(1, idCliente);
            }

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Pedido p = new Pedido();
                    p.setIdPedido(rs.getInt("id_pedido"));
                    p.setIdCliente(String.valueOf(rs.getInt("id_cliente")));
                    // Asumiendo que tienes estos campos en tu clase Pedido y BD
                    p.setTotal(rs.getDouble("total"));
                    // p.setFecha(rs.getString("fecha")); // Si tienes fecha, agrégala
                    lista.add(p);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
}
