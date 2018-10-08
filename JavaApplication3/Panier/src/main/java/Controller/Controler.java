/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modele.Fruit;
import Modele.Panier;
import Modele.PanierPleinException;
import View.AfficheConsole;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 *
 * @author pc744913
 */
public interface Controler extends ActionListener{
    public void setPanier(Panier p );    
    public void setVue(AfficheConsole ac);
}
