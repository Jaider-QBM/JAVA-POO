package Health;

import java.util.Scanner;

public class ChallengeOne {
    public String typeDoc;
    public int document;
    public String name;
    public String lastname;
    public double weight, actualWeight;
    public double stature, statureD;
    public int age;
    public String sexo;

    public void pedirDatos(){
        Scanner lectura= new Scanner(System.in);
    
        System.out.println("Ingrese el tipo de documento");
        typeDoc=lectura.next();
    
        System.out.println("Ingrese el numero de documento");
        document=lectura.nextInt();
    
        System.out.println("Como es tu nombre?");
        name=lectura.next();
    
        System.out.println(name + " cual es tu apellido");
        lastname=lectura.next();
    
        System.out.println(name + " " + lastname + " cual es tu peso");
        weight=lectura.nextDouble();
    
        System.out.println(name + " " +  lastname + " cual es tu estatura");
        stature=lectura.nextDouble();
    
        System.out.println(name + " " +  lastname + " Cual es tu edad");
        age=lectura.nextInt();
    
        System.out.println(name + " " +  lastname + " Cual es tu Sexo");
        sexo=lectura.next();

        lectura.close();
    }

    public void mostrarPersonal(){
        System.out.println("Los datos ingresados son: ");
        System.out.println("Su tipo de documento es  " + typeDoc);
        System.out.println("Su numero de documento es  " +document);
        System.out.println("Su nombre es " + name);
        System.out.println("Su apellido es  " + lastname);
        System.out.println("Su peso es de  " + weight);
        System.out.println("Su estatura es de " + stature);
        System.out.println("Su edad es de  " + age + " Años");
        System.out.println("Su sexo es " + sexo);

    }

    public void calcularLmc(){
        statureD = Math.pow(stature, 2);
        actualWeight= weight/statureD;

        if(actualWeight<20){
            System.out.println("El peso esta por debajo de lo ideal" + actualWeight);

        }
        else if(actualWeight<=25){
            System.out.println("El peso es ideal " + actualWeight);
        }
        else {
            System.out.println("Tienes sobrepeso" + actualWeight);
        }
    }

    public void mayorEdad(){
        if(age<18){
            System.out.println("Eres menor de edad, tu edad es " + age);
        }
        else{
            System.out.println("Eres mayor de edad, tu edad es " + age);
        }
    }

    
}

