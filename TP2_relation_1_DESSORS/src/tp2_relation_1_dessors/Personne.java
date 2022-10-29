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
}
