package com.mycompany.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Artista> artistas;

    public Gerenciador() {
        artistas = new ArrayList<>();
    }

    public void adicionarArtista(Artista a) {
        artistas.add(a);
    }

    public Artista artistaComMaisAlbuns() {
        Artista maior = null;
        int max = -1;

        for (Artista a : artistas) {
            if (a.getAlbuns().size() > max) {
                max = a.getAlbuns().size();
                maior = a;
            }
        }
        return maior;
    }

    public Album albumComMaisMusicas() {
        Album maior = null;
        int max = -1;

        for (Artista a : artistas) {
            for (Album al : a.getAlbuns()) {
                if (al.getMusicas().size() > max) {
                    max = al.getMusicas().size();
                    maior = al;
                }
            }
        }
        return maior;
    }
}