package Atividade9_Exercicio_Fixação_Polimorfismo.Applications;
import Atividade9_Exercicio_Fixação_Polimorfismo.Entities.UsedProduct;
import Atividade9_Exercicio_Fixação_Polimorfismo.Entities.Product;
import Atividade9_Exercicio_Fixação_Polimorfismo.Entities.ImportedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double customsFee = 0;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      List<Product> list = new ArrayList <>();
        System.out.println(" Enter the number of products: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            if (type == 'i') {
                System.out.println("Customs free: ");
                customsFee = scanner.nextDouble();
                ImportedProduct product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            }
            if (type == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(scanner.next(), fmt);
                UsedProduct product = new UsedProduct(name, price, date);
                list.add(product);
            }
            else {
                Product product = new Product(name, price);
                list.add(product);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }
    }
}
