package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class SbrChocolate extends Bolo {
    
     public SbrChocolate() {
        this.setNome("Chocolate");
    }

    @Override
    public String getAdicional() {
        return "Massa com sabor de Chocolate\n";
    }

    @Override
    public double getValor() {
        return 6.0;
    }
}
