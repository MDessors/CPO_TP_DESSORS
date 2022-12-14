/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_dessors;

/**
 *
 * @author maxCD
 */
public class Magicien extends Personnage{
    
    boolean Confirme;
    int nb_magicien = 0;
    
    public Magicien(String name, int hp, boolean confirme){
        super(name, hp, "Baton");
        Confirme = confirme;
        nb_magicien ++;
    }    
}
