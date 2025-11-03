package Clases;

public class Factura {
    private int idFactura;
    private String nombreCliente;
    private String fechaEmision;
    private String rfc;
    private String correo;
    private String fechaCompra;
    private int idVenta;
    private double total;

    public Factura(int idFactura, String nombreCliente, String fechaEmision, String rfc, 
                   String correo, String fechaCompra, int idVenta, double total) {
        this.idFactura = idFactura;
        this.nombreCliente = nombreCliente;
        this.fechaEmision = fechaEmision;
        this.rfc = rfc;
        this.correo = correo;
        this.fechaCompra = fechaCompra;
        this.idVenta = idVenta;
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

