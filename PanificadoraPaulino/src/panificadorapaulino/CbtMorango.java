package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class CbtMorango extends Cobertura {
    
      public CbtMorango(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicional() {

        return  this.getBolo().getAdicional() + "Cobertura de: Morango \n";
    }

    @Override
    public double getValor() {

        return 2.0 + this.getBolo().getValor();
    }
}
