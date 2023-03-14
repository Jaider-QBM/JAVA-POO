package Health;

import Health.ChallengeTwo;

public class Empleado  extends ChallengeTwo {
    // atributo propios
    private String cargo;
    private int valorHora;
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


   



}
