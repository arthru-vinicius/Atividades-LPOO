package Excecoes;

import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaCorrente {
    private String numeroConta;
    private double saldo;
    
    public ContaCorrente(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque de " + valor);
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso. Saldo atual: " + saldo);
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }
}

public class Qs5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        
        ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial);
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o valor do saque #" + i + ": ");
            double valorSaque = scanner.nextDouble();
            
            try {
                conta.sacar(valorSaque);
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
}
