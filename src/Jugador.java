import java.util.ArrayList;

/*
    Created by Ivan
    in 03/02/2021
    Description:
*/
public class Jugador {
    ArrayList<Integer> cartulina1= new ArrayList<>(10);
    public void rellenar(){
        System.out.println("\n\nCartulina");
        for (int i = 0; i < 10; i++) {
            int numero=(int) (Math.random()*100);
            if (cartulina1.contains(numero))
                cartulina1.remove(numero);
            else cartulina1.add(numero);
                System.out.print(cartulina1.get(i) + " ");
        }
    }
}
