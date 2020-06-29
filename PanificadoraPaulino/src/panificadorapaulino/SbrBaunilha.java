package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class SbrBaunilha extends Bolo{
    
     public SbrBaunilha() {
        this.setNome("Baunilha");
    }

    @Override
    public String getAdicional() {
        return "Massa com sabor de Baunilha\n";
    }

    @Override
    public double getValor() {
        return 3.0;
    }
}
