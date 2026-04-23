package com.mycompany.poojava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aeroporto aeroporto = new Aeroporto("Brasília", "DF");
        Voo voo1 = new Voo("BR123", "Nova York", 100);
        Passageiro p1 = new Passageiro("João", "123");

        voo1.adicionarEscala("Miami");
        voo1.adicionarEscala("Orlando");

        aeroporto.adicionarVoo(voo1);
        voo1.adicionarPassageiro(p1);

        p1.getSistemaFidelidade().adicionarPontos(500);

        aeroporto.iniciarVoo("BR123");

        List<Voo> prejuizo = aeroporto.calcularVoosComPrejuizo();

        System.out.println("Voos com prejuízo:");
        for (Voo v : prejuizo) {
            System.out.println(v.getNumero());
        }

        System.out.println("\n--- SISTEMA ---");
        System.out.println(aeroporto);
    }
}