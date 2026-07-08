package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio4_ControleEstacionamento.Entities;

public abstract class Veiculo {

    private String placa;
    private String tipo;
    public int horaEntrada;

    private boolean vagasDisponiveis;
    private boolean pagamentoAprovado;

    public abstract double calcularPagamento(int horaSaida);

    public StatusEstacionamento verificarSaida() {

        if (!vagasDisponiveis) {
            return StatusEstacionamento.LOTADO;
        }

        if (!pagamentoAprovado) {
            return StatusEstacionamento.PAGAMENTO_RECUSADO;
        }

        return StatusEstacionamento.SAIDA_LIBERADA;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public boolean isVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(boolean vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public boolean isPagamentoAprovado() {
        return pagamentoAprovado;
    }

    public void setPagamentoAprovado(boolean pagamentoAprovado) {
        this.pagamentoAprovado = pagamentoAprovado;
    }
}