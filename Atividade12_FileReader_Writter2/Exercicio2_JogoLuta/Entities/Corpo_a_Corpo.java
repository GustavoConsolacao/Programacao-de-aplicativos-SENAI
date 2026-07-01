package Atividade12_FileReader_Writter2.Exercicio2_JogoLuta.Entities;

public class Corpo_a_Corpo extends Atividade12_FileReader_Writter2.Exercicio2_JogoLuta.Entities.Personagem {

    private String arteMarcial;

    public Corpo_a_Corpo(String nome,
                         int forcaBase,
                         String arteMarcial) {

        super(nome, forcaBase);
        this.arteMarcial = arteMarcial;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Arte Marcial: "
                + arteMarcial;
    }
}