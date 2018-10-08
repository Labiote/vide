/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modele.Panier;
import View.AfficheConsole;
import java.awt.event.ActionEvent;

/**
 *
 * @author pc744913
 */
public class Control implements Controler{

    Panier p ; 
    AfficheConsole ac;
    
    public void setPanier(Panier p) {
        this.p = p;
    }

    public void setVue(AfficheConsole ac) {
        this.ac = ac;
    }

    public void actionPerformed(ActionEvent e) {
        
    }
    
}
