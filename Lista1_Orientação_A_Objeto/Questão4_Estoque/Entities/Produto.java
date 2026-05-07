package Lista1_Orientação_A_Objeto.Questão4_Estoque.Entities;

import java.util.Locale;


public class Produto {
        public String Nome;
        public double Preço;

        public Double QuantidadeEstoque;
         public void resumo() {
Double total = Preço * QuantidadeEstoque;
             System.out.println("Resumo:");
             System.out.println("Nome do produto: " + Nome);
             System.out.println("Preço do produto: R$" + Preço);
             System.out.println("Quantidade do produto no estoque: " + QuantidadeEstoque);
             System.out.println("Valor total do produto: R$" + total);
        }
    }


