package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StackListTest {
    @Test
    public void testPushAndPop() {
        StackList<Integer> stack = new StackList<>(new SimpleEncadenadas<>());
        stack.push(100);
        stack.push(200);

        try {
            int resultado = stack.pop();
            assertEquals(200, resultado, "El último elemento en la pila debe ser 200");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }

    @Test
    public void testIsEmpty() {
        StackList<Integer> stack = new StackList<>(new SimpleEncadenadas<>());
        assertTrue(stack.isEmpty(), "La pila debería estar vacía");
    }
}
