package model;

public class Estudiante {


    private String nombre;

    private String numeroMatricula;

    private String apellido;

    private String telefono;

    public Estudiante(String nombre, String numeroMatricula, String apellido, String telefono) {
        this.nombre = nombre;
        this.numeroMatricula = numeroMatricula;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Estudiante() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
