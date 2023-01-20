package br.com.controle;

/**
 *
 * @author VictinhoBR Programa para simular um caixa eletronico simples
 *
 */
public class Banco {
//criar atributos

    private double saque;
    private double deposito;
    private double saldo;

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
        this.saldo -= this.saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
        this.saldo += this.deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
