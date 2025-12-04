package DAO;

import Clases.ConexionBD;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    // Método para insertar un producto
    public boolean insertarProducto(Producto producto) throws Exception {
        String sql = "INSERT INTO inventario(id_producto, nombre, id_marca, id_categoria, precio_compra, precio_venta, precio_merma, cantidad) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, producto.getIdProducto());
            pst.setString(2, producto.getNombre());
            pst.setInt(3, producto.getIdMarca());
            pst.setInt(4, producto.getIdCategoria());
            pst.setDouble(5, producto.getPrecioCompra());
            pst.setDouble(6, producto.getPrecioVenta());
            pst.setDouble(7, producto.getPrecioMerma());
            pst.setInt(8, producto.getCantidad());

            return pst.executeUpdate() > 0;
        }
    }

    public boolean actualizarCantidad(int idProducto, double cantidad) throws Exception {
    String sql = "UPDATE inventario SET cantidad = cantidad + ? WHERE id_producto = ?";
    try (Connection con = ConexionBD.getConexion();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setDouble(1, cantidad); // Puede ser positivo o negativo
        pst.setInt(2, idProducto);

        return pst.executeUpdate() > 0;
    }
}
    
    // Método para obtener el último ID de producto
    public int obtenerUltimoIdProducto() throws Exception {
        String sql = "SELECT id_producto FROM inventario ORDER BY id_producto DESC LIMIT 1";
        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_producto");
            }
        }
        return 0; // Si no hay registros, retorna 0
    }

    // Método para obtener una lista de productos (opcional, para llenar una tabla)
    public List<Producto> obtenerProductos() throws Exception {
        String sql = "SELECT id_producto, nombre, id_marca, id_categoria, precio_compra, precio_venta, precio_merma, cantidad FROM inventario";
        List<Producto> lista = new ArrayList<>();

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Producto producto = new Producto(
                    rs.getInt("id_producto"),
                    rs.getString("nombre"),
                    rs.getInt("id_marca"),
                    rs.getInt("id_categoria"),
                    rs.getDouble("precio_compra"),
                    rs.getDouble("precio_venta"),
                    rs.getDouble("precio_merma"),
                    rs.getInt("cantidad")
                );
                lista.add(producto);
            }
        }
        return lista;
    }
    
    public List<Producto> ObtenerProductos() throws Exception {
    String sql = "SELECT id_producto, nombre, precio_venta FROM inventario";
    List<Producto> lista = new ArrayList<>();

    try (Connection con = ConexionBD.getConexion();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        while (rs.next()) {
            Producto producto = new Producto(
                rs.getInt("id_producto"),
                rs.getString("nombre"),
                rs.getDouble("precio_venta")
            );
            lista.add(producto);
        }
    } catch (Exception e) {
        throw new Exception("Error al obtener productos: " + e.getMessage());
    }
    return lista;
}
    
    // --- AGREGA ESTOS MÉTODOS A TU ProductoDAO ---

    public Clases.Producto obtenerProductoPorId(int id) throws Exception {
        String sql = "SELECT * FROM inventario WHERE id_producto = ?";
        try (java.sql.Connection con = Clases.ConexionBD.getConexion();
             java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setInt(1, id);
            java.sql.ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                return new Clases.Producto(
                    rs.getInt("id_producto"),
                    rs.getString("nombre"),
                    rs.getInt("id_marca"),
                    rs.getInt("id_categoria"),
                    rs.getDouble("precio_compra"),
                    rs.getDouble("precio_venta"),
                    rs.getDouble("precio_merma"),
                    rs.getInt("cantidad")
                );
            }
        }
        return null;
    }

    public boolean actualizarProducto(Clases.Producto p) throws Exception {
        String sql = "UPDATE inventario SET nombre=?, id_marca=?, id_categoria=?, " +
                     "precio_compra=?, precio_venta=?, precio_merma=?, cantidad=? " +
                     "WHERE id_producto=?";
                     
        try (java.sql.Connection con = Clases.ConexionBD.getConexion();
             java.sql.PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, p.getNombre());
            pst.setInt(2, p.getIdMarca());
            pst.setInt(3, p.getIdCategoria());
            pst.setDouble(4, p.getPrecioCompra());
            pst.setDouble(5, p.getPrecioVenta());
            pst.setDouble(6, p.getPrecioMerma());
            pst.setInt(7, p.getCantidad());
            pst.setInt(8, p.getIdProducto()); // WHERE

            return pst.executeUpdate() > 0;
        }
    }
    
    // Método para el filtro de búsqueda
    public List<Clases.Producto> buscarProductosPorNombre(String texto) throws Exception {
        String sql = "SELECT * FROM inventario WHERE nombre LIKE ?";
        List<Clases.Producto> lista = new ArrayList<>();
        try (java.sql.Connection con = Clases.ConexionBD.getConexion();
             java.sql.PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, "%" + texto + "%");
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Clases.Producto(
                    rs.getInt("id_producto"),
                    rs.getString("nombre"),
                    rs.getInt("id_marca"),
                    rs.getInt("id_categoria"),
                    rs.getDouble("precio_compra"),
                    rs.getDouble("precio_venta"),
                    rs.getDouble("precio_merma"),
                    rs.getInt("cantidad")
                ));
            }
        }
        return lista;
    }
    
}

