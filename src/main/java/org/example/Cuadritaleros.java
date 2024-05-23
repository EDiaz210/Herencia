package org.example;

public class Cuadritaleros extends FigurasGeometricas{
    double ancho;
    double largo;
    public Cuadritaleros(double ancho, double largo){}
    public Cuadritaleros(){}

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return ancho * largo;
    }
    public double calcularPerimetro() {
        return 2 * ancho * largo;
    }

}
