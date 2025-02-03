package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTestErrores {
    @Test
    public void testExpresionMalFormada() {
        App app = new App();
        Exception exception = assertThrows(Exception.class, () -> app.evaluate("3 +"));
        assertEquals("Expresión mal formada.", exception.getMessage(), "Debe lanzar error por expresión mal formada");
    }

    @Test
    public void testDivisionPorCero() {
        App app = new App();
        Exception exception = assertThrows(Exception.class, () -> app.evaluate("10 0 /"));
        assertEquals("División por cero no permitida.", exception.getMessage(), "Debe lanzar error por división entre cero");
    }
}
