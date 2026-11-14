package ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO SISTEMA DE MANTENIMIENTO (ISP) ===");
        Reparacion tecnico = new TecnicoMantenimiento();
        tecnico.repararEquipo();

        Limpieza aseo = new PersonalAseo();
        aseo.limpiarArea();
    }
}