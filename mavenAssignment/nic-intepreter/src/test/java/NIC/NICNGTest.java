/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NIC;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Nirosh
 */
public class NICNGTest {
     private NIC n;
   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        n=new NIC();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of calculate method, of class NIC.
     */
    @Test
    public void testCalculate() {
       
        String input = "913040937V";
        String[] expResult = {"1991","10","30","MALE","true"};
        String[] result = n.calculate(input);
        assertEquals(result, expResult);
        
    }
}
