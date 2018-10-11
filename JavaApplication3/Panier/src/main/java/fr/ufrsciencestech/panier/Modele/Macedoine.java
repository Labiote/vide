/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Modele;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author gd238947
 */
public class Macedoine extends Observable {
    private ArrayList<Fruit> ingredient;
    private String nom;

    public Macedoine(String n){
        this.nom=n;
        this.ingredient= new ArrayList<Fruit>();
    }
    public void putFruit(Fruit o){
        getListe().add(o);
        setChanged();
        notifyObservers();
    }
    public ArrayList<Fruit> getListe() {
        return ingredient;
    }
    public String toString(){
        String str="Voici un macédoine "+ nom+" elle contient :";
        for(int i=0 ; i<getListe().size(); i++ ){
            str+=","+getListe().get(i);
        }
        return str;
    }
}
