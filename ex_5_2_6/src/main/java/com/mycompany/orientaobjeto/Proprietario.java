package com.mycompany.orientaobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proprietario {
    private String nome;
    private String cpf;
    private String email;
    private List<Carro> carros;

    public Proprietario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.carros = new ArrayList<>();
    }

    public Proprietario() {
        nome = "";
        cpf = "";
        email = "";
        carros = new ArrayList<>();
    }
    
    public Proprietario(Proprietario outro) {
        this.nome = outro.nome;
        this.cpf = outro.cpf;
        this.email = outro.email;

        this.carros = new ArrayList<>();
        for (Carro c : outro.carros) {
            this.carros.add(c.copiar());
        }
    }

    public List<Carro> getCarros() { return carros; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setEmail(String email) { this.email = email; }
    public void setCarros(List<Carro> carros) {
        this.carros = new ArrayList<>();
        for (Carro c : carros) {
            this.carros.add(c.copiar());
        }
    }
    
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Email: " + email;
    }
    
    public void fill() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        this.nome = ler.next();
        System.out.print("CPF: ");
        this.cpf = ler.next();
        System.out.print("Email: ");
        this.email = ler.next();
    }
    
    public Proprietario copiar() {
        return new Proprietario(this);
    }

    public void adicionarCarro(Carro c) {
        carros.add(c);
    }
    
    public boolean possuiFabricante(String fabricante) {
        for (Carro c : carros) {
            if (c.getFabricante().equals(fabricante)) {
                return true;
            }
        }
        return false;
    }
}