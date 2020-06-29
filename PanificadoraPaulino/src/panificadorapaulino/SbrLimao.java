package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class SbrLimao extends Bolo {
    
    public SbrLimao() {
        this.setNome("Limao");
    }

    @Override
    public String getAdicional() {
        return "Massa com sabor de Limao \n";
    }

    @Override
    public double getValor() {
        return 5.0;
    }
}
