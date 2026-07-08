package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio6_ReservaHotel.Entities;

public final class ReservaFinal extends Reserva {

    public ReservaFinal(Hospede hospede, Quarto quarto, int diarias) {
        super(hospede, quarto, diarias);
    }

    @Override
    public double calcularValorTotal() {
        return 0;
    }
}
