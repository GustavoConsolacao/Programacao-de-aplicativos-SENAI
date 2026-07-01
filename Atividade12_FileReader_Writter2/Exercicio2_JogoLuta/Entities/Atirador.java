package Atividade12_FileReader_Writter2.Exercicio2_JogoLuta.Entities;

public class Atirador extends Atividade12_FileReader_Writter2.Exercicio2_JogoLuta.Entities.Personagem {

    private String armaPrincipal;

    public Atirador(String nome,
                    int forcaBase,
                    String armaPrincipal) {

        super(nome, forcaBase);
        this.armaPrincipal = armaPrincipal;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Arma: "
                + armaPrincipal;
    }
}