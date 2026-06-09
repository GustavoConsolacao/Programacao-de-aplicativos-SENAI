package Atividade9_Exemplo_Fixação_Polimorfismo.Entities;

public class BusinessAccount extends Account {
    public Double loanLimit;

    /*
    Neste Construtor devemos ter atenção pois como estamos utilizando a herança para
    qua esta classe Atividade9_Exemplo_Fixação_Polimorfismo.Entities.BusinessAccount possua os mesmos atributos da super classe Atividade9_Exemplo_Fixação_Polimorfismo.Entities.Account,
    nos devemos criar um construtos que tenha tbm como parâmeto/argumento o atributo
    loanLimit passando a obrigatoriedade de preenchimento dos valores.
     */

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Integer number, String holder, Double loanLimit) {
        super(number, holder);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {

        return loanLimit;
    }

    public void loan(Double amount) {//
        if (amount <= loanLimit) {     //Testando se o valor pedido(amount)
            balance -= amount - 10.0;// é inferior ao limite de emprestimo liberado(loanLimit)
            //Aqui usamos o tipo protected em balance
        }
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 15.0;

    }
}