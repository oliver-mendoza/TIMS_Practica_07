import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class AutenticadorTest {
    @Test
    public void testAutenticarUsuarioValidoYContrasenaCorrecta() {
        Autenticador autenticador = new Autenticador();
        boolean result = autenticador.autenticar("admin", "1234");
        Assertions.assertTrue(result, "El usuario y la contraseña deberían ser válidos.");
    }
    @Test
    public void testAutenticarUsuarioValidoYContrasenaIncorrecta() {
        Autenticador autenticador = new Autenticador();
        boolean result = autenticador.autenticar("admin", "yjjkgvvvkjvkj");
        Assertions.assertFalse(result, "La contraseña debería ser incorrecta.");
    }
    @Test
    public void testAutenticarUsuarioNoPermitido() {
        Autenticador autenticador = new Autenticador();
        boolean result = autenticador.autenticar(" khbhkhooh", "1234");
        Assertions.assertFalse(result, "El usuario no debería estar permitido.");
    }
    @Test
    public void testAutenticarParametrosNull() {
        Autenticador autenticador = new Autenticador();
        boolean result = autenticador.autenticar(null, "1234");
        Assertions.assertFalse(result, "No se debería permitir la autenticación con usuario nulo.");
        result = autenticador.autenticar(null, null);
        Assertions.assertFalse(result, "No se debería permitir la autenticación con contraseña nula.");
    }
    @Test
    public void testAutenticarContrasenaMuyCorta() {
        Autenticador autenticador = new Autenticador();
        boolean result = autenticador.autenticar("admin", "123");
        Assertions.assertFalse(result, "La contraseña debería tener al menos 4 caracteres.");
    }
    @Test
    public void testAutenticarSoloPasswordNull() {
        Autenticador autenticador = new Autenticador();
        boolean result = autenticador.autenticar("admin", null);
        Assertions.assertFalse(result, "No se debería permitir la autenticación con contraseña nula.");
    }
    @Test
    public void testDummy(){
        //esta prueba no hace nada
    }
}