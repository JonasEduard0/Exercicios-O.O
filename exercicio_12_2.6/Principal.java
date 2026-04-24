package com.mycompany.poojava;

public class Principal {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Tech Solutions");

        Funcionario f1 = new Funcionario("Ana", "F001");
        Funcionario f2 = new Funcionario("Carlos", "F002");

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);

        Projeto p1 = new Projeto("Software", "P001", "App");
        Projeto p2 = new Projeto("Pesquisa", "P002", "Mercado");

        empresa.adicionarProjeto(p1);
        empresa.adicionarProjeto(p2);

        p1.adicionarFuncionario(f1);
        p2.adicionarFuncionario(f1);
        p1.adicionarFuncionario(f2);

        System.out.println("Mais produtivo: " + empresa.funcionarioMaisProdutivo().getNome());
        System.out.println("Menos produtivo: " + empresa.funcionarioMenosProdutivo().getNome());
    }
}