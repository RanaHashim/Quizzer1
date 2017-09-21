/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hashim Ali Khan
 */
public class settingQuizNGTest {
    
    public settingQuizNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of serialize method, of class settingQuiz.
     */
    @Test
    public void testSerialize() {
        System.out.println("serialize");
        ArrayList<data> st = null;
        settingQuiz instance = new settingQuiz();
        instance.serialize(st);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quiz_description method, of class settingQuiz.
     */
    @Test
    public void testQuiz_description() {
        System.out.println("quiz_description");
        settingQuiz instance = new settingQuiz();
        instance.quiz_description();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class settingQuiz.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        settingQuiz.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
