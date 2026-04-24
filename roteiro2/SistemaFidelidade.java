package com.mycompany.poojava;

public class SistemaFidelidade {
    // Armazena a quantidade de pontos do passageiro
    private int pontos;

    // Construtor padrão
    // Inicializa o sistema com 0 pontos
    public SistemaFidelidade() {
        this.pontos = 0;
    }

    // Construtor de cópia
    // Cria um novo objeto com a mesma quantidade de pontos de outro
    public SistemaFidelidade(SistemaFidelidade outro) {
        this.pontos = outro.pontos;
    }

    // Método copiar
    // Retorna uma nova instância com os mesmos dados (cópia do objeto)
    public SistemaFidelidade copiar() {
        return new SistemaFidelidade(this);
    }

    // Adiciona pontos ao saldo
    // Só permite valores positivos
    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontos += pontos;
        }
    }

    // Retorna a quantidade atual de pontos
    public int getSaldoPontos() {
        return pontos;
    }

    // Realiza o resgate de pontos
    // Verifica se o valor é válido e se há saldo suficiente
    // Retorna true se conseguiu resgatar, false caso contrário
    public boolean resgatarPontos(int pontosParaResgate) {
        if (pontosParaResgate <= 0 || pontosParaResgate > this.pontos) {
            return false;
        } else {
            this.pontos -= pontosParaResgate;
            return true;
        }
    }

    // Retorna uma representação textual do objeto
    // Mostra a quantidade de pontos atual
    public String toString() {
        return "Pontos: " + pontos;
    }
}