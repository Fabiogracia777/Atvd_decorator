
package Atvd;

public class ReceitaMedica {
    private Medicamento medicamento;
    private Paciente paciente;
    private Medico medico;
    

    public ReceitaMedica(Medicamento medicamento, Paciente paciente, Medico medico ) {
        this.medicamento = medicamento;
        this.paciente = paciente;
        this.medico = medico;
        
    }

    @Override
    public String toString() {
        return "\n_____________________Receita Médica____________________" 
                + "\n\nPaciente: " 
                + this.paciente.getNome() + "\nMedico: " + this.medico.getNome() 
                + "\nMedicamento: " + this.medicamento.getNome();
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
}
