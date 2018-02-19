/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anahernandez
 */
public class CalculosTest {
    
    public CalculosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of operar method, of class Calculos.
     */
    @org.junit.Test
    public void testOperarVector() {
        String expresion = "3 4 + 6 5 * - 2 /";
        String entryLista = "";
        String entryStack = "Vector";
        Calculos instance = new Calculos();
        double expResult = -11.5;
        double result = instance.operar(expresion, entryStack, entryLista);
        if (result != expResult)
        {
            fail("La prueba ha fallado");
        }
    }
    /**
     * Test of operar method, of class Calculos.
     */
    @org.junit.Test
    public void testOperarArrayList() {
        String expresion = "3 4 + 6 5 * - 2 /";
        String entryLista = "";
        String entryStack = "ArrayList";
        Calculos instance = new Calculos();
        double expResult = -11.5;
        double result = instance.operar(expresion, entryStack, entryLista);
        if (result != expResult)
        {
            fail("La prueba ha fallado");
        }
    }
    /**
     * Test for another case of operar method, of class Calculos.
     */
    @org.junit.Test
    public void testOperarListaSingly() {
        String expresion = "3 4 + 6 5 * - 2 /";
        String entryStack = "Lista";
        String entryLista = "Simplemente encadenada";
        Calculos instance = new Calculos();
        double expResult = -11.5;
        double result = instance.operar(expresion, entryStack, entryLista);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test for another case of operar method, of class Calculos.
     */
    @org.junit.Test
    public void testOperarListaDoubly() {
        String expresion = "3 4 + 6 5 * - 2 /";
        String entryStack = "Lista";
        String entryLista = "Doblemente encadenada";
        Calculos instance = new Calculos();
        double expResult = -11.5;
        double result = instance.operar(expresion, entryStack, entryLista);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test for another case of operar method, of class Calculos.
     */
    @org.junit.Test
    public void testOperarListaCircular() {
        String expresion = "3 4 + 6 5 * - 2 /";
        String entryStack = "Lista";
        String entryLista = "Lista Circular";
        Calculos instance = new Calculos();
        double expResult = -11.5;
        double result = instance.operar(expresion, entryStack, entryLista);
        assertEquals(expResult, result, 0.0);
    }
}
