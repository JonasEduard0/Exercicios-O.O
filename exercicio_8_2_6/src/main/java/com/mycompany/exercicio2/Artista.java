package com.mycompany.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Artista {
    private String nome;
    private List<Album> albuns;

    public Artista(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
    }

    public Artista() {
        this.nome = "";
        this.albuns = new ArrayList<>();
    }

    public Artista(Artista outro) {
        this.nome = outro.nome;

        this.albuns = new ArrayList<>();
        for (Album a : outro.albuns) {
            this.albuns.add(a.copiar());
        }
    }

    public Artista copiar() {
        return new Artista(this);
    }

    public String getNome() { return nome; }
    public List<Album> getAlbuns() { return albuns; }

    public void setNome(String nome) { this.nome = nome; }
    public void setAlbuns(List<Album> albuns) {
        this.albuns = new ArrayList<>();
        for (Album a : albuns) {
            this.albuns.add(a.copiar());
        }
    }
    
    public void fill() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome artista: ");
        this.nome = ler.next();
    }

    public String toString() {
        return "Artista: " + nome;
    }
    
    public void adicionarAlbum(Album a) {
        albuns.add(a);
    }

    public void adicionarMusica(String nomeAlbum, Musica m) {
        for (Album a : albuns) {
            if (a.getNome().equals(nomeAlbum)) {
                a.adicionarMusica(m);
                return;
            }
        }
    }
}