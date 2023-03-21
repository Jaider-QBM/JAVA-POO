package principal;
import polimorfismo.figura;

import java.util.Scanner;

import polimorfismo.Circulo;
import polimorfismo.cuadrado;
import polimorfismo.Rectangulo;
import polimorfismo.Triangulo;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        cuadrado figura1 = new cuadrado();
        Circulo figura2 = new Circulo();
        Rectangulo figura3 = new Rectangulo();
        Triangulo figura4 = new Triangulo();

        int eleccion, op;

        op =1;

        while( op==1){

            System.out.println("Elija a que Figuro quiere el area ");
            System.out.println("1. Cuadrado");
            System.out.println("2. Circulo");
            System.out.println("3. Rectangulo" );
            System.out.println("4. Triangulo ");
            eleccion = lectura.nextInt();

            if (eleccion==1){
                figura1.calcularArea();
            }
            else if (eleccion==2){
                figura2.calcularArea();
            }
            else if (eleccion==3){
                figura3.calcularArea();
            }
            else{
                figura4.calcularArea();
            }

            System.out.println("Quiere seguir eligiendo la figuras, para saber el area ");
            System.out.println("1. Si");
            System.out.println("2. No");
            op = lectura.nextInt();
            
        } 
    }
}
