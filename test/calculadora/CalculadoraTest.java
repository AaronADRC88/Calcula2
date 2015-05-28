package calculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculadoraTest {
    
    private Float n1;
    private Float n2;
    private String op;
    private Float expResult;
    private Calculadora calculadora;
    
    @Before
    public void initialize() {
        calculadora = new Calculadora();
    }
    
    public CalculadoraTest(Float nu1, Float nu2, String ope, Float expResul) {
        this.n1 = nu1;
        this.n2 = nu2;
        this.op = ope;
        this.expResult = expResul;
    }
    
    @Parameterized.Parameters
    public static Collection calculando() {
        return Arrays.asList(new Object[][]{
            {1.0f, 1.0f, "sumar", 2.0f},
            {1.0f, 2.0f, "sumar", 3.0f},
            {2.0f,1.0f,"restar",1.0f}
        });
    }
    
    
    /**
     * Test of realizaOperacion method, of class Calculadora.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion" + n1 + n2 + op);
        // float result = Calculadora.realizaOperacion(n1, n2, op);
        assertEquals(expResult, calculadora.realizaOperacion(n1, n2, op),0.0);

        //fail("The test case is a prototype.");
    }
    
}
