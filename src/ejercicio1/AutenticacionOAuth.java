package ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String tokenOAuth) {
        System.out.println("Validando token OAuth con proveedor externo para: " + usuario);
        return tokenOAuth != null && tokenOAuth.startsWith("token_valido_");
    }
}