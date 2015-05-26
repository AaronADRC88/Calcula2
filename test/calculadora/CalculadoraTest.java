/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aferreiradominguez
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

  
    /**
     * Test of realizaOperacion method, of class Calculadora.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        float n1 = 4.0F;
        float n2 = 2.0F;
        String op = "restar";
        float expResult = 2.0F;
        float result = Calculadora.realizaOperacion(n1, n2, op);
       // assertEquals(3, new float[]{10,20},new float[]{10,10});
        assertEquals(expResult, result,0.0F);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
