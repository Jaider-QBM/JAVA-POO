package principal;
import Health.Empleado;
import Health.ChallengeTwo;

import Health.Empleado;

public class StarThree {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();

        empleado.setTypeDoc("Cedula de ciudadania");
        empleado.setDocument(1016946496);
        empleado.setName("Jaider Steven");
        empleado.setLastName("Quimbaya Mendez");
        empleado.setCargo("Administrador");
        empleado.setValorHora(20000);
        empleado.setHoraTrabajadas(6);
        empleado.sertDepartamento("Bogota D.c");
        empleado.calcularHonorario(20000, 6);

        empleado.mostrarEmpleado();
    }
}
