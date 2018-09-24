/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.Scanner;
/**
 *
 * @author jd790080
 */
public class Orange {
    
    private double prix;
    private String origine;
    
    /**
     * Constructeur
     * @param p prix
     * @param o origine
     */
    public Orange(double p, String o)
    {
        this.prix = checkPrix(p);
        this.origine = o;
    }
    
    /**
     * Accesseurs
     */
    public double getPrix()
    {
        return this.prix;
    }
    
    public String getOrigine()
    {
        return this.origine;
    }
    
    /**
     * Checker si le prix < 0 si oui on demande un vrai prix
     * @param c prix de base
     * @return prix correct
     */
    private double checkPrix(double c)
    {
        Scanner s = new Scanner(System.in);
        String t =""+c;
        if(c < 0)
        {  
            do
            {
                System.out.println("Prix incorrect, impossible d'entrer un prix negatif. Nouveau prix ?");
                
                t = s.nextLine();
            }while(Double.parseDouble(t)<0);
        }
        return Double.parseDouble(t);
    }
    
    @Override
    public String toString()
    {
        return("Orange de : "+this.origine+" / Prix : "+this.prix+"\n");
    }
    
    public boolean equals(Orange o2)
    {
        if(o2.prix == this.prix)
            if(this.origine.equals(o2.origine))
                return true;
        return false;
    }
}
