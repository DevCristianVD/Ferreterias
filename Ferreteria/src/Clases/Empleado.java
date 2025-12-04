package Clases;

public class Empleado {

    // --- Atributos Privados ---
    private int idEmpleado;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String fechaNacimiento;
    private String domicilio;
    private String numeroCasa;
    private String localidad;
    private String horario;
    private String fechaIngreso;
    private String nombreContacto;
    private String parentesco;
    private String telefonoContacto;
    private String usuario;
    private String contrasena;

    // Atributo calculado
    private String nombreCompleto;

    // --- Constructores ---

    /**
     * Constructor vacío.
     * Esencial para que el DAO pueda crear un objeto Empleado
     * y llenarlo desde la base de datos (Ej. en validarLogin).
     */
    public Empleado() {
    }

    /**
     * Constructor completo.
     * Útil para crear un empleado nuevo con todos sus datos de una vez.
     */
    public Empleado(int idEmpleado, String nombre, String primerApellido, String segundoApellido,
            String telefono, String fechaNacimiento, String domicilio, String numeroCasa,
            String localidad, String horario, String fechaIngreso, String nombreContacto,
            String parentesco, String telefonoContacto, String usuario, String contrasena) {
        
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.numeroCasa = numeroCasa;
        this.localidad = localidad;
        this.horario = horario;
        this.fechaIngreso = fechaIngreso;
        this.nombreContacto = nombreContacto;
        this.parentesco = parentesco;
        this.telefonoContacto = telefonoContacto;
        this.usuario = usuario;
        this.contrasena = contrasena;
        // Se calcula automáticamente
        this.nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;
    }

    /**
     * Constructor simplificado.
     * Útil para mostrar listas simples de empleados (como en el método obtenerEmpleados del DAO).
     */
    public Empleado(int idEmpleado, String nombreCompleto, String telefono, String horario) {
        this.idEmpleado = idEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.horario = horario;
    }

    // --- Métodos Getter y Setter (Formateados) ---

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    // Nota: No hay un setNombreCompleto porque se calcula automáticamente
    // Si necesitas asignarlo manualmente (ej. desde el DAO), puedes agregarlo:
    // public void setNombreCompleto(String nombreCompleto) {
    //     this.nombreCompleto = nombreCompleto;
    // }
}