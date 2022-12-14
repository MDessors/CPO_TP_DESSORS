/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_dessors;

/**
 *
 * @author maxCD
 */ 
public abstract class Personnage implements etreVivant{
    
    String Name;
    int Hp;
    Vector Liste_Armes = new Vector();
    Arme Arme_Main;
    String Arme_predilection;
    int nb_personnages = 0;
    
    
    public Personnage(String name, int hp, String arme_predilection){
        Name = name;
        Hp = hp;
        Arme_predilection = arme_predilection;
        nb_personnages ++;
    }
}
