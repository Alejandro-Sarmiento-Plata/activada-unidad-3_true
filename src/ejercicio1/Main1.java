package ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO SISTEMA DE AUTENTICACIÓN (DIP) ===");

        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestor1 = new GestorAutenticacion(authLocal);
        gestor1.iniciarSesion("admin", "1234");

        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestor2 = new GestorAutenticacion(authOAuth);
        gestor2.iniciarSesion("alejandro", "token_valido_xyz");
    }
}