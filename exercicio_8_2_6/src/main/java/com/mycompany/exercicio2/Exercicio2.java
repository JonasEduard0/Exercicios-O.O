package com.mycompany.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
       
        Artista artista1 = new Artista("Artista1");

        Album album1 = new Album("Album1", 2020);
        Album album2 = new Album("Album2", 2021);

        artista1.adicionarAlbum(album1);
        artista1.adicionarAlbum(album2);

        Musica m1 = new Musica("Musica1", 3.3);
        Musica m2 = new Musica("Musica2", 4.0);

        artista1.adicionarMusica("Album1", m1);
        artista1.adicionarMusica("Album1", m2);

        Gerenciador g = new Gerenciador();
        g.adicionarArtista(artista1);

        System.out.println("Artista com mais albuns: " + g.artistaComMaisAlbuns().getNome());
        System.out.println("Album com mais musicas: " + g.albumComMaisMusicas().getNome());
        
    }
}