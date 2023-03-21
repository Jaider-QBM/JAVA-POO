package polimorfismo;

import java.util.Scanner;

public class Circulo extends figura {
    Scanner lectura = new Scanner(System.in);

    private double radio;
    private double area;

    public double getRadio(){
        return radio;
    }

    public double gerArea(){
        return area;
    }

    public void radio ( double radio){
        this.radio = radio;
    }

    public void area (Double area){
        this.area = area;
    }

    public void calcularArea(){
        System.out.println("Ingrese el radio del circulo" );
        radio = lectura.nextDouble();

        radio = Math.pow(radio, 2);
        area = 3.1416*radio;

        System.out.println("El radio es "+ radio + "El area del circulo es de " + area);
    }
}
