package Clases;

public class Parentesco {
    private int idParentesco;
    private String nombre;

    public Parentesco(int idParentesco, String nombre) {
        this.idParentesco = idParentesco;
        this.nombre = nombre;
    }

    public int getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(int idParentesco) {
        this.idParentesco = idParentesco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

