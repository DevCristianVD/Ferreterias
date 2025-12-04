package Clases;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String usuario; // Ya lo tenías
    private String primerApellido;
    private String segundoApellido;
    private String domicilio;
    private String numero;
    private String cp;
    private String telefono;
    private String correo;
    private String contrasena;
    private String Rfc;
    
    public Cliente() {
    }
    
    public Cliente(int idCliente, String nombre, String primerApellido, String segundoApellido, 
                   String domicilio, String numero, String cp, String telefono, 
                   String correo, String contrasena, String usuario) { // <-- Agregado al final
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.domicilio = domicilio;
        this.numero = numero;
        this.cp = cp;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.usuario = usuario; // <-- Agregado
    }

    
    // --- Métodos Getters y Setters ---
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // --- CAMBIO 3: Getters y Setters para 'usuario' ---
    // (Faltaban estos métodos)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRfc() {
        return Rfc;
    }

    public void setRfc(String Rfc) {
        this.Rfc = Rfc;
    }
    
    
}