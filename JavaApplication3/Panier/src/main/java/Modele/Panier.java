package Modele;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Vector;

public class Panier extends Observable{
    private int maxFruits;
    private Vector<Fruit> lFruits;
    
   
    
    public Panier(int m)
    {
        maxFruits = m;
        lFruits = new Vector<Fruit>();
    }
    
    public int getMax()
    {
        return maxFruits;
    }
    
    public Vector<Fruit> getFruits()
    {
        return lFruits;
    }
    
    public boolean estPlein()
    {
        return lFruits.size() == maxFruits;
    }
    
    public boolean estVide()
    {
        return lFruits.isEmpty();
    }
    
    @Override
    public String toString()
    {
        String s="";
        for (Fruit o : lFruits)
            s += o.toString() + "\n";
        return s;
    }
    public void ajout(Fruit o) throws PanierPleinException{
        if (lFruits.size() < maxFruits)
            lFruits.add(o);
        else
            throw new PanierPleinException();
        setChanged();
        notifyObservers(getFruits().size());
    }  
    
    public void retire() throws PanierVideException{
        if (!lFruits.isEmpty())
            lFruits.remove(lFruits.size()-1);
        else
             throw new PanierVideException();
        setChanged();
        notifyObservers(getFruits().size());
    }
    
    public double getPrix(){
        double prix = 0;
        for (Fruit o : lFruits)
            prix += o.getPrix();
        return prix;
    }
    
    public void boycotteOrigine(String o){
        if (lFruits.size() >= 0)
        for(int i = lFruits.size(); i >= 0; i--){
            if (lFruits.elementAt(i).getOrigine().equals(o)) lFruits.remove(i);
        }
        setChanged();
        notifyObservers(getFruits().size());
    }
    
    public boolean equals(Panier p)
    {
        if (lFruits.size() != p.getFruits().size() || maxFruits != p.getMax() )
            return false;
        boolean trouve = false;
        for (Fruit o : lFruits)
        {
            trouve = false;
            for (Fruit o2 : p.getFruits())
                if (o.equals(o2) )
                    trouve = true;
            if (!trouve)
                return false;
            
        }
        return true;
    }
}
