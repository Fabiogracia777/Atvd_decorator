package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class FrtPessego extends Fruta{
    
     public FrtPessego(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicional() {

        return this.getBolo().getAdicional() + "Fruta: Pessego \n" ;
    }

    @Override
    public double getValor() {
        return 1.5 + this.getBolo().getValor();
    }
}
