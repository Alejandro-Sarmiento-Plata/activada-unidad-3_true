package ejercicio1;

public class GestorAutenticacion {
    private final ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String usuario, String credencial) {
        boolean exito = servicioAutenticacion.autenticar(usuario, credencial);
        if (exito) {
            System.out.println("-> Acceso concedido a " + usuario);
        } else {
            System.out.println("-> Acceso denegado.");
        }
    }
}