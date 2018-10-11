/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Modele;

/**
 *
 * @author jd790080
 */
public abstract class Fruit {
    protected double prix;
    protected String origine;
    protected boolean pepin;
    
    public Fruit(double p,String str){
        if(p<0){
            p=-p;
        }
        this.prix=p;
        this.origine=str;
    }
    
    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @return the origine
     */
    public String getOrigine() {
        return origine;
    }
    
    @Override
    public String toString(){
        String str="Prix : "+prix+"\n origine : "+origine+" \n";
        return str;
        
    }
    
    public abstract String getFruit();
    
    public boolean equals(Fruit f) {
       if( f.getFruit().equals(this.getFruit()) && f.getPrix()==this.prix && f.getOrigine().equals(this.origine)){
           return true;
       }
       return false;
    }
}
