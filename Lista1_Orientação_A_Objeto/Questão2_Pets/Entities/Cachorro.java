package Lista1_Orientação_A_Objeto.Questão2_Pets.Entities;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public void latir() {
        System.out.println("O " + nome + " de raça " + raca + " está latindo: Au Au!");
    }
}
