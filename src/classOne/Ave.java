package classOne;

public class Ave  extends Animal{
    //Atributos propios 
    private String envergadura;

    // metodos constructor
    public Ave(){}// constructor vacio

    public Ave (String name, int age, String envergadura){
        super(name, age);
        this.envergadura= envergadura;
    }
    //metodos accesibles 

    public String  getEnvergadura(){
        return envergadura;
    }

    public void setEnvergadura(String envergadura){
        this.envergadura= envergadura;
    }
    // metodos propios (){
    public void  mostrarAve(){
    System.out.println("el nombre del animal es "+ getName() + " la edad del animal es "+ getAge() +" La envergadura del ave es " + this.envergadura);
    }
}


