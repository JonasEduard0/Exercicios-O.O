package com.mycompany.poojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private String id;
    private List<Projeto> projetos;

    public Funcionario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.projetos = new ArrayList<>();
    }

    public Funcionario(Funcionario f) {
        this.nome = f.nome;
        this.id = f.id;
        this.projetos = new ArrayList<>(f.projetos);
    }

    public Funcionario copiar() {
        return new Funcionario(this);
    }

    public void fill(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public void adicionarProjeto(Projeto p) {
        if (!projetos.contains(p)) {
            projetos.add(p);
        }
    }

    public void removerProjeto(Projeto p) {
        projetos.remove(p);
    }

    public int getQuantidadeProjetos() {
        return projetos.size();
    }

    public String getNome() { return nome; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return "Funcionario: " + nome + " (" + id + ") - Projetos: " + projetos.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}