package org.example;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos");
        usuario.crearSolicitud("Permiso de vacaciones");  // Dependencia de creación.
    }
}
