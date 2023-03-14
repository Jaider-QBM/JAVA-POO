package classOne;
import java.util.Scanner;

public class Animal {
    //Atributos
    private String name;
    public int age;
    


    //Primero de construir un Metodo constructor toca crear un metodo vacio

    public Animal(){}// constructor vacio o por defecto
    //metodo constructor
    public Animal ( String name, int age){
        this.name=name;
        this.age=age;
    }

    // metodos accesibles 
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    //mas de tres constructores es un constructor sobre carga

    

    //Metodos u operaciones

    public void registrarAnimal(){
        Scanner lectura=new Scanner(System.in);

        //Cuerpo metodo
        System.out.println("Ingrese el nombre del animal");
        name=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        age=lectura.nextInt();

        lectura.close();

    } 


    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es "+ name + " tiene " + age + " años");
    }
}
