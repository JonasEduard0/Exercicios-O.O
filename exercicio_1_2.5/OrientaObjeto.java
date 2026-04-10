package com.mycompany.orientaobjeto;
import java.util.Scanner;

public class OrientaObjeto {

    public static void main(String[] args) {

        // Exemplo fixo
        Produto p1 = new Produto("Teclado Mecânico", "Informática", 350.00);
        Pedido pedido1 = new Pedido(1001, "16/03/2026", 3, p1);

        System.out.println(pedido1);
        System.out.println("Total do pedido: R$ " + pedido1.calcularTotal());

        // Entrada do usuário
        Scanner leitor = new Scanner(System.in);

        Pedido pedido2 = criarPedido(leitor);

        System.out.println("\n--- Pedido Criado ---");
        System.out.println(pedido2);
        System.out.println("Total do pedido: R$ " + pedido2.calcularTotal());

        leitor.close();
    }

    public static Pedido criarPedido(Scanner leitor) {

        System.out.print("Número do pedido: ");
        int numero = leitor.nextInt();
        leitor.nextLine(); // limpar buffer

        System.out.print("Data: ");
        String data = leitor.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Nome do produto: ");
        String nome = leitor.nextLine();

        System.out.print("Categoria: ");
        String categoria = leitor.nextLine();

        System.out.print("Preço unitário: ");
        double preco = leitor.nextDouble();

        Produto produto = new Produto(nome, categoria, preco);

        return new Pedido(numero, data, quantidade, produto);
    }
}