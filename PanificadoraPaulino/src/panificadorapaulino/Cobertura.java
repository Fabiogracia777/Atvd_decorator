package panificadorapaulino;

/**
 *
 * @author fabio
 */
public abstract class Cobertura extends Bolo {
    
    private Bolo bolo;

    public Cobertura(Bolo b) {
        this.bolo = b;
        this.setNome(b.getNome());
    }

    public Bolo getBolo() {
        return this.bolo;
    }

}
