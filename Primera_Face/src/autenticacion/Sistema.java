package autenticacion;

public class Sistema {
    private Autenticador autenticador;
    public Sistema() {
        this.autenticador = new Autenticador();
    }
    public String iniciarSesion(String usuario, String password) {
        if (autenticador.autenticar(usuario, password)) {
            return "Autenticación exitosa para: " + usuario;
        } else {
            return "Error de autenticación.";
        }
    }
}