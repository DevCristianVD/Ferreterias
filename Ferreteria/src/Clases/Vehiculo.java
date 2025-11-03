package Clases;

public class Vehiculo {
    private int idVehiculo;
    private String modelo;
    private double pesoSoportado;
    private int idEmpleado;
    private String estatus;

    // Constructor
    public Vehiculo(int idVehiculo, String modelo, double pesoSoportado, int idEmpleado, String estatus) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.pesoSoportado = pesoSoportado;
        this.idEmpleado = idEmpleado;
        this.estatus = estatus;
    }

    // Getters y Setters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPesoSoportado() {
        return pesoSoportado;
    }

    public void setPesoSoportado(double pesoSoportado) {
        this.pesoSoportado = pesoSoportado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}