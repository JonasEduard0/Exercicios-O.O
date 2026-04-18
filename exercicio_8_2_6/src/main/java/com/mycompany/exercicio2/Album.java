package com.mycompany.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Album {
    private String nome;
    private int ano;
    private List<Musica> musicas;

    public Album(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
        this.musicas = new ArrayList<>();
    }

    public Album() {
        this.nome = "";
        this.ano = 0;
        this.musicas = new ArrayList<>();
    }

    public Album(Album outro) {
        this.nome = outro.nome;
        this.ano = outro.ano;

        this.musicas = new ArrayList<>();
        for (Musica m : outro.musicas) {
            this.musicas.add(m.copiar());
        }
    }

    public Album copiar() {
        return new Album(this);
    }

    public String getNome() { return nome; }
    public int getAno() { return ano; }
    public List<Musica> getMusicas() { return musicas; }

    public void setAno(int ano) { this.ano = ano; }
    public void setNome(String nome) { this.nome = nome; }
    public void setMusicas(List<Musica> musicas) {
        this.musicas = new ArrayList<>();
        for (Musica m : musicas) {
            this.musicas.add(m.copiar());
        }
    }
    
    public void fill() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome do album: ");
        this.nome = ler.next();
        System.out.print("Ano: ");
        this.ano = ler.nextInt();
    }

    public String toString() {
        return "Album: " + nome + ", ano: " + ano;
    }
    
    public void adicionarMusica(Musica m) {
        musicas.add(m);
    }
}