package desafios.contaBancaria;
// comentar o package quando for executar

public class Main {
    public static void main(String[] args) {
        ContaBancaria edgarContaBancaria = new ContaBancaria();
        edgarContaBancaria.setTitular("Edgar Augusto Mendes de Souza");
        edgarContaBancaria.setSaldo(50);
        edgarContaBancaria.setNumeroConta("0192");

        double valorSaque = 40;
        boolean saque = edgarContaBancaria.sacar(valorSaque);

        System.out.println("valor do saque R$" + valorSaque);
        System.out.println(saque ? "saque realizado com sucesso. saldo atual: R$" + edgarContaBancaria.getSaldo() : "saldo insuficiente");
    }
}