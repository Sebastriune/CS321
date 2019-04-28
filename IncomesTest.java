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
public class IncomesTest {
    
    public IncomesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sumIncomes method, of class Incomes.
     */
    @Test
    public void testSumIncomes() {
        System.out.println("sumIncomes");
        Incomes instance = null;
        int expResult = 0;
        int result = instance.sumIncomes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addIncome method, of class Incomes.
     */
    @Test
    public void testAddIncome() {
        System.out.println("addIncome");
        Incomes instance = null;
        int expResult = 0;
        int result = instance.addIncome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
