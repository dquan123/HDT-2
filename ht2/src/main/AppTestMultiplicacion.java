package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTestMultiplicacion {
    @Test
    public void testMultiplicacion() {
        App app = new App();
        try {
            int resultado = app.evaluate("5 6 *");
            assertEquals(30, resultado, "La multiplicación de 5 * 6 debe ser 30");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }
}
