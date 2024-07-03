package desafios.listaDeTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final ListaTarefa listaTarefa = new ListaTarefa();
        final Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        do {
            System.out.println("====== Lista de tarefas ======");

            System.out.println("=== Digite [1] para adicionar uma tarefa ===");
            System.out.println("=== Digite [2] para remover uma tarefa ===");
            System.out.println("=== Digite [3] para ver quantas tarefas tem na lista de tarefas ===");
            System.out.println("=== Digite [4] para ver as tarefas ===");
            System.out.println("=== Digite [5] para finalizar o programa ===");

            final byte resp = scan.nextByte();
            scan.nextLine();

            switch (resp) {
                case 1:
                    System.out.println("== Digite abaixo a descrição da tarefa que deseja adicionar ==");
                    String conteudoAdicionar = scan.nextLine();

                    System.out.println("Tarefa adicionada com sucesso!");

                    System.out.println("");

                    listaTarefa.adicionarTarefa(conteudoAdicionar);
                    break;

                case 2:
                    System.out.println("== Digite abaixo a descrição da tarefa que deseja remover ==");
                    String conteudoRemover = scan.nextLine();

                    System.out.println("");

                    listaTarefa.removerTarefa(conteudoRemover);
                    break;

                case 3:
                    System.out.println("Quantidade de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

                    System.out.println("");
                    break;

                case 4:
                    System.out.println("== Tarefas ==");
                    for(int c = 0; c < listaTarefa.obterNumeroTotalTarefas(); c++) {
                        System.out.println((c + 1) + "º tarefa: " + listaTarefa.obterDescricoesTarefas(c));
                    }

                    System.out.println("");
                    break;

                case 5:
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