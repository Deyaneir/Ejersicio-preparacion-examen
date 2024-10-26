package MiniFactura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresar el plato solicitado: ");
        String nombrePlato= sc.next();
        System.out.println("Ingresar el precio del plato: ");
        double precioPlato= sc.nextDouble();
        System.out.println("Ingresar la cantidad requerida: ");
        int cantidad=sc.nextInt();
        sc.nextLine();
        Factura cuenta=new Factura(nombrePlato,precioPlato,cantidad);
        cuenta.mostrarFactura();
    }

}
