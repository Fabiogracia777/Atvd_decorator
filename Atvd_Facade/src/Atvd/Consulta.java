package Atvd;

/**
 *
 * @author fabio
 */
public class Consulta {

    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;

    public Consulta(Medico medico, Paciente paciente, String data, String horario) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.horario = horario;

    }

    public void agendarConsulta(Paciente pct, Medico mdc, String horario, String data) {
        System.out.println("_______________Agendamento________________");
        System.out.println("\nPaciente: " + pct.getNome() + " |" + " Telefone: " + pct.getTelefone() + "\nMédico: "
                + mdc.getNome() + " |" + " COD: " + mdc.getRegistroMedico() + "\nHorário: "
                + horario + "\nData: " + data);

    }

    ;
    
    public void gerarReceita(Medicamento medicamento, Paciente pct, Medico mdc) {
        ReceitaMedica receita = new ReceitaMedica(medicamento, pct, mdc);
        System.out.println(receita.toString());
    }

    public ReceitaMedica returnReceita(Medicamento medicamento, Paciente pct, Medico mdc) {
        ReceitaMedica receita = new ReceitaMedica(medicamento, pct, mdc);
        return receita;
    }
}
