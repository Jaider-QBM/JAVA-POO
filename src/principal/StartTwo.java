package principal;

import java.util.Scanner;
import Health.ChallengeTwo;

public class StartTwo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ChallengeTwo person= new ChallengeTwo();

        System.out.println("Como es tu nombre?");
        String name=lectura.next();
    
        System.out.println(name + " cual es tu apellido");
        String lastname=lectura.next();
    
        System.out.println(name + " " + lastname + " cual es tu peso");
        double weight=lectura.nextDouble();
    
        System.out.println(name + " " +  lastname + " cual es tu estatura");
        double stature=lectura.nextDouble();

        person.pedirDatos(name, lastname, stature, stature, weight, stature);
    
        String retorno=person.calcularLmc(weight, stature);
        if(retorno.equalsIgnoreCase("PESO BAJO")){
            System.out.println("sU PESO ESTA MUY BAJO");
        }
        else if(retorno.equalsIgnoreCase("PESO IDEAL")){
            System.out.println("El peso es ideal ");
        }
        else if(retorno.equalsIgnoreCase("SOBRE PESO")){
            System.out.println("Tienes sobrepeso");
        }
    }
}
