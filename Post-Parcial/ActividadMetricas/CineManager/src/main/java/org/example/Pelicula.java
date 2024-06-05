package org.example;

import java.util.ArrayList;
import java.util.List;

class Pelicula {
    private String titulo;
    private List<Sesion> sesiones;
    public Pelicula(String titulo) {
        this.titulo = titulo;
        sesiones = new ArrayList<>();
    }
    public void agregarSesion(Sesion sesion) {
        sesiones.add(sesion);
    }
    public String getTitulo() {
        return titulo;
    }
    public List<Sesion> getSesiones() {
        return new ArrayList<>(sesiones);
    }

}