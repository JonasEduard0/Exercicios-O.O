import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControleDeEstoque controle = new ControleDeEstoque();

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("\n Menu");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Atualizar Quantidade");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Buscar Produto");
            System.out.println("6 - Sair");

            System.out.print("Digite o nimero da sua escolha : ");
            opcao = sc.nextInt();
            sc.nextLine(); //isso pq senão o programa pula leitura de string

            if (opcao == 1) {

                String codigo, nome;
                int quantidade;
                System.out.print("Codigo: ");
                codigo = sc.nextLine();
                System.out.print("Nome: ");
                nome = sc.nextLine();
                System.out.print("Quantidade: ");
                quantidade = sc.nextInt();
                Produto p = new Produto(codigo, nome, quantidade);
                controle.adicionarProduto(p);

            } else if (opcao == 2) {

                String codigo;
                System.out.print("Codigo: ");
                codigo = sc.nextLine();
                controle.removerProduto(codigo);

            } else if (opcao == 3) {

                String codigo;
                int quantidade;
                System.out.print("Codigo: ");
                codigo = sc.nextLine();
                System.out.print("Nova quantidade: ");
                quantidade = sc.nextInt();
                controle.atualizarQuantidade(codigo, quantidade);

            } else if (opcao == 4) {
                controle.listarProdutos();

            } else if (opcao == 5) {

                String codigo;
                System.out.print("Codigo: ");
                codigo = sc.nextLine();
                Produto p = controle.buscarProduto(codigo);

                if (p != null) {
                    System.out.println(p);
                } else {
                    System.out.println("Produto nao achado");
                }
            }}
        sc.close();
}}