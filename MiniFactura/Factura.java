package MiniFactura;

public class Factura {
    private String nombrePlato;
    private double precioPlato;
    private int cantidad;
    public Factura(String nombrePlato, double precioPlato, int cantidad){
        this.nombrePlato=nombrePlato;
        this.precioPlato=precioPlato;
        this.cantidad=cantidad;
    }
    public double calcularTotal(){
        return precioPlato*cantidad;
    }
    public void mostrarFactura(){
        System.out.println("El plato elegido es: "+nombrePlato+" Su precio es: "+precioPlato+" la cantidad solicitada es: "+cantidad+" total: "+calcularTotal());
    }
}
