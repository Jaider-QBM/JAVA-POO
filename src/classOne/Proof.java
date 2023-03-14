package classOne;

public class Proof {
    public static void main(String[] args) {
        

        //Contructores definidos 
        Movie up=new Movie("Up", "Infantil", 2013, 96);

        Movie lndd=new Movie("La noche del demonio", "terror", 2015, 120);
        
        up.mostrarPelicula();
        lndd.mostrarPelicula();

        up.mostrarPelicula();
        up.mostrarPelicula("pescador", 2003);
        up.mostrarPelicula("la ballena", "drama ", 96);
        up.mostrarPelicula(2012, 200, "perros criollos");


        /*
         Animal guacamayo=new Animal();
        guacamayo.registrarAnimal();// invocar o llamar un metodo
        
        Movie titanic=new Movie();
         */
        
    }
}
