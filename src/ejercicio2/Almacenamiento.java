package ejercicio2;

public interface Almacenamiento {
    void guardarArchivo(String nombreArchivo, byte[] datos);
    byte[] recuperarArchivo(String nombreArchivo);
}