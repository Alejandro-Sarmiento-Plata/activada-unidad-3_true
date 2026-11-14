package ejercicio1;

public class TecnicoMantenimiento implements Reparacion {
    @Override
    public void repararEquipo() {
        System.out.println("El técnico está diagnosticando y reparando el equipo electrónico.");
    }
}