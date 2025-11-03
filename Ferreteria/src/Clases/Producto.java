package Clases;

public class Producto {
    private int idProducto;
    private String nombre;
    private int idMarca;
    private int idCategoria;
    private double precioCompra;
    private double precioVenta;
    private double precioMerma;
    private int cantidad;

    // Constructor
    public Producto(int idProducto, String nombre, int idMarca, int idCategoria, 
                    double precioCompra, double precioVenta, double precioMerma, int cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.idMarca = idMarca;
        this.idCategoria = idCategoria;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.precioMerma = precioMerma;
        this.cantidad = cantidad;
    }
    
    public Producto(int idProducto, String nombre, double precioVenta) {
        this.idProducto = idProducto;
        this.nombre = nombre;        
        this.precioVenta = precioVenta;
    }

    // Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioMerma() {
        return precioMerma;
    }

    public void setPrecioMerma(double precioMerma) {
        this.precioMerma = precioMerma;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
