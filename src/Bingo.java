import java.util.ArrayList;

/*
    Created by Mike Etchup
    in 03/02/2021
    Description: Bingo funcional versión solo 2 jugadores
*/
public class Bingo {
    public static void main(String[] args) {
        Jugador Jugador1=new Jugador();
        Jugador Jugador2=new Jugador();
        Jugador1.rellenar();
        Jugador2.rellenar();
        Bombo Bombo1=new Bombo();
        Bombo1.game1vs1(Jugador1,Jugador2);
    }

}

