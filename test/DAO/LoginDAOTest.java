/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.UserBean;
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
public class LoginDAOTest {
    
    public LoginDAOTest() {
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
     * Test of login method, of class LoginDAO.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        UserBean user = null;
        LoginDAO instance = new LoginDAO();
        boolean expResult = false;
        boolean result = instance.login(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class LoginDAO.
     */
    @Test
    public void testGetUser_int() {
        System.out.println("getUser");
        int userID = 0;
        LoginDAO instance = new LoginDAO();
        UserBean expResult = null;
        UserBean result = instance.getUser(userID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class LoginDAO.
     */
    @Test
    public void testGetUser_String() {
        System.out.println("getUser");
        String username = "";
        LoginDAO instance = new LoginDAO();
        UserBean expResult = null;
        UserBean result = instance.getUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
