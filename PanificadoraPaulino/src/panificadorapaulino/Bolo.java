package panificadorapaulino;

/**
 *
 * @author fabio
 */
public abstract class Bolo {
    
    private String nome;
    
    public abstract String getAdicional();
    public abstract double getValor();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
