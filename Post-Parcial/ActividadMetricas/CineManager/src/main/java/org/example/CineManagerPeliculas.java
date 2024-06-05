package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CineManagerPeliculas {
    private List<Pelicula> peliculas;
    public CineManagerPeliculas() {
        peliculas = new ArrayList<>();
    }
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }
    public boolean eliminarPelicula(String titulo) {
        return peliculas.removeIf(p -> p.getTitulo().equals(titulo));
    }
    public List<Sesion> sesionesPorPelicula(String titulo) {
        return peliculas.stream()
                .filter(p -> p.getTitulo().equals(titulo))
                .flatMap(p -> p.getSesiones().stream())
                .collect(Collectors.toList());
    }
    public void programarSesion(String titulo, Sesion sesion) {
        peliculas.stream()
                .filter(p -> p.getTitulo().equals(titulo))
                .findFirst()
                .ifPresent(p -> p.agregarSesion(sesion));
    }
    public int contarPeliculas() {
        return peliculas.size();
    }
}


