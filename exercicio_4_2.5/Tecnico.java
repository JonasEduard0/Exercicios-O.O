package com.mycompany.orientaobjeto;

public class Tecnico {
    private String nome;
    private String nacionalidade;
    private int anoNascimento;
    
    public Tecnico() {
        nome = "";
        nacionalidade = "";
        anoNascimento = 0;
    }
    
    public Tecnico copiar() {
        return new Tecnico(this);
    }
    
    public Tecnico(Tecnico outro) {
        this.nome = outro.nome;
        this.nacionalidade = outro.nacionalidade;
        this.anoNascimento = outro.anoNascimento;
    }
    
    public Tecnico(String nome, String nacionalidade, int anoNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() { return anoNascimento; }
    public String getNacionalidade() { return nacionalidade; }
    public String getNome() { return nome; }

    public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nacionalidade: " + nacionalidade + ", Ano de Nascimento: " + anoNascimento;
    }
}
