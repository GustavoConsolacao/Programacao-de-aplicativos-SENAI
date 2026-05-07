package Lista1_Orientação_A_Objeto.Questão5_Banco.Entities;

    public class ContaBancaria {
        public String titular;
        public double saldo;
        public void depositar(double valor) {
            saldo = saldo + valor;
        }
        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                System.out.println("Valor sacado, saldo atual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente, saldo atual: " + saldo);
            }
        }


    }


