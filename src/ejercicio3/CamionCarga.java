package ejercicio3;

public class CamionCarga implements Conducible, Carguero {
    @Override
    public void conducir() {
        System.out.println("Conduciendo camión pesado en carretera nacional.");
    }

    @Override
    public void cargarMercancia(double pesoKg) {
        System.out.println("Cargando " + pesoKg + " kg de mercancía en el furgón del camión.");
    }
}