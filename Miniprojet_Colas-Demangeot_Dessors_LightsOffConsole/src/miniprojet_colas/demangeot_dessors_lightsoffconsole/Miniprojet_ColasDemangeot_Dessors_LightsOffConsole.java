/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniprojet_colas.demangeot_dessors_lightsoffconsole;
import java.util.Scanner;
/**
 *
 * @author maxCD
 */
public class Miniprojet_ColasDemangeot_Dessors_LightsOffConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CelluleLumineuse jeu = new CelluleLumineuse (5);
        jeu.LumièreDebutDePartie();
        System.out.println(jeu);
        
        Scanner sc = new Scanner (System.in);
        while (true){
        System.out.println("Choisiser une coordonner X");
        int x = sc.nextInt();
        
        System.out.println("Choisiser une coordonner Y");
        int y = sc.nextInt();
        
        jeu.choix(x, y);
        System.out.println(jeu);
        }
    }
    
}
