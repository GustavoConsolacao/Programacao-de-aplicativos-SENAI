package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities;

public class CardapioItens extends Cardapio{
    @Override
    public void exibirCardapio() {
        System.out.println("===== CARDÁPIO =====");
        System.out.println("1 - Hambúrguer R$25");
        System.out.println("2 - Pizza R$40");
        System.out.println("3 - Batata R$15");
        System.out.println("4 - Refrigerante R$10");
        System.out.println("5 - Combo Casal R$55");
        System.out.println("6 - Combo Família R$70");
    }
    @Override
    public void adicionarProduto(int opcao) {
        if (opcao == 1) {
            itens.add("Hambúrguer");
            valorTotal += 25;
        }
        else if (opcao == 2) {
            itens.add("Pizza");
            valorTotal += 40;
        }
        else if (opcao == 3) {
            itens.add("Batata");
            valorTotal += 15;
        }
        else if (opcao == 4) {
            itens.add("Refrigerante");
            valorTotal += 10;
        }
        else if (opcao == 5) {
            itens.add("Combo Casal");
            valorTotal += 55;
        }
        else if (opcao == 6) {
            itens.add("Combo Família");
            valorTotal += 70;
        }
        else {
            System.out.println("Opção inválida.");
        }
    }

}
