/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dessors;

/**
 *
 * @author maxCD
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String Model, String brand, int puissanceCV){      
// constructeur
        
        Modele = Model;
        Marque = brand;
        PuissanceCV = puissanceCV;
        proprietaire = null;
    }
}
