/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.ArrayList;

/**
 *
 * @author jd790080
 */
public class Panier {
    
    public int nbMaxItems;
    public ArrayList<Orange> contenu;
    
    /**
     * Constructeur
     * @param m 
     */
    public Panier(int m)
    {
        this.nbMaxItems = m;
        contenu = new ArrayList(this.nbMaxItems);
    }
    
    /**
     * Accesseurs
     * @return 
     */
    public int getMax()
    {
        return this.nbMaxItems;
    }
    
    public ArrayList getContenu()
    {
        return contenu;
    }
    
    public boolean estPlein()
    {
        return contenu.size() == nbMaxItems;
    }
    
    public boolean estVide()
    {
        return contenu.size() == 0;
    }
    
    public String toString()
    {
        String res = "Votre panier d'oranges : Nombre d'oranges : "+this.contenu.size()+"/"+this.nbMaxItems+"\n";
        
        for(int k=0; k<this.contenu.size(); k++)
        {
            //System.out.println(res);
            if(this.contenu.get(k)!=null)
                res += contenu.get(k).toString();
        }
        return res;
    }
    
    public boolean equals(Panier p2)
    {
        boolean res = true;
        if(this.nbMaxItems != p2.nbMaxItems)
            return false;
        else if(this.nbMaxItems == p2.nbMaxItems)
        {
            for(int i=0; i<this.contenu.size();i++)
            {
                if(this.contenu.get(i).equals(p2.contenu.get(i)))
                    ;
                else
                    res = false;
            }
        }
        return res;
    }
    
    public void ajouterOrange(Orange o)
    {
        if(this.contenu.size() < this.nbMaxItems)
        {
            this.contenu.add(o);
        }
        else
        {
            System.out.println("Depassement de la taille maximum autorisee du panier...");
        }
    }
    
    /**
     * retirer la derniere orange du panier
     */
    public void retireOrange()
    {
        this.contenu.remove(this.contenu.size()-1);
    }
    
    public double getprix()
    {
        double res = 0;
        for(int i=0; i<contenu.size();i++)
        {
            res += contenu.get(i).getPrix();
        }
        return res;
    }
    
    public void boycotteOrange(String p)
    {
        for(int i=0;i<this.contenu.size();i++)
        {
            if(this.contenu.get(i).getOrigine().equals(p))
                this.contenu.remove(i);
        }
    }
}
