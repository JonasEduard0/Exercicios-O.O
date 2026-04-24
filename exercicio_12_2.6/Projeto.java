package com.mycompany.poojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Projeto {
    private String nome;
    private String codigo;
    private String descricao;
    private List<Funcionario> funcionarios;

    public Projeto(String nome, String codigo, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.funcionarios = new ArrayList<>();
    }

    public Projeto(Projeto p) {
        this.nome = p.nome;
        this.codigo = p.codigo;
        this.descricao = p.descricao;
        this.funcionarios = new ArrayList<>(p.funcionarios);
    }

    public Projeto copiar() {
        return new Projeto(this);
    }

    public void fill(String nome, String codigo, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (!funcionarios.contains(f)) {
            funcionarios.add(f);
            f.adicionarProjeto(this); // vínculo bidirecional
        }
    }

    public void removerFuncionario(Funcionario f) {
        if (funcionarios.remove(f)) {
            f.removerProjeto(this);
        }
    }

    // Getters
    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "Projeto: " + nome + " (" + codigo + ") - Funcionarios: " + funcionarios.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Projeto)) return false;
        Projeto that = (Projeto) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}