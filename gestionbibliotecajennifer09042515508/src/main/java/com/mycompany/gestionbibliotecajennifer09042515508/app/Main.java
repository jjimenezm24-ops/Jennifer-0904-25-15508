
package com.mycompany.gestionbibliotecajennifer09042515508.app;

import com.mycompany.gestionbibliotecajennifer09042515508.modelo.Libro;
import com.mycompany.gestionbibliotecajennifer09042515508.servicio.Biblioteca;
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Libros válidos
        biblioteca.agregarLibro(new Libro("Don Quijote", "Cervantes", 1605));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", 1949));
        biblioteca.agregarLibro(new Libro("El Principito", "Autor Antoine de Saint-Exupery", 1943));

        // Libro inválido
        try {
            biblioteca.agregarLibro(new Libro("", "Autor", -1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar libro invalido: " + e.getMessage());
        }

        // Mostrar libros
        System.out.println("Lista de libros:");
        for (Libro libro : biblioteca.obtenerLibros()) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() +
                    " (" + libro.getYearPublicacion() + ")" +
                    (libro.esAntiguo() ? " [Antiguo]" : ""));
        }

        // Buscar libro
        String tituloBuscar = "1984";
        Libro encontrado = biblioteca.buscarPorTitulo(tituloBuscar);

        if (encontrado != null) {
            System.out.println("Libro encontrado: " + encontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado");
        }
    }
}
