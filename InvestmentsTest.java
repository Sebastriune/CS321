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
public class InvestmentsTest {
    
    public InvestmentsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of investmentSuggestion method, of class Investments.
     */
    @Test
    public void testInvestmentSuggestion() {
        System.out.println("investmentSuggestion");
        Investments instance = null;
        String expResult = "";
        String result = instance.investmentSuggestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
