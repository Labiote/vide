package fr.ufrsciencestech.panier;
import fr.ufrsciencestech.panier.Panier;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Panier p = new Panier(5);
        p.ajouterOrange(new Orange(-0.8,"France"));
        p.ajouterOrange(new Orange(0.8,"Espagne"));
        p.ajouterOrange(new Orange(0.9,"Floride"));
        //p.boycotteOrange("Floride");
        
        System.out.println(p.toString());
    }
}
