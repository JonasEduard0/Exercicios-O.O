package com.mycompany.poojava;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String numero;
    private String destino;
    private int capacidadeMax;
    private List<Passageiro> passageiros; // Lista de passageiros do voo (relação 1 para muitos)
    private String estado;
    private List<String> escalas; // Lista de escalas (paradas intermediárias)

    public Voo(String numero, String destino, int capacidadeMax) {
        this.numero = numero;
        this.destino = destino;
        this.capacidadeMax = capacidadeMax;
        this.passageiros = new ArrayList<>();
        this.escalas = new ArrayList<>();
        this.estado = "Aguardando";  // Inicializa atributos e cria listas vazias
    }
    
    // Construtor de cópia
    // Cria um novo voo com os mesmos dados
    // Faz cópia da lista de passageiros e escalas
    public Voo(Voo outro) {
        this.numero = outro.numero;
        this.destino = outro.destino;
        this.capacidadeMax = outro.capacidadeMax;

        this.passageiros = new ArrayList<>();
        for (Passageiro p : outro.passageiros) {
            this.passageiros.add(p.copiar());
        }

        this.escalas = new ArrayList<>(outro.escalas);
        this.estado = outro.estado;
    }

    public Voo copiar() {
        return new Voo(this);
    }

    public void fill(String numero, String destino, int capacidadeMax) {
        this.numero = numero;
        this.destino = destino;
        this.capacidadeMax = capacidadeMax;
    }

    // Só adiciona se não ultrapassar a capacidade máxima
    // Retorna true se conseguiu adicionar
    public boolean adicionarPassageiro(Passageiro p) {
        if (passageiros.size() < capacidadeMax) {
            passageiros.add(p);
            return true;
        }
        return false;
    }

    // Remove um passageiro com base no CPF
    // Retorna true se removeu, false se não encontrou
    public boolean removerPassageiro(String cpf) {
        for (Passageiro p : passageiros) {
            if (p.getCpf().equals(cpf)) {
                passageiros.remove(p);
                return true;
            }
        }
        return false;
    }

    // Adiciona uma nova escala (parada intermediária)
    public void adicionarEscala(String escala) {
        escalas.add(escala);
    }

    // Remove uma escala da lista
    public void removerEscala(String escala) {
        escalas.remove(escala);
    }

    // Altera o estado do voo
    // Ex: "Aguardando" -> "Voando"
    public void alterarEstado(String estado) {
        this.estado = estado;
    }

    // Verifica se o voo terá prejuízo
    // Regra: menos de 5 passageiros
    public boolean temPrejuizo() {
        return passageiros.size() < 5;
    }

    // Getter do número do voo
    public String getNumero() { 
        return numero; 
    }

    // Retorna uma representação textual do voo
    // Mostra dados principais, quantidade de passageiros e escalas
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