package interfaz;

import java.util.Scanner;

public class carisellazo implements game {
    Scanner lectura = new Scanner(System.in);
    private String name;
    private int eleccion;
    private int lanzamiento;

    @Override
    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador ");
        name = lectura.nextLine();
    }

    @Override

    public void jugar(){
        System.out.println(name +" Elije ");
        System.out.println("1 Cara");
        System.out.println("2. Sello");
        eleccion = lectura.nextInt();
    }

    @Override

    public void finalizar(){
        int lanzamiento = (int)(Math.random()*2+1);
         
        if(lanzamiento==1 && eleccion==1 ){
            System.out.println(name + " Has elegido cara, cayo cara, Ha GANADO ");
        }
        else if (lanzamiento == 2 && eleccion==2){
            System.out.println(name + " Has elegido Sello, cayo Sello, Ha GANADO ");
        }
        else if(lanzamiento==1 && eleccion==2){
            System.out.println(name + " Has elegido Sello, cayo Cara, Ha PERDIDO ");
        }   
        else if(lanzamiento==2 && eleccion==1){
            System.out.println(name + " Has elegido Cara, cayo Sello, Ha PERDIDO ");
        }
    }
}
