package com.mycompany.orientaobjeto;

public class Produto {
    private String nome;
    private String categoria;
    private double precoUnitario;

    public Produto() {
        nome = "";
        categoria = "";
        precoUnitario = 0.0;
    }

    public Produto(String nome, String categoria, double precoUnitario) {
        this.nome = nome;
        this.categoria = categoria;
        this.precoUnitario = precoUnitario;
    }

    public Produto(Produto outro) {
        this.nome = outro.nome;
        this.categoria = outro.categoria;
        this.precoUnitario = outro.precoUnitario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

    @Override
    public String toString() {
        return "Produto: " + nome +
               "\nCategoria: " + categoria +
               "\nPreço Unitário: R$ " + precoUnitario;
    }

    public Produto copiar() {
        return new Produto(this);
    }
}