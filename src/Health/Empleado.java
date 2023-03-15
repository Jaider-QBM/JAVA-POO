package Health;

import Health.ChallengeTwo;

public class Empleado  extends ChallengeTwo {
    // atributo propios
    
    private String cargo;
    private int valorHora;
    public int calcularHonorario;
    public double reteica;
    public double totalApagar;
    public int horasTrabajadas;
    public String departamento;

    //Metodos constructor 

    public Empleado(){}

    public Empleado(String name,String lastname, double weight, double stature, String cargo, int valorHora, int horasTrabajadas, String departamento){
        super(name,lastname, weight,stature);
        this.cargo= cargo;
        this.valorHora= valorHora;
        this.horasTrabajadas= horasTrabajadas;
        this.departamento=departamento;
    }

    //Metodos accesibles

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo=cargo;
    }

    public int getValorHora(){
        return valorHora;
    }

    public void setValorHora( int valorHora){
        this.valorHora= valorHora;
    }

    public int getHoraTrabajadas(){
        return horasTrabajadas;
    }

    public void setHoraTrabajadas( int horasTrabajadas){
        this.horasTrabajadas= horasTrabajadas;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void sertDepartamento(String departamento){
        this.departamento=departamento;
    }

    public double calcularHonorario(int valorHora, int horasTrabajadas){
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        reteica = (valorHora*0.966 )/100;
        totalApagar= (valorHora*horasTrabajadas)-reteica;
        return totalApagar;
    }

    public void mostrarEmpleado(){
        System.out.println("El nombre es: ");
        System.out.println(getName());
        System.out.println(getName() +" Su apellido es ");
        System.out.println(getLastName());
        System.out.println(getName()+" "+getLastName()+" Su Tipo de documento es: ");
        System.out.println(getDocument());
        System.out.println(getName() +" "+getLastName()+" El numero de documento: ");
        System.out.println(getDocument());
        System.out.println(getName()+" "+ getLastName() + " Su cargo es:");
        System.out.println(getCargo());
        System.out.println(getName()+" " + getLastName() + "Las horas trabajadas");
        System.out.println(getHoraTrabajadas());
        System.out.println(getName() +" "+ getLastName() + " El valor a pagar por hora es ");
        System.out.println(getValorHora());
        System.out.println(getName()+" "+ getLastName()+ " El total a pagar es " + totalApagar);
    }


   



}
