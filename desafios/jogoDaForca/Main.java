// package desafios.jogoDaForca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JogoForca jogoForca = new JogoForca("cachorro", "animal");
        String[] array = {"o", "r", "y", "p"};

        jogoForca.mostrarBonequinho();

        jogoForca.atualizarLinha(array);
        jogoForca.mostrarLinha();
        System.out.println("cachorro");
    }
}