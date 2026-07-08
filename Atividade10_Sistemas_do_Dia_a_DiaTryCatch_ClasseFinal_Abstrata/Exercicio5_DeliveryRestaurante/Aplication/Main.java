package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Aplication;

import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities.*;
import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities.Enums.StatusPagamento;
import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities.Enums.StatusPedido;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            Cliente cliente = new Cliente();
            Cardapio cardapio = new CardapioItens();
            Pagamento pagamento = new Pagamento();
            Pedido pedido = new Pedido();
            System.out.println("Olá usuário, Digite seu nome, email e senha para continuarmos com o seu pedido");
            cliente.setNome(sc.nextLine());
            cliente.setEmail(sc.nextLine());
            cliente.setSenha(sc.nextLine());
            System.out.println("Digite novamente seu email e senha para confirmarmos o seu login por favor");
            String email = sc.nextLine();
            String senha = sc.nextLine();
            if (!email.equals(cliente.getEmail())||!senha.equals(cliente.getSenha())) {
                System.out.println("Usuário e/ou senha inválidos.");
                return;
            }
            System.out.println("Login realizado com sucesso");
            int continuar = 1;
            while (continuar == 1) {
                cardapio.exibirCardapio();
                System.out.print("Digite o numero do item escolhido: ");
                int escolha = sc.nextInt();
                cardapio.adicionarProduto(escolha);
                System.out.println("Deseja mais alguma coisa?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                continuar = sc.nextInt();
            }
            System.out.println("Resumo do pedido:");
            for (String item : cardapio.getItens()){
                System.out.println(item);
            }
            System.out.printf("Valor total: R$ %.2f%n", cardapio.getValorTotal());
            double totalFinal = cardapio.calcularFrete();
            if (cardapio.getValorTotal() < 50) {
                System.out.println("Taxa de entrega: R$8,00");
            }
            else {
                System.out.println("Frete grátis aplicado");
            }
            System.out.printf("Total: R$ %.2f%n", totalFinal);
            while (pagamento.getStatus() != StatusPagamento.APROVADO) {
                System.out.println("qual vai ser a forma de pagamento?");
                System.out.println("1 - PIX");
                System.out.println("2 - Cartão");
                int opcaoPagamento = sc.nextInt();
                if (opcaoPagamento == 1) {
                    pagamento.setFormaPagamento("PIX");
                }
                else if (opcaoPagamento == 2) {
                    pagamento.setFormaPagamento("Cartão");
                }
                else {
                    System.out.println("Opção inválida.");
                    continue;
                }
                if (random.nextInt(2) == 1) {
                    pagamento.setStatus(StatusPagamento.APROVADO);
                    System.out.println("Pagamento aprovado");
                } else {
                    pagamento.setStatus(StatusPagamento.RECUSADO);
                    System.out.println("Houve um erro, tente novamente.");
                    break;
                }
                pedido.setNumeroPedido(random.nextInt(1000) + 1);
                pedido.setStatus(StatusPedido.PREPARANDO);
                System.out.println("Pedido realizado com sucesso");
                System.out.println("Número do pedido: " + pedido.getNumeroPedido());
                while (pedido.getStatus() != StatusPedido.ENTREGUE) {
                    System.out.println("Digite REFRESH para atualizar o seu pedido:");
                    String refresh = sc.next();
                    if (refresh.equalsIgnoreCase("refresh")) {
                        if (pedido.getStatus() == StatusPedido.PREPARANDO) {
                            if (random.nextInt(2) == 1) {
                                pedido.setStatus(StatusPedido.SAIU_PARA_ENTREGA);
                            }
                        }
                        else if (pedido.getStatus() == StatusPedido.SAIU_PARA_ENTREGA) {
                            if (random.nextInt(2) == 1) {
                                pedido.setStatus(StatusPedido.ENTREGUE);
                            }
                        }
                        System.out.println("Status atual: " + pedido.getStatus());
                    }
                }
                System.out.println("Pedido entregue");
                System.out.println("Obrigado pela preferência.");
                sc.close();
                break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    }

