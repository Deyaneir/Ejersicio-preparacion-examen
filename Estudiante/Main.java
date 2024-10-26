package Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su telefono: ");
        int telf=sc.nextInt();
        sc.nextLine();
        informacion estudiante1=new informacion(nombre,edad,telf);
        System.out.println("Ingrese nota 1: ");
        double nota=sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese nota 2: ");
        double nota2=sc.nextDouble();
        sc.nextLine();
        Notas promedio=new Notas(nota,nota2);
        estudiante1.imprimir();
        promedio.imprimir2();
    }

}
