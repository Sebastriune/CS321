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
public class HelpTest {
    
    public HelpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getHelpMessage method, of class Help.
     */
    @Test
    public void testGetHelpMessage() {
        System.out.println("getHelpMessage");
        Object requestedClass = null;
        Help instance = new Help();
        String expResult = "";
        String result = instance.getHelpMessage(requestedClass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
