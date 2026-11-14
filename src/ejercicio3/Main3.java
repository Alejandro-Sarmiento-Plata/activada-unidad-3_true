package ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO GESTIÓN DE VEHÍCULOS (ISP) ===");
        Conducible auto = new Automovil();
        auto.conducir();

        CamionCarga camion = new CamionCarga();
        camion.conducir();
        camion.cargarMercancia(12000.0);
    }
}