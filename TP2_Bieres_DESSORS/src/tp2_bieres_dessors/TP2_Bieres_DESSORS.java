/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dessors;

/**
 *
 * @author maxCD
 */
public class TP2_Bieres_DESSORS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        uneBiere.ouverte = false;
        //CREATION de la nouvelle bouteille de biere dubuisson avec comme variable BouteilleBiere
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Abbaye de Leffe" ,6.6 ,"Leffe");
        autreBiere.ouverte = false;
        //Creation de bierre leffe
        autreBiere.lireEtiquette();
        BouteilleBiere tequBiere = new BouteilleBiere ("Campo de AGAVE Tequila" , 40.0, "HerraduraBIERE");
        tequBiere.ouverte = true ;
        //Creation de biere personelle HEARRADURABierre
        tequBiere.lireEtiquette();
        System.out.println(uneBiere) ;
        //Unsystem out print pour nous afficher chaque bierre et ses details
    }


}
