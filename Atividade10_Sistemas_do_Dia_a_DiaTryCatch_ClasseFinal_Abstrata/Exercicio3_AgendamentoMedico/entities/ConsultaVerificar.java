package Atividade10_Sistemas_do_Dia_a_DiaTryCatch_ClasseFinal_Abstrata.Exercicio3_AgendamentoMedico.entities;

public class ConsultaVerificar extends Consulta {
    @Override
    public StatusConsulta verificarConsulta() {

        if (!cadastrado) {
            return StatusConsulta.PACIENTE_NAO_CADASTRADO;
        }

        if (!horariosDisponiveis) {
            return StatusConsulta.SEM_HORARIOS;
        }

        if (!horarioLivre) {
            return StatusConsulta.HORARIO_INDISPONIVEL;

        }

        return StatusConsulta.CONSULTA_AGENDADA;
    }

}
