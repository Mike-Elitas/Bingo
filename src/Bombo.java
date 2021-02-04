import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

/*
    Created by Ivan
    in 03/02/2021
    Description:
*/
public class Bombo {
    int bola;
    boolean victoria = false;
    ArrayList<Integer> numeros = new ArrayList<>(100);

    public int generar() {
        bola = ((int) (Math.random() * 100));
        System.out.println("\n");
        if (numeros.contains(bola)) bola = ((int) (Math.random() * 100));
        else numeros.add(bola);
        System.out.println("El número es: " + bola);
        return bola;
    }

    public void game(Jugador jugador1, Jugador jugador2) {
        while (!victoria) {
            generar();
            if (jugador1.cartulina1.size() == 0){
                System.out.println("\nGana el jugador 1");
                victoria = true;
            } else if (jugador2.cartulina1.size() == 0){
                System.out.println("\nGana el jugador 2");
                victoria = true;
            } else System.out.println("Y seguimos para bingo");

            if (jugador1.cartulina1.contains(bola)) {
               jugador1.cartulina1.remove(jugador1.cartulina1.indexOf(bola));
                System.out.println("El jugador 1 tiene este número y le quedan "+jugador1.cartulina1.size()+" números para ganar");
            } else if (jugador2.cartulina1.contains(bola)) {
                jugador2.cartulina1.remove(jugador2.cartulina1.indexOf(bola));
                System.out.println("El jugador 2 tiene este número y le quedan "+jugador2.cartulina1.size()+" números para ganar");

            } else if (jugador1.cartulina1.size() != 0 && jugador2.cartulina1.size() != 0){
                System.out.println("Ninguno tiene el número");
            }
            else System.out.println("\nFin de la partida");
        }

    }
}
