package actividad_02;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ContadorTest {
    @Test
    void cuentaDosPalabrasConRamasVerdaderas() {
        Contador c = new Contador();
        assertEquals(2, c.count("cats|dogs"));
    }
    @Test
    void cuentaUnaSoloConRamaFalsa() {
        Contador c = new Contador();
        assertEquals(1, c.count("cats|dog"));
    }
}