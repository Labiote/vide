/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Modele.Panier;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author pc744913
 */
public class AfficheConsole implements Observer, Vue{

    public AfficheConsole()
    {
        System.out.println("Contenance initiale : "+0);
    }
        
    public void update(Observable o, Object arg) {
        Panier p = (Panier) arg;
        Integer nombreFruits = p.getFruits().size();
        System.out.println("Nouvelle contenance : "+ nombreFruits);
    }

    private void setTrace(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
