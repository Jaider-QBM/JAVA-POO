package polimorfismo;

import java.util.Scanner;

public class Rectangulo extends figura {
    Scanner lectura = new Scanner(System.in);

    private double alto;
    private double ancho;
    private double area;

    public double getAlto(){
        return alto;
    }

    public void setlado(){
        this.alto = alto;
    }

    public double getAncho(){
        return ancho;
    }

    public void setAncho(){
        this.ancho = ancho;
    }

    public double getArea(){
        return area;
    }

    public void setArea(){
        this.area = area;
    }

    public void calcularArea(){

        System.out.println("Ingrese el alto del rectangulo");
        this.alto = lectura.nextDouble();

        System.out.println("Ingrese el ancho del rectangulo");
        this.ancho = lectura.nextDouble();

        //area del cuadro;
        double area = alto*ancho;

        System.out.println("El alto del rectangulo es " + alto + "El ancho  del rectangulo es "+ ancho +" el area es " +area);
    }
}


