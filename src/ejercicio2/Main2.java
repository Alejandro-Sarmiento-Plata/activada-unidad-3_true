package ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO SISTEMA DE ALMACENAMIENTO (DIP) ===");

        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(local);
        gestorLocal.procesarRespaldo("backup_db.sql", new byte[]{1, 2, 3});

        Almacenamiento nube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(nube);
        gestorNube.procesarRespaldo("reporte_anual.pdf", new byte[]{4, 5, 6});
    }
}