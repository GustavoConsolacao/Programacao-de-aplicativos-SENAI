package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Application;

import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Entities.ContaStreaming;
import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Entities.ContaUsuario;
import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Entities.PlanoTipo;
import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Entities.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String nome = "";

            while (nome.trim().isEmpty()) {
                System.out.print("Nome do usuário: ");
                nome = sc.nextLine();
            }

            String email = "";

            while (email.trim().isEmpty()) {
                System.out.print("Email: ");
                email = sc.nextLine();
            }

            PlanoTipo plano = null;

            while (plano == null) {

                System.out.print("Plano (PADRAO/PREMIUM): ");

                try {
                    plano = PlanoTipo.valueOf(
                            sc.nextLine().trim().toUpperCase()
                    );
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Plano inválido.");
                }
            }

            ContaStreaming conta =
                    new ContaUsuario(nome, email, plano);

            System.out.println();
            System.out.println("===== RECIBO DA ASSINATURA =====");
            System.out.println(conta);

        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}