/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.SupplierBean;
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
public class SupplierDAOTest {
    
    public SupplierDAOTest() {
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
     * Test of addSupplier method, of class SupplierDAO.
     */
    @Test
    public void testAddSupplier() {
        System.out.println("addSupplier");
        SupplierBean supplier = null;
        SupplierDAO instance = new SupplierDAO();
        boolean expResult = false;
        boolean result = instance.addSupplier(supplier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSuppliers method, of class SupplierDAO.
     */
    @Test
    public void testGetAllSuppliers() throws Exception {
        System.out.println("getAllSuppliers");
        SupplierDAO instance = new SupplierDAO();
        ArrayList<SupplierBean> expResult = null;
        ArrayList<SupplierBean> result = instance.getAllSuppliers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplier method, of class SupplierDAO.
     */
    @Test
    public void testGetSupplier() {
        System.out.println("getSupplier");
        int supplierID = 0;
        SupplierDAO instance = new SupplierDAO();
        SupplierBean expResult = null;
        SupplierBean result = instance.getSupplier(supplierID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
