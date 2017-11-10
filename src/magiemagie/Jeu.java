/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Jeu {

    private ArrayList<Joueur> Joueurs = new ArrayList<>();
    private Joueur joueurEnCours;

    public Joueur getJoueurEnCours() {
        return joueurEnCours;
    }

    public void setJoueurEnCours(Joueur joueurEnCours) {
        this.joueurEnCours = joueurEnCours;
    }

    public ArrayList<Joueur> getJoueurs() {
        return Joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> Joueur) {
        this.Joueurs = Joueurs;
    }

    public void menuPrincipal() {

        boolean Quitter = false;
        while (Quitter == false) {

            //affiche le menu
            System.out.println("Menu :");
            System.out.println("--------");
            System.out.println("1.Nouveau Joueur");
            System.out.println("2.Afficher la liste des joueurs");
            System.out.println("3.Demarer Partie");
            System.out.println("4.Quitter");

            // saisie clavier
            String choix = new Scanner(System.in).nextLine();
            switch (choix) {
                case "1":
                    menuNouveauJoueur();
                    break;
                case "2":
                    System.out.println(Joueurs);
                    break;
                case "3":
                    demarerParti();
                    break;
                case "4":
                    Quitter = true;
                    break;
                default:
                    System.out.println("Commande Invalide");
                    break;

            }
        }
    }

    public void menuNouveauJoueur() {

        //1.saisie du nom
        System.out.print("saisir le nom du joueur:");
        Scanner s = new Scanner(System.in);
        String nomjoueur = s.nextLine();

        //2.cree un joueur et on lui set le nom
        Joueur joueur = new Joueur();
        joueur.setNomJoueur(nomjoueur);

        //3.ajout dans la list
        Joueurs.add(joueur);

    }

    public void demarerParti() {

        //distribue 7 cartes par joueur
        for (Joueur joueur1 : Joueurs) {

            for (int i = 0; i < 7; i++) {
                Cartes carte = new Cartes();

                //distribuer 7 cartes pour le joueur actuel
                Random random = new Random();
                int nb = random.nextInt(5);
                switch (nb) {
                    case 0:
                        carte.setType(Cartes.TypeCarte.Aile_de_chauve_souris);
                        break;
                    case 1:
                        carte.setType(Cartes.TypeCarte.Bave_de_crapaud);
                        break;
                    case 2:
                        carte.setType(Cartes.TypeCarte.Corne_de_licorne);
                        break;
                    case 3:
                        carte.setType(Cartes.TypeCarte.Lapis_lazuli);
                        break;
                    case 4:
                        carte.setType(Cartes.TypeCarte.Mandragore);
                        break;
                    default:
                        break;
                }
                joueur1.getCartes().add(carte);
            
            }
            //Donner la main au premier joueur
            joueurEnCours = Joueurs.get(0);
            
            menuAction();

        }

    }

    //lance sort ou passe tour  
    public void menuAction() {
boolean terminer = false;
        do {
        //affiche menu
        System.out.println("Menu");
        System.out.println("-----");
        System.out.println("A vous de jouer:" + joueurEnCours.getNomJoueur());
        System.out.println("Cartes:" + joueurEnCours.getCartes());
        System.out.println("a.passer son tour");
        System.out.println("b.lancer le sort");
        System.out.print("votre choix:");
        Scanner scan = new Scanner(System.in);
        String choix = scan.nextLine();
        
                   
            
        
        
        switch (choix) {
            case "a":
                passerSonTour();
                terminer = true;
                break;
            case "b":
                lancerSort();
                terminer = true;
                break;
            default:
                System.out.println("commande invalide");
                break;
                
        } 
        
        } while (terminer == false);
        
        }
        

    public void passerSonTour() {

        
        
        
        
        
    }

    public void lancerSort() {

        
        boolean terminer = false;
        while (terminer == false){
        //affiche les sort possible
        Cartes carteCorneLicorne = new Cartes();
        Cartes carteBaveCrapaud = new Cartes();
        Cartes carteMandragore = new Cartes();
        Cartes carteAilesCS = new Cartes();
        Cartes carteLapisLazuli = new Cartes();
        
        
        carteCorneLicorne.setType(Cartes.TypeCarte.Corne_de_licorne);
        carteBaveCrapaud.setType(Cartes.TypeCarte.Bave_de_crapaud);
        carteMandragore.setType(Cartes.TypeCarte.Mandragore);
        carteAilesCS.setType(Cartes.TypeCarte.Aile_de_chauve_souris);
        carteLapisLazuli.setType(Cartes.TypeCarte.Lapis_lazuli);
        
        
        if(joueurEnCours.getCartes().contains(carteCorneLicorne)&& 
                joueurEnCours.getCartes().contains(carteBaveCrapaud))
            System.out.println("1 INVISIBILITE");
        if(joueurEnCours.getCartes().contains(carteCorneLicorne)&&
                joueurEnCours.getCartes().contains(carteMandragore))
            System.out.println("2 FILTRE D’AMOUR");
        if(joueurEnCours.getCartes().contains(carteBaveCrapaud)&& 
                joueurEnCours.getCartes().contains(carteLapisLazuli))
            System.out.println("3 HYPNOSE");
        if(joueurEnCours.getCartes().contains(carteLapisLazuli)&& 
                joueurEnCours.getCartes().contains(carteAilesCS))
            System.out.println("4 DIVINATION");
        if(joueurEnCours.getCartes().contains(carteMandragore)&& 
                joueurEnCours.getCartes().contains(carteAilesCS))
            System.out.println("5 SOMMEIL-PROFOND");
            
        
        
            Scanner scan = new Scanner(System.in);
            String choix = scan.nextLine();
             
            switch (choix){
            case "1":
               sortInvisibilité();
                terminer = true;
                 
                break;
            case "2":
                sortPhiltreAmour();
                terminer = true;
                
                break;
            case "3":
                sortHypnose();
            terminer = true;
                
                break;
            case "4":
                sortDivination();
                terminer = true;
                
                break;
            case "5":
                sortSommeilProfond();
                terminer = true;
                
                break;
              
            default:
                System.out.println("commande invalide");
                return;
                                
                       
                        }
        
        //saisi ls sort a lancer
        
        //lancement du sort
        
        //supprime les carte qui on lancer le sort
           
    
        }
        } 

    private void sortInvisibilité() {
        
    }

    private void sortPhiltreAmour() {
        
    }

    private void sortHypnose() {
        
    }

    private void sortDivination() {
      
    }

    private void sortSommeilProfond() {
         
    }
}
    
       
        
        
        