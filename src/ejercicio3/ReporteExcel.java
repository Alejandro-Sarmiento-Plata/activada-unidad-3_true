package ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando hoja de cálculo tabular en formato XLSX con filas y columnas.");
        System.out.println("Contenido: " + contenido);
    }
}