package classOne;

public class Movie {
    // Atributos 

    private  String name;
    private String category;
    int year;
    public int duration;

    // Metodos;

    public Movie(){}//constructor vacio

    public Movie(String name, String catagory, int year, int duration){
        this.name=name;
        this.category=catagory;
        this.year=year;
        this.duration=duration;
    }
    // metodos accesibles 

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category= category;
    }

    public int getYear(){
        return year;
    }
    public void setYear (int year){
        this.year=year;
    }

    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration= duration;
    }


    public  void mostrarPelicula(){
        System.out.println("El nombre de la pelicula es "+ name + " y la categoria es " + category + " el año que salio es " + year + " la duracion es " + duration);
    }
    // contructores sobrecarga 
    public void mostrarPelicula(String name, int year){
        System.out.println("La pelicula es " + name + " del año " + year );
    }

    public void mostrarPelicula(String name, String category, int duration){
        System.out.println("El nombre de la pelibula es "+ name + " la categoria es " + category + " y la duracion es " +duration);
    }
    
    public void mostrarPelicula (int year, int duracion, String name ){
        System.out.println("El año que entroso "+ year +" y la duracion es de " +duration +" y el nombre es " + name);
    }
}
