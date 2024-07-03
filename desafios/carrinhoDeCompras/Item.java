package desafios.carrinhoDeCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String obterNome() { return nome; }
    public double obterPreco() { return preco; }
    public double obterQuantidade() { return quantidade; }
}