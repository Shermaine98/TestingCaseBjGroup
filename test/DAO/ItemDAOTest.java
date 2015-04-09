/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.ItemBean;
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
public class ItemDAOTest {
    
    public ItemDAOTest() {
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
     * Test of addItem method, of class ItemDAO.
     */
    @Test
    public void testAddItem() throws Exception {
       ItemBean itembean = new ItemBean("Geraline","TAO",2,100000.000);
       ItemDAO itemDAO = new ItemDAO();
       itemDAO.addItem(itembean, 1);
       
       ItemBean test = new ItemBean();
       int lastObject =itemDAO.getAllItems().size()-1;
      
       itembean.setItemid(itemDAO.getAllItems().get(lastObject).getItemid()); 
       test = itemDAO.getAllItems().get(lastObject);
       
       System.out.println(itembean.getItemDesc());
       System.out.println(itembean.getItemName());
       System.out.println(itembean.getItemPrice());
       System.out.println(itembean.getItemid());
       
       System.out.println(test.getItemDesc());
       System.out.println(test.getItemName());
       System.out.println(test.getItemPrice());
       System.out.println(test.getItemid());

       assertEquals(itembean,test);
       System.out.println("Passed");
//       System.out.println("addItem");
//        ItemBean itemBean = null;
//        int supplierID = 0;
//        ItemDAO instance = new ItemDAO();
//        instance.addItem(itemBean, supplierID);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getAllItems method, of class ItemDAO.
     */
    /*
    @Test
    public void testGetAllItems_0args() throws Exception {
        System.out.println("getAllItems");
        ItemDAO instance = new ItemDAO();
        ArrayList<ItemBean> expResult = null;
        ArrayList<ItemBean> result = instance.getAllItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getAllItems method, of class ItemDAO.
     */
    /*
    @Test
    public void testGetAllItems_int() throws Exception {
        System.out.println("getAllItems");
        int supplierID = 0;
        ItemDAO instance = new ItemDAO();
        ArrayList<ItemBean> expResult = null;
        ArrayList<ItemBean> result = instance.getAllItems(supplierID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of getItem method, of class ItemDAO.
     */
    /*@Test
    public void testGetItem() throws Exception {
        System.out.println("getItem");
        int itemID = 0;
        ItemDAO instance = new ItemDAO();
        ItemBean expResult = null;
        ItemBean result = instance.getItem(itemID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
}
