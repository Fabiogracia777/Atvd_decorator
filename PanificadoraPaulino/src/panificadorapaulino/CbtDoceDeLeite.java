package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class CbtDoceDeLeite extends Cobertura {
    
    public CbtDoceDeLeite(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicional() {

        return  this.getBolo().getAdicional() + "Cobertura de: Doce de Leite \n";
    }

    @Override
    public double getValor() {

        return 1.50 + this.getBolo().getValor();
    }
}
