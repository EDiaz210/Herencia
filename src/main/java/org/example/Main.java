package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FigurasGeometricas miFigura= new FigurasGeometricas();
        Circulos miFigura2= new Circulos();
        Triangulos miFigura3= new Triangulos();
        Cuadritaleros miFigura4= new Cuadritaleros();

        Circulos miFigura5= new Circulos(3.00);
        Triangulos miFigura6= new Triangulos(6.00,8.00);
        Cuadritaleros miFigura7= new Cuadritaleros(5.00,5.00);
        Cuadritaleros miFigura8= new Cuadritaleros(5.00,10.00);

        miFigura2.setNombre("Pileta del CEC");
        System.out.println(miFigura2.getNombre());

        System.out.println("La nueva pileta tendra un radio de:");
        miFigura2.setRadio(4.00);
        System.out.println(miFigura2.getRadio());

        System.out.println("Y su area será:");
        System.out.println(miFigura2.calcularArea());

        miFigura3.setNombre("Mi triangulo");
        System.out.println(miFigura3.getNombre());

        System.out.println("La altura del triángulo es:");
        miFigura3.setAltura(4.00);
        System.out.println(miFigura3.getAltura());
        System.out.println("La base del triángulo es:");
        miFigura3.setBase(9.00);
        System.out.println(miFigura3.getBase());

        System.out.println("El aréa es:");
        System.out.println(miFigura3.calcularArea());

        miFigura4.setNombre("Mi piscina");
        System.out.println(miFigura4.getNombre());

        System.out.println("El ancho de la piscina es:");
        miFigura4.setAncho(15.00);
        System.out.println(miFigura4.getAncho());
        System.out.println("El largo de la piscina es:");
        miFigura4.setLargo(35.00);
        System.out.println(miFigura4.getLargo());

        System.out.println("Su area es:");
        System.out.println(miFigura4.calcularArea());





    }
}