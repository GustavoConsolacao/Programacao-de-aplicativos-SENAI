package Atividade9_Exercicio_Fixação_Polimorfismo.Entities;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct(String Name, Double Price, Double customsFee) {
        super(Name, Price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + totalPrice() + " (Customs fee: $" + customsFee + ")";
    }
}

