package com.mycompany.poojava;

import java.util.Scanner;

public class Passageiro {
    String nome;
    String cpf;
    private SistemaFidelidade sistemaFidelidade;

    public Passageiro() {
        nome = "";
        cpf = "";
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.sistemaFidelidade = new SistemaFidelidade();
    }
    
    public Passageiro(Passageiro p) {
        this.nome = p.nome;
        this.cpf = p.cpf;
        this.sistemaFidelidade = p.sistemaFidelidade.copiar();
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
    
    public void fill() {
        Scanner ler = new Scanner(System.in); //Preenche com dados do usuário

        System.out.print("Nome: "); //Preenche cada um dos atributos
        this.nome = ler.next();
        System.out.print("CPF: ");
        this.cpf = ler.next();
    }
    
    public Passageiro copiar() {
        return new Passageiro(this);
    }
}
