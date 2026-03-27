import java.util.HashMap;

public class ControleDeEstoque {
    private HashMap<String, Produto> estoque;

    public ControleDeEstoque() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.put(produto.getCodigo(), produto);
    }

    public void removerProduto(String codigo) {
        estoque.remove(codigo);
    }

    public void atualizarQuantidade(String codigo, int novaQuantidade) {
        Produto p = estoque.get(codigo);
        if (p != null) {
            p.setQuantidadeEmEstoque(novaQuantidade);
        }
    }

    public Produto buscarProduto(String codigo) {
        return estoque.get(codigo);
    }

    public void listarProdutos() {
        for (Produto p : estoque.values()) {
            System.out.println(p);
        }
    }
}