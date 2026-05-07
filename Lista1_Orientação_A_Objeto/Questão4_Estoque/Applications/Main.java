package Lista1_Orientação_A_Objeto.Questão4_Estoque.Applications;

import Lista1_Orientação_A_Objeto.Questão4_Estoque.Entities.Produto;

import java.util.Scanner;
    public class Main {
        static void main() {
Produto produto= new Produto();
Scanner scanner= new Scanner(System.in);
            System.out.println("Insira o nome do produto");
            produto.Nome= scanner.nextLine();
            System.out.println("Insira o preço do produto");
            produto.Preço= scanner.nextDouble();
            System.out.println("Insira a quantidade do produto no estoque");
produto.QuantidadeEstoque= scanner.nextDouble();
produto.resumo();
scanner.close();
        }


    }


