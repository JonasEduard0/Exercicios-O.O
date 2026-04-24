package com.mycompany.poojava;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Projeto> projetos;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.projetos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public void adicionarProjeto(Projeto p) {
        projetos.add(p);
    }

    public void removerProjeto(Projeto p) {
        projetos.remove(p);
    }

    public Funcionario funcionarioMaisProdutivo() {
        if (funcionarios.isEmpty()) return null;

        Funcionario melhor = funcionarios.get(0);

        for (Funcionario f : funcionarios) {
            if (f.getQuantidadeProjetos() > melhor.getQuantidadeProjetos()) {
                melhor = f;
            }
        }
        return melhor;
    }

    public Funcionario funcionarioMenosProdutivo() {
        if (funcionarios.isEmpty()) return null;

        Funcionario pior = funcionarios.get(0);

        for (Funcionario f : funcionarios) {
            if (f.getQuantidadeProjetos() < pior.getQuantidadeProjetos()) {
                pior = f;
            }
        }
        return pior;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa: ").append(nome).append("\n");

        sb.append("Funcionarios:\n");
        for (Funcionario f : funcionarios) {
            sb.append(f).append("\n");
        }

        sb.append("\nProjetos:\n");
        for (Projeto p : projetos) {
            sb.append(p).append("\n");
        }

        return sb.toString();
    }
}
