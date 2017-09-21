/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;

/**
 *
 * @author Hashim Ali Khan
 */
public class loginNGTest {
    
    public loginNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of main method, of class login.
     */
    @org.testng.annotations.Test
    public void testMain() {
        // TODO review the generated test code and remove the default call to fail.
        login l=new login();
        l.setUn("Hashim");
        assertEquals("Hashim",l.getUn());
        l.setPass("rana");
        assertEquals("rana",l.getPass());
        l.setRol("Instuctor");
        assertEquals("Instuctor",l.getRol());
    }
    
}
