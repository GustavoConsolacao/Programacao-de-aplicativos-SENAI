package ProductStock.Applications;

import ProductStock.Entities.ProductData;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ProductData productdata = new ProductData();
        System.out.println("Enter product data:");
        System.out.println("Name:");
        productdata.Name = scanner.nextLine();
        System.out.println("Price:");
        productdata.Price =scanner.nextDouble();
        System.out.println("Quantity:");
        productdata.Quantity = scanner.nextInt();
        System.out.println("Product data: " + productdata.Name + ", $" + productdata.Price + ", " + productdata.Quantity + " units, Total: " + productdata.TotalValueinStock());
        System.out.println("Enter the number of products to be added in stock: ");
        int AddQuantity = scanner.nextInt();
        productdata.AddProducts(AddQuantity);
        System.out.println("Updated data: " + productdata.Name + ", $" + productdata.Price + ", " + productdata.Quantity + " units, Total: " + productdata.TotalValueinStock());
        System.out.println("Enter the number of products to be removed from stock: ");
        int RemoveQuantity = scanner.nextInt();
        productdata.RemoveProducts(RemoveQuantity);
        System.out.println("Updated data: " + productdata.Name + ", $" + productdata.Price + ", " + productdata.Quantity + " units, Total: " + productdata.TotalValueinStock());

    }

        }





