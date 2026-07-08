package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities;
import java.util.ArrayList;

public abstract class Cardapio {
    public ArrayList<String> itens;
    public double valorTotal;
    public Cardapio() {
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }
    public ArrayList<String> getItens() {
        return itens;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public abstract void exibirCardapio();
    public abstract void adicionarProduto(int opcao);

    public double calcularFrete() {
        if (valorTotal < 50) {
            return valorTotal + 8;
        }
        else {
            return valorTotal;
        }
    }
}

