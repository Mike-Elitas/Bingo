import java.util.ArrayList;

/*
    Created by Ivan
    in 03/02/2021
    Description:
*/
public class Bombo {
    boolean victoria = false;
    ArrayList<Integer> numeros = new ArrayList<>(100);

    public int generar() {
        int bola = ((int) (Math.random() * 100));
        System.out.println("\n");
        if (numeros.contains(bola)) bola = ((int) (Math.random() * 100));
        else numeros.add(bola);
        System.out.println("El número es: " + bola);
        return bola;
    }

    public void game(Jugador jugador1, Jugador jugador2)throws Exception {
        while (!victoria) {
            if (jugador1.cartulina1.size() != 0 && jugador1.cartulina2.size() != 0) {
                generar();
            } else if (jugador1.cartulina1.size() == 0 && jugador1.cartulina2.size() == 0){
                System.out.println("Gana el jugador " + jugador1);
                victoria = true;
            } else if (jugador2.cartulina1.size() != 0 && jugador2.cartulina2.size() != 0) {
                generar();
            } else if (jugador2.cartulina1.size() == 0 && jugador2.cartulina2.size() == 0){
                System.out.println("Gana el jugador " + jugador1);
                victoria = true;
            } else throw new Exception("Ha ocurrido algo inesperado.");

            if (jugador1.cartulina1.contains(generar())) {
                jugador1.cartulina1.remove(generar());
            } else if (jugador1.cartulina2.contains(generar())) {
                jugador1.cartulina2.remove(generar());
            }
            if (jugador2.cartulina1.contains(generar())) {
                jugador2.cartulina1.remove(generar());
            } else if (jugador2.cartulina2.contains(generar())) {
                jugador2.cartulina2.remove(generar());
            }
        }

    }
}