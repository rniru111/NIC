
package nic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NICTest {
    
    @Before
    public void setUp() {
        NIC instance = new NIC();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getYear method, of class NIC.
     */
    @Test
    public void testGetYear() {
         NIC instance = new NIC();
        System.out.println("getYear");
        String input = "902042474V";
        int expResult = 1990;
        int result = instance.getYear(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class NIC.
     */
    @Test
    public void testGetMonth() {
         NIC instance = new NIC();
        System.out.println("getMonth");
        String input = "902042474V";
        int expResult = 7;
        int result = instance.getMonth(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class NIC.
     */
    @Test
    public void testGetDate() {
         NIC instance = new NIC();
        System.out.println("getDate");
        String input = "902042474V";
        int expResult = 22;
        int result = instance.getDate(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of gender method, of class NIC.
     */
    
   

    /**
     * Test of isVoter method, of class NIC.
     */
     public void testGender() {
          NIC instance = new NIC();
        System.out.println("gender");
        String input = "902042474V";
        String expResult = "Male";
        String result = instance.gender(input);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsVoter() {
         NIC instance = new NIC();
        System.out.println("isVoter");
        String input = "902042474V";
        boolean expResult = true;
        boolean result = instance.isVoter(input);
        assertEquals(expResult, result);
    }
}
