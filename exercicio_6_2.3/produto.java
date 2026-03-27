public class Produto {
    private String codigo;
    private String nome;
    private int quantidadeEmEstoque;

    public Produto(String codigo, String nome, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String toString() {
        return "Codigo: " + codigo + " | Nome: " + nome + " | Quantidade: " + quantidadeEmEstoque;
    }
}