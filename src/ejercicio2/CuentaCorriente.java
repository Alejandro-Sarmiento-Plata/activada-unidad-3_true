package ejercicio2;

public class CuentaCorriente implements TransferenciaBancaria, RetiroBancario, PagoServicio {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " en efectivo.");
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pagando factura de " + servicio + " por valor de $" + monto);
    }
}