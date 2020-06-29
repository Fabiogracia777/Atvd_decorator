package panificadorapaulino;

/**
 *
 * @author fabio
 */
public abstract class Fruta extends Bolo{
    
     private Bolo bolo;
    
    public Fruta(Bolo b) {
        this.bolo = b;
        this.setNome(b.getNome());
    }

    public Bolo getBolo() {
        return this.bolo;
    }
}
