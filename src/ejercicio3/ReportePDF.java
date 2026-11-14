package ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando documento estructurado en formato PDF con diseño visual.");
        System.out.println("Contenido: " + contenido);
    }
}