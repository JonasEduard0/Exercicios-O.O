package com.mycompany.orientaobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private List<Roda> rodas;

    public Carro(String fabricante, String modelo, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.rodas = new ArrayList<>();
    }

    public Carro() {
        fabricante = "";
        cor = "";
        modelo = "";
        rodas = new ArrayList<>();
    }
    
    public Carro(Carro outro) {
        this.fabricante = outro.fabricante;
        this.modelo = outro.modelo;
        this.cor = outro.cor;

        this.rodas = new ArrayList<>();
        for (Roda r : outro.rodas) {
            this.rodas.add(r.copiar());
        }
    }
    
    public String getFabricante() { return fabricante; }
    public String getCor() { return cor; }
    public String getModelo() { return modelo; }
    public List<Roda> getRodas() { return rodas; }

    public void setCor(String cor) { this.cor = cor; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setRodas(List<Roda> rodas) {
        this.rodas = new ArrayList<>();
        for (Roda r : rodas) {
            this.rodas.add(r.copiar());
        }
    }
    
    public void fill() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Fabricante: ");
        this.fabricante = ler.next();
        System.out.print("Modelo: ");
        this.modelo = ler.next();
        System.out.print("Cor: ");
        this.cor = ler.next();
    }
    
    public Carro copiar() {
        return new Carro(this);
    }

    public void adicionarRoda(Roda r) {
        rodas.add(r);
    }

    public String toString() {
        return "Fabricante: " + fabricante + ", modelo: " + modelo + ", cor: " + cor;
    }
}