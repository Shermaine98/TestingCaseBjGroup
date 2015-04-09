/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.SupplierBean;
import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gerard
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
    public void testAddSupplier() throws SQLException {
        SupplierBean supplierBean = new SupplierBean("Shermaine", "15 Twinster town hall", "1234", "09064643073", "phil", "shermaine@yahoo.com", "shermainbe", "sy", "09064643073", "sher@yahoo.com" );
        
        SupplierDAO supplierDAO = new SupplierDAO();
        supplierDAO.addSupplier(supplierBean);
        
        SupplierBean test = new SupplierBean();
        int lastObject = supplierDAO.getAllSuppliers().size()-1;
        supplierBean.setSupplierID(supplierDAO.getAllSuppliers().get(lastObject).getSupplierID());
       
        test = supplierDAO.getAllSuppliers().get(lastObject);

        assertEquals(supplierBean, test);
        System.out.println("Passed");
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
    /**
     * Test of getAllSuppliers method, of class SupplierDAO.
     */
    @Test
    public void testGetAllSuppliers() throws Exception {
        
        SupplierBean supplierBean = new SupplierBean("Shermaine", "15 Twinster town hall", "1234", "09064643073", "phil", "shermaine@yahoo.com", "shermainbe", "sy", "09064643073", "sher@yahoo.com" );
        
        SupplierDAO supplierDAO = new SupplierDAO();
        supplierDAO.addSupplier(supplierBean);
        
        SupplierBean test = new SupplierBean();
        int lastObject = supplierDAO.getAllSuppliers().size()-1;
        supplierBean.setSupplierID(supplierDAO.getAllSuppliers().get(lastObject).getSupplierID());
       
        test = supplierDAO.getAllSuppliers().get(lastObject);
        
        assertEquals(supplierBean, test);
        System.out.println("Passed");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of getSupplier method, of class SupplierDAO.
     */
    /*
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
    */
}
