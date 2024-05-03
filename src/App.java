/*Como extra foi adicionada a função de consultar e alterar a titularidade da conta, com a finalidade de manipular tambem o
* nome do dono da conta.*/

import java.util.Scanner;
import Entities.ContaBancaria;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = in.nextLine();
        System.out.print("Informe o número da conta: ");
        String numero = in.nextLine();
        System.out.print("Informe o saldo inicial: ");
        double saldoInicial = in.nextDouble();
        ContaBancaria conta = new ContaBancaria(nome, numero, saldoInicial);

        while (true) {
            System.out.println("\nEscolha uma das operações abaixo:" +
                    "\n1.Depositar Valor" +
                    "\n2.Sacar Valor" +
                    "\n3.Obter Saldo Disponível" +
                    "\n4.Consultar Titularidade da Conta" +
                    "\n5.Trocar Titularidade da Conta" +
                    "\n6.Sair do Caixa Eletrônico");

            int operacao = in.nextInt();
            if (operacao == 6)
                break;

            switch (operacao) {
                case 1:
                    System.out.print("Informe o valor que deseja depositar: ");
                    conta.depositarValor(in.nextDouble());
                    break;
                case 2:
                    System.out.print("Informe o valor que deseja sacar: ");
                    conta.sacarValor(in.nextDouble());;
                    break;
                case 3:
                    System.out.println("Saldo Atual: R$ " + conta.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Titular da Conta: " + conta.consultarTitularidade());
                    break;
                case 5:
                    conta.trocarTitularidade(in.nextLine());
            }
        }



        in.close();
    }
}
