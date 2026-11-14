package ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, byte[] datos) {
        System.out.println("Subiendo archivo '" + nombreArchivo + "' al servidor Cloud (AWS S3 / Firebase Storage).");
    }

    @Override
    public byte[] recuperarArchivo(String nombreArchivo) {
        System.out.println("Descargando archivo '" + nombreArchivo + "' desde el servidor Cloud.");
        return new byte[0];
    }
}