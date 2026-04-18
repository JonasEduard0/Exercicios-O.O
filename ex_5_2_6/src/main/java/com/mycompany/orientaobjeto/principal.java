package com.mycompany.orientaobjeto;

public class principal {

    public static void main(String[] args) {
        
        Proprietario p1 = new Proprietario("João", "123", "joao@email");
        Proprietario p2 = new Proprietario("Maria", "456", "maria@email");

        Carro c1 = new Carro("Toyota", "Corolla", "Preto");
        Carro c2 = new Carro("Honda", "Civic", "Branco");

        Carro c3 = new Carro("Toyota", "Yaris", "Prata");
        Carro c4 = new Carro("Ford", "Ka", "Vermelho");

        p1.adicionarCarro(c1);
        p1.adicionarCarro(c2);

        p2.adicionarCarro(c3);
        p2.adicionarCarro(c4);

        if (p1.possuiFabricante("Toyota") && p2.possuiFabricante("Toyota")) {
            System.out.println("tem carros do mesmo fabricador");
        } else {
            System.out.println("Nao tem carros do mesmo fabricador");
        }

    }
}