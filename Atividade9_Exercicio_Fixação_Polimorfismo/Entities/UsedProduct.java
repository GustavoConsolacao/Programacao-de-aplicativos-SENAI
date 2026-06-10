package Atividade9_Exercicio_Fixação_Polimorfismo.Entities;

import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;
    public UsedProduct (String Name, Double Price, LocalDate manufactureDate) {
        super(Name, Price);
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag () {
        return getName() + " (Used) $" + getPrice() + " (Manufacture date: " + manufactureDate + " )";
    }
}
