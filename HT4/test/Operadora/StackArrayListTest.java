
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
public class StackArrayListTest {
    
    public StackArrayListTest() {
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
     * Test of push method, of class StackArrayList.
     */
    @Test
    public void testPush() {
        System.out.println("push listo");
        StackArrayList instance = new StackArrayList();
        Object item = "5";
        Object expResult = "5";
        instance.push(item);
        Object result = instance.pop();      
        assertEquals(expResult, result); 
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop listo");
        StackArrayList<String> instance = new StackArrayList<String>();
        //ArrayList<String> places = new ArrayList<String>( Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
        instance.push("1");
        instance.push("2");
        instance.push("3");
        Object expResult = "3";
        Object result = instance.pop();
        assertEquals(expResult, result); 
    }

    /**
     * Test of peek method, of class StackArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek listo");
        StackArrayList instance = new StackArrayList();
        instance.push("2");
        instance.push("3");
        instance.push("4");
        Object expResult = "4";
        Object result = instance.peek();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class StackArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size listo");
        StackArrayList instance = new StackArrayList();
        instance.push("2");
        instance.push("3");
        instance.push("6");
        instance.push("6");
        int expResult = 4;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of empty method, of class StackArrayList.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty listo");
        StackArrayList instance = new StackArrayList();
        instance.push("1");
        instance.pop();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);

    }

    /**
     * Test of operar method, of class StackArrayList.
     */
    @Test
    public void testOperar() {
        System.out.println("operar listo");
        String linea = "22+5*";
        StackArrayList instance = new StackArrayList();
        double expResult = 20.0;
        double result = instance.operar(linea);
        assertEquals(expResult, result, 0.0);

    }
    
}
