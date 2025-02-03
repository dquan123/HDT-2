package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTestDivision {
    @Test
    public void testDivision() {
        App app = new App();
        try {
            int resultado = app.evaluate("20 4 /");
            assertEquals(5, resultado, "La división de 20 / 4 debe ser 5");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }
}
