package contateste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria("João", 123);
        ContaBancaria conta2 = new ContaBancaria("Maria", 456);

        int opcao;
        do {
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir para Maria");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta1.exibirSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDep = sc.nextDouble();
                    conta1.depositar(valorDep);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaq = sc.nextDouble();
                    conta1.sacar(valorSaq);
                    break;
                case 4:
                    System.out.print("Digite o valor para transferir para Maria: ");
                    double valorTransf = sc.nextDouble();
                    conta1.transferir(conta2, valorTransf);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
