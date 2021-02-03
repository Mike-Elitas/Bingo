import java.util.ArrayList;

/*
    Created by Ivan
    in 03/02/2021
    Description:
*/
public class Jugador {
    ArrayList<Integer> cartulina1= new ArrayList<>(10);
    ArrayList<Integer> cartulina2= new ArrayList<>(10);
    public void rellenar(){
        System.out.println("\n\nCartulina 1");
        for (int i = 0; i < 10; i++) {
            int numero=(int) (Math.random()*100);
                cartulina1.add(numero);
                System.out.print(cartulina1.get(i) + " ");

        }
        System.out.println("\n\nCartulina 2");
        for (int i = 0; i < 10; i++) {
            cartulina2.add((int) (Math.random()*100));
            System.out.print(cartulina2.get(i) + " ");
        }
    }
}
