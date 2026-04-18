package com.mycompany.orientaobjeto;

import java.util.Scanner;

public class Roda {
    private double raio;
    private String material;
    private String cor;

    public Roda(double raio, String material, String cor) {
        this.raio = raio;
        this.material = material;
        this.cor = cor;
    }

    public Roda() {
        raio = 0.0;
        material = "";
        cor = "";
    }
    
    public Roda(Roda outra) {
        this.cor = outra.cor;
        this.material = outra.material;
        this.raio = outra.raio;
    }

    public String getCor() { return cor; }
    public String getMaterial() { return material; }
    public double getRaio() { return raio; }

    public void setCor(String cor) { this.cor = cor; }
    public void setMaterial(String material) { this.material = material; }
    public void setRaio(double raio) { this.raio = raio; }
    
     public void fill() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Cor: ");
        this.cor = ler.next();
        System.out.print("Material: ");
        this.material = ler.next();
        System.out.print("Raio: ");
        this.raio = ler.nextDouble();
    }
    
    public Roda copiar() {
        return new Roda(this);
    }

    @Override
    public String toString() {
        return "Raio: " + raio + ", material: " + material + ", cor: " + cor;
    }
}