package ejercicio3;

public class GestorReportes {
    private final GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void exportar(String contenido) {
        generadorReporte.generar(contenido);
    }
}