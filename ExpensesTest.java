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
public class ExpensesTest {
    
    public ExpensesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sumExpenses method, of class Expenses.
     */
    @Test
    public void testSumExpenses() {
        System.out.println("sumExpenses");
        Expenses instance = null;
        int expResult = 0;
        int result = instance.sumExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addExpense method, of class Expenses.
     */
    @Test
    public void testAddExpense() {
        System.out.println("addExpense");
        Expenses instance = null;
        int expResult = 0;
        int result = instance.addExpense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
