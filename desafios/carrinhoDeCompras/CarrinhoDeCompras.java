package desafios.carrinhoDeCompras;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    // método construtor que cria um array
    public CarrinhoDeCompras() { this.itemList = new ArrayList<>(); }

    // método que adiciona uma nova tarefa adicionando ao ArrayList com o método "add" instanciando a classe "Item"
    public void adicionarItem(String nome, double preco, int quantidade) { for(int c = 1; c <= quantidade; c++) itemList.add(new Item(nome, preco, quantidade)); }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item item : itemList) if(item.obterNome().equalsIgnoreCase(nome)) itensParaRemover.add(item);

        itemList.removeAll(itensParaRemover);
    }

    public double obterValorTotal() {
        double precos = 0.0;

        for (Item item : itemList) {
            precos += item.obterPreco();
        }

        return precos;
    }

    public String obterNomeItem(int index) {
        if(index >= 0 && index < this.itemList.size()) return this.itemList.get(index).obterNome().toString();

        return null;
    }

    public double obterPrecoItem(int index) {
        if(index >= 0 && index < this.itemList.size()) return this.itemList.get(index).obterPreco();
        else return -1.0;
    }

    public int obterNumeroTotalItens() { return itemList.size(); }
}