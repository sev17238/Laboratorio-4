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
 * @author SDiego
 */
public class StackVectorTest {
    
    public StackVectorTest() {
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
     * Test of push method, of class StackVector.
     */
    @Test
    public void testPush() {
        System.out.println("push listo");
        Object obj = "2";
        StackVector instance = new StackVector();
        instance.push(obj);
        Object expResult = "2";
        Object result = instance.pop();
        assertEquals(expResult, result);

    }

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() {
        System.out.println("pop listo");
        StackVector instance = new StackVector();
        instance.push("1");
        instance.push("2");
        Object expResult = "2";
        Object result = instance.pop();
        assertEquals(expResult, result);

    }

    /**
     * Test of peek method, of class StackVector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek listo");
        StackVector instance = new StackVector();
        instance.push("1");
        instance.push("2");
        Object expResult = "2";
        Object result = instance.peek();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class StackVector.
     */
    @Test
    public void testSize() {
        System.out.println("size listo");
        StackVector instance = new StackVector();
        instance.push("1");
        instance.push("2");
        instance.push("3");
        instance.push("2");
        int expResult = 4;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of operar method, of class StackVector.
     */
    @Test
    public void testOperar() {
        System.out.println("operar listo");
        String linea = "33*2*";
        StackVector instance = new StackVector();
        double expResult = 18.0;
        double result = instance.operar(linea);
        assertEquals(expResult, result, 0.0);

    }
    
}
