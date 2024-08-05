package org.example;

import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();
        conta.init();
    }

     public void init(){
        exibirBoasVindas();
        obterInformacoesCliente();
        exibirMensageEncerramento();
    }

    private void obterInformacoesCliente(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numero = ler.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = ler.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = ler.next();

        System.out.println("Por favor, insira o saldo: ");
        saldo = ler.nextDouble();
    }

    private void exibirBoasVindas(){
        System.out.println(" *** Bem vindo ao Conta Banco ***");
    }

    private void exibirMensageEncerramento(){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo);
    }
}
