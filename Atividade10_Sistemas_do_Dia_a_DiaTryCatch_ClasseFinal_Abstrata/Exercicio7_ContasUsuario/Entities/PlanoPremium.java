package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Entities;

public class PlanoPremium extends ContaStreaming {

    private String qualidadeVideo = "4K Ultra HD";
    private int limiteTelas = 4;
    private boolean permiteDownload = true;

    public PlanoPremium(String nomeUsuario, String email) {

        super(nomeUsuario, email);
        setPrecoBase(50.0);
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
                + "\nPlano: PREMIUM"
                + "\nQualidade: " + qualidadeVideo
                + "\nLimite de telas: " + limiteTelas
                + "\nDownload Offline: "
                + (permiteDownload ? "Ativo" : "Inativo");
    }
}