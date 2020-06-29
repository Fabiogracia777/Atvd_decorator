
package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class CrctBolo {
    
    public static void CaracteristicaDoBolo(Bolo b) {

        System.out.println("Bolo: " + b.getNome());
        System.out.println("Adiconal: " + b.getAdicional());
        System.out.println("Preço: R$ " + b.getValor() + "\n");

    }
}
