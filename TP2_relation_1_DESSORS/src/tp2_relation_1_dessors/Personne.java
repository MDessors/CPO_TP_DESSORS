/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dessors;

/**
 *
 * @author maxCD
 */
public class Personne {
    
    String Prenom;
    String Nom;
    int nbVoitures;
    Voiture[] liste_voitures;
    
    public Personne(String prenom, String nom){     
//constructeur de la classe personne
        
        Prenom = prenom;
        Nom = nom;
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "\nnom : " + Nom + "\nprenom : " + Prenom +"\nnombre de voitures : " + nbVoitures;
        return chaine_a_retourner ;
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire !=null){
            System.out.println(voiture_a_ajouter + "voiture volee !!");
            return false;
            }else{
            if(this.nbVoitures == 3){
                System.out.println(this.Nom + this.Prenom+ "a déjà 3 voitures");
                return false;
            }else{
                this.liste_voitures[nbVoitures] = voiture_a_ajouter;
                nbVoitures += 1;
                voiture_a_ajouter.proprietaire = this  ;
                return true;

                }
            }
        }
    }
