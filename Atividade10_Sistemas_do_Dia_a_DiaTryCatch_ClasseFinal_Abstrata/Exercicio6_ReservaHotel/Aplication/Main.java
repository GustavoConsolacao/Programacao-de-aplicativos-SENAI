package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio6_ReservaHotel.Aplication;
import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio6_ReservaHotel.Entities.*;


import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                try {
                    Scanner sc = new Scanner(System.in);

                    System.out.println(" SISTEMA DE RESERVA DE HOTEL ");
                    System.out.print("Nome do hospede: ");
                    String nome = sc.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = sc.nextLine();
                    System.out.print("Quantidade de hospedes: ");
                    int quantidadeHospedes = sc.nextInt();
                    System.out.print("Quantidade de diárias: ");
                    int diarias = sc.nextInt();
                    sc.nextLine();
                    Quarto quarto = new Quarto(101, "Casal", 250.0);
                    if (!quarto.isDisponivel()) {
                        System.out.println("Nenhum quarto disponivel.");
                        sc.close();
                        return;
                    }
                    System.out.println("Quarto encontrado:");
                    System.out.println(quarto);
                    System.out.print("Forma de pagamento: ");
                    String formaPagamento = sc.nextLine();
                    Hospede hospede = new Hospede(nome);
                    Reserva reserva = new ReservaTotal(hospede, quarto, diarias);
                    Pagamento pagamento = new Pagamento(formaPagamento);
                    System.out.println(" Resumo da reserva ");
                    System.out.println(reserva);
                    if (pagamento.validarPagamento()) {
                        quarto.reservar();
                        System.out.println("      Pagamento    ");
                        System.out.println(pagamento);
                        System.out.println("Hospedagem registrada.");
                        System.out.println("Confirmação enviada por e-mail.");
                        System.out.println("Reserva confirmada.");

                    } else {
                        System.out.println("Pagamento recusado.");
                    }
                    sc.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

