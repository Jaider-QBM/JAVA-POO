package polimorfismo;

import java.util.Scanner;

public class Triangulo extends figura {
    Scanner lectura = new Scanner(System.in);

    private double alto;
    private double base;
    private double area;


    public double getAlto (){
        return alto;
    }

    public void setAlto(){
        this.alto = alto;
    }

    public double getBase(){
        return base;
    }

    public void setBase(){
        this.base = base;
    }

    public void calcularArea(){

        System.out.println("Ingrese el alto del triangulo");
        this.alto = lectura.nextDouble();

        System.out.println("Ingrese la base del triangulo");
        this.base = lectura.nextDouble();
        //area del cuadro;

        this.area = (base*alto)/2 ;

        System.out.println("El alto del triangulo es " + alto + "La base del triangulo es "+ base +" el area es " +area);
    }

}
