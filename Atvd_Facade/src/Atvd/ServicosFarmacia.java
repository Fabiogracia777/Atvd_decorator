package Atvd;

import java.util.ArrayList;

public class ServicosFarmacia {

    private ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();

    public void receberMedicamento(ReceitaMedica receita) {

    }

    public void addMedicamento(Medicamento remedio) {

        listaMedicamentos.add(remedio);
    }

    public ArrayList<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(ArrayList<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

}
