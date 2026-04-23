package com.mycompany.poojava;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nome;
    private String localizacao;
    private List<Voo> voos;

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.voos = new ArrayList<>();
    }

    // Construtor de cópia
    public Aeroporto(Aeroporto a) {
        this.nome = a.nome;
        this.localizacao = a.localizacao;

        this.voos = new ArrayList<>();
        for (Voo v : a.voos) {
            this.voos.add(v.copiar());
        }
    }

    public Aeroporto copiar() {
        return new Aeroporto(this);
    }

    public void adicionarVoo(Voo v) {
        voos.add(v);
    }

    public boolean removerVoo(String numero) {
        for (Voo v : voos) {
            if (v.getNumero().equals(numero)) {
                voos.remove(v);
                return true;
            }
        }
        return false;
    }

    public Voo buscarVoo(String numero) {
        for (Voo v : voos) {
            if (v.getNumero().equals(numero)) {
                return v;
            }
        }
        return null;
    }

    public void iniciarVoo(String numero) {
        Voo v = buscarVoo(numero);
        if (v != null) {
            v.alterarEstado("Voando");
        }
    }

    public List<Voo> calcularVoosComPrejuizo() {
        List<Voo> lista = new ArrayList<>();

        for (Voo v : voos) {
            if (v.temPrejuizo()) {
                lista.add(v);
            }
        }

        return lista;
    }

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