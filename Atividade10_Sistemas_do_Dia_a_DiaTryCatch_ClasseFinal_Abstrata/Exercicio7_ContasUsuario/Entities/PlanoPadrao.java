package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Entities;

public class PlanoPadrao extends ContaStreaming {

    private String qualidadeVideo = "Full HD";
    private int limiteTelas = 2;

    public PlanoPadrao(String nomeUsuario, String email) {

        super(nomeUsuario, email);
        setPrecoBase(30.0);
    }

    private void setPrecoBase(double v) {

    }

    @Override
    public String detalhesPlano() {
        return "";
    }

    @Override
    public String toString() {

        return super.toString()
                + "\nPlano: PADRAO"
                + "\nQualidade: " + qualidadeVideo
                + "\nLimite de telas: " + limiteTelas;
    }
}