package ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String password) {
        System.out.println("Validando usuario local: " + usuario);
        return "admin".equals(usuario) && "1234".equals(password);
    }
}