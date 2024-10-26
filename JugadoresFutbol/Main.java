package JugadoresFutbol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresar el nombre del jugador: ");
        String nombre= sc.nextLine();
        System.out.println("Ingresar el anio de nacimiento: ");
        int anioNacimiento= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresar el numero de camisetas: ");
        int nCamiseta=sc.nextInt();
        sc.nextLine();
        Jugador persona=new Jugador(nombre,anioNacimiento,nCamiseta);
        persona.mostrarInf();
        persona.setnCamiseta(22);
        persona.mostrarInf();
    }

}
