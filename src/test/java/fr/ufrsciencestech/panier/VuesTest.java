/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import fr.ufrsciencestech.panier.Modele.Panier;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author jd790080
 */
public class VuesTest {
    
    Panier exp;
    
    @Before
    public void setUp()
    {
        exp = new Panier(2);
    }
    
     @Test
     public void testUpdate()
     {
         System.out.println("testUpdate");
         Panier test = new Panier(2);
         assertEquals(test,exp);

     }
}
