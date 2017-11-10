/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Joueur {

    @Override
    public String toString() {
        return "nomJoueur:" + this.nomJoueur + " cartes:" + this.cartes;
        
    }
    private String nomJoueur;
    private  ArrayList<Cartes> cartes = new ArrayList<>();
    

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }
    


    public ArrayList<Cartes> getCartes() {
        return cartes;
    }

    public void setCartes(ArrayList<Cartes> cartes) {
        this.cartes = cartes;
    }

   
     

    

    
    
}
