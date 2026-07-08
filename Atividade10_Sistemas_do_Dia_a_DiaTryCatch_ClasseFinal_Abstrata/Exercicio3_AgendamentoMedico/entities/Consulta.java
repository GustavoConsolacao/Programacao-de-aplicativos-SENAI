package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio3_AgendamentoMedico.entities;

public abstract class Consulta {

    private String cpf;
    private String nome;
    private String especialidade;

    public boolean cadastrado;
    public boolean horariosDisponiveis;
    public boolean horarioLivre;

    public abstract StatusConsulta verificarConsulta();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public boolean isHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(boolean horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

    public boolean isHorarioLivre() {
        return horarioLivre;
    }

    public void setHorarioLivre(boolean horarioLivre) {
        this.horarioLivre = horarioLivre;
    }
}