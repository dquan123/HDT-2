package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTestResta {
    @Test
    public void testResta() {
        App app = new App();
        try {
            int resultado = app.evaluate("10 3 -");
            assertEquals(7, resultado, "La resta de 10 - 3 debe ser 7");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }
}
