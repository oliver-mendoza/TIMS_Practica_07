package autenticacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AutenticadorTest {
    Autenticador autenticador = new Autenticador();
    @Test
    public void testUsuarioValidoYPasswordCorrecto() {
        assertTrue(autenticador.autenticar("admin", "1234"));
    }
    @Test
    public void testUsuarioValidoYPasswordIncorrecto() {
        assertFalse(autenticador.autenticar("admin", "abcd"));
    }
    @Test
    public void testUsuarioNoPermitido() {
        assertFalse(autenticador.autenticar("hacker", "1234"));
    }
    @Test
    public void testCamposNulos() {
        assertFalse(autenticador.autenticar(null, "1234"));
        assertFalse(autenticador.autenticar("admin", null));
    }
    @Test
    public void testPasswordCorta() {
        assertFalse(autenticador.autenticar("admin", "123"));
    }
}