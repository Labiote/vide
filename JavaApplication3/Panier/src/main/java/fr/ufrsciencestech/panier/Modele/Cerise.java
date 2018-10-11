/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Modele;

/**
 *
 * @author ar948052
 */
public class Cerise extends Fruit{

    public Cerise(double p,String str){
        super(p,str);
        this.pepin = true;
    }
    
    @Override
    public String toString(){
        return this.getFruit() + super.toString();
    }

    @Override
    public String getFruit() {
        return "Cerise";
    }
}
