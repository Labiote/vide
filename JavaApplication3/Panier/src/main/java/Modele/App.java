package Modele;

import View.AfficheConsole;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        
        
        Panier p = new Panier(5);
        AfficheConsole ac = new AfficheConsole();
        p.addObserver(ac);
        
        
        
//        Panier p2 = new Panier(5);
//        
//        p.ajout(new Orange(12,"Abricot"));
//        p.ajout(new Orange(10,"Banane"));
//        
//        p2.ajout(new Orange(10,"Banane"));
//        p2.ajout(new Orange(12,"Abricot"));
//        
//        p2.retire();
//        p2.retire();
//        
//        System.out.print(p.getPrix());
    }
}
