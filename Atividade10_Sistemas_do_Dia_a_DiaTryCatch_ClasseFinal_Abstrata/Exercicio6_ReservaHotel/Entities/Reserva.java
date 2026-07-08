package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio6_ReservaHotel.Entities;

public abstract class Reserva {

    public Hospede hospede;
    public Quarto quarto;
    public int diarias;

    public Reserva(Hospede hospede, Quarto quarto, int diarias) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.diarias = diarias;
    }

    public abstract double calcularValorTotal();

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getDiarias() {
        return diarias;
    }


    public String toString() {
        return "Reserva{" + "Hospede = " + hospede.getNome() + "Quarto = " + quarto.getNumero() + "Diarias = " + diarias + "Valor Total = R$ " + calcularValorTotal() + "}";
    }
}
