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
    public void testOperar() {
        System.out.println("operar listo");
        String expresion = "22+4*2*8/";
        String entry = "Stack";
        String entryLista = "";
        String entryStack = "Vector";
        Calculos instance = new Calculos();
        double expResult = 4.0;
        double result = instance.operar(expresion, entry, entryLista, entryStack);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test for another case of operar method, of class Calculos.
     */
    @org.junit.Test
    public void testOperar2() {
        System.out.println("operar2 listo");
        String expresion = "22+4*2*4/";
        String entry = "Lista";
        String entryLista = "Lista Circular";
        String entryStack = "";
        Calculos instance = new Calculos();
        double expResult = 8.0;
        double result = instance.operar(expresion, entry, entryLista, entryStack);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
