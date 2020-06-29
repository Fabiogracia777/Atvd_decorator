package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class FrtMorango extends Fruta{
    
     public FrtMorango(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicional() {

        return this.getBolo().getAdicional() + "Fruta: Morango \n" ;
    }

    @Override
    public double getValor() {
        return 2.5 + this.getBolo().getValor();
    }
}
