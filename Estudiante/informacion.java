package Estudiante;

public class informacion {
    String nombre;
    int edad;
    int telf;
    public informacion(String nombre, int edad, int telf){
        this.nombre=nombre;
        this.edad=edad;
        this.telf=telf;
    }
    public void imprimir(){
        System.out.println("Su nombre es: "+nombre+" y tiene: "+edad+" years su telefono es: "+telf);
    }
}
