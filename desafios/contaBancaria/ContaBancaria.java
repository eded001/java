package desafios.contaBancaria;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;
    private String titular;

    // getters
    public double getSaldo() {
        return this.saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    // setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public boolean sacar(double valorSaque) {
        double saldoAtual = this.saldo;

        if(valorSaque > saldoAtual) {
            return false; // saldo insuficiente
        } else {
            this.saldo -= valorSaque;

            return true; // saque realizado com sucesso
        }
    }
}