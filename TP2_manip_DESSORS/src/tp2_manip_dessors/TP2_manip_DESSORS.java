/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_dessors;

/**
 *
 * @author maxCD
 */
public class TP2_manip_DESSORS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //créons deux tartiflettes avec des calories différentes
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        
        Tartiflette assiette3 = assiette2 ; 
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        //afficher le nombre de calories des deux tartiflettes
        
        Tartiflette assiettetemp = assiette1;
        assiette1 = assiette2;
        assiette2 = assiettetemp;
        //assiette1 et assiette2 intervertissent les objets de 
        //type Tartiflette qu’ellesréférencent
        
        //Moussaka assiette666 = assiette1 ; Faux
        //Moussaka assiette667 = new Tartiflette() ;Faux
        
        Moussaka[] tabmoussk = new Moussaka[10];
        //un tableau de 10 références de Moussaka.
        for (int k = 0; k < tabmoussk.length; k++){
            tabmoussk[k] = new Moussaka(1); 
            
        System.out.println(tabmoussk)  ;  
        }
    }
        
}
