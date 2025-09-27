package estudo.JavaBasico.DesafiosDIO;

import java.util.Scanner;

public class Salario_Imposto {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                   
                    break;
                case 3:
                    System.out.println("Saldo atual:" + (saldo));
                    
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
