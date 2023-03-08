package principal;

import Health.ChallengeOne;

public class Initiation {
    public static void main(String[] args) {
        ChallengeOne person=new ChallengeOne();


        person.pedirDatos();
        person.mostrarPersonal();
        person.calcularLmc();
        person.mayorEdad();
    }
}
