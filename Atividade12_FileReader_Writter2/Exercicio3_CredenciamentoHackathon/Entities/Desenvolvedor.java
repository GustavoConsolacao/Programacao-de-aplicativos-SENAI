package Atividade12_FileReader_Writter2.Exercicio3_CredenciamentoHackathon.Entities;

public class Desenvolvedor
        extends Atividade12_FileReader_Writter2.Exercicio3_CredenciamentoHackathon.Entities.Participante {

    private String linguagemFavorita;

    public Desenvolvedor(String nome,
                         int idade,
                         String matricula,
                         String linguagemFavorita) {

        super(nome, idade, matricula);
        this.linguagemFavorita =
                linguagemFavorita;
    }

    @Override
    public String toString() {

        return super.toString()
                + ", Linguagem: "
                + linguagemFavorita;
    }
}
