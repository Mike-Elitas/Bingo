import java.util.ArrayList;

/*
    Created by Ivan
    in 03/02/2021
    Description: Bombo de Bingo
*/
public class Bombo {
    boolean victoria = false;
    ArrayList<Integer> numeros = new ArrayList<>(100);
    int bola;
    public void generar() {
        boolean repetido=false;
        do{
            bola = ((int) (Math.random() * 100));
            if (numeros.contains(bola)) repetido=true;
            else repetido=false;
        }
        while (repetido);
        numeros.add(bola);
        System.out.println("\n");
        System.out.println("El número es: " + bola);
        }

    public void game1vs1(Jugador jugador1, Jugador jugador2){
        while (!victoria) {
            if (jugador1.cartulina1.size() != 0 && jugador2.cartulina1.size() != 0) {
                generar();
            } else System.out.println("Ha sucedido algo inesperado");
            if (jugador1.cartulina1.contains(bola)) {
                jugador1.cartulina1.remove(jugador1.cartulina1.indexOf(bola));
                System.out.println("El jugador 1 tiene este numero");
            } else System.out.println("El jugador 1 no tiene este numero");
            if (jugador2.cartulina1.contains(bola)) {
                jugador2.cartulina1.remove(jugador2.cartulina1.indexOf(bola));
                System.out.println("El jugador 2 tiene este numero");
            } else System.out.println("El jugador 2 no tiene este numero");

            if (jugador1.cartulina1.size()==0 && jugador2.cartulina1.size()==0){
                System.out.println("\nGanan ambos");
                victoria = true;
            } else if (jugador1.cartulina1.size()==0){
                System.out.println("\nGana el jugador 1");
                victoria = true;
            } else if(jugador2.cartulina1.size()==0){
                System.out.println("\nGana el jugador 2");
                victoria = true;
            }else System.out.println("\n\nContinuamos la partida");
        }

    }
}
