package org.example;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Mis Favoritas");
        playlist.agregarCancion(new Cancion("Bohemian Rhapsody"));
        playlist.agregarCancion(new Cancion("Hotel California"));
        playlist.mostrarPlaylist();  // Asociación uno a muchos.
    }
}
