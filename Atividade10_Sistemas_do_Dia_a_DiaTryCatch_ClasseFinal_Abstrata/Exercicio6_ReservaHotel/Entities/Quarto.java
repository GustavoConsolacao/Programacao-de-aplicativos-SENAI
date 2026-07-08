package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio6_ReservaHotel.Entities;

public class Quarto {

    private int numero;
    private String tipo;
    private double valorDiaria;
    private boolean disponivel;

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        disponivel = false;
    }

    public String toString() {
        return "Quarto{" + "Número = " + numero + "Tipo = " + tipo + "Valor da Diária = R$ " + valorDiaria + "Disponível = " + disponivel + "}";
    }
}

