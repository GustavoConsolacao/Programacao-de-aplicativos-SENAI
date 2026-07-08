package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio6_ReservaHotel.Entities;

public class Hospede {

    private String nome;

    public Hospede(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Hospede{" + "nome='" + nome + '\'' + '}';
    }
}