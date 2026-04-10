package com.mycompany.orientaobjeto;

public class Pedido {
    private int numero;
    private String data;
    private int quantidade;
    private Produto produto;

    public Pedido() {
        data = "";
        numero = 0;
        quantidade = 0;
    }

    public Pedido(int numero, String data, int quantidade, Produto produto) {
        this.numero = numero;
        this.data = data;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Pedido(Pedido outro) {
        this.numero = outro.numero;
        this.data = outro.data;
        this.quantidade = outro.quantidade;
        this.produto = outro.produto.copiar();
    }

    public Pedido copiar() {
        return new Pedido(this);
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
    
    public double calcularTotal() {
        return quantidade*produto.getPrecoUnitario();
    }

    @Override
    public String toString() {
        return "Pedido: " + numero +
               "Data: " + data +
               "Quantidade: " + quantidade +
               produto.toString();
    }
}