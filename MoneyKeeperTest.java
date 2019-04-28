/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author triun
 */
public class MoneyKeeperTest {
    
    public MoneyKeeperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class MoneyKeeper.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MoneyKeeper.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateDelta method, of class MoneyKeeper.
     */
    @Test
    public void testCalculateDelta() {
        System.out.println("calculateDelta");
        MoneyKeeper instance = new MoneyKeeper();
        int expResult = 0;
        int result = instance.calculateDelta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
