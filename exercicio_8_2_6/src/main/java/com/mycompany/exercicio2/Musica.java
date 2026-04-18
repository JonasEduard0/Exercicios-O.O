package com.mycompany.exercicio2;

import java.util.Scanner;

public class Musica {
    private String titulo;
    private double duracao;

    public Musica(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public Musica() {
        this.titulo = "";
        this.duracao = 0.0;
    }

    public Musica(Musica outra) {
        this.titulo = outra.titulo;
        this.duracao = outra.duracao;
    }

    public Musica copiar() {
        return new Musica(this);
    }

    public String getTitulo() { return titulo; }
    public double getDuracao() { return duracao; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDuracao(double duracao) { this.duracao = duracao; }

    public void fill() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Titulo: ");
        this.titulo = ler.next();
        System.out.print("Duracao: ");
        this.duracao = ler.nextDouble();
    }

    public String toString() {
        return "Titulo: " + titulo + ", duracao: " + duracao;
    }
}