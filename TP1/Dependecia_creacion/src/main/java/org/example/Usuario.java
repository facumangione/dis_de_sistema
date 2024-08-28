package org.example;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void crearSolicitud(String tipoSolicitud) {
        Solicitud solicitud = new Solicitud(tipoSolicitud);  // Dependencia de creación.
        solicitud.procesar();
    }
}
