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
public class StackListTest {
    
    public StackListTest() {
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
     * Test of push method, of class StackList.
     */
    @Test
    public void testPush() {
        System.out.println("testPush");
        StackList<String> instance = new StackList<>("Doblemente encadenada");
        String item = "5";
        String expResult = "5";
        instance.push(item);
        Object result = instance.pop();      
        assertEquals(expResult, result); 
    }

    /**
     * Test of peek method, of class StackList.
     */
    @Test
    public void testPeek() {
        System.out.println("testPeek");
        StackList<String> instance = new StackList<>("Doblemente encadenada");
        instance.push("2");
        instance.push("3");
        instance.push("4");
        Object expResult = "4";
        Object result = instance.peek();
        assertEquals(expResult, result);

    }

    /**
     * Test of pop method, of class StackList.
     */
    @Test
    public void testPop() {
        System.out.println("testPop");
        StackList<String> instance = new StackList<>("Doblemente encadenada");
        instance.push("1");
        instance.push("2");
        instance.push("3");
        Object expResult = "3";
        Object result = instance.pop();
        assertEquals(expResult, result); 
    }

    /**
     * Test of operarc method, of class StackList.
     */
    @Test
    public void testOperarListaCircular() {
        System.out.println("testOperarListaCircular");
        String expresion = "3 4 + 6 5 * - 2 /";
        String entryLista = "Lista Circular";
        StackList<Double> instance = new StackList<>(entryLista);
        double expResult = -11.5;
        double result = instance.operarc(expresion);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test for another case of operar method, of class Calculos.
     */
    @Test
    public void testOperarListaDoubly() {
        System.out.println("testOperarListaDoubly");
        String expresion = "3 4 + 6 5 * - 2 /";
        String entryLista = "Doblemente encadenada";
        StackList<Double> instance = new StackList<>(entryLista);
        double expResult = -11.5;
        double result = instance.operar(expresion);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test for another case of operar method, of class Calculos.
     */
    @Test
    public void testOperarListaSingly() {
        System.out.println("testOperarListaSingly");
        String expresion = "3 4 + 6 5 * - 2 /";
        String entryLista = "Simplemente encadenada";
        StackList<Double> instance = new StackList<>(entryLista);
        double expResult = -11.5;
        double result = instance.operar(expresion);
        assertEquals(expResult, result, 0.0);
    }
    
}
