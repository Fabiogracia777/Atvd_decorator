package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class FrtAmora extends Fruta {
    
    public FrtAmora(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicional() {

        return this.getBolo().getAdicional() + "Fruta: Amora \n" ;
    }

    @Override
    public double getValor() {
        return 2.0 + this.getBolo().getValor();
    }

}
