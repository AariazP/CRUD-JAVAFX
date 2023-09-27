package model;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private String nombre;

    private List<Estudiante> listaEstudiantes;


    public Escuela(String nombre) {
        this.nombre = nombre;
        listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {

        listaEstudiantes.add(estudiante);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        listaEstudiantes.remove(estudiante);
    }

    public void actualizarEstudiante(Estudiante estudiante) {


        for(Estudiante aux:listaEstudiantes){

            if(aux.getNumeroMatricula().equals(estudiante.getNumeroMatricula())){

                aux.setTelefono(estudiante.getTelefono());
                aux.setApellido(estudiante.getApellido());
                aux.setNombre(estudiante.getNombre());

            }

        }



    }
}
