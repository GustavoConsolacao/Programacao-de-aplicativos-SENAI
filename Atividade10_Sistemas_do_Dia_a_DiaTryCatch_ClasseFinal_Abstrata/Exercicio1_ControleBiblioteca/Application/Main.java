package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio1_ControleBiblioteca.Application;

import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio1_ControleBiblioteca.Entities.Biblioteca;
import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio1_ControleBiblioteca.Entities.BibliotecaAluno;
import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio1_ControleBiblioteca.Entities.StatusEmprestimo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca aluno = new BibliotecaAluno();
        try {
            System.out.print("Informe a matrícula: ");
            aluno.setMatricula(sc.nextInt());
            if (aluno.getMatricula() >= 100) {
                String respostaMulta;
                do {
                    System.out.print("Possui multa pendente? (sim/nao): ");
                    respostaMulta = sc.next();
                    if (!respostaMulta.equalsIgnoreCase("sim")
                            && !respostaMulta.equalsIgnoreCase("nao")) {
                        System.out.println("Digite apenas sim ou nao.");
                    }
                } while (!respostaMulta.equalsIgnoreCase("sim") && !respostaMulta.equalsIgnoreCase("nao"));
                aluno.setMulta(respostaMulta.equalsIgnoreCase("sim"));
                if (!aluno.isMulta()) {
                    System.out.print("Quantidade de livros emprestados: ");
                    aluno.setLivrosEmprestados(sc.nextInt());
                    if (aluno.getLivrosEmprestados() < 5) {
                        System.out.print("Código do livro: ");
                        aluno.setCodigoLivro(sc.nextInt());
                        String respostaLivro;
                        do {
                            System.out.print("Livro disponível? (sim/nao): ");
                            respostaLivro = sc.next();
                            if (!respostaLivro.equalsIgnoreCase("sim") && !respostaLivro.equalsIgnoreCase("nao")) {
                                System.out.println("Digite apenas sim ou nao.");
                            }
                        } while (!respostaLivro.equalsIgnoreCase("sim") && !respostaLivro.equalsIgnoreCase("nao"));
                        aluno.setDisponivel(respostaLivro.equalsIgnoreCase("sim"));
                    }
                }
            }

            StatusEmprestimo status = aluno.verificarEmprestimo();

            switch (status) {

                case ALUNO_NAO_ENCONTRADO:
                    System.out.println("Aluno não encontrado.");
                    break;

                case BLOQUEADO_POR_MULTA:
                    System.out.println("Empréstimo bloqueado por multa.");
                    break;

                case LIMITE_ATINGIDO:
                    System.out.println("Limite de empréstimos atingido.");
                    break;

                case LIVRO_INDISPONIVEL:
                    System.out.println("Livro indisponível.");
                    break;

                case EMPRESTIMO_REALIZADO:
                    System.out.println("Empréstimo realizado com sucesso.");
                    break;
            }

        } catch (Exception e) {

            System.out.println("Erro: digite valores válidos.");

        } finally {

            sc.close();
        }
    }

}