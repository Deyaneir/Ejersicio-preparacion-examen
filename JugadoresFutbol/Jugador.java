package JugadoresFutbol;

public class Jugador {
    private String nombre;
    private int anioNacimiento;
    private int nCamiseta;
    public Jugador(String nombre,int anioNacimiento,int nCamiseta){
        this.anioNacimiento=anioNacimiento;
        this.nombre=nombre;
        this.nCamiseta=nCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getnCamiseta() {
        return nCamiseta;
    }

    public void setnCamiseta(int nCamiseta) {
        this.nCamiseta = nCamiseta;
    }
    public void mostrarInf(){
        System.out.println("El nombre es: "+getNombre()+" Su fecha de nacimiento: "+getAnioNacimiento()
        +" Numero de camiseta: "+getnCamiseta()+"Total es: "+CalculoVenta());
    }
    public double CalculoVenta(){
        return nCamiseta*25;
    }
}

