package com.mycompany.orientaobjeto;

public class Time {
    private String nome;
    private String cidade;
    private int anoFundacao;
    private Tecnico tecnico;
    
    public Time() {
        nome = "";
        cidade = "";
        anoFundacao = 0;
    }

    public Time(String nome, String cidade, int anoFundacao) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
    }
    
    public Time(Time outro){
        this.nome = outro.nome;
        this.cidade = outro.cidade;
        this.anoFundacao = outro.anoFundacao;
    }
    
    public Time copiar() {
        return new Time(this);
    }

    public String getNome() { return nome; }
    public String getCidade() { return cidade; }
    public int getAnoFundacao() { return anoFundacao; }
    public Tecnico getTecnico() { return tecnico; }
    
    public void setNome(String nome) { this.nome = nome; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setAnoFundacao(int anoFundacao) { this.anoFundacao = anoFundacao; }
    public void setTecnico(Tecnico tecnico) { this.tecnico = tecnico; }
    

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cidade: " + cidade + ", Ano de Fundacao: " + anoFundacao;
    }
}