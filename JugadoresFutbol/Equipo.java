package JugadoresFutbol;

public class Equipo {
    String nombreEquipo;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void inscribirJugador(String nombre, int anioNacimiento, int nCamiseta) {
        System.out.println("Nombre: " + nombre + "nacio en el anio: " + anioNacimiento + " su numero de camiseta es: " + nCamiseta);
    }

    public void obtenerJugador(String nombre, int anioNacimiento,int nCamiseta) {
        inscribirJugador(nombre,nCamiseta, anioNacimiento);
        System.out.println(nombreEquipo);
    }

}
