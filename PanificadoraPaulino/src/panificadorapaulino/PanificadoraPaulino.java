package panificadorapaulino;

/**
 *
 * @author fabio
 */
public class PanificadoraPaulino {

    public static void main(String[] args) {
        Bolo bolo = new SbrChocolate();
        bolo = new CbtChocolate(bolo);
        bolo = new FrtMorango(bolo);
        CrctBolo.CaracteristicaDoBolo(bolo);
        
        System.out.println("---------------------------------------");

        Bolo bolo2 = new SbrBaunilha();
        bolo2 = new CbtDoceDeLeite(bolo2);
        bolo2 = new FrtPessego(bolo2);
        CrctBolo.CaracteristicaDoBolo(bolo2);

          System.out.println("---------------------------------------");
          
        Bolo bolo3 = new SbrLimao();
        bolo3 = new CbtDoceDeLeite(bolo3);
        bolo3 = new FrtAmora(bolo3);
        CrctBolo.CaracteristicaDoBolo(bolo3);
        
          System.out.println("---------------------------------------");

        Bolo bolo4 = new SbrLaranja();
        bolo4 = new CbtMorango(bolo4);
        bolo4 = new FrtMorango(bolo4);
        CrctBolo.CaracteristicaDoBolo(bolo4);
    }

}
