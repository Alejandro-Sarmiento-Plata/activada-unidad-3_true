package ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO OPERACIONES BANCARIAS (ISP) ===");
        CuentaCorriente cuentaCompleta = new CuentaCorriente();
        cuentaCompleta.transferir(150000.0, "123-456-789");
        cuentaCompleta.retirar(50000.0);
        cuentaCompleta.pagarFactura("Energía eléctrica", 85000.0);

        CuentaAhorrosBasica cuentaBasica = new CuentaAhorrosBasica();
        cuentaBasica.retirar(20000.0);
    }
}