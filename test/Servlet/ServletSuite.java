/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Shermaine
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Servlet.AddSupplierServletTest.class, Servlet.ProcureServletTest.class, Servlet.AddClientServletTest.class, Servlet.ItemsOfSupplierTest.class, Servlet.LoginServletTest.class, Servlet.GenerateItemTest.class, Servlet.AddItemServletTest.class})
public class ServletSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
