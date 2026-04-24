package com.mycompany.poojava;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nome;
    private String localizacao;

    private List<Voo> voos; // Lista de voos gerenciados pelo aeroporto 
    
    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.voos = new ArrayList<>(); // Inicializa nome, localização e cria a lista de voos vazia
    }

    // Construtor de cópia
    // Cria um novo aeroporto com os mesmos dados
    // Faz cópia da lista de voos (cópia dos objetos)
    public Aeroporto(Aeroporto a) {
        this.nome = a.nome;
        this.localizacao = a.localizacao;

        this.voos = new ArrayList<>();
        for (Voo v : a.voos) {
            this.voos.add(v.copiar());
        }
    }

    // Método copiar
    // Retorna uma nova instância com os mesmos dados do objeto atual
    public Aeroporto copiar() {
        return new Aeroporto(this);
    }

    // Adiciona um voo à lista
    public void adicionarVoo(Voo v) {
        voos.add(v);
    }

    // Remove um voo pelo número
    // Retorna true se removeu, false se não encontrou
    public boolean removerVoo(String numero) {
        for (Voo v : voos) {
            if (v.getNumero().equals(numero)) {
                voos.remove(v);
                return true;
            }
        }
        return false;
    }

    // Busca um voo pelo número
    // Retorna o voo se encontrar, ou null caso contrário
    public Voo buscarVoo(String numero) {
        for (Voo v : voos) {
            if (v.getNumero().equals(numero)) {
                return v;
            }
        }
        return null;
    }

    // Inicia um voo
    // Busca o voo pelo número e altera seu estado para "Voando"
    public void iniciarVoo(String numero) {
        Voo v = buscarVoo(numero);
        if (v != null) {
            v.alterarEstado("Voando");
        }
    }

    // Calcula os voos que terão prejuízo
    // Retorna uma lista com voos que possuem menos de 5 passageiros
    public List<Voo> calcularVoosComPrejuizo() {
        List<Voo> lista = new ArrayList<>();

        for (Voo v : voos) {
            if (v.temPrejuizo()) {
                lista.add(v);
            }
        }

        return lista;
    }

    // Retorna uma representação textual do aeroporto
    // Mostra os dados do aeroporto e todos os voos cadastrados
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aeroporto: ").append(nome)
          .append(" - ").append(localizacao).append("\n");

        for (Voo v : voos) {
            sb.append(v).append("\n\n");
        }

        return sb.toString();
    }
}