package Health;

public class ChallengeTwo {
    public String typeDoc;
    public int document;
    public String name;
    public String lastname, retorno;
    public double weight, actualWeight;
    public double stature, statureD;

    public ChallengeTwo(){}
    public ChallengeTwo(String name, String lastname, double weight, double stature){
        this.name=name;
        this.lastname=lastname;
        this.weight=weight;
        this.stature=stature;
    }
    public String getTypeDoc(){
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc){
        this.typeDoc = typeDoc;
    }

    public int getDocument(){
        return document;
    }

    public void setDocument(int document){
        this.document=document;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getLastName(){
        return lastname;
    }

    public void setLastName( String lastname){
        this.lastname=lastname;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.stature=stature;
    }

    public double stature (){
        return stature;
    }

    public void setStature(double stature){
        this.stature=stature;
    }

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


