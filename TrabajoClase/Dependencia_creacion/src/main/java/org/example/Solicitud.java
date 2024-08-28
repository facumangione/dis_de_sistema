package org.example;

public class Solicitud {
    private String tipo;

    public Solicitud(String tipo) {
        this.tipo = tipo;
    }

    public void procesar() {
        System.out.println("Procesando solicitud de tipo: " + tipo);
    }
}
