/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author maxCD
 */
public class Arme {
    String nom;
    private int nivDatack ;
    
    public Arme (String n ,int i ){
        nom = n;
        nivDatack = i;
    }
    
    @Override
    public String toString(){
    return "Nom de l'arme: "+nom+"\nNiveau de l'arme: " +nivDatack;
    }

}
