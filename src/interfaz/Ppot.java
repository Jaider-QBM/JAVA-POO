package interfaz;

import java.util.Scanner;

public class Ppot implements game {
    Scanner lectura = new Scanner(System.in);

    private String name;
    private int eleccion;
    private int result;

    @Override
    public void iniciar(){
        System.out.println("Ingrese su nombre de jugador ");
        name = lectura.nextLine();
    }

    @Override
    public void jugar(){
        System.out.println(name + " Elije " );
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        eleccion = lectura.nextInt();
    }

    @Override 
    public void finalizar(){
        int lanzamiento = (int)(Math.random()*3+1);
        
        if(lanzamiento == 1 && eleccion == 1){
            System.out.println( name + " Ha elegido piedra, Salio piedra, HA EMPATADO ");
        }
        else if(lanzamiento == 2 && eleccion ==1){
            System.out.println( name + "Ha elegido Piedra, salio Papel, HA PERDIDO");
        }
        else if(lanzamiento ==3 && eleccion==1){
            System.out.println( name + "Ha elegido Piedra, Salio Tijera, Ha GANADO");
        }

        else if (lanzamiento == 1 && eleccion == 2){
            System.out.println( name + " Ha elegido Papel, Salio piedra, HA GANADO");
        }
        else if(lanzamiento == 2 && eleccion ==2){
            System.out.println( name + "Ha elegido Papel, salio Papel, HA EMPATADO");
        }
        else if(lanzamiento ==3 && eleccion==1){    
            System.out.println( name + "Ha elegido Papel, Salio Tijera, Ha PERDIDO");
        }
        
        else if (lanzamiento == 1 && eleccion == 3){
            System.out.println( name + " Ha elegido Tijera, Salio piedra, HA PERDIDO");
        }
        else if(lanzamiento == 2 && eleccion ==3){
            System.out.println( name + "Ha elegido Tijera, salio Papel, HA GANADO");
        }
        else if(lanzamiento ==3 && eleccion==3){    
            System.out.println( name + "Ha elegido Tijera, Salio Tijera, Ha EMPATADO");
        }
    }
}
