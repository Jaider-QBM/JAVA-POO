package classOne;
import java.util.Scanner;

public class Animal {
    //Atributos
    private String name;
    public int age;

    //Metodos u operaciones

    public void registrarAnimal(){
        Scanner lectura=new Scanner(System.in);

        //Cuerpo metodo
        System.out.println("Ingrese el nombre del animal");
        name=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        age=lectura.nextInt();

    }

    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es "+ name + " tiene " + age + " años");
    }
}
