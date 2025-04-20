package autenticacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SistemaTest {
    Sistema sistema = new Sistema();
    @Test
    public void testInicioSesionExitosa() {
        String resultado = sistema.iniciarSesion("admin", "1234");
        assertEquals("Autenticación exitosa para: admin", resultado);
    }
    @Test
    public void testInicioSesionFallida() {
        String resultado = sistema.iniciarSesion("admin", "0000");
        assertEquals("Error de autenticación.", resultado);
    }
}