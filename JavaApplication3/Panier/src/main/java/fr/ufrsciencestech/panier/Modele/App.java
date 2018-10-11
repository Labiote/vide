package Modele;

import Controller.Controler;
import Modele.Orange;
import Modele.Panier;
import View.VueConsole;
import View.VueGswing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Orange o=new Orange(3.45,"France");
        Orange o1=new Orange(3.45,"France");
        Orange o2=new Orange(66.66,"Allemagne");
        Panier p=new Panier(3);
        Panier p2=new Panier(5);
        p.putOrange(o);
        p.putOrange(o1);
        p.putOrange(o2);
        
        p2.putOrange(o);
        p2.putOrange(o1);
        p2.putOrange(o2);
        p2.putOrange(o2);
        VueConsole vc=new VueConsole();
        p.addObserver(vc);
        p.boycotte("Allemagne");
        VueGswing vue=new VueGswing();
        Controler c=new Controler();
        c.setP(p);
        c.setVue(vue);
        p.addObserver(vue);
        vue.addControler(c);
        vue.setVisible(true);
    }
}