package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class CbtChocolate extends Cobertura{
    
    public CbtChocolate(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicional() {

        return  this.getBolo().getAdicional() + "Cobertura de: Chocolate \n";
    }

    @Override
    public double getValor() {

        return 2.25 + this.getBolo().getValor();
    }
}
