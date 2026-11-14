package ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO SISTEMA DE REPORTES (DIP) ===");

        GeneradorReporte repPDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(repPDF);
        gestorPDF.exportar("Resumen de notas - Estudiante Alejandro");

        GeneradorReporte repExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(repExcel);
        gestorExcel.exportar("Estadísticas de rendimiento académico");
    }
}