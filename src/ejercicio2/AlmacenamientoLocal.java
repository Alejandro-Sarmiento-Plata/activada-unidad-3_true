package ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, byte[] datos) {
        System.out.println("Guardando archivo '" + nombreArchivo + "' en el disco duro local (/storage/local/).");
    }

    @Override
    public byte[] recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperando archivo '" + nombreArchivo + "' del almacenamiento local.");
        return new byte[0];
    }
}