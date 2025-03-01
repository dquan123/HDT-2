package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DobleEncadenadasTest {
    @Test
    public void testAddAndRemove() {
        DobleEncadenadas<Integer> list = new DobleEncadenadas<>();
        list.add(5);
        list.add(10);

        try {
            int resultado = list.remove();
            assertEquals(10, resultado, "El último elemento agregado debe ser 10");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }

    @Test
    public void testSize() {
        DobleEncadenadas<Integer> list = new DobleEncadenadas<>();
        list.add(1);
        list.add(2);
        assertEquals(2, list.size(), "La lista debe contener 2 elementos");
    }
}
