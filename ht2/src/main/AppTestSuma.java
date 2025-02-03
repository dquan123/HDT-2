import org.junit.*;

public class AppTestSuma {
    @Test
    public void testSuma() {
        App app = new App();
        try {
            int resultado = app.evaluate("3 4 +");
            Assert.assertEquals(10, resultado); // ERROR: Debería ser 7, pero ponemos 10
        } catch (Exception e) {
            Assert.fail("No debería lanzar una excepción");
        }
    }
}
