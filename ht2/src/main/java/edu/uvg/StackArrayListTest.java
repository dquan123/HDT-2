package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StackArrayListTest {
    @Test
    public void testPushAndPop() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(10);
        stack.push(20);

        try {
            int resultado = stack.pop();
            assertEquals(20, resultado, "El último elemento en la pila debe ser 20");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }

    @Test
    public void testEmptyStack() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        assertTrue(stack.isEmpty(), "La pila debería estar vacía");
    }
}
