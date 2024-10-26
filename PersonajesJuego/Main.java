package PersonajesJuego;

import JugadoresFutbol.Jugador;

public class Main {
    public static void main(String[] args){
        Personajes jugador1= new Personajes("German",1980,"0987654321");
        jugador1.imprimir1();
        jugador1.imprimir2();
        jugador1.imprimir3();
        jugador1.setTelefono("0987664331");
        jugador1.imprimir3();
    }
}
