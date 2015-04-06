/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.ProcureBean;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shermaine
 */
public class ProcureDAOTest {
    
    public ProcureDAOTest() {
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
     * Test of procureOrder method, of class ProcureDAO.
     */
    @Test
    public void testProcureOrder() throws Exception {
        System.out.println("procureOrder");
        ArrayList<ProcureBean> procureList = null;
        ProcureDAO instance = new ProcureDAO();
        boolean expResult = false;
        boolean result = instance.procureOrder(procureList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
