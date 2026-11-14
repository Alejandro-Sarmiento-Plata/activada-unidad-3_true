package ejercicio2;

public class GestorArchivos {
    private final Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarRespaldo(String nombre, byte[] datos) {
        almacenamiento.guardarArchivo(nombre, datos);
    }
}