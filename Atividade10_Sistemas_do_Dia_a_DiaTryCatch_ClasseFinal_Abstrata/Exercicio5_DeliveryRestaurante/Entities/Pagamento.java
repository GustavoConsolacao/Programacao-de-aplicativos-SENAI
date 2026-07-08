package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities;

import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities.Enums.StatusPagamento;

public class Pagamento {
    private String formaPagamento;
    private StatusPagamento status;
    public Pagamento(String formaPagamento, StatusPagamento status) {
        this.formaPagamento = formaPagamento;
        this.status = status;
    }

    public Pagamento() {

    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public StatusPagamento getStatus() {
        return status;
    }
    public void setStatus(StatusPagamento status) {
        this.status = status;
    }
}
