package ejercicio2;

public class CuentaAhorrosBasica implements RetiroBancario {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro rápido de cajero por valor de $" + monto);
    }
}