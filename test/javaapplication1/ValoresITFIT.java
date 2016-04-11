/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
public class ValoresITFIT {
    
    public ValoresITFIT() {
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
     * Test of ins method, of class ValoresITF.
     */
    @Test
    public void testIns() {
        System.out.println("ins");
        int v = 0;
        ValoresITF instance = new ValoresITFImpl();
        boolean expResult = false;
        boolean result = instance.ins(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of del method, of class ValoresITF.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        int i = 0;
        ValoresITF instance = new ValoresITFImpl();
        int expResult = 0;
        int result = instance.del(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ValoresITF.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ValoresITF instance = new ValoresITFImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mean method, of class ValoresITF.
     */
    @Test
    public void testMean() {
        System.out.println("mean");
        ValoresITF instance = new ValoresITFImpl();
        double expResult = 0.0;
        double result = instance.mean();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of greater method, of class ValoresITF.
     */
    @Test
    public void testGreater() {
        System.out.println("greater");
        ValoresITF instance = new ValoresITFImpl();
        int expResult = 0;
        int result = instance.greater();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lower method, of class ValoresITF.
     */
    @Test
    public void testLower() {
        System.out.println("lower");
        ValoresITF instance = new ValoresITFImpl();
        int expResult = 0;
        int result = instance.lower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ValoresITFImpl implements ValoresITF {

        public boolean ins(int v) {
            return false;
        }

        public int del(int i) {
            return 0;
        }

        public int size() {
            return 0;
        }

        public double mean() {
            return 0.0;
        }

        public int greater() {
            return 0;
        }

        public int lower() {
            return 0;
        }
    }
    
}
