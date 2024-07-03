package desafios.carrinhoDeCompras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();
        final Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        do {
            System.out.println("====== Carrinho de compras ======");

            System.out.println("=== Digite [1] para adicionar um item ===");
            System.out.println("=== Digite [2] para remover um item ===");
            System.out.println("=== Digite [3] para ver quantos itens tem no carrinho de compras ===");
            System.out.println("=== Digite [4] para ver as compras ===");
            System.out.println("=== Digite [5] para ver o valor total das compras ===");
            System.out.println("=== Digite [6] para finalizar o programa ===");

            final byte resp = scan.nextByte();
            scan.nextLine();

            switch (resp) {
                case 1:
                    System.out.println("");

                    System.out.println("== Digite o nome do produto ==");
                    final String nomeProduto = scan.nextLine();

                    System.out.println("== Digite o preço do produto ==");
                    final double precoProduto = scan.nextDouble();

                    System.out.println("== Digite a quantidade do produto ==");
                    final int quantidadeProduto = scan.nextInt();
                    scan.nextLine();

                    carrinhoCompras.adicionarItem(nomeProduto, precoProduto, quantidadeProduto);

                    System.out.println("");
                    System.out.println("Produto adicionado com sucesso!");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("== Digite o nome do produto a ser removido ==");
                    String produtoASerRemovido = scan.nextLine();

                    carrinhoCompras.removerItem(produtoASerRemovido);

                    System.out.println("");
                    System.out.println("Produto removido com sucesso!");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Número de itens no carrinho de compras: " + carrinhoCompras.obterNumeroTotalItens());
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("== Produtos ==");
                    for(int c = 0; c < carrinhoCompras.obterNumeroTotalItens(); c++) {
                        System.out.println((c + 1) + "º produto: " + carrinhoCompras.obterNomeItem(c) + " (R$" + carrinhoCompras.obterPrecoItem(c) + ")");
                    }

                    System.out.println("");
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("Valor total dos produtos: (R$" + carrinhoCompras.obterValorTotal() + ")");
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("");
                    System.out.println("Fim do programa");
                    System.out.println("");
                    continuar = false;
                    break;

                default:
                    System.out.println("Digite uma opção válida");

                    System.out.println("");
                    break;
            }
        } while(continuar);

        scan.close();
    }
}