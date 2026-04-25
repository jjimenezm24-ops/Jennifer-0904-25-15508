
package com.mycompany.gestionbibliotecajennifer09042515508.servicio;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.gestionbibliotecajennifer09042515508.modelo.Libro;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> obtenerLibros() {
        return new ArrayList<>(libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
