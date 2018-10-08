/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

//import Modele.Orange;
import junit.framework.TestCase;

/**
 *
 * @author fb564351
 */
public class OrangeTest extends TestCase {
    
    public OrangeTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
    
    
    
//    /**
//     * Test of getPrix method, of class Orange.
//     */
    public void testGetPrix() throws Exception {
        System.out.println("getPrix");
        Orange instance = new Orange((float)0.0,"");
        float expResult = (float)0.0;
        float result = (float)instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
//
//    /**
//     * Test of getOrigine method, of class Orange.
//     */
//    public void testGetOrigine() {
//        System.out.println("getOrigine");
//        Orange instance = null;
//        String expResult = "";
//        String result = instance.getOrigine();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPrix method, of class Orange.
//     */
//    public void testSetPrix() throws Exception {
//        System.out.println("setPrix");
//        float p = 0.0F;
//        Orange instance = null;
//        instance.setPrix(p);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Orange.
//     */
//    public void testEquals() {
//        System.out.println("equals");
//        Orange o = null;
//        Orange instance = null;
//        boolean expResult = false;
//        boolean result = instance.equals(o);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Orange.
//     */
//    public void testToString() {
//        System.out.println("toString");
//        Orange instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
     
    
}
