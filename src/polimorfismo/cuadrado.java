package polimorfismo;

import java.util.Scanner;

public class cuadrado extends figura {
    Scanner lectura = new Scanner(System.in);

    private double lado; //Atributo encapsulado 

    //Metodos accesores get y set
    public double getlado(){
        return lado;
    }

    public void setlado(){
        this.lado = lado;
    }

    //Sobreescritura metodo calcularArea()
    @Override
    
    public void calcularArea(){

        System.out.println("Ingrese el lado del cuadrado");
        this.lado = lectura.nextDouble();
        //area del cuadro;
        double area = lado*lado;

        System.out.println("El lado del cuadrado es " + lado + " el area es " +area);
    }
}
