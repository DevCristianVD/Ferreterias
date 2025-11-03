package Clases;

public class Merma {
    private int idMerma;
    private int idProducto;
    private String nombre;
    private double precioMerma;
    private double cantidad;

    public Merma(int idMerma, int idProducto, String nombre, double precioMerma, double cantidad) {
        this.idMerma = idMerma;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioMerma = precioMerma;
        this.cantidad = cantidad;
    }

    public Merma(int idProducto, String nombre, double precioMerma, double cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioMerma = precioMerma;
        this.cantidad = cantidad;
    }

    public int getIdMerma() {
        return idMerma;
    }

    public void setIdMerma(int idMerma) {
        this.idMerma = idMerma;
    }

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

    public double getPrecioMerma() {
        return precioMerma;
    }

    public void setPrecioMerma(double precioMerma) {
        this.precioMerma = precioMerma;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
