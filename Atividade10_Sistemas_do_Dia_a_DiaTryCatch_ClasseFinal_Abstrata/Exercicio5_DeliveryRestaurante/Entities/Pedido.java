package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities;

import Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio5_DeliveryRestaurante.Entities.Enums.StatusPedido;

public class Pedido {
    private Integer numeroPedido;
    private StatusPedido status;
    public Pedido(Integer numeroPedido, StatusPedido status) {
        this.numeroPedido = numeroPedido;
        this.status = status;
    }

    public Pedido() {

    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public StatusPedido getStatus() {
        return status;
    }
    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
