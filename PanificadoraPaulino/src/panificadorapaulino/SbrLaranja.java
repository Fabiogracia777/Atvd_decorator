package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class SbrLaranja extends Bolo {
    
     public SbrLaranja() {
        this.setNome("Laranja");
    }

    @Override
    public String getAdicional() {
        return "Massa com sabor de Laranja \n";
    }

    @Override
    public double getValor() {
        return 5.0;
    }
}
