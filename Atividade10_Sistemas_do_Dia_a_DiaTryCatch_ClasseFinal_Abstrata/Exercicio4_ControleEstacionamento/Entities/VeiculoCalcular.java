package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio4_ControleEstacionamento.Entities;

public class VeiculoCalcular extends Veiculo{
    @Override
    public double calcularPagamento(int horaSaida) {

        int tempo = horaSaida - horaEntrada;

        if (tempo <= 1) {
            return 10.0;
        }

        return 10.0 + (tempo - 1) * 5.0;
    }
}
