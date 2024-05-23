package org.example;

public class Triangulos extends FigurasGeometricas{
    double base;
    double altura;
    public Triangulos(double base, double altura){
        this.base = base;
    }
    public Triangulos(){}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura / 2;
    }

    public double calcularPerimetro() {
        return 2 * base + altura;
    }
}
