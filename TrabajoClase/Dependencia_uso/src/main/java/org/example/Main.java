package org.example;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.mostrarLibro(libro);  // Dependencia de uso.
    }
}
