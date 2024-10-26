package PersonajesJuego;

public class Personajes {
    private String nombre;
    private int anioNacimiento;
    private String telefono;
    public Personajes(String nombre, int anioNacimiento, String telefono) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void imprimir1(){
        System.out.println(getNombre());
    }
    public void imprimir2(){
        System.out.println(getAnioNacimiento());
    }
    public void imprimir3(){
        System.out.println(getTelefono());
    }

}

