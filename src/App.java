import classOne.Animal;
import classOne.Movie;
import classOne.Ave;

public class App {
    public static void main(String[] args) throws Exception {
        
        Animal tigre=new Animal();

        Ave condor = new Ave();
        condor.setName("Condor");
        condor.setAge(2006);
        condor.setEnvergadura("300 Centimetros");

        condor.getName();
        condor.getAge();
        condor.getEnvergadura();

        condor.mostrarAve();
        


        Movie minions=new Movie();

        Movie avatar= new Movie();

        avatar.setName("Avatar");
        avatar.setCategory("drama");
        avatar.setDuration(160);
        avatar.setYear(2022);

       System.out.println("El nombre de la pelicula es " + avatar.getName()+ " La categoria es " + avatar.getCategory()+ " la duracion es de " + avatar.getDuration()+ "minutos" +" el año que salio es" + avatar.getYear());

    }
}
