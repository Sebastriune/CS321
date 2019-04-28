/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author triun
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({HelpTest.class, StudentDebtTest.class, MoneyKeeperTest.class, IncomesTest.class, ExpensesTest.class, InvestmentsTest.class})
public class MoneykeeperSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
