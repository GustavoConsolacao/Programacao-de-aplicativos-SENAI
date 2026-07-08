package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio7_ContasUsuario.Entities;

public final class ContaUsuario extends ContaStreaming {

    private PlanoTipo plano;

    public ContaUsuario(String nomeUsuario, String email, PlanoTipo plano) {
        super(
                nomeUsuario,
                email,
                plano == PlanoTipo.PADRAO ? 30.0 : 50.0
        );

        this.plano = plano;
    }

    @Override
    public String detalhesPlano() {

        if (plano == PlanoTipo.PADRAO) {

            return "Plano: PADRÃO"
                    + "\nQualidade Máxima: Full HD"
                    + "\nLimite de Telas: 2";
        }

        return "Plano: PREMIUM"
                + "\nQualidade Máxima: 4K Ultra HD"
                + "\nLimite de Telas: 4"
                + "\nDownload Offline: Sim";
    }
}