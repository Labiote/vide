/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;


public class Orange extends Fruit{
    private double prix;
    private String origine;
    
    public Orange (float p, String o) throws Exception
    { 
        super();
        setPrix(p); 
        origine = o;
    }
    
    
    public double getPrix(){ return prix;}
    public String getOrigine(){ return origine; }
    public void setPrix(float p) throws Exception 
    { 
        if(p>=0) 
            prix = p; 
        else 
            throw new Exception("Erreur prix négatif !!!!!");
    }
    
    public boolean equals(Orange o)
    {
        return prix == o.getPrix() && origine == o.getOrigine();
    }
    
    @Override
    public String toString()
    {
        return "Orange d'origine "+getOrigine()+" au prix de "+getPrix()+"€";
    }
}