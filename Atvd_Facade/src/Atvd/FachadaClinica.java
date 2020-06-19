package Atvd;

public class FachadaClinica {

    ServicosFarmacia farmacia;
    Consulta consulta;
    Medico medico;
    Paciente paciente;

    public FachadaClinica(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;

    }

    public void marcarConsulta(Paciente pct, Medico mdc, String data, String hora) {
        consulta = new Consulta(mdc, pct, hora, data);
        consulta.agendarConsulta(pct, mdc, hora, data);

    }

    public void obterReceita(Paciente pct, Medico mdc, Medicamento medicamento) {

        consulta.gerarReceita(medicamento, pct, mdc);

    }

    public ReceitaMedica returnReceita(Paciente pct, Medico mdc, Medicamento medicamento) {
        return consulta.returnReceita( medicamento, pct, mdc);
    }

    public void receberMedicacao(ReceitaMedica receita) {

        farmacia = new ServicosFarmacia();
        farmacia.receberMedicamento(receita);

    }

}
