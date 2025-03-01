package edu.uvg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StackVectorTest {
    @Test
    public void testPushAndPop() {
        StackVector<Integer> stack = new StackVector<>();
        stack.push(5);
        stack.push(15);

        try {
            int resultado = stack.pop();
            assertEquals(15, resultado, "El último elemento en la pila debe ser 15");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }

    @Test
    public void testPeek() {
        StackVector<Integer> stack = new StackVector<>();
        stack.push(30);

        try {
            int resultado = stack.UltimoValor();
            assertEquals(30, resultado, "El último valor debe ser 30 sin ser eliminado");
        } catch (Exception e) {
            fail("No debería lanzar una excepción");
        }
    }
}
