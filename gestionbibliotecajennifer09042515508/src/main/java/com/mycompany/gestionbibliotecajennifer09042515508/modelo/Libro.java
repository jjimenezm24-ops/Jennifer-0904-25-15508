
package com.mycompany.gestionbibliotecajennifer09042515508.modelo;


public class Libro {
    private String titulo;
    private String autor;
    private int yearPublicacion;

    public Libro(String titulo, String autor, int yearPublicacion) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede ser vacio");
        }
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("El autor no puede ser vacio");
        }
        if (yearPublicacion <= 0) {
            throw new IllegalArgumentException("El año debe ser mayor que 0");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public boolean esAntiguo() {
        return yearPublicacion < 2000;
    }
}
