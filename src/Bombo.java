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
        boolean repetido;
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
            comprobarNumero(jugador1);
            comprobarNumero(jugador2);


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

    private void comprobarNumero(Jugador j) {
        if (j.cartulina1.contains(bola)) {
            j.cartulina1.remove(j.cartulina1.indexOf(bola));
            System.out.println("Este jugador tiene el número");
        } else System.out.println("Este jugador no tiene el número");

    }
}
