package com.mycompany.poojava;

import java.util.Scanner;

public class Passageiro {
    private String nome;
    private String cpf;

    // Sistema de fidelidade associado ao passageiro (composição)
    private SistemaFidelidade sistemaFidelidade;

    public Passageiro() {
        nome = "";
        cpf = "";
        this.sistemaFidelidade = new SistemaFidelidade();
    }
    
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.sistemaFidelidade = new SistemaFidelidade();
    }
    
    // Construtor de cópia
    // Cria um novo Passageiro com os mesmos dados
    // Faz cópia do sistema de fidelidade (cópia profunda)
    public Passageiro(Passageiro outro) {
        this.nome = outro.nome;
        this.cpf = outro.cpf;
        this.sistemaFidelidade = outro.sistemaFidelidade.copiar(); // Faz cópia do sistema de fidelidade (cópia profunda)
    }

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public SistemaFidelidade getSistemaFidelidade() { return sistemaFidelidade; }

    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
    
    // Método fill
    // Preenche os atributos com dados digitados pelo usuário
    public void fill() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        this.nome = ler.next();

        System.out.print("CPF: ");
        this.cpf = ler.next();
    }
    
    // Método copiar
    // Retorna uma nova instância com os mesmos dados do objeto atual
    public Passageiro copiar() {
        return new Passageiro(this);
    }
}