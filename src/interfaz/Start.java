package interfaz;

public class Start {
    public static void main(String[] args) {
        carisellazo gameOne = new carisellazo();
        Ppot gameTwo = new Ppot();

        gameOne.iniciar();
        gameOne.jugar();
        gameOne.finalizar();

        gameTwo.iniciar();
        gameTwo.jugar();
        gameTwo.finalizar();
    }
}
