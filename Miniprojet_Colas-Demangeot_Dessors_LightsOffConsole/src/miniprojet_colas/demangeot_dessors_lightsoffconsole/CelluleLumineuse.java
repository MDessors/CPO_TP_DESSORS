/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_colas.demangeot_dessors_lightsoffconsole;

/**
 *
 * @author maxCD
 */
public class CelluleLumineuse {
    
    private boolean[][]grille;
    
    public CelluleLumineuse(int taille){
        grille = new boolean [taille][taille];
        
        for (int i = 0; i <taille ; i++){
            for (int j = 0; j < taille; j++){
                grille[i][j]=false;
            }
        }
    }
    public String toString(){
        String s ="";
        for(int i = 0; i < grille.length; i++){
            for(int j = 0; j < grille[i].length; j++){
                if(grille[i][j]){
                    s +="a";
                }else{
                    s +="e";
                }
            }
            s +="\n";
        }
        return s;
    }
}
