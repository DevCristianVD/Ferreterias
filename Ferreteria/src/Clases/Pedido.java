package Clases;

public class Pedido {
    private int idPedido;
    private String idVehiculo;
    private String idCliente;
    private String domicilio;
    private double total;

  
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public String getIdVehiculo() {
        return idVehiculo;
    }
    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
}

