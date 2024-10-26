package Estudiante;

public class Notas {
    double nota;
    double nota2;
    public Notas(double nota, double nota2){
        this.nota=nota;
        this.nota2=nota2;
    }
    public double promedio(){
        return (nota+nota2)/2;
    }
    public void imprimir2(){
        System.out.println("El promedio es: "+promedio());
    }
}
