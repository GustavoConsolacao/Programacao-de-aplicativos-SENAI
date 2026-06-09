package Atividade9_Exemplo_Fixação_Polimorfismo.Entities;

public class SavingsAccount extends Account {
    private Double interestRate;//Isso aqui é igual a "Taxa de Juros"

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double interestRate) {
        super(number, holder);
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
    public void updateBalance(){

        balance += balance * interestRate;
    }
    @Override
    public void withdraw(Double amount){/*Sobrescrevendo um método da classe Atividade9_Exemplo_Fixação_Polimorfismo.Entities.Account com @Override*/
        balance -= amount;              //Agora temos dois metodos com o mesmo nome que fazem a mesma coisa
    }
}