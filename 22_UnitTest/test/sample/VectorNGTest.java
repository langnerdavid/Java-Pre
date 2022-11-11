/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package sample;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author davidlangner
 */
public class VectorNGTest {
    
    public VectorNGTest() {
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
     * Test of setData method, of class Vector.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        double[] data = {1, 2};
        Vector instance = new Vector();
        instance.setData(data);
    }

    /**
     * Test of equals method, of class Vector.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Vector v1 = new Vector();        
        Vector v2 = new Vector();
        double[] data = {1, 3, 5, 7, 9};       
        v1.setData(data);
        v2.setData(new double[] {1, 3});
        Vector instance = new Vector();
        boolean expResult = false;
        boolean result = instance.equals(v1, v2);
        assertEquals(result, expResult);
    }

    /**
     * Test of scalarMultiplication method, of class Vector.
     */
    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        Vector v1 = new Vector();        
        Vector v2 = new Vector();
        double[] data = {1, 3, 1, 2, 2};       
        v1.setData(data);
        v2.setData(data);
        Vector instance = new Vector();
        double expResult = 19.0;
        double result = instance.scalarMultiplication(v1, v2);
        assertEquals(result, expResult, 0.0);
    }
}
