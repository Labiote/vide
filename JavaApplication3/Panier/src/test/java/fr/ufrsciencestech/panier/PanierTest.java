/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

//import Modele.*;
import java.util.Vector;
import junit.framework.TestCase;
import junit.*;
import org.junit.Test;

/**
 *
 * @author fb564351
 */
public class PanierTest extends TestCase {
    
    private Orange o, o1, o2;
    private Panier p1, p2;
    
    public PanierTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        p1 = new Panier(1);
        p2 = new Panier(2);
        o = new Orange((float)0.5, "France");
        o1 = new Orange((float)0.8, "Madagascar");
        o2 = new Orange((float)0.7, "Espagne");
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testToString()
    {
        String a = p1.toString();
        assertFalse(a.isEmpty());
    }
    @Test
    public void testAjoutPanierVide() throws PanierPleinException{
        assertTrue(p1.estVide());
        p1.putOrange(o);
        assertFalse(p1.estVide());
    }
    @Test
    public void testAjoutPanierPlein() throws PanierPleinException{
        try
        {
            p1.putOrange(o);
            p1.putOrange(o2);
            fail("");
        }catch(PanierPleinException e){ System.out.println("osef");}
    }
    
//    public void testBoycotteOriginePanierVide(){
//        p2.boycotteOrigine("France");
//        assertTrue(p2.estVide());
//    }
    
    
}
