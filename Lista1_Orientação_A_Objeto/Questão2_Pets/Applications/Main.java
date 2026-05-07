package Lista1_Orientação_A_Objeto.Questão2_Pets.Applications;
import java.util.Scanner;
import Lista1_Orientação_A_Objeto.Questão2_Pets.Entities.Cachorro;
public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Cachorro cachorro1 = new Cachorro();
    Cachorro cachorro2 = new Cachorro();
    System.out.println("Digite o nome do cachorro 1:");
    cachorro1.nome = scanner.nextLine();
    System.out.println("Digite a raça do cachorro 1:");
    cachorro1.raca = scanner.nextLine();
    System.out.println("Digite a idade do cachorro 1:");
    cachorro1.idade = scanner.nextInt();
    scanner.nextLine();

    System.out.println("\nDigite o nome do cachorro 2:");
    cachorro2.nome = scanner.nextLine();
    System.out.println("Digite a raça do cachorro 2:");
    cachorro2.raca = scanner.nextLine();
    System.out.println("Digite a idade do cachorro 2:");
    cachorro2.idade = scanner.nextInt();
    int numero = (int) (Math.random() * 2) + 1;


    if (numero == 1) {
        cachorro1.latir();
    } else {
        cachorro2.latir();
    }

    scanner.close();
}

}
