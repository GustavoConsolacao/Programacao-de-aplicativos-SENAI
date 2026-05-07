package Lista1_Orientação_A_Objeto.Questão3_Calculadora.Applications;

import Lista1_Orientação_A_Objeto.Questão3_Calculadora.Entities.Retangulo;

import java.util.Scanner;
    public class Main {
        static void main() {
            Scanner scanner = new Scanner(System.in);
            Retangulo retangulo = new Retangulo();
            System.out.println("Insira o valor da base");
            retangulo.base=scanner.nextDouble();
            System.out.println("Insira o valor da altura");
            retangulo.altura=scanner.nextDouble();
            double Area= retangulo.CalculoArea();
            System.out.println("A área do retangulo é " + Area);

        }


    }


