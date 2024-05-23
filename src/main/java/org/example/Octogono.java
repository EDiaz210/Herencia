package org.example;

public class Octogono extends FigurasGeometricas{
    double longitudLado;
    double apotema;
    public Octogono(){}

    public Octogono(String nombre, int nlados, double longitudLado, double apotema) {
        super(nombre, nlados);
        this.longitudLado = longitudLado;
        this.apotema = apotema;
    }

    public double getlongitudLado() {
        return longitudLado;
    }

    public void setBaseTriangulo(double baseTriangulo) {
        this.longitudLado = longitudLado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double calcularPerimetro{

    }
    public double calcularArea(){

        return (perimetro * apotema)/2;
    }

}
