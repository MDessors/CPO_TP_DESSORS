/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur_objet_dessors;

/**
 *
 * @author maxCD
 */
public class TP2_Convertisseur_Objet_DESSORS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double res = 0;
        
        Convertisseur C1 = new Convertisseur();
        while(res != res-300){
            
            res = C1.convert();
            System.out.println(C1.toString());
            System.out.println("Le resultat de la conversion est " + res + "\n");
            
        }
        // TODO code application logic here
    }
    
}
