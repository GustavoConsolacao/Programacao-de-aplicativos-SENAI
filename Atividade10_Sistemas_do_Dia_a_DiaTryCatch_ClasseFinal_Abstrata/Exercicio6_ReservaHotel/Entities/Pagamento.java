package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio6_ReservaHotel.Entities;

public class Pagamento {
    private String formaPagamento;
    private boolean aprovado;
    public Pagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
        this.aprovado = false;
    }
    public boolean validarPagamento() {
        aprovado = true;
        return aprovado;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public boolean isAprovado() {
        return aprovado;
    }
    public String toString() {
        return "Pagamento{" + "Forma de Pagamento = " + formaPagamento + "Status = " + (aprovado ? "Aprovado" : "Recusado") + "}";
    }
}

