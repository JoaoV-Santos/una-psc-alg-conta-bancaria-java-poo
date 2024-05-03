package Entities;

import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private String numero;
    private double saldo;

    public ContaBancaria (String nome, String numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;

        System.out.println("\nConta bancária criada com sucesso!");
    }

    public void depositarValor (double valor) {
        this.saldo += valor;
    }

    public void sacarValor (double valor) {
        saldo -= valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String consultarTitularidade() {
        return nome;
    }

    public void trocarTitularidade(String nome) {
        if (saldo == 0) {
            Scanner in = new Scanner(System.in);
            System.out.print("Informe o nome do novo titular da conta: ");
            nome = in.nextLine();
            this.nome = nome;
            System.out.println("Novo Titular da Conta: " + nome);
        }
        else {
            System.out.println("Para alterar a titularidade da conta, o saldo deve ser de R$ 0,00.");
            System.out.println("Saldo Atual: " + consultarSaldo());
        }
    }

}
