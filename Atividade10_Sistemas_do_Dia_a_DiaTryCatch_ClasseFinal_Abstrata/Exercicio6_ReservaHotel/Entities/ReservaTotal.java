package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio6_ReservaHotel.Entities;

public class ReservaTotal extends Reserva{
    public ReservaTotal(Hospede hospede, Quarto quarto, int diarias) {
        super(hospede, quarto, diarias);
    }

    @Override
    public double calcularValorTotal() {
        double total = quarto.getValorDiaria() * diarias;

        if (getDiarias() > 5) {
            total *= 0.90;
        }

        return total;
    }
}
