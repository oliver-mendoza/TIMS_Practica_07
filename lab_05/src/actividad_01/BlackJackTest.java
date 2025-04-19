package actividad_01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BlackJackTest {
    @Test
    void testAmbosPierden() {
            BlackJack game = new BlackJack();
            assertEquals(0, game.play(22, 25));
    }
    @Test
    void testIzquierdoGana() {
            BlackJack game = new BlackJack();
            assertEquals(20, game.play(20, 18));
    }
    @Test
    void testDerechoGana() {
            BlackJack game = new BlackJack();
            assertEquals(20, game.play(19, 20));
    }
    @Test
    void testEmpate() {
            BlackJack game = new BlackJack();
            assertEquals(18, game.play(18, 18));
    }
    @Test
    void testLimite21() {
            BlackJack game = new BlackJack();
            assertEquals(21, game.play(21, 19));
    }
    @Test
    void testUnoJusto21OtroPierde() {
        BlackJack game = new BlackJack();
        assertEquals(21, game.play(21, 22));
    }
    @Test
    void testDummy() {
        // Esta prueba no hace nada
    }
}