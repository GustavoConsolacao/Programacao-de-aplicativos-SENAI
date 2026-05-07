package Lista1_Orientação_A_Objeto.Questão5_Banco.Applications;
import Lista1_Orientação_A_Objeto.Questão5_Banco.Entities.ContaBancaria;

import java.util.Scanner;
import java.util.Random;
public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ContaBancaria conta = new ContaBancaria();
                System.out.println("Digite o nome do titular");
                conta.titular= scanner.nextLine();
                conta.saldo = (int)(Math.random() * 4001) + 1000;
                System.out.println("Olá "+conta.titular+", seu saldo atual é de: " + conta.saldo);
                System.out.println("Digite 1 para depositar");
                System.out.println("Digite 2 para sacar");

                int opcao = scanner.nextInt();

                if (opcao == 1) {

                    System.out.println("Digite o valor para depositar:");
                    double valor = scanner.nextDouble();

                    conta.depositar(valor);
                    System.out.println("Valor depositado, saldo atual: " + conta.saldo);

                } else if (opcao == 2) {

                    System.out.println("Digite o valor para sacar:");
                    double valor = scanner.nextDouble();

                    conta.sacar(valor);
                }

                scanner.close();
            }
        }





