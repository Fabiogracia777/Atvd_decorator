package Atvd;

public class Principal {

    public static void main(String[] args) {

        Medico medico = new Medico();
        medico.setNome("DR.Francisco Da Costa Silva");
        medico.setRegistroMedico("137-rt");

        Paciente paciente = new Paciente();
        paciente.setNome("Antonia Aurineide de Souza");
        paciente.setTelefone("(88) 99343-4232");

        ServicosFarmacia farmacia = new ServicosFarmacia();

        Medicamento remedio = new Medicamento("Cefalexina", "9.787");
        Medicamento remedio2 = new Medicamento("Dipirona", "6.433");
        Medicamento remedio3 = new Medicamento("Paracetamol", "2.645");

        farmacia.addMedicamento(remedio);
        farmacia.addMedicamento(remedio2);
        farmacia.addMedicamento(remedio3);

        FachadaClinica fachada = new FachadaClinica(medico, paciente);

        fachada.marcarConsulta(paciente, medico, "13/10/2020", "08:40");

        fachada.obterReceita(paciente, medico, remedio3);

        fachada.receberMedicacao(fachada.returnReceita(paciente, medico, remedio3));

    }

}
