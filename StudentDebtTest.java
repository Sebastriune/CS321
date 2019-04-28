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
public class StudentDebtTest {
    
    public StudentDebtTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sumStudentDebt method, of class StudentDebt.
     */
    @Test
    public void testSumStudentDebt() {
        System.out.println("sumStudentDebt");
        StudentDebt instance = null;
        int expResult = 0;
        int result = instance.sumStudentDebt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDebt method, of class StudentDebt.
     */
    @Test
    public void testAddDebt() {
        System.out.println("addDebt");
        StudentDebt instance = null;
        int expResult = 0;
        int result = instance.addDebt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
