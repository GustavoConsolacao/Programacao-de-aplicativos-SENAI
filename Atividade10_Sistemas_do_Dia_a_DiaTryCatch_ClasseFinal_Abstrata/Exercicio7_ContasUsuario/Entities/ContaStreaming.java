package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Entities;

public abstract class ContaStreaming {

    private String nomeUsuario;
    private String email;
    private double precoBase;

    public ContaStreaming(String nomeUsuario, String email, double precoBase) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.precoBase = precoBase;
    }

    public ContaStreaming(String nomeUsuario, String email) {
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract String detalhesPlano();

    @Override
    public String toString() {
        return "Nome: " + nomeUsuario
                + "\nEmail: " + email
                + "\nPreço: R$ " + String.format("%.2f", precoBase)
                + "\n" + detalhesPlano();
    }
}