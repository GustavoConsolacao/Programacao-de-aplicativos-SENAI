package Atividade9_Exercicio_Fixação_Polimorfismo.Entities;

public class Product {
    private String Name;
    private Double Price;
    public Product(String Name, Double Price){
        this.Name = Name;
        this.Price = Price;
    }
    public String priceTag() {
        return Name + " $ " + Price;
    }
    public String getName() {
        return Name;
    }

    public Double getPrice() {
        return Price;
    }
}
