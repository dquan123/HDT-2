package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleEncadenadasTest {
    @Test
    public void testAddAndRemove() {
        SimpleEncadenadas<Integer> list = new SimpleEncadenadas<>();
        list.add(50);
        list.add(60);

        try {
            int resultado = list.remove();
            assertEquals(60, resultado, "El último elemento agregado debe ser 60");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }

    @Test
    public void testIsEmpty() {
        SimpleEncadenadas<Integer> list = new SimpleEncadenadas<>();
        assertTrue(list.isEmpty(), "La lista debería estar vacía");
    }
}
