package Health;

public class ChallengeTwo {
    public String name;
    public String lastname, retorno;
    public double weight, actualWeight;
    public double stature, statureD;


    public void pedirDatos(String n, String a, double p, double ap, double e, double ed){
        name =n;
        lastname = a;
        weight = p;
        actualWeight = ap;
        stature = e;
        statureD = ed;
    }

    public String calcularLmc( double p, double e ){
        weight=p;
        stature=e;
        
        statureD = Math.pow(stature, 2);
        actualWeight= weight/statureD;

        if(actualWeight<20){
           retorno = "PESO BAJO";

        }
        else if(actualWeight<=25){
            retorno = "PESO IDEAL";
        }
        else {
            retorno = "SOBRE PESO";
        }
        return retorno;
    }
    
}


