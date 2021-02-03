import java.util.ArrayList;

/*
    Created by Ivan
    in 03/02/2021
    Description:
*/
public class Bingo {
    public static void main(String[] args) {
        Jugador Jugador1=new Jugador();
        Jugador Jugador2=new Jugador();
        Jugador1.rellenar();
        Jugador2.rellenar();
        Bombo Bombo1=new Bombo();
        try {
            Bombo1.game(Jugador1,Jugador2);
        }
        catch (Exception e){}
    }
}

