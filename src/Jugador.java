import java.util.ArrayList;

/*
    Created by Ivan
    in 03/02/2021
    Description: Las cartulinas de player
*/
public class Jugador {
    ArrayList<Integer> cartulina1 = new ArrayList<>(10);

    public void rellenar() {
        boolean repetido=false;
        System.out.println("\n\nCartulina 1\n");
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100);
            if (cartulina1.contains(numero)){
                i--;
            }
            else cartulina1.add(numero);
            System.out.print(cartulina1.get(i) + " ");
        }

    }
}
