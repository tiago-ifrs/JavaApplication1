/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author redes2
 */
public class ValoresIT extends TestCase {

    private Valores val;
    
    private Valores instance;

    public ValoresIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
        val = new Valores();
        val.ins(5);
        val.ins(12);
        val.ins(1);
        val.ins(30);
        val.ins(152);
        val.ins(6);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ins method, of class Valores.
     */
    @Test
    public void testIns() {
        assertEquals(false, val.ins(-10));
        assertEquals(false, val.ins(0));
        val.ins(2);
        assertEquals(7, val.size());
        val.ins(3);
        assertEquals(8, val.size());
        val.ins(4);
        assertEquals(9, val.size());
        val.ins(5);
        assertEquals(10, val.size());
        assertEquals(false, val.ins(11));
    }

    /**
     * Test of del method, of class Valores.
     */
    @Test
    public void testDel() {
        assertEquals(5, val.del(0));
        assertEquals(6, val.del(4));
        assertEquals(-1, val.del(4));
        assertEquals(1, val.del(1));
        assertEquals(12, val.del(0));
        assertEquals(30, val.del(0));
        assertEquals(152, val.del(0));
        assertEquals(-1, val.del(0));
    }

    /**
     * Test of size method, of class Valores.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        //Valores instance = null;
        //Valores instance = new Valores();
        instance = new Valores();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mean method, of class Valores.
     */
    @Test
    public void testMean() {
        assertTrue(Math.round(34.3) == Math.round(val.mean()));
        assertTrue(Math.round(0.0) == Math.round((new Valores()).mean()));
    }

    /**
     * Test of greater method, of class Valores.
     */
    @Test
    public void testGreater() {
        assertEquals(152, val.greater());
        assertEquals(-1, (new Valores()).greater());
    }

    /**
     * Test of lower method, of class Valores.
     */
    @Test
    public void testLower() {
        assertEquals(1, val.lower());
        assertEquals(-1, (new Valores()).lower());
    }

}
