package com.mycompany.poojava;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String numero;
    private String destino;
    private int capacidadeMax;
    private List<Passageiro> passageiros;
    private List<String> escalas;
    private String estado;

    public Voo(String numero, String destino, int capacidadeMax) {
        this.numero = numero;
        this.destino = destino;
        this.capacidadeMax = capacidadeMax;
        this.passageiros = new ArrayList<>();
        this.escalas = new ArrayList<>();
        this.estado = "Aguardando";
    }
    
    public Voo(Voo v) {
        this.numero = v.numero;
        this.destino = v.destino;
        this.capacidadeMax = v.capacidadeMax;

        this.passageiros = new ArrayList<>();
        for (Passageiro p : v.passageiros) {
            this.passageiros.add(p.copiar());
        }

        this.escalas = new ArrayList<>(v.escalas);
        this.estado = v.estado;
    }

    public Voo copiar() {
        return new Voo(this);
    }

    public void fill(String numero, String destino, int capacidadeMax) {
        this.numero = numero;
        this.destino = destino;
        this.capacidadeMax = capacidadeMax;
    }

    public boolean adicionarPassageiro(Passageiro p) {
        if (passageiros.size() < capacidadeMax) {
            passageiros.add(p);
            return true;
        }
        return false;
    }

    public boolean removerPassageiro(String cpf) {
        for (Passageiro p : passageiros) {
            if (p.getCpf().equals(cpf)) {
                passageiros.remove(p);
                return true;
            }
        }
        return false;
    }

    public void adicionarEscala(String escala) {
        escalas.add(escala);
    }

    public void removerEscala(String escala) {
        escalas.remove(escala);
    }

    public void alterarEstado(String estado) {
        this.estado = estado;
    }

    public boolean temPrejuizo() {
        return passageiros.size() < 5;
    }

    // Getters
    public String getNumero() { return numero; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Voo ").append(numero)
          .append(" -> ").append(destino)
          .append(" | Estado: ").append(estado)
          .append("\nPassageiros: ").append(passageiros.size())
          .append("\nEscalas: ").append(escalas);

        return sb.toString();
    }
}